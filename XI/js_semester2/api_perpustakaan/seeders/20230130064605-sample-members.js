'use strict';

/** @type {import('sequelize-cli').Migration} */
module.exports = {
  async up(queryInterface, Sequelize) {
    /**
     * Add seed commands here.
     *
     * Example:
     * await queryInterface.bulkInsert('People', [{
     *   name: 'John Doe',
     *   isBetaMember: false
     * }], {});
    */
    await queryInterface.bulkInsert('Members', [
      {
        name: `Soekarno`, gender: `Male`,
        contact: `021-223311`, address: `Tokyo, Japan`,
        createdAt: new Date(), updatedAt: new Date()
      },
      {
        name: `Soeharto`, gender: `Male`,
        contact: `0331-474747`, address: `Beijing, China`,
        createdAt: new Date(), updatedAt: new Date()
      },
      {
        name: `Megawati`, gender: `Female`,
        contact: `091-23981`, address: `Bangkok, Thailand`,
        createdAt: new Date(), updatedAt: new Date()
      },
    ], {})
  },

  async down(queryInterface, Sequelize) {
    /**
     * Add commands to revert seed here.
     *
     * Example:
     * await queryInterface.bulkDelete('People', null, {});
     */
    await queryInterface.bulkDelete('Members', null, {});

  }
};
