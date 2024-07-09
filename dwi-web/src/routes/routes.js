import { createRouter, createWebHistory } from "vue-router";
import Home from "../pages/Home.vue";
import Detalles from "../pages/Detalles.vue";

const routes = [
    {
        path: '/',
        component: Home
    },
    {
        path: '/details',
        component: Detalles
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router