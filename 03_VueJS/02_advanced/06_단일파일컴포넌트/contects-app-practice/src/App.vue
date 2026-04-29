<template>
  <div id="app" class="container mt-3">
    <div class="card card-body bg-light mb-3">
      <div class="fw-bold">우리반 Contact ❤️</div>
    </div>

    <ContactForm @add-contact="addContact" />
    <ContactList :contactList="contacts" @delete-contact="deleteContact" />
  </div>
</template>

<script>
import ContactForm from './components/ContactForm.vue';
import ContactList from './components/ContactList.vue';

export default {
  name: 'App',
  components: {
    ContactForm,
    ContactList,
  },
  data() {
    return {
      nextId: 5,
      contacts: [
        {
          id: 1,
          name: '홍길동',
          gender: '남',
          age: 20,
          email: 'hong@example.com',
          github: 'hongGD',
        },
        {
          id: 2,
          name: '짱구',
          gender: '남',
          age: 7,
          email: 'janggu@example.com',
          github: 'janggu',
        },
        {
          id: 3,
          name: '유리',
          gender: '여',
          age: 7,
          email: 'yuri@example.com',
          github: 'yuri',
        },
        {
          id: 4,
          name: '철수',
          gender: '남',
          age: 7,
          email: 'chulsoo@example.com',
          github: 'chulsoo',
        },
      ],
    };
  },
  methods: {
    addContact(contact) {
      this.contacts.push({
        id: this.nextId++,
        ...contact,
      });
    },
    deleteContact(id) {
      this.contacts = this.contacts.filter((contact) => contact.id !== id);
    },
  },
};
</script>
