/*    */ package org.jetbrains.jewel.bridge;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*    */ import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior;
/*    */ 
/*    */ @DebugMetadata(f = "SwingBridgeService.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.SwingBridgeService$currentBridgeThemeData$1$1")
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\002\032\0020\0042\006\020\002\032\0020\005H\n"}, d2 = {"<anonymous>", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "<unused var>", "", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;"})
/*    */ final class SwingBridgeService$currentBridgeThemeData$1$1 extends SuspendLambda implements Function4<Unit, ScrollbarVisibility, TrackClickBehavior, Continuation<? super SwingBridgeService.BridgeThemeData>, Object> {
/*    */   int label;
/*    */   
/*    */   SwingBridgeService$currentBridgeThemeData$1$1(Continuation $completion) {
/*    */     super(4, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 23 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */ 
/*    */ 
/*    */         
/* 27 */         this.label = 1; if (SwingBridgeService.access$tryGettingThemeData(SwingBridgeService.this, (Continuation)this) == object) return object;  return SwingBridgeService.access$tryGettingThemeData(SwingBridgeService.this, (Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(Unit p1, ScrollbarVisibility p2, TrackClickBehavior p3, Continuation<? super SwingBridgeService$currentBridgeThemeData$1$1> p4) {
/*    */     return (new SwingBridgeService$currentBridgeThemeData$1$1(p4)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\SwingBridgeService$currentBridgeThemeData$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */