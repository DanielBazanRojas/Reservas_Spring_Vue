<script setup lang="ts">
import { RouterLink } from 'vue-router';
</script>

<template>
<div class="flex flex-col min-h-[100dvh]">
  <header class="bg-primary text-primary-foreground px-4 lg:px-6 py-4 flex items-center justify-between sticky top-0 z-10">
    <a class="flex items-center gap-2" href="#">
      <img src="../assets/travel.svg" alt="">
      <span class="text-xl font-bold">Joymeyros Tours</span>
    </a>
    <nav class="hidden lg:flex gap-4">
      <a class="hover:underline" href="#Opinions">
        Opiniones
      </a>
      <a class="hover:underline" href="#About">
        Sobre Nosotros
      </a>
      <a class="hover:underline" href="#Contact">
        Contacto
      </a>
    </nav>
    <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 lg:hidden">
      <img src="../assets/hamburguer.svg" alt="">
    </button>
  </header>
  <main class="flex-1">
    <section class="bg-[url('/hero-image.jpg')] bg-cover bg-center py-24 md:py-32 lg:py-40 text-primary-foreground">
      <div class="container px-4 md:px-6 max-w-2xl mx-auto space-y-6">
        <h1 class="text-4xl md:text-5xl lg:text-6xl font-bold">Descubre el mundo con Joymeyros Tours</h1>
        <p class="text-lg md:text-xl">
          Ofrecemos paquetes turísticos personalizados para que puedas vivir experiencias únicas en los mejores
          destinos.
        </p>
        <div class="flex gap-4">
            <RouterLink to="/reservas">
                <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2">
                  Reservar Ahora
                </button>
            </RouterLink>
          <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2">
            Explorar Paquetes
          </button>
        </div>
      </div>
    </section>
    <section class="py-12 md:py-20 lg:py-28 grid place-content-center">
      <div class="container px-4 md:px-6">
        <div class="grid md:grid-cols-2 gap-8">
          <div>
            <h2 class="text-3xl md:text-4xl font-bold mb-4">Paquetes a tu medida</h2>
            <p class="text-muted-foreground mb-6">
              Nuestros paquetes turísticos incluyen todo lo que necesitas para disfrutar de tus vacaciones sin
              preocupaciones.
            </p>
            <ul class="space-y-4">
              <li class="flex items-center gap-2">
                <img class="h-5 w-5" src="../assets/check.svg" alt="">
                <span>Vuelos, hoteles y traslados</span>
              </li>
              <li class="flex items-center gap-2">
                <img class="h-5 w-5" src="../assets/check.svg" alt="">
                <span>Actividades y excursiones</span>
              </li>
              <li class="flex items-center gap-2">
                <img class="h-5 w-5" src="../assets/check.svg" alt="">
                <span>Asistencia 24/7</span>
              </li>
            </ul>
          </div>
          <div>
            <img
              src="../assets/placeholder.jpg"
              width="600"
              height="400"
              alt="Paquete Turístico"
              class="rounded-lg object-cover aspect-6/4"
            />
          </div>
        </div>
      </div>
    </section>
    <section class="bg-muted py-12 md:py-20 lg:py-28 grid place-content-center" id="Opinions">
      <div class="container px-4 md:px-6">
        <h2 class="text-3xl md:text-4xl font-bold mb-8 text-center">Lo que dicen nuestros clientes</h2>
        <div class="grid md:grid-cols-2 lg:grid-cols-3 gap-6">
          <div class="border text-card-foreground bg-background p-6 rounded-lg shadow-md" data-v0-t="card">
            <div class="flex items-center mb-4">
              <span class="relative flex h-10 w-10 shrink-0 overflow-hidden rounded-full">
                <span class="flex h-full w-full items-center justify-center rounded-full bg-muted">JP</span>
              </span>
              <div class="ml-4">
                <p class="font-medium">Joaquin Perez</p>
                <p class="text-muted-foreground text-sm">Viajero frecuente</p>
              </div>
            </div>
            <p class="text-muted-foreground">
              "¡Gran servicio! Joymeyros Tours hizo que nuestras vacaciones fueran una experiencia inolvidable."
            </p>
          </div>
          <div class="border text-card-foreground bg-background p-6 rounded-lg shadow-md" data-v0-t="card">
            <div class="flex items-center mb-4">
              <span class="relative flex h-10 w-10 shrink-0 overflow-hidden rounded-full">
                <span class="flex h-full w-full items-center justify-center rounded-full bg-muted">SM</span>
              </span>
              <div class="ml-4">
                <p class="font-medium">Sofía Martínez</p>
                <p class="text-muted-foreground text-sm">Viajera ocasional</p>
              </div>
            </div>
            <p class="text-muted-foreground">
              "Gracias a Joymeyros Tours, pude disfrutar de unas vacaciones relajantes y sin preocupaciones."
            </p>
          </div>
          <div class="border text-card-foreground bg-background p-6 rounded-lg shadow-md" data-v0-t="card">
            <div class="flex items-center mb-4">
              <span class="relative flex h-10 w-10 shrink-0 overflow-hidden rounded-full">
                <span class="flex h-full w-full items-center justify-center rounded-full bg-muted">LG</span>
              </span>
              <div class="ml-4">
                <p class="font-medium">Luis Gómez</p>
                <p class="text-muted-foreground text-sm">Viajero frecuente</p>
              </div>
            </div>
            <p class="text-muted-foreground">
              "¡Recomiendo ampliamente a Joymeyros Tours! Su atención al detalle y servicio personalizado son
              excepcionales."
            </p>
          </div>
        </div>
      </div>
    </section>
    <section class="py-12 md:py-20 lg:py-28 bg-background grid place-content-center" id="About">
          <div class="container px-4 md:px-6 ">
            <h2 class="text-3xl md:text-4xl font-bold mb-8 text-center">Sobre Nosotros</h2>
            <h3 class="text-2xl font-bold mb-2">Quiénes Somos</h3>
            <p class="text-muted-foreground mb-8">
              Travel Bliss es una agencia de viajes líder en el mercado, dedicada a brindar experiencias
              turísticas excepcionales a nuestros clientes. Desde nuestra fundación, hemos trabajado
              incansablemente para ofrecer paquetes personalizados y un servicio de calidad inigualable.
            </p>
            <div class="grid gap-6 md:grid-cols-2 lg:grid-cols-3">
              <div class="bg-muted p-8 rounded-[30px] shadow-md">
                <div>
                  <h3 class="text-2xl font-bold mb-2">Nuestra Visión</h3>
                  <p class="text-muted-foreground">
                    Ser la agencia de viajes de referencia en el mercado, reconocida por nuestra innovación, excelencia
                    en el servicio y compromiso con la satisfacción de nuestros clientes.
                  </p>
                </div>
              </div>
              <div class="bg-muted p-8 rounded-[30px] shadow-md">
                <div>
                  <h3 class="text-2xl font-bold mb-2">Nuestra Misión</h3>
                  <p class="text-muted-foreground">
                    Inspirar y facilitar viajes memorables a nuestros clientes, ofreciendo soluciones a medida y un
                    acompañamiento personalizado en cada etapa de su experiencia.
                  </p>
                </div>
              </div>
              <div class="bg-muted p-8 rounded-[30px] shadow-md">
                <div>
                  <h3 class="text-2xl font-bold mb-2">Nuestros Valores</h3>
                  <ul class="space-y-2 text-muted-foreground">
                    <li class="flex items-center gap-2">
                        <img class="h-5 w-5" src="../assets/check.svg" alt="">
                      <span>Excelencia en el servicio</span>
                    </li>
                    <li class="flex items-center gap-2">
                        <img class="h-5 w-5" src="../assets/check.svg" alt="">
                      <span>Innovación y mejora continua</span>
                    </li>
                    <li class="flex items-center gap-2">
                        <img class="h-5 w-5" src="../assets/check.svg" alt="">
                      <span>Compromiso con la sostenibilidad</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <CheckIcon class="h-5 w-5 text-primary" />
                      <span>Respeto y diversidad</span>
                    </li>
                  </ul>
                </div>
            </div>
            </div>
          </div>
        </section>
        <section class="py-12 md:py-20 lg:py-28 flex place-content-center" id="Contact">
      <div class="container px-4 md:px-6">
        <h2 class="text-3xl md:text-4xl font-bold mb-8 text-center">Contáctanos</h2>
        <div class="max-w-md mx-auto">
          <form>
            <div class="rounded-lg border bg-card text-card-foreground shadow-sm" data-v0-t="card">
              <div class="flex flex-col space-y-1.5 p-6">
                <h3 class="whitespace-nowrap text-2xl font-semibold leading-none tracking-tight">
                  Envíanos un mensaje
                </h3>
                <p class="text-sm text-muted-foreground">Estaremos encantados de ayudarte a reservar un paquete turistico con nosotros.</p>
              </div>
              <div class="p-6 space-y-4">
                <div>
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="name"
                  >
                    Nombre
                  </label>
                  <input
                    class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                    id="name"
                    placeholder="Ingresa tu nombre"
                    type="text"
                  />
                </div>
                <div>
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="email"
                  >
                    Correo Electrónico
                  </label>
                  <input
                    class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                    id="email"
                    placeholder="example@email.com"
                    type="email"
                  />
                </div>
                <div>
                  <label
                    class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                    for="message"
                  >
                    Mensaje
                  </label>
                  <textarea
                    class="flex min-h-[80px] w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
                    id="message"
                    placeholder="Escribe tu mensaje"
                    rows="4"
                  ></textarea>
                </div>
              </div>
              <div class="items-center p-6 flex justify-end">
                <button
                  class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2"
                  type="submit"
                >
                  Enviar
                </button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </section>
  </main>
  <footer class="bg-primary text-primary-foreground px-4 lg:px-6 py-6 flex flex-col md:flex-row items-center justify-between">
    <p class="text-sm">© 2024 Joymeyros Tours. Todos los derechos reservados.</p>
    <nav class="flex gap-4 mt-4 md:mt-0">
      <a class="hover:underline" href="#">
        Términos y Condiciones
      </a>
      <a class="hover:underline" href="#">
        Política de Privacidad
      </a>
    </nav>
  </footer>
</div>
</template>
