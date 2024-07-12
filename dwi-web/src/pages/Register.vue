<script>
    import { RouterLink } from 'vue-router';
</script>

<template>
<header class="bg-primary text-primary-foreground px-4 lg:px-6 py-4 flex items-center justify-between sticky top-0 z-10">
    <RouterLink to="/" class="flex items-center gap-2">
        <img src="../assets/travel.svg" alt="">
        <span class="text-xl font-bold">Joymeyros Tours</span>
    </RouterLink>
  </header>
<div class="flex min-h-[70dvh] justify-center bg-background px-4 pt-2 pb-4 sm:px-6 lg:px-8">
  <div class="w-full max-w-md space-y-8">
    <div>
      <h2 class="mt-6 text-center text-3xl font-bold tracking-tight text-foreground">
        Registrate para Comenzar
      </h2>
      <p class="mt-2 text-center text-sm text-muted-foreground">
        Registrate para empezar a planear tus viajes con nosotros.
      </p>
    </div>
    <form class="space-y-4" action="#" method="POST">
      <div class="grid gap-4">
        <div class="grid gap-2">
          <label for="name" class="block text-sm font-medium text-muted-foreground">
            Nombre Completo
          </label>
          <input
            class="flex h-10 w-full bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-lg border-2 border-muted focus:border-primary focus:ring-primary"
            id="name"
            autocomplete="name"
            required=""
            placeholder="John Doe"
            type="text"
            name="name"
          />
        </div>
        <div class="grid gap-2">
          <label for="address" class="block text-sm font-medium text-muted-foreground">
            Dirección
          </label>
          <input
            class="flex h-10 w-full bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-lg border-2 border-muted focus:border-primary focus:ring-primary"
            id="address"
            autocomplete="address"
            required=""
            placeholder="123 Main St, Anytown USA"
            name="address"
            type="text"
          />
        </div>
        <div class="grid grid-cols-2 gap-4">
          <div class="grid gap-2">
            <label for="phone" class="block text-sm font-medium text-muted-foreground">
              Teléfono
            </label>
            <input
              class="flex h-10 w-full bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-lg border-2 border-muted focus:border-primary focus:ring-primary"
              id="phone"
              autocomplete="tel"
              required=""
              placeholder="987-654-321"
              name="phone"
              type="tel"
            />
          </div>
          <div class="grid gap-2">
            <label for="dni" class="block text-sm font-medium text-muted-foreground">
              DNI
            </label>
            <input
              class="flex h-10 w-full bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-lg border-2 border-muted focus:border-primary focus:ring-primary"
              id="dni"
              type="text"
              name="dni"
              autocomplete="identity"
              required=""
              placeholder="12345678"
            />
          </div>
        </div>
        <div class="grid gap-2">
          <label for="email" class="block text-sm font-medium text-muted-foreground">
            Correo Electrónico
          </label>
          <input
            class="flex h-10 w-full bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 rounded-lg border-2 border-muted focus:border-primary focus:ring-primary"
            id="email"
            autocomplete="email"
            required=""
            placeholder="tucorreo@example.com"
            type="email"
            name="email"
          />
        </div>
      </div>
      <div>
        <button
      class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 w-full"
      type="submit"
    >
      Registrarse
    </button>
      </div>
      <div class="flex items-center space-x-2">
      <div class="h-px flex-1 bg-border"></div>
      <p class="px-2 text-muted-foreground">También puedes registrate con</p>
      <div class="h-px flex-1 bg-border"></div>
    </div>
    <div class="grid grid-cols-2 gap-2">
      <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 w-full">
        <img src="../assets/google.svg" class="mr-2 h-4 w-4" alt="">
        Google
      </button>
      <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 w-full">
        <img src="../assets/facebook.svg" class="mr-2 h-4 w-4" alt="">
        Facebook
      </button>
    </div>
    <div class="text-center text-sm">
      Ya tienes una cuenta?
      <RouterLink to="/login"><b>Ingresa aquí</b></RouterLink>
    </div>
    </form>
  </div>
</div>
</template>