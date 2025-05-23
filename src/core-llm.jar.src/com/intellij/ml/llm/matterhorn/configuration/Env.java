/*    */ package com.intellij.ml.llm.matterhorn.configuration;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\025\n\002\020\b\n\002\b\007\b&\030\0002\0020\001B\007¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\tX¦\004¢\006\006\032\004\b\r\020\013R\022\020\016\032\0020\tX¦\004¢\006\006\032\004\b\017\020\013R\022\020\020\032\0020\tX¦\004¢\006\006\032\004\b\021\020\013R\022\020\022\032\0020\tX¦\004¢\006\006\032\004\b\023\020\013R\022\020\024\032\0020\tX¦\004¢\006\006\032\004\b\025\020\013R\022\020\026\032\0020\tX¦\004¢\006\006\032\004\b\027\020\013R\022\020\030\032\0020\tX¦\004¢\006\006\032\004\b\031\020\013R\022\020\032\032\0020\tX¦\004¢\006\006\032\004\b\033\020\013R\022\020\034\032\0020\tX¦\004¢\006\006\032\004\b\035\020\013R\024\020\036\032\0020\037XD¢\006\b\n\000\032\004\b \020!R\024\020\"\032\0020\t8VX\004¢\006\006\032\004\b#\020\013R\024\020$\032\0020\t8VX\004¢\006\006\032\004\b%\020\013¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/configuration/Env;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "hasRedisCache", "", "getHasRedisCache", "()Z", "hasLocalCache", "getHasLocalCache", "hasJbAI", "getHasJbAI", "hasIngrazzio", "getHasIngrazzio", "hasDirectAccess", "getHasDirectAccess", "canSendNonAnonymizedStats", "getCanSendNonAnonymizedStats", "hasEAPLicenseAgreement", "getHasEAPLicenseAgreement", "hasMatterhornSettings", "getHasMatterhornSettings", "eapExceptionProcessing", "getEapExceptionProcessing", "binaryAttachments", "getBinaryAttachments", "trialDays", "", "getTrialDays", "()I", "matterhornEnvironmentServerMode", "getMatterhornEnvironmentServerMode", "saveCachesOnDisk", "getSaveCachesOnDisk", "core"})
/*    */ @SourceDebugExtension({"SMAP\nEnv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Env.kt\ncom/intellij/ml/llm/matterhorn/configuration/Env\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,33:1\n14#2:34\n*S KotlinDebug\n*F\n+ 1 Env.kt\ncom/intellij/ml/llm/matterhorn/configuration/Env\n*L\n9#1:34\n*E\n"})
/*    */ public abstract class Env {
/*    */   public Env() {
/*  9 */     int $i$f$logger = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Env.class), "getInstance(...)"); this.logger = Logger.getInstance(Env.class);
/*    */     this.logger.info("Environment: " + getClass().getName());
/*    */     this.trialDays = 30;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Logger logger;
/*    */   private final int trialDays;
/*    */   
/*    */   @NotNull
/*    */   public final Logger getLogger() {
/*    */     return this.logger;
/*    */   }
/*    */   
/*    */   public abstract boolean getHasRedisCache();
/*    */   
/*    */   public abstract boolean getHasLocalCache();
/*    */   
/*    */   public abstract boolean getHasJbAI();
/*    */   
/*    */   public abstract boolean getHasIngrazzio();
/*    */   
/*    */   public abstract boolean getHasDirectAccess();
/*    */   
/*    */   public abstract boolean getCanSendNonAnonymizedStats();
/*    */   
/*    */   public abstract boolean getHasEAPLicenseAgreement();
/*    */   
/*    */   public abstract boolean getHasMatterhornSettings();
/*    */   
/*    */   public abstract boolean getEapExceptionProcessing();
/*    */   
/*    */   public abstract boolean getBinaryAttachments();
/*    */   
/*    */   public int getTrialDays() {
/*    */     return this.trialDays;
/*    */   }
/*    */   
/*    */   public boolean getMatterhornEnvironmentServerMode() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public boolean getSaveCachesOnDisk() {
/*    */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\configuration\Env.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */