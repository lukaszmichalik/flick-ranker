<template>
  <div class="flex p-8 justify-center">
    <input type="text" class="rounded border-2 border-gray-200 w-72"
           placeholder="Enter login">
  </div>

  <div class="flex p-8 justify-center">
      <input type="text" class="rounded border-2 border-gray-200 w-72"
      placeholder="Enter password">
  </div>

  <div class="flex p-8 justify-center">
    <router-link to="/registration">
        hej register
    </router-link>
  </div>
</template>

<script setup>
import {computed} from "vue";
import store from "../store/index.js";


</script>