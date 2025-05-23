/*    */ package com.intellij.ml.llm.matterhorn.configuration.env;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\027\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\005XD¢\006\b\n\000\032\004\b\t\020\007R\024\020\n\032\0020\005XD¢\006\b\n\000\032\004\b\013\020\007R\024\020\f\032\0020\005XD¢\006\b\n\000\032\004\b\r\020\007R\024\020\016\032\0020\005XD¢\006\b\n\000\032\004\b\017\020\007R\024\020\020\032\0020\005XD¢\006\b\n\000\032\004\b\021\020\007R\024\020\022\032\0020\005XD¢\006\b\n\000\032\004\b\023\020\007R\024\020\024\032\0020\005XD¢\006\b\n\000\032\004\b\025\020\007R\024\020\026\032\0020\005XD¢\006\b\n\000\032\004\b\027\020\007R\024\020\030\032\0020\005XD¢\006\b\n\000\032\004\b\031\020\007R\024\020\032\032\0020\005XD¢\006\b\n\000\032\004\b\033\020\007¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/configuration/env/JunieRelease;", "Lcom/intellij/ml/llm/matterhorn/configuration/Env;", "<init>", "()V", "hasRedisCache", "", "getHasRedisCache", "()Z", "hasLocalCache", "getHasLocalCache", "hasJbAI", "getHasJbAI", "hasIngrazzio", "getHasIngrazzio", "hasDirectAccess", "getHasDirectAccess", "canSendNonAnonymizedStats", "getCanSendNonAnonymizedStats", "hasMatterhornSettings", "getHasMatterhornSettings", "eapExceptionProcessing", "getEapExceptionProcessing", "hasEAPLicenseAgreement", "getHasEAPLicenseAgreement", "saveCachesOnDisk", "getSaveCachesOnDisk", "binaryAttachments", "getBinaryAttachments", "core"})
/*    */ public final class JunieRelease extends Env {
/*  6 */   public boolean getHasRedisCache() { return hasRedisCache; }
/*  7 */   public boolean getHasLocalCache() { return hasLocalCache; } @NotNull
/*  8 */   public static final JunieRelease INSTANCE = new JunieRelease(); private static final boolean hasRedisCache; private static final boolean hasLocalCache; private static final boolean hasJbAI = true; private static final boolean hasIngrazzio; private static final boolean hasDirectAccess; public boolean getHasJbAI() { return hasJbAI; } private static final boolean canSendNonAnonymizedStats; private static final boolean hasMatterhornSettings; private static final boolean eapExceptionProcessing; private static final boolean hasEAPLicenseAgreement; private static final boolean saveCachesOnDisk; private static final boolean binaryAttachments; public boolean getHasIngrazzio() {
/*  9 */     return hasIngrazzio; }
/* 10 */   public boolean getHasDirectAccess() { return hasDirectAccess; }
/* 11 */   public boolean getCanSendNonAnonymizedStats() { return canSendNonAnonymizedStats; }
/* 12 */   public boolean getHasMatterhornSettings() { return hasMatterhornSettings; }
/* 13 */   public boolean getEapExceptionProcessing() { return eapExceptionProcessing; }
/* 14 */   public boolean getHasEAPLicenseAgreement() { return hasEAPLicenseAgreement; }
/* 15 */   public boolean getSaveCachesOnDisk() { return saveCachesOnDisk; } public boolean getBinaryAttachments() {
/* 16 */     return binaryAttachments;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\configuration\env\JunieRelease.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */