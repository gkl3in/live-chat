package br.com.gklein.chat.providers;

import java.security.PublicKey;

public interface KeyProvider {
    PublicKey getPublicKey(String keyId);
}
