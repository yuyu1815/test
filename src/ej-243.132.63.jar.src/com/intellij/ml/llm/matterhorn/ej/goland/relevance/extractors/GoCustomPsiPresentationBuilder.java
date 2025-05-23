/*    */ package com.intellij.ml.llm.matterhorn.ej.goland.relevance.extractors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\022\020\b\032\0020\t2\b\020\f\032\004\030\0010\rH\026J\020\020\016\032\0020\t2\006\020\n\032\0020\013H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoCustomPsiPresentationBuilder;", "Lcom/goide/psi/presentation/GoPsiPresentationBuilder;", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;)V", "getParams", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "build", "", "parameters", "Lcom/goide/psi/GoParameters;", "result", "Lcom/goide/psi/GoResult;", "buildNamesOnly", "ej-goland"})
/*    */ @SourceDebugExtension({"SMAP\nGoCustomPsiPresentationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoCustomPsiPresentationBuilder.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoCustomPsiPresentationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1611#2,9:34\n1863#2:43\n1864#2:45\n1620#2:46\n1#3:44\n*S KotlinDebug\n*F\n+ 1 GoCustomPsiPresentationBuilder.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/relevance/extractors/GoCustomPsiPresentationBuilder\n*L\n32#1:34,9\n32#1:43\n32#1:45\n32#1:46\n32#1:44\n*E\n"})
/*    */ public final class GoCustomPsiPresentationBuilder extends GoPsiPresentationBuilder {
/*  9 */   public GoCustomPsiPresentationBuilder(@NotNull ElementProvider.ShowMethodsParametersType params) { this.params = params;
/*    */     
/* 11 */     oneline();
/* 12 */     withoutStructureAndInterfaceContent();
/* 13 */     withoutResolve(); }
/*    */   @NotNull
/*    */   private final ElementProvider.ShowMethodsParametersType params; @NotNull
/*    */   public final ElementProvider.ShowMethodsParametersType getParams() { return this.params; } @NotNull
/* 17 */   public String build(@NotNull GoParameters parameters) { Intrinsics.checkNotNullParameter(parameters, "parameters"); switch (WhenMappings.$EnumSwitchMapping$0[this.params.ordinal()]) { case 1:
/* 18 */         Intrinsics.checkNotNullExpressionValue(super.build(parameters), "build(...)");
/*    */       case 2:
/*    */       
/*    */       case 3:
/*    */        }
/*    */     
/*    */     throw new NoWhenBranchMatchedException(); } @NotNull
/* 25 */   public String build(@Nullable GoResult result) { switch (WhenMappings.$EnumSwitchMapping$0[this.params.ordinal()]) { case 1:
/* 26 */         Intrinsics.checkNotNullExpressionValue(super.build(result), "build(...)");
/*    */       case 2:
/*    */       case 3:
/*    */        }
/*    */     
/*    */     throw new NoWhenBranchMatchedException(); } private final String buildNamesOnly(GoParameters parameters) {
/* 32 */     Intrinsics.checkNotNullExpressionValue(parameters.getDefinitionList(), "getDefinitionList(...)"); Iterable $this$mapNotNull$iv = parameters.getDefinitionList(); int $i$f$mapNotNull = 0;
/*    */     
/* 34 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 43 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; GoParamDefinition it = (GoParamDefinition)element$iv$iv;
/*    */       int $i$a$-mapNotNull-GoCustomPsiPresentationBuilder$buildNamesOnly$1 = 0; }
/*    */     
/* 46 */     return CollectionsKt.joinToString$default(destination$iv$iv, ", ", null, null, 0, null, null, 62, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\relevance\extractors\GoCustomPsiPresentationBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */