/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000(\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\032\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002H\b¢\006\002\020\003\032J\020\004\032\b\022\004\022\002H\0060\005\"\b\b\000\020\001*\0020\007\"\004\b\001\020\006*\b\022\004\022\002H\0010\b2\037\b\004\020\t\032\031\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0060\0050\n¢\006\002\b\013H\n\032D\020\f\032\b\022\004\022\002H\0060\005\"\b\b\000\020\001*\0020\007\"\004\b\001\020\006*\b\022\004\022\002H\0010\b2\031\b\004\020\f\032\023\022\004\022\002H\001\022\004\022\002H\0060\n¢\006\002\b\013H\b¨\006\r"}, d2 = {"rememberDataStore", "T", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore;", "()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "R", "", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "flow", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "value", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nAiaDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,83:1\n40#2,3:84\n189#3:87\n49#4:88\n51#4:92\n46#5:89\n51#5:91\n105#6:90\n*S KotlinDebug\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n*L\n47#1:84,3\n75#1:87\n79#1:88\n79#1:92\n79#1:89\n79#1:91\n79#1:90\n*E\n"})
/*    */ public final class AiaDataStoreKt
/*    */ {
/*    */   private static final <T, R> Flow<R> invoke(AiaServiceSupport $this$invoke, Function1 flow) {
/* 75 */     Intrinsics.checkNotNullParameter($this$invoke, "<this>"); int $i$f$invoke = 0; Flow $this$flatMapLatest$iv = $this$invoke.instanceFlow(); int $i$f$flatMapLatest = 0; return 
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
/* 87 */       FlowKt.transformLatest($this$flatMapLatest$iv, new AiaDataStoreKt$invoke$$inlined$flatMapLatest$1(null, flow)); } private static final <T, R> Flow<R> value(AiaServiceSupport $this$value, Function1 value) { int $i$f$value = 0; Flow $this$map$iv = $this$value.instanceFlow(); int $i$f$map = 0;
/* 88 */     Flow $this$unsafeTransform$iv$iv = $this$map$iv; int $i$f$unsafeTransform = 0;
/* 89 */     int $i$f$unsafeFlow = 0;
/* 90 */     return new AiaDataStoreKt$value$$inlined$map$1($this$unsafeTransform$iv$iv, value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AiaDataStoreKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */