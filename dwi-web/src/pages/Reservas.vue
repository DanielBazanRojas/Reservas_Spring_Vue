<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const router = useRouter();

const paquete = ref('');
const fechaSalida = ref('');
const fechaRetorno = ref('');
const cantidadPersonas = ref('');
const serviciosAdicionales = ref([]);

const realizarReserva = async () => {
  try {
    const response = await axios.post('http://localhost:8080/reservas', {
      idPaquete: paquete.value,
      fechaSalida: fechaSalida.value,
      fechaRetorno: fechaRetorno.value,
      cantidadPersonas: parseInt(cantidadPersonas.value),
      // Otros campos necesarios como idCliente, idEmpleado, etc.
    });

    if (response.data) {
      // Reserva exitosa, redirigir a la página de pago
      router.push('/pago');
    }
  } catch (error) {
    console.error('Error al realizar la reserva:', error);
    // Manejar el error (mostrar mensaje al usuario, etc.)
  }
};
</script>

<template>
  <header
    class="bg-primary text-primary-foreground px-4 lg:px-6 py-4 flex items-center justify-between sticky top-0 z-10">
    <RouterLink to="/" class="flex items-center gap-2">
      <img src="../assets/travel.svg" alt="">
      <span class="text-xl font-bold">Joymeyros Tours</span>
    </RouterLink>
    <button
      class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 lg:hidden">
      <img src="../assets/hamburguer.svg" alt="">
    </button>
  </header>
  <div class="max-w-6xl mx-auto p-4 sm:p-6 md:p-8 h-[70dvh] content-center">
    <div class="grid gap-8 md:grid-cols-2 items-start">
      <div class="grid gap-4">
        <h1 class="text-3xl font-bold">Reserva tu aventura ahora</h1>
        <p class="text-muted-foreground">
          Completa el formulario a continuación para reservar tu paquete de viaje. ¡Estamos emocionados de tenerte en
          nuestro próximo viaje!
        </p>
        <form class="grid gap-6" @submit.prevent="realizarReserva">
          <div class="grid gap-2">
            <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
              for="package">
              Paquete Turistico
            </label>
            <select name="" id="webos"
              class="flex h-10 w-full items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50">
              <option value="">Selecciona un paquete</option>
              <option value="Mancora">Mancora</option>
              <option value="Cuzco">Cuzco</option>
              <option value="Tumbes">Tumbes</option>
              <option value="Cajamarca">Cajamarca</option>
              <option value="Tarapoto">Tarapoto</option>
            </select>
          </div>
          <div class="grid grid-cols-2 gap-4">
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="check-in">
                Fecha de Salida
              </label>
              <input type="date" name="" id="" class="bg-background border border-border p-1.5">
            </div>
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="check-out">
                Fecha de Retorno
              </label>
              <input type="date" name="" id="" class="bg-background border border-border p-1.5">
            </div>
          </div>
          <div class="grid grid-cols-2 gap-4">
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="travelers">
                Viajeros
              </label>
              <select
                class="flex h-10 w-full items-center justify-between rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50">
                <option value="">Seleccionar</option>
                <option value="1">1 persona</option>
                <option value="2">2 personas</option>
                <option value="3">3 personas</option>
                <option value="4">4 personas</option>
                <option value="5">5+ personas</option>
              </select>
            </div>
            <div class="grid gap-2">
              <label class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                for="extras">
                Servicios adicionales
              </label>
              <div>
                <div class="flex items-center gap-2">
                  <input type="checkbox" value="airport-transfer"
                    class="peer appearance-none bg-background h-4 w-4 border border-primary checked:bg-border" />
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="airport-transfer">
                    Traslado al aeropuerto
                  </label>
                </div>
                <div class="flex items-center gap-2">
                  <input type="checkbox" value="travel-insurance"
                    class="peer appearance-none bg-background h-4 w-4 border border-primary checked:bg-border" />
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="travel-insurance">
                    Seguro de viaje
                  </label>
                </div>
                <div class="flex items-center gap-2">
                  <input type="checkbox" value="guided-tour"
                    class="peer appearance-none bg-background h-4 w-4 border border-primary checked:bg-border" />
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="guided-tour">
                    Tour guiado
                  </label>
                </div>
              </div>
            </div>
          </div>
          <RouterLink to="/pago">
            <button
              class="inline-flex items-center justify-center whitespace-nowrap text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-11 rounded-md px-8 w-full"
              type="submit">
              Reservar ahora
            </button>
          </RouterLink>
        </form>
      </div>
      <div class="grid gap-4">
        <div class="bg-muted p-6 rounded-lg">
          <h2 class="text-2xl font-bold">Tu Reserva</h2>
          <div class="grid gap-4 mt-4">
            <div class="flex items-center justify-between">
              <span>Paquete Turistico</span>
              <span>Opcion</span>
            </div>
            <div class="flex items-center justify-between">
              <span>Fecha de salida</span>
              <span>Fecha escogida</span>
            </div>
            <div class="flex items-center justify-between">
              <span>Fecha de retorno</span>
              <span>Fecha escogida</span>
            </div>
            <div class="flex items-center justify-between">
              <span>Viajeros</span>
              <span>Nro personas</span>
            </div>
            <div class="flex items-center justify-between">
              <span>Servicios adicionales</span>
              <span>Servicios escogidos</span>
            </div>
            <div data-orientation="horizontal" role="none" class="shrink-0 bg-border h-[1px] w-full"></div>
            <div class="flex items-center justify-between font-bold">
              <span>Total</span>
              <span>S/.2,499</span>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
