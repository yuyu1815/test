/*    */ package org.jetbrains.jewel.foundation.modifier;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\002\n\000\032\036\020\000\032\0020\001*\0020\0012\022\020\000\032\016\022\004\022\0020\003\022\004\022\0020\0040\002¨\006\005"}, d2 = {"onHover", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "", "foundation"})
/*    */ public final class OnHoverModifierKt {
/*    */   @NotNull
/*  8 */   public static final Modifier onHover(@NotNull Modifier $this$onHover, @NotNull Function1<? super Boolean, Unit> onHover) { Intrinsics.checkNotNullParameter($this$onHover, "<this>"); Intrinsics.checkNotNullParameter(onHover, "onHover"); return SuspendingPointerInputFilterKt.pointerInput($this$onHover, Unit.INSTANCE, new OnHoverModifierKt$onHover$1(onHover, null)); } @DebugMetadata(f = "OnHoverModifier.kt", l = {9}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.modifier.OnHoverModifierKt$onHover$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}) static final class OnHoverModifierKt$onHover$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> { int label; OnHoverModifierKt$onHover$1(Function1<Boolean, Unit> $onHover, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { PointerInputScope $this$pointerInput; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$pointerInput = (PointerInputScope)this.L$0;
/*  9 */           this.label = 1; if ($this$pointerInput.awaitPointerEventScope(new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$onHover, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                   //   3: astore #5
/*    */                   //   5: aload_0
/*    */                   //   6: getfield label : I
/*    */                   //   9: tableswitch default -> 160, 0 -> 32, 1 -> 75
/*    */                   //   32: aload_1
/*    */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   36: aload_0
/*    */                   //   37: getfield L$0 : Ljava/lang/Object;
/*    */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*    */                   //   43: astore_2
/*    */                   //   44: nop
/*    */                   //   45: aload_2
/*    */                   //   46: aconst_null
/*    */                   //   47: aload_0
/*    */                   //   48: checkcast kotlin/coroutines/Continuation
/*    */                   //   51: iconst_1
/*    */                   //   52: aconst_null
/*    */                   //   53: aload_0
/*    */                   //   54: aload_2
/*    */                   //   55: putfield L$0 : Ljava/lang/Object;
/*    */                   //   58: aload_0
/*    */                   //   59: iconst_1
/*    */                   //   60: putfield label : I
/*    */                   //   63: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                   //   66: dup
/*    */                   //   67: aload #5
/*    */                   //   69: if_acmpne -> 88
/*    */                   //   72: aload #5
/*    */                   //   74: areturn
/*    */                   //   75: aload_0
/*    */                   //   76: getfield L$0 : Ljava/lang/Object;
/*    */                   //   79: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*    */                   //   82: astore_2
/*    */                   //   83: aload_1
/*    */                   //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   87: aload_1
/*    */                   //   88: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*    */                   //   91: astore_3
/*    */                   //   92: aload_3
/*    */                   //   93: invokevirtual getType-7fucELk : ()I
/*    */                   //   96: istore #4
/*    */                   //   98: iload #4
/*    */                   //   100: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*    */                   //   103: invokevirtual getEnter-7fucELk : ()I
/*    */                   //   106: invokestatic equals-impl0 : (II)Z
/*    */                   //   109: ifeq -> 129
/*    */                   //   112: aload_0
/*    */                   //   113: getfield $onHover : Lkotlin/jvm/functions/Function1;
/*    */                   //   116: iconst_1
/*    */                   //   117: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                   //   120: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */                   //   125: pop
/*    */                   //   126: goto -> 44
/*    */                   //   129: iload #4
/*    */                   //   131: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*    */                   //   134: invokevirtual getExit-7fucELk : ()I
/*    */                   //   137: invokestatic equals-impl0 : (II)Z
/*    */                   //   140: ifeq -> 44
/*    */                   //   143: aload_0
/*    */                   //   144: getfield $onHover : Lkotlin/jvm/functions/Function1;
/*    */                   //   147: iconst_0
/*    */                   //   148: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                   //   151: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */                   //   156: pop
/*    */                   //   157: goto -> 44
/*    */                   //   160: new java/lang/IllegalStateException
/*    */                   //   163: dup
/*    */                   //   164: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                   //   166: invokespecial <init> : (Ljava/lang/String;)V
/*    */                   //   169: athrow
/*    */                   // Line number table:
/*    */                   //   Java source line number -> byte code offset
/*    */                   //   #9	-> 3
/*    */                   //   #10	-> 44
/*    */                   //   #11	-> 45
/*    */                   //   #9	-> 72
/*    */                   //   #12	-> 92
/*    */                   //   #13	-> 98
/*    */                   //   #14	-> 129
/*    */                   //   #9	-> 160
/*    */                   // Local variable table:
/*    */                   //   start	length	slot	name	descriptor
/*    */                   //   44	31	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*    */                   //   83	77	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*    */                   //   92	6	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*    */                   //   0	170	0	this	Lorg/jetbrains/jewel/foundation/modifier/OnHoverModifierKt$onHover$1$1;
/*  9 */                   //   36	124	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$onHover, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  $this$pointerInput.awaitPointerEventScope(new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$onHover, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                   //   3: astore #5
/*    */                   //   5: aload_0
/*    */                   //   6: getfield label : I
/*    */                   //   9: tableswitch default -> 160, 0 -> 32, 1 -> 75
/*    */                   //   32: aload_1
/*    */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   36: aload_0
/*    */                   //   37: getfield L$0 : Ljava/lang/Object;
/*    */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*    */                   //   43: astore_2
/*    */                   //   44: nop
/*    */                   //   45: aload_2
/*    */                   //   46: aconst_null
/*    */                   //   47: aload_0
/*    */                   //   48: checkcast kotlin/coroutines/Continuation
/*    */                   //   51: iconst_1
/*    */                   //   52: aconst_null
/*    */                   //   53: aload_0
/*    */                   //   54: aload_2
/*    */                   //   55: putfield L$0 : Ljava/lang/Object;
/*    */                   //   58: aload_0
/*    */                   //   59: iconst_1
/*    */                   //   60: putfield label : I
/*    */                   //   63: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */                   //   66: dup
/*    */                   //   67: aload #5
/*    */                   //   69: if_acmpne -> 88
/*    */                   //   72: aload #5
/*    */                   //   74: areturn
/*    */                   //   75: aload_0
/*    */                   //   76: getfield L$0 : Ljava/lang/Object;
/*    */                   //   79: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*    */                   //   82: astore_2
/*    */                   //   83: aload_1
/*    */                   //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   87: aload_1
/*    */                   //   88: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*    */                   //   91: astore_3
/*    */                   //   92: aload_3
/*    */                   //   93: invokevirtual getType-7fucELk : ()I
/*    */                   //   96: istore #4
/*    */                   //   98: iload #4
/*    */                   //   100: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*    */                   //   103: invokevirtual getEnter-7fucELk : ()I
/*    */                   //   106: invokestatic equals-impl0 : (II)Z
/*    */                   //   109: ifeq -> 129
/*    */                   //   112: aload_0
/*    */                   //   113: getfield $onHover : Lkotlin/jvm/functions/Function1;
/*    */                   //   116: iconst_1
/*    */                   //   117: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                   //   120: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */                   //   125: pop
/*    */                   //   126: goto -> 44
/*    */                   //   129: iload #4
/*    */                   //   131: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*    */                   //   134: invokevirtual getExit-7fucELk : ()I
/*    */                   //   137: invokestatic equals-impl0 : (II)Z
/*    */                   //   140: ifeq -> 44
/*    */                   //   143: aload_0
/*    */                   //   144: getfield $onHover : Lkotlin/jvm/functions/Function1;
/*    */                   //   147: iconst_0
/*    */                   //   148: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */                   //   151: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */                   //   156: pop
/*    */                   //   157: goto -> 44
/*    */                   //   160: new java/lang/IllegalStateException
/*    */                   //   163: dup
/*    */                   //   164: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                   //   166: invokespecial <init> : (Ljava/lang/String;)V
/*    */                   //   169: athrow
/*    */                   // Line number table:
/*    */                   //   Java source line number -> byte code offset
/*    */                   //   #9	-> 3
/*    */                   //   #10	-> 44
/*    */                   //   #11	-> 45
/*    */                   //   #9	-> 72
/*    */                   //   #12	-> 92
/*    */                   //   #13	-> 98
/*    */                   //   #14	-> 129
/*    */                   //   #9	-> 160
/*    */                   // Local variable table:
/*    */                   //   start	length	slot	name	descriptor
/*    */                   //   44	31	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*    */                   //   83	77	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*    */                   //   92	6	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*    */                   //   0	170	0	this	Lorg/jetbrains/jewel/foundation/modifier/OnHoverModifierKt$onHover$1$1;
/*  9 */                   //   36	124	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$onHover, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 18 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super OnHoverModifierKt$onHover$1> $completion) {
/*    */       OnHoverModifierKt$onHover$1 onHoverModifierKt$onHover$1 = new OnHoverModifierKt$onHover$1(this.$onHover, $completion);
/*    */       onHoverModifierKt$onHover$1.L$0 = value;
/*    */       return (Continuation<Unit>)onHoverModifierKt$onHover$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*    */       return ((OnHoverModifierKt$onHover$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\OnHoverModifierKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */