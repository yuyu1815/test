/*     */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyContainer;
/*     */ import com.intellij.openapi.extensions.ExtensionPointName;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\007\032\b\022\004\022\0020\t0\bR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornProperties;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyContainer;", "collectAllProperties", "", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornSettingsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1368#2:322\n1454#2,5:323\n*S KotlinDebug\n*F\n+ 1 MatterhornSettingsService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornProperties\n*L\n120#1:322\n120#1:323,5\n*E\n"})
/*     */ public final class MatterhornProperties
/*     */ {
/*     */   @NotNull
/* 117 */   public static final MatterhornProperties INSTANCE = new MatterhornProperties(); @NotNull private static final ExtensionPointName<MatterhornPropertyContainer> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.propertyContainer");
/*     */   @NotNull
/*     */   public final List<MatterhornProperty> collectAllProperties() {
/* 120 */     Iterable $this$flatMap$iv = EP_NAME.getExtensionList(); int $i$f$flatMap = 0;
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
/* 322 */     Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 323 */     for (Object element$iv$iv : iterable1) {
/* 324 */       MatterhornPropertyContainer it = (MatterhornPropertyContainer)element$iv$iv; int $i$a$-flatMap-MatterhornProperties$collectAllProperties$1 = 0; Iterable list$iv$iv = it.getProperties();
/* 325 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */     } 
/* 327 */     return (List<MatterhornProperty>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornProperties.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */