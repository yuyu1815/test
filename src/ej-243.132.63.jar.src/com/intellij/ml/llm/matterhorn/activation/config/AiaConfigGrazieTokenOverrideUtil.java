/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.util.SystemProperties;
/*    */ import java.io.File;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.io.FilesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\t\n\002\b\007\n\002\030\002\n\002\b\002\bÁ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\017\032\0020\020H\002J\b\020\021\032\004\030\0010\005R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000R\033\020\n\032\0020\0058BX\002¢\006\f\n\004\b\r\020\016\032\004\b\013\020\f¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/config/AiaConfigGrazieTokenOverrideUtil;", "", "<init>", "()V", "ENVIRONMENT_VARIABLE_KEY", "", "TOKEN_FILE_NAME", "MIN_TOKEN_SIZE", "", "MAX_TOKEN_SIZE", "userHome", "getUserHome", "()Ljava/lang/String;", "userHome$delegate", "Lkotlin/Lazy;", "getTokenFile", "Ljava/io/File;", "getOverriddenGrazieToken", "config"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class AiaConfigGrazieTokenOverrideUtil
/*    */ {
/*    */   @NotNull
/*    */   private static final String ENVIRONMENT_VARIABLE_KEY = "AI_ASSISTANT_GRAZIE_TOKEN";
/*    */   @NotNull
/*    */   private static final String TOKEN_FILE_NAME = ".ai-assistant-staging-test-token";
/*    */   private static final long MIN_TOKEN_SIZE = 580L;
/*    */   @NotNull
/* 41 */   public static final AiaConfigGrazieTokenOverrideUtil INSTANCE = new AiaConfigGrazieTokenOverrideUtil(); private static final long MAX_TOKEN_SIZE = 8192L; @NotNull private static final Lazy userHome$delegate = LazyKt.lazy(AiaConfigGrazieTokenOverrideUtil::userHome_delegate$lambda$0); public static final int $stable = 8; private final String getUserHome() { Lazy lazy = userHome$delegate; return (String)lazy.getValue(); } private static final String userHome_delegate$lambda$0() { Intrinsics.checkNotNullExpressionValue(SystemProperties.getUserHome(), "getUserHome(...)"); return SystemProperties.getUserHome(); }
/*    */   
/*    */   private final File getTokenFile() {
/* 44 */     return new File(getUserHome(), ".ai-assistant-staging-test-token");
/*    */   }
/*    */   @Nullable
/*    */   public final String getOverriddenGrazieToken() {
/* 48 */     String tokenFromEnvironmentVariable = System.getenv("AI_ASSISTANT_GRAZIE_TOKEN");
/*    */     
/* 50 */     if (tokenFromEnvironmentVariable != null) { String it = tokenFromEnvironmentVariable; int $i$a$-let-AiaConfigGrazieTokenOverrideUtil$getOverriddenGrazieToken$1 = 0;
/* 51 */       AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn("Environment variable AI_ASSISTANT_GRAZIE_TOKEN was found. This will be used as the Grazie token.");
/* 52 */       return StringsKt.trim(it).toString(); }
/*    */ 
/*    */     
/* 55 */     File tokenFile = getTokenFile();
/*    */     
/*    */     try {
/* 58 */       if (!tokenFile.exists()) {
/* 59 */         AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn("Grazie token override is enabled, but environment variable AI_ASSISTANT_GRAZIE_TOKEN and file .ai-assistant-staging-test-token in " + getUserHome() + " do not exist.");
/* 60 */         return null;
/*    */       } 
/*    */       
/* 63 */       long tokenFileLength = tokenFile.length();
/*    */       
/* 65 */       if (tokenFile.length() < 580L) {
/* 66 */         AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn(".ai-assistant-staging-test-token in " + getUserHome() + " was found, but it has " + tokenFileLength + " bytes and it should be at least 580. It's fine if the token has leading or trailing whitespaces.");
/*    */         
/* 68 */         return null;
/*    */       } 
/*    */       
/* 71 */       if (tokenFile.length() > 8192L) {
/* 72 */         AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn(".ai-assistant-staging-test-token in " + getUserHome() + " was found, but it has " + tokenFileLength + " bytes and it should be a maximum of 8192. It's fine if the token has leading or trailing whitespaces.");
/*    */         
/* 74 */         return null;
/*    */       } 
/*    */       
/* 77 */       AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn(".ai-assistant-staging-test-token in " + getUserHome() + " was found. This will be used as the Grazie token.");
/*    */       
/* 79 */       return StringsKt.trim(FilesKt.readText$default(tokenFile, null, 1, null)).toString();
/*    */     }
/* 81 */     catch (SecurityException e) {
/* 82 */       AiaConfigGrazieTokenOverrideUtilKt.access$getLOG$p().warn("Grazie token override is enabled, but reading .ai-assistant-staging-test-token in " + getUserHome() + " led to this exception: ", e);
/*    */ 
/*    */       
/* 85 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfigGrazieTokenOverrideUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */