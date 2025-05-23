/*    */ package com.intellij.ml.llm.matterhorn.ej.core.eula;
/*    */ import com.intellij.ide.Prefs;
/*    */ import com.intellij.ide.gdpr.EndUserAgreement;
/*    */ import com.intellij.ide.gdpr.Version;
/*    */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*    */ import com.intellij.ml.llm.matterhorn.configuration.EnvExtensionsKt;
/*    */ import com.intellij.util.ResourceUtil;
/*    */ import java.io.InputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.io.CloseableKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\006\032\0020\005J\016\020\007\032\0020\b2\006\020\t\032\0020\005J\016\020\n\032\0020\0132\006\020\t\032\0020\005J\026\020\f\032\0020\r2\006\020\t\032\0020\0052\006\020\016\032\0020\013J\020\020\017\032\0020\0052\006\020\t\032\0020\005H\002J\b\020\020\032\0020\rH\007J\r\020\021\032\0020\022H\000¢\006\002\b\023R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreement;", "", "<init>", "()V", "AGREEMENT_DOC", "", "getDocumentName", "isPrivacyPolicyAccepted", "", "docName", "getAcceptedPrivacyPolicyVersion", "Lcom/intellij/ide/gdpr/Version;", "setAcceptedPrivacyPolicyVersion", "", "version", "getAcceptedVersionKey", "dropAgreement", "getLatestAgreement", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "getLatestAgreement$ej_core", "ej-core"})
/*    */ @Internal
/*    */ public final class JunieAgreement {
/*    */   @NotNull
/* 19 */   public static final JunieAgreement INSTANCE = new JunieAgreement(); static {
/* 20 */     EnvExtensionsKt.assertHasEAPLicenseAgreement(BuildConfigKt.getConfig());
/*    */   }
/*    */   @NotNull
/*    */   private static final String AGREEMENT_DOC = "junieEula";
/*    */   @NotNull
/*    */   public final String getDocumentName() {
/* 26 */     return "junieEula";
/*    */   }
/*    */   
/*    */   public final boolean isPrivacyPolicyAccepted(@NotNull String docName) {
/* 30 */     Intrinsics.checkNotNullParameter(docName, "docName"); return !getAcceptedPrivacyPolicyVersion(docName).isUnknown();
/*    */   }
/*    */   @NotNull
/*    */   public final Version getAcceptedPrivacyPolicyVersion(@NotNull String docName) {
/* 34 */     Intrinsics.checkNotNullParameter(docName, "docName"); Intrinsics.checkNotNullExpressionValue(Version.fromString(Prefs.get(getAcceptedVersionKey(docName), null)), "fromString(...)"); return Version.fromString(Prefs.get(getAcceptedVersionKey(docName), null));
/*    */   }
/*    */   
/*    */   public final void setAcceptedPrivacyPolicyVersion(@NotNull String docName, @NotNull Version version) {
/* 38 */     Intrinsics.checkNotNullParameter(docName, "docName"); Intrinsics.checkNotNullParameter(version, "version"); Prefs.put(getAcceptedVersionKey(docName), version.toString());
/*    */   }
/*    */   
/*    */   private final String getAcceptedVersionKey(String docName) {
/* 42 */     return "JetBrains.privacy_policy." + docName + "_accepted_version";
/*    */   }
/*    */   
/*    */   @Internal
/*    */   public final void dropAgreement() {
/* 47 */     Prefs.remove(getAcceptedVersionKey(getDocumentName()));
/*    */   }
/*    */   @NotNull
/*    */   public final EndUserAgreement.Document getLatestAgreement$ej_core() {
/* 51 */     String docName = "junieEula";
/*    */     
/* 53 */     InputStream inputStream = JunieAgreement.class.getResourceAsStream("/" + docName + ".html"); Throwable throwable = null; try { InputStream input = inputStream; int $i$a$-use-JunieAgreement$getLatestAgreement$1 = 0;
/* 54 */       if (input == null) throw new IllegalStateException(
/* 55 */             "Can't find Junie EULA bundled text".toString());
/*    */       
/* 57 */       EndUserAgreement.Document document = new EndUserAgreement.Document(docName, ResourceUtil.loadText(input)); }
/*    */     catch (Throwable throwable1)
/*    */     { throwable = throwable1 = null;
/*    */       throw throwable1; }
/*    */     finally
/*    */     { CloseableKt.closeFinally(inputStream, throwable); }
/*    */     
/*    */     return document;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\eula\JunieAgreement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */