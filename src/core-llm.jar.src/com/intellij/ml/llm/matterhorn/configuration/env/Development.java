/*    */ package com.intellij.ml.llm.matterhorn.configuration.env;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\021\n\002\020\b\n\002\b\007\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\005XD¢\006\b\n\000\032\004\b\t\020\007R\024\020\n\032\0020\005XD¢\006\b\n\000\032\004\b\013\020\007R\024\020\f\032\0020\005XD¢\006\b\n\000\032\004\b\r\020\007R\024\020\016\032\0020\005XD¢\006\b\n\000\032\004\b\017\020\007R\024\020\020\032\0020\005XD¢\006\b\n\000\032\004\b\021\020\007R\024\020\022\032\0020\005XD¢\006\b\n\000\032\004\b\023\020\007R\024\020\024\032\0020\005XD¢\006\b\n\000\032\004\b\025\020\007R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031R\024\020\032\032\0020\005XD¢\006\b\n\000\032\004\b\033\020\007R\024\020\034\032\0020\005XD¢\006\b\n\000\032\004\b\035\020\007¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/configuration/env/Development;", "Lcom/intellij/ml/llm/matterhorn/configuration/Env;", "<init>", "()V", "hasRedisCache", "", "getHasRedisCache", "()Z", "hasLocalCache", "getHasLocalCache", "hasJbAI", "getHasJbAI", "hasIngrazzio", "getHasIngrazzio", "hasDirectAccess", "getHasDirectAccess", "canSendNonAnonymizedStats", "getCanSendNonAnonymizedStats", "hasMatterhornSettings", "getHasMatterhornSettings", "eapExceptionProcessing", "getEapExceptionProcessing", "trialDays", "", "getTrialDays", "()I", "hasEAPLicenseAgreement", "getHasEAPLicenseAgreement", "binaryAttachments", "getBinaryAttachments", "core"})
/*    */ public final class Development extends Env {
/*    */   @NotNull
/*  6 */   public static final Development INSTANCE = new Development(); private static final boolean hasRedisCache = true; public boolean getHasRedisCache() { return hasRedisCache; } private static final boolean hasLocalCache = true;
/*  7 */   public boolean getHasLocalCache() { return hasLocalCache; } private static final boolean hasJbAI = true;
/*  8 */   public boolean getHasJbAI() { return hasJbAI; } private static final boolean hasIngrazzio = true;
/*  9 */   public boolean getHasIngrazzio() { return hasIngrazzio; } private static final boolean hasDirectAccess = true;
/* 10 */   public boolean getHasDirectAccess() { return hasDirectAccess; } private static final boolean canSendNonAnonymizedStats = true;
/* 11 */   public boolean getCanSendNonAnonymizedStats() { return canSendNonAnonymizedStats; }
/* 12 */   private static final boolean hasMatterhornSettings = true; public boolean getHasMatterhornSettings() { return hasMatterhornSettings; } private static final boolean eapExceptionProcessing; public boolean getEapExceptionProcessing() {
/* 13 */     return eapExceptionProcessing; }
/* 14 */   public int getTrialDays() { return 7; } private static final boolean hasEAPLicenseAgreement = true;
/* 15 */   public boolean getHasEAPLicenseAgreement() { return hasEAPLicenseAgreement; } private static final boolean binaryAttachments = true; public boolean getBinaryAttachments() {
/* 16 */     return binaryAttachments;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\configuration\env\Development.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */