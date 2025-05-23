/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.MutableSharedFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\002\b\001\030\000 \0202\0020\0012\0020\002:\001\020B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\n\032\0020\0132\006\020\f\032\0020\tH\026J\034\020\r\032\0020\0132\022\020\016\032\016\022\004\022\0020\t\022\004\022\0020\0130\017H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventProducer;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventConsumer;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEvent;", "produce", "", "event", "consume", "onEvent", "Lkotlin/Function1;", "Companion", "ej-android"})
/*    */ public final class AndroidTestResultListenerEventBus implements AndroidTestResultEventProducer, AndroidTestResultEventConsumer {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CoroutineScope coroutineScope;
/*    */   @NotNull
/*    */   private final MutableSharedFlow<AndroidTestResultListenerEvent> events;
/*    */   
/*    */   public AndroidTestResultListenerEventBus(@NotNull CoroutineScope coroutineScope) {
/* 27 */     this.coroutineScope = coroutineScope;
/*    */     
/* 29 */     this.events = SharedFlowKt.MutableSharedFlow$default(0, 
/* 30 */         512, 
/* 31 */         BufferOverflow.DROP_OLDEST, 1, null);
/*    */   }
/*    */   
/*    */   public void produce(@NotNull AndroidTestResultListenerEvent event) {
/* 35 */     Intrinsics.checkNotNullParameter(event, "event"); this.events.tryEmit(event);
/*    */   }
/*    */   
/*    */   public void consume(@NotNull Function1<? super AndroidTestResultListenerEvent, Unit> onEvent) {
/* 39 */     Intrinsics.checkNotNullParameter(onEvent, "onEvent"); BuildersKt.launch$default(this.coroutineScope, null, null, new AndroidTestResultListenerEventBus$consume$1(onEvent, null), 3, null); } @DebugMetadata(f = "AndroidTestResultListenerEvent.kt", l = {39}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.android.connectedTest.AndroidTestResultListenerEventBus$consume$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AndroidTestResultListenerEventBus$consume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (AndroidTestResultListenerEventBus.this.events.collect(new FlowCollector(this.$onEvent) { public final Object emit(AndroidTestResultListenerEvent it, Continuation $completion) { this.$onEvent.invoke(it); return Unit.INSTANCE; } }, (Continuation)this) == object) return object;  AndroidTestResultListenerEventBus.this.events.collect(new FlowCollector(this.$onEvent) { public final Object emit(AndroidTestResultListenerEvent it, Continuation $completion) { this.$onEvent.invoke(it); return Unit.INSTANCE; } }, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } AndroidTestResultListenerEventBus$consume$1(Function1<AndroidTestResultListenerEvent, Unit> $onEvent, Continuation $completion) { super(2, $completion); } public final Continuation<Unit> create(Object value, Continuation<? super AndroidTestResultListenerEventBus$consume$1> $completion) { return (Continuation<Unit>)new AndroidTestResultListenerEventBus$consume$1(this.$onEvent, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((AndroidTestResultListenerEventBus$consume$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus;", "ej-android"}) @SourceDebugExtension({"SMAP\nAndroidTestResultListenerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTestResultListenerEvent.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,46:1\n40#2,3:47\n*S KotlinDebug\n*F\n+ 1 AndroidTestResultListenerEvent.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion\n*L\n43#1:47,3\n*E\n"}) public static final class Companion
/*    */   {
/*    */     @NotNull
/* 43 */     public final AndroidTestResultListenerEventBus getInstance() { int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */       
/* 47 */       Class<AndroidTestResultListenerEventBus> serviceClass$iv = AndroidTestResultListenerEventBus.class;
/* 48 */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 49 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */       
/*    */       return (AndroidTestResultListenerEventBus)ApplicationManager.getApplication().getService(serviceClass$iv); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultListenerEventBus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */