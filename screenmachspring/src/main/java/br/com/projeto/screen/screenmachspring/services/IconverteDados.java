package br.com.projeto.screen.screenmachspring.services;

public interface IconverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
