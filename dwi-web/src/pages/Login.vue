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
<div class="mx-auto max-w-md space-y-6 py-12">
  <div class="space-y-2 text-center">
    <h1 class="text-3xl font-bold">Bienvenido de Vuelta</h1>
    <p class="text-muted-foreground">Ingresa a tu cuenta para seguir disfrutando de los planes de viaje que tenemos para ti.</p>
  </div>
  <div class="space-y-4">
    <div class="space-y-2">
      <label
        class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
        for="email"
      >
        Correo Electrónico
      </label>
      <input
        class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
        id="email"
        placeholder="tucorreo@example.com"
        required=""
        type="email"
      />
    </div>
    <div class="space-y-2">
      <label
        class="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
        for="password"
      >
        Contraseña
      </label>
      <input
        class="flex h-10 w-full rounded-md border border-input bg-background px-3 py-2 text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50"
        id="password"
        placeholder="********"
        required=""
        type="password"
      />
    </div>
    <button
      class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2 w-full"
      type="submit"
    >
      Ingresar
    </button>
    <div class="flex items-center space-x-2">
      <div class="h-px flex-1 bg-border"></div>
      <p class="px-2 text-muted-foreground">También puedes ingresar con</p>
      <div class="h-px flex-1 bg-border"></div>
    </div>
    <div class="grid grid-cols-2 gap-4">
      <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 w-full">
        <img src="../assets/google.svg" class="mr-2 h-4 w-4" alt="">
        Google
      </button>
      <button class="inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 border border-input bg-background hover:bg-accent hover:text-accent-foreground h-10 px-4 py-2 w-full">
        <img src="../assets/facebook.svg" class="mr-2 h-4 w-4" alt="">
        Facebook
      </button>
    </div>
    <div class="mt-4 text-center text-sm">
      No tienes una cuenta aún?
      <RouterLink to="/register"><b>Registrate</b></RouterLink>
      <a class="underline" href="#" rel="ugc">
      </a>
    </div>
  </div>
</div>
</template>