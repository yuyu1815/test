/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ide.Region;
/*     */ import com.intellij.ide.gdpr.EndUserAgreement;
/*     */ import com.intellij.ide.gdpr.Version;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.nio.charset.Charset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.io.TextStreamsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\002\032\020\020\003\032\0020\0042\006\020\005\032\0020\006H\002\032\020\020\b\032\0020\0042\006\020\005\032\0020\006H\002\032\016\020\013\032\0020\f2\006\020\r\032\0020\004\"\016\020\007\032\0020\004XT¢\006\002\n\000\"\016\020\t\032\0020\004XT¢\006\002\n\000\"\016\020\n\032\0020\004XT¢\006\002\n\000\"\016\020\016\032\0020\017X\004¢\006\002\n\000¨\006\020"}, d2 = {"toModelVersion", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "Lcom/intellij/ide/gdpr/Version;", "regionalDocumentUnmappedUrl", "", "region", "Lcom/intellij/ide/Region;", "acceptableUsePolicyUnmappedUrl", "regionalDocumentName", "aiEua", "aiEua_cn", "loadDocumentBlocking", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "docName", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAipLicenseAgreementRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseAgreementRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryKt\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,127:1\n58#2:128\n36#2,2:129\n*S KotlinDebug\n*F\n+ 1 JunieAipLicenseAgreementRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepositoryKt\n*L\n126#1:128\n126#1:129,2\n*E\n"})
/*     */ public final class JunieAipLicenseAgreementRepositoryKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String acceptableUsePolicyUnmappedUrl = "https://www.jetbrains.com/legal/docs/terms/jetbrains-ai/acceptable-use/";
/*     */   @NotNull
/*     */   private static final String aiEua = "aiEua";
/*     */   @NotNull
/*     */   private static final String aiEua_cn = "aiEua_cn";
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   private static final AipLicenseAgreement.Version toModelVersion(Version $this$toModelVersion) {
/*  99 */     return AipLicenseAgreement.Version.Companion.of($this$toModelVersion.getMajor(), $this$toModelVersion.getMinor());
/*     */   }
/*     */   private static final String regionalDocumentUnmappedUrl(Region region) {
/* 102 */     return 
/* 103 */       (WhenMappings.$EnumSwitchMapping$0[region.ordinal()] == 1) ? "https://www.jetbrains.com/legal/docs/terms/jetbrains-ai-service-cn/" : 
/* 104 */       "https://www.jetbrains.com/legal/docs/terms/jetbrains-ai-service/";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String regionalDocumentName(Region region) {
/* 111 */     return 
/* 112 */       (WhenMappings.$EnumSwitchMapping$0[region.ordinal()] == 1) ? "aiEua_cn" : 
/* 113 */       "aiEua";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final EndUserAgreement.Document loadDocumentBlocking(@NotNull String docName) {
/*     */     Throwable throwable;
/* 121 */     Intrinsics.checkNotNullParameter(docName, "docName"); Intrinsics.checkNotNull(JunieAipLicenseAgreementRepositoryImpl.class.getResourceAsStream("/" + docName + ".html")); InputStream inputStream = JunieAipLicenseAgreementRepositoryImpl.class.getResourceAsStream("/" + docName + ".html"); Charset charset = Charsets.UTF_8; InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset); charset = null; try { InputStreamReader reader = inputStreamReader; int $i$a$-use-JunieAipLicenseAgreementRepositoryKt$loadDocumentBlocking$1 = 0; EndUserAgreement.Document document = 
/* 122 */         new EndUserAgreement.Document(docName, TextStreamsKt.readText(reader)); }
/*     */     catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; }
/*     */     finally
/*     */     { CloseableKt.closeFinally(inputStreamReader, throwable); }
/* 126 */      return document; } static { int $i$f$fileLogger = 0;
/*     */     
/* 128 */     int $i$f$currentClassLogger = 0;
/* 129 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 130 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseAgreementRepositoryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */