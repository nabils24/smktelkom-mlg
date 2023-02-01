'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class buku extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // define association here
    }
  }
  buku.init({
    isbn: DataTypes.STRING,
    title: DataTypes.STRING,
    author: DataTypes.STRING,
    publisher: DataTypes.STRING,
    category: DataTypes.STRING,
    stok: DataTypes.INTEGER,
    cover: DataTypes.STRING
  }, {
    sequelize,
    modelName: 'buku',
  });
  return buku;
};