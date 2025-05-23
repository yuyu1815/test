/*    */ package com.intellij.ml.llm.matterhorn.ej.core.eula;
/*    */ 
/*    */ import com.intellij.DynamicBundle;
/*    */ import com.intellij.ide.gdpr.EndUserAgreement;
/*    */ import com.intellij.ide.gdpr.Version;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.EJCoreBundle;
/*    */ import java.util.ResourceBundle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\006\020\016\032\0020\005J\016\020\017\032\0020\0052\006\020\020\032\0020\021J\006\020\022\032\0020\005J\006\020\023\032\0020\005J\006\020\024\032\0020\005J\006\020\025\032\0020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\n\032\0020\0138BX\004¢\006\006\032\004\b\f\020\r¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/JunieAgreementUiData;", "", "document", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "tosUrl", "", "<init>", "(Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Ljava/lang/String;)V", "getDocument", "()Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "commonEulaBundle", "Ljava/util/ResourceBundle;", "getCommonEulaBundle", "()Ljava/util/ResourceBundle;", "getTitle", "getAcceptanceText", "acceptedVersion", "Lcom/intellij/ide/gdpr/Version;", "getCheckboxText", "getAgreeButtonText", "getContinueButtonText", "getDeclinedButtonText", "ej-core"})
/*    */ public final class JunieAgreementUiData
/*    */ {
/*    */   @NotNull
/*    */   private final EndUserAgreement.Document document;
/*    */   @NotNull
/*    */   private final String tosUrl;
/*    */   
/*    */   public JunieAgreementUiData(@NotNull EndUserAgreement.Document document, @NotNull String tosUrl) {
/* 63 */     this.document = document; this.tosUrl = tosUrl; } @NotNull public final EndUserAgreement.Document getDocument() { return this.document; }
/*    */   
/*    */   private final ResourceBundle getCommonEulaBundle() {
/* 66 */     Intrinsics.checkNotNullExpressionValue(DynamicBundle.getResourceBundle(getClass().getClassLoader(), "messages.AgreementsBundle"), "getResourceBundle(...)"); return DynamicBundle.getResourceBundle(getClass().getClassLoader(), "messages.AgreementsBundle");
/*    */   } @NotNull
/*    */   public final String getTitle() {
/* 69 */     return EJCoreBundle.message("agreement.title", new Object[0]);
/*    */   }
/*    */   @NotNull
/*    */   public final String getAcceptanceText(@NotNull Version acceptedVersion) {
/* 73 */     Intrinsics.checkNotNullParameter(acceptedVersion, "acceptedVersion"); String agreeButtonText = getAgreeButtonText();
/* 74 */     if (acceptedVersion.isUnknown()) {
/* 75 */       Object[] arrayOfObject1 = new Object[2]; arrayOfObject1[0] = agreeButtonText; arrayOfObject1[1] = this.tosUrl; return EJCoreBundle.message("agreement.content", arrayOfObject1);
/*    */     } 
/* 77 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = agreeButtonText; arrayOfObject[1] = this.tosUrl; return EJCoreBundle.message("agreement.content.update", arrayOfObject);
/*    */   }
/*    */   @NotNull
/*    */   public final String getCheckboxText() {
/* 81 */     Intrinsics.checkNotNullExpressionValue(getCommonEulaBundle().getString("userAgreement.dialog.checkBox"), "getString(...)"); return getCommonEulaBundle().getString("userAgreement.dialog.checkBox");
/*    */   }
/*    */   @NotNull
/*    */   public final String getAgreeButtonText() {
/* 85 */     return EJCoreBundle.message("agreement.agree", new Object[0]);
/*    */   }
/*    */   @NotNull
/*    */   public final String getContinueButtonText() {
/* 89 */     Intrinsics.checkNotNullExpressionValue(getCommonEulaBundle().getString("userAgreement.dialog.continue"), "getString(...)"); return getCommonEulaBundle().getString("userAgreement.dialog.continue");
/*    */   }
/*    */   @NotNull
/*    */   public final String getDeclinedButtonText() {
/* 93 */     return EJCoreBundle.message("agreement.decline", new Object[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\eula\JunieAgreementUiData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */