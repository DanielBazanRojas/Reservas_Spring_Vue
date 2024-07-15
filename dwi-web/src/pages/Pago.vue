<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const router = useRouter();

const numeroTarjeta = ref('');
const mesExpiracion = ref('');
const anioExpiracion = ref('');
const cvc = ref('');

const realizarPago = async () => {
  try {
    const response = await axios.post('http://localhost:8080/pagos', {
      numeroTarjeta: numeroTarjeta.value,
      fechaExpiracion: `${mesExpiracion.value}/${anioExpiracion.value}`,
      cvc: cvc.value
    });

    if (response.data === "Pago realizado con éxito") {
      // Pago exitoso, redirigir a la página de confirmación
      router.push('/confirmacion');
    }
  } catch (error) {
    console.error('Error al realizar el pago:', error);
    // Manejar el error (mostrar mensaje al usuario, etc.)
  }
};
</script>

<template>
  <div class="grid w-[100dvw] h-[100dvh] place-content-center">
    <div class="grid rounded-lg border bg-card text-card-foreground shadow-sm h-[95dvh] w-full max-w-2xl"
      data-v0-t="card">
      <div class="self-center flex flex-col space-y-1.5 p-6">
        <h3 class="whitespace-nowrap text-2xl font-semibold leading-none tracking-tight">Realizar Pago</h3>
        <p class="text-sm text-muted-foreground">CIngresa tus datos de pago para completar la transacción.</p>
      </div>
      <div class="p-3">
        <form class="grid gap-6" @submit.prevent="realizarPago">
          <div class="grid gap-2">
            <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
              for="payment-method">
              Método de Pago
            </label>
            <div role="radiogroup" aria-required="false" dir="ltr" class="grid grid-cols-3 gap-4" id="payment-method"
              tabindex="-1" style="outline:none">
              <label
                class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 border cursor-pointer rounded-md p-4 flex flex-col items-center justify-center gap-2 [&amp;:has([data-state=checked])]:border-primary"
                for="credit-card">
                <button type="button" role="radio" aria-checked="true" data-state="checked" value="credit-card"
                  class="aspect-square h-4 w-4 rounded-full border border-primary text-primary ring-offset-background focus:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                  id="credit-card" tabindex="-1" data-radix-collection-item="">
                  <span data-state="checked" class="flex items-center justify-center">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                      stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                      class="lucide lucide-circle h-2.5 w-2.5 fill-current text-current">
                      <circle cx="12" cy="12" r="10"></circle>
                    </svg>
                  </span>
                </button>
                <input type="radio" aria-hidden="true"
                  style="transform:translateX(-100%);position:absolute;pointer-events:none;opacity:0;margin:0"
                  tabindex="-1" checked="" value="credit-card" />
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                  stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="h-6 w-6">
                  <rect width="20" height="14" x="2" y="5" rx="2"></rect>
                  <line x1="2" x2="22" y1="10" y2="10"></line>
                </svg>
                <span class="grid justify-self-center">Tarjeta de Crédito/Debito</span>
              </label>
              <label
                class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 border cursor-pointer rounded-md p-4 flex flex-col items-center justify-center gap-2 [&amp;:has([data-state=checked])]:border-primary"
                for="bank-transfer">
                <button type="button" role="radio" aria-checked="false" data-state="unchecked" value="bank-transfer"
                  class="aspect-square h-4 w-4 rounded-full border border-primary text-primary ring-offset-background focus:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                  id="bank-transfer" tabindex="-1" data-radix-collection-item=""></button>
                <input type="radio" aria-hidden="true"
                  style="transform:translateX(-100%);position:absolute;pointer-events:none;opacity:0;margin:0"
                  tabindex="-1" value="bank-transfer" />
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                  stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="h-6 w-6">
                  <rect width="20" height="12" x="2" y="6" rx="2"></rect>
                  <circle cx="12" cy="12" r="2"></circle>
                  <path d="M6 12h.01M18 12h.01"></path>
                </svg>
                Transferencia
              </label>
              <label
                class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 border cursor-pointer rounded-md p-4 flex flex-col items-center justify-center gap-2 [&amp;:has([data-state=checked])]:border-primary"
                for="paypal">
                <button type="button" role="radio" aria-checked="false" data-state="unchecked" value="paypal"
                  class="aspect-square h-4 w-4 rounded-full border border-primary text-primary ring-offset-background focus:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                  id="paypal" tabindex="-1" data-radix-collection-item=""></button>
                <input type="radio" aria-hidden="true"
                  style="transform:translateX(-100%);position:absolute;pointer-events:none;opacity:0;margin:0"
                  tabindex="-1" value="paypal" />
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                  stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="h-6 w-6">
                  <path
                    d="M19 7V4a1 1 0 0 0-1-1H5a2 2 0 0 0 0 4h15a1 1 0 0 1 1 1v4h-3a2 2 0 0 0 0 4h3a1 1 0 0 0 1-1v-2a1 1 0 0 0-1-1">
                  </path>
                  <path d="M3 5v14a2 2 0 0 0 2 2h15a1 1 0 0 0 1-1v-4"></path>
                </svg>
                PayPal
              </label>
            </div>
          </div>
          <div class="grid gap-2">
            <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
              for="name">
              Nombre Completo
            </label>
            <input
              class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
              id="name" placeholder="Ingresa tu nombre completo" />
          </div>
          <div class="grid gap-2">
            <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
              for="email">
              Correo Electrónico
            </label>
            <input
              class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
              type="email" id="email" placeholder="Ingresa tu correo electrónico" />
          </div>
          <div class="grid gap-2">
            <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
              for="card-number">
              Número de tarjeta
            </label>
            <input
              class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
              type="text" id="card-number" placeholder="Ingresa el número de tu tarjeta" />
          </div>
          <div class="grid grid-cols-3 gap-4">
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="expiration-month">
                Mes
              </label>
              <select aria-hidden="true" tabindex="-1"
                class="flex h-10 w-full items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50">
                <option value="">Selecciona el mes</option>
                <option value="">Enero</option>
                <option value="">Febrero</option>
                <option value="">Marzo</option>
                <option value="">Abril</option>
                <option value="">Mayo</option>
                <option value="">Junio</option>
                <option value="">Julio</option>
                <option value="">Agosto</option>
                <option value="">Septiembre</option>
                <option value="">Octubre</option>
                <option value="">Noviembre</option>
                <option value="">Diciembre</option>
              </select>
            </div>
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="expiration-month">
                Año
              </label>
              <select aria-hidden="true" tabindex="-1"
                class="flex h-10 w-full items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50">
                <option value="">Selecciona el año</option>
                <option value="">2024</option>
                <option value="">2025</option>
                <option value="">2026</option>
                <option value="">2027</option>
                <option value="">2028</option>
                <option value="">2029</option>
                <option value="">2030</option>
                <option value="">2031</option>
                <option value="">2032</option>
                <option value="">2033</option>
                <option value="">2034</option>
                <option value="">2035</option>
              </select>
            </div>
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="cvc">
                CVC
              </label>
              <input
                class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                type="text" id="cvc" placeholder="Ingresa tu CVC" />
            </div>
          </div>
        </form>
      </div>
      <div class="items-center p-3 flex justify-between">
        <RouterLink to="/reservas">
          <button
            class="grid place-content-center p-0 m-0 items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2">
            Cancelar compra
          </button>
        </RouterLink>
        <RouterLink to="confirmacion">
          <button
            class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2"
            type="submit">
            Completar compra
          </button>
        </RouterLink>
      </div>
    </div>
  </div>
</template>