/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.ui.focus.FocusDirection;
/*     */ import androidx.compose.ui.focus.FocusManager;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.tree.KeyActions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class SelectableLazyColumnKt$SelectableLazyColumn$5$1
/*     */   implements Function1<KeyEvent, Boolean>
/*     */ {
/*     */   public final Boolean invoke-ZmokQxo(Object event) {
/*  92 */     Intrinsics.checkNotNullParameter(event, "event"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(event), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(event), Key.Companion.getTab-EK5gGoQ())) {
/*  93 */       int focusDirection = KeyEvent_desktopKt.isShiftPressed-ZmokQxo(event) ? FocusDirection.Companion.getPrevious-dhqQ-8s() : FocusDirection.Companion.getNext-dhqQ-8s();
/*  94 */       this.$focusManager.moveFocus-3ESFkO8(focusDirection);
/*  95 */       return Boolean.valueOf(true);
/*     */     } 
/*  97 */     if (this.$state.getLastActiveItemIndex() != null) {
/*  98 */       boolean actionHandled = ((Boolean)this.$keyActions.handleOnKeyEvent-jhbQyNo(event, this.$keys, this.$state, this.$selectionMode).invoke(KeyEvent.box-impl(event))).booleanValue();
/*  99 */       if (actionHandled) {
/* 100 */         BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$state, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore #6
/*     */                 //   5: aload_0
/*     */                 //   6: getfield label : I
/*     */                 //   9: tableswitch default -> 108, 0 -> 32, 1 -> 91
/*     */                 //   32: aload_1
/*     */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   36: aload_0
/*     */                 //   37: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                 //   40: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */                 //   43: dup
/*     */                 //   44: ifnull -> 103
/*     */                 //   47: astore_2
/*     */                 //   48: aload_0
/*     */                 //   49: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                 //   52: astore_3
/*     */                 //   53: aload_2
/*     */                 //   54: checkcast java/lang/Number
/*     */                 //   57: invokevirtual intValue : ()I
/*     */                 //   60: istore #4
/*     */                 //   62: iconst_0
/*     */                 //   63: istore #5
/*     */                 //   65: aload_3
/*     */                 //   66: iload #4
/*     */                 //   68: iconst_0
/*     */                 //   69: iconst_0
/*     */                 //   70: aload_0
/*     */                 //   71: bipush #6
/*     */                 //   73: aconst_null
/*     */                 //   74: aload_0
/*     */                 //   75: iconst_1
/*     */                 //   76: putfield label : I
/*     */                 //   79: invokestatic scrollToItem$default : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;IZILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                 //   82: dup
/*     */                 //   83: aload #6
/*     */                 //   85: if_acmpne -> 99
/*     */                 //   88: aload #6
/*     */                 //   90: areturn
/*     */                 //   91: iconst_0
/*     */                 //   92: istore #5
/*     */                 //   94: aload_1
/*     */                 //   95: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   98: aload_1
/*     */                 //   99: pop
/*     */                 //   100: goto -> 104
/*     */                 //   103: pop
/*     */                 //   104: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   107: areturn
/*     */                 //   108: new java/lang/IllegalStateException
/*     */                 //   111: dup
/*     */                 //   112: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   114: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   117: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #100	-> 3
/*     */                 //   #100	-> 36
/*     */                 //   #246	-> 62
/*     */                 //   #100	-> 65
/*     */                 //   #100	-> 88
/*     */                 //   #100	-> 99
/*     */                 //   #100	-> 100
/*     */                 //   #100	-> 103
/*     */                 //   #100	-> 108
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   62	20	4	it	I
/*     */                 //   65	26	5	$i$a$-let-SelectableLazyColumnKt$SelectableLazyColumn$5$1$1$1	I
/*     */                 //   0	118	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$SelectableLazyColumn$5$1$1;
/*     */                 //   36	72	1	$result	Ljava/lang/Object;
/* 100 */                 //   94	6	5	$i$a$-let-SelectableLazyColumnKt$SelectableLazyColumn$5$1$1$1	I } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$state, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*     */       }
/* 102 */       return Boolean.valueOf(actionHandled);
/*     */     } 
/* 104 */     return Boolean.valueOf(false);
/*     */   }
/*     */   
/*     */   SelectableLazyColumnKt$SelectableLazyColumn$5$1(FocusManager $focusManager, SelectableLazyListState $state, KeyActions $keyActions, List<SelectableLazyListKey> $keys, SelectionMode $selectionMode, CoroutineScope $scope) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyColumnKt$SelectableLazyColumn$5$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */