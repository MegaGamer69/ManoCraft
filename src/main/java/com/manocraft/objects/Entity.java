// Pacote do Código
package com.manocraft.objects;

// Direitos Autorais:
// @MegaGamer69(Criador do Código Fonte)
// 2024 ManoCraft

// Importações Concretas Úteis do Java
import java.lang.Exception;

// Classe para Representar as Entidades
public class Entity
{
    // a Quantidade de Vida
    private float health;

    // a Quantidade de Dano por Golpe
    private float damage;

    // a Velocidade de Golpe em Segundos
    private float attackSpeed;

    // a Velocidade de Movimento
    private float movement;

    // Cria uma Nova Instância da Classe
    public Entity(float health, float damage, float attackSpeed, float movement)
    {
        // Define as Variáveis
        this.health = health;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.movement = movement;
    }
}