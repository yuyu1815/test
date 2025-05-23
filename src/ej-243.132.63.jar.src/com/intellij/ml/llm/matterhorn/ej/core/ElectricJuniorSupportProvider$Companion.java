/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.application.ApplicationInfo;
/*     */ import com.intellij.openapi.extensions.ExtensionPointName;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\t\032\0020\n2\006\020\013\032\0020\fR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nElectricJuniorSupportProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricJuniorSupportProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,91:1\n11483#2,9:92\n13409#2:101\n13410#2:103\n11492#2:104\n11165#2:105\n11500#2,3:106\n1#3:102\n24#4:109\n*S KotlinDebug\n*F\n+ 1 ElectricJuniorSupportProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion\n*L\n20#1:92,9\n20#1:101\n20#1:103\n20#1:104\n30#1:105\n30#1:106,3\n20#1:102\n33#1:109\n*E\n"})
/*     */ public final class Companion {
/*     */   @NotNull
/*  15 */   public final ExtensionPointName<ElectricJuniorSupportProvider> getEP_NAME() { return EP_NAME; } @NotNull
/*  16 */   private static final ExtensionPointName<ElectricJuniorSupportProvider> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.matterhorn.ejSupportProvider");
/*     */   
/*     */   @NotNull
/*     */   public final ElectricJuniorSupport getSupport(@NotNull Project project) {
/*  20 */     Intrinsics.checkNotNullParameter(project, "project"); Object[] $this$mapNotNull$iv = EP_NAME.getExtensions(); int $i$f$mapNotNull = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     Object[] arrayOfObject1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     Object[] $this$forEach$iv$iv$iv = arrayOfObject1; int $i$f$forEach = 0;
/* 101 */     byte b1 = 0; int i = $this$forEach$iv$iv$iv.length; if (b1 < i) { Object element$iv$iv$iv = $this$forEach$iv$iv$iv[b1], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; ElectricJuniorSupportProvider it = (ElectricJuniorSupportProvider)element$iv$iv;
/*     */       int $i$a$-mapNotNull-ElectricJuniorSupportProvider$Companion$getSupport$supports$1 = 0; }
/*     */     
/* 104 */     List supports = (List)destination$iv$iv; SupportWithReason reason = (SupportWithReason)CollectionsKt.singleOrNull(supports); StringBuilder stringBuilder1 = new StringBuilder(), $this$getSupport_u24lambda_u243 = stringBuilder1; int $i$a$-buildString-ElectricJuniorSupportProvider$Companion$getSupport$message$1 = 0; $this$getSupport_u24lambda_u243.append("Expected single provider, found supports: ["); $this$getSupport_u24lambda_u243.append(CollectionsKt.joinToString$default(supports, ", ", null, null, 0, null, Companion::getSupport$lambda$3$lambda$1, 30, null)); Intrinsics.checkNotNullExpressionValue($this$getSupport_u24lambda_u243.append("]"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getSupport_u24lambda_u243.append("]").append('\n'), "append(...)"); $this$getSupport_u24lambda_u243.append("]").append('\n'); StringBuilder stringBuilder2 = $this$getSupport_u24lambda_u243; Object[] $this$map$iv = EP_NAME.getExtensions(); int $i$f$map = 0;
/* 105 */     Object[] arrayOfObject2 = $this$map$iv; Collection<String> collection = new ArrayList($this$map$iv.length); int $i$f$mapTo = 0; byte b2; int j;
/* 106 */     for (b2 = 0, j = arrayOfObject2.length; b2 < j; ) { Object item$iv$iv = arrayOfObject2[b2];
/* 107 */       Object it$iv$iv = item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-ElectricJuniorSupportProvider$Companion$getSupport$message$1$2 = 0; collection1.add(it$iv$iv.getClass().getName()); }
/* 108 */      String str1 = "Available support providers: " + (List)collection + ", "; Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(str1), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(str1).append('\n'), "append(...)"); stringBuilder2.append(str1).append('\n'); Intrinsics.checkNotNullExpressionValue($this$getSupport_u24lambda_u243.append("Product: " + ApplicationInfo.getInstance().getVersionName()), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getSupport_u24lambda_u243.append("Product: " + ApplicationInfo.getInstance().getVersionName()).append('\n'), "append(...)"); $this$getSupport_u24lambda_u243.append("Product: " + ApplicationInfo.getInstance().getVersionName()).append('\n'); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); String message = stringBuilder1.toString(); Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/* 109 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Companion.class), "getInstance(...)"); Logger.getInstance(Companion.class).error(message);
/*     */     return ((reason != null) ? reason : DefaultJunieSupportProviderKt.defaultSupport()).getSupport();
/*     */   }
/*     */   
/*     */   private static final CharSequence getSupport$lambda$3$lambda$1(SupportWithReason it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getSupport().getClass().getName() + " :" + it.getSupport().getClass().getName();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ElectricJuniorSupportProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */