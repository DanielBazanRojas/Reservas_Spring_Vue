<script setup lang="ts">
import { RouterLink } from 'vue-router';
import navbarComponent from '../components/navbarComponent.vue';
</script>

<template>
    <div>
        <navbarComponent class="w-screen"/>
        <div>
            <span>Home</span>
            <span>Listar cliente</span>
        </div>
        <RouterLink to="details">Detalles</RouterLink>
    </div>
</template>