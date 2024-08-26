/// <Reference types="cypress" />

describe('Dev Finances Agilizei', () => {

    beforeEach(() => {
        cy.visit("https://devfinance-agilizei.netlify.app/");
    });

    // Cadastrar entrada
        it('Cadastrar Entradas ', () => {

            // Item  1
            cy.get('#transaction .button') // id + class
            .click()
            cy.get('#description') // id
            .type('Presente')
            cy.get('[name=amount]') // atributos
            .type('12')
            cy.get('[type=date]') // atributos
            .type('2021-03-18')
            cy.contains('button', 'Salvar') // tipo e valor
            .click()

            // Item 2
            cy.get('#transaction .button') // id + class
            .click()
            cy.get('#description') // id
            .type('Mesada')
            cy.get('[name=amount]') // atributos
            .type('50')
            cy.get('[type=date]') // atributos
            .type('2021-03-17')
            cy.contains('button', 'Salvar') // tipo e valor
            .click()

            // Item 3
            cy.get('#transaction .button') // id + class
            .click()
            cy.get('#description') // id
            .type('Cortar Grama')
            cy.get('[name=amount]') // atributos
            .type('50')
            cy.get('[type=date]') // atributos
            .type('2021-03-19')
            cy.contains('button', 'Salvar') // tipo e valor
            .click()

            cy.get('#data-table tbody tr').should('have.length', 3)

    });

    // Cadastrar saídas
    it.only('Cadastrar Saidas ', () => {

        // Item  1
        cy.get('#transaction .button') // id + class
        .click()
        cy.get('#description') // id
        .type('Celular')
        cy.get('[name=amount]') // atributos
        .type('-26')
        cy.get('[type=date]') // atributos
        .type('2021-03-18')
        cy.contains('button', 'Salvar') // tipo e valor
        .click()

        // Item 2
        cy.get('#transaction .button') // id + class
        .click()
        cy.get('#description') // id
        .type('Parcela Casa')
        cy.get('[name=amount]') // atributos
        .type('-50')
        cy.get('[type=date]') // atributos
        .type('2021-03-17')
        cy.contains('button', 'Salvar') // tipo e valor
        .click()

        // Item 3
        cy.get('#transaction .button') // id + class
        .click()
        cy.get('#description') // id
        .type('Internet')
        cy.get('[name=amount]') // atributos
        .type('-30')
        cy.get('[type=date]') // atributos
        .type('2021-03-19')
        cy.contains('button', 'Salvar') // tipo e valor
        .click()

        cy.get('#data-table tbody tr').should('have.length', 3)

});


    // Cadastrar entradas e saídas
});