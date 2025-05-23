/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.v2.ScrollbarAdapter;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\t\b\002\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\020\020\023\032\0020\r2\006\020\016\032\0020\017H\002J\016\020\024\032\0020\025H@¢\006\002\020\026J\b\020\027\032\0020\025H\002J\016\020\030\032\0020\0252\006\020\016\032\0020\017J\016\020\031\032\0020\0252\006\020\016\032\0020\017J\b\020\032\032\0020\025H\002J\006\020\033\032\0020\025J\020\020\034\032\0020\0252\006\020\016\032\0020\017H\002J\006\020\035\032\0020\025R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000R\022\020\016\032\004\030\0010\017X\016¢\006\004\n\002\020\020R\020\020\021\032\004\030\0010\022X\016¢\006\002\n\000¨\006\036"}, d2 = {"Lorg/jetbrains/jewel/ui/component/TrackPressScroller;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sliderAdapter", "Lorg/jetbrains/jewel/ui/component/SliderAdapter;", "reverseLayout", "", "clickBehavior", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lorg/jetbrains/jewel/ui/component/SliderAdapter;ZLorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;)V", "direction", "", "offset", "", "Ljava/lang/Float;", "job", "Lkotlinx/coroutines/Job;", "directionOfScrollTowards", "scrollTowardsCurrentOffset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startScrollingByPage", "onPress", "onMovePressed", "cleanupAfterGesture", "onRelease", "scrollToOffset", "onGestureCancelled", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nScrollbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/TrackPressScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/*     */ final class TrackPressScroller
/*     */ {
/*     */   @NotNull
/*     */   private final CoroutineScope coroutineScope;
/*     */   @NotNull
/*     */   private final SliderAdapter sliderAdapter;
/*     */   private final boolean reverseLayout;
/*     */   @NotNull
/*     */   private final TrackClickBehavior clickBehavior;
/*     */   private int direction;
/*     */   @Nullable
/*     */   private Float offset;
/*     */   @Nullable
/*     */   private Job job;
/*     */   
/*     */   public TrackPressScroller(@NotNull CoroutineScope coroutineScope, @NotNull SliderAdapter sliderAdapter, boolean reverseLayout, @NotNull TrackClickBehavior clickBehavior) {
/* 507 */     this.coroutineScope = coroutineScope;
/* 508 */     this.sliderAdapter = sliderAdapter;
/* 509 */     this.reverseLayout = reverseLayout;
/* 510 */     this.clickBehavior = clickBehavior;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int directionOfScrollTowards(float offset) {
/* 523 */     IntRange pixelRange = ScrollbarKt.access$getThumbPixelRange(this.sliderAdapter);
/* 524 */     return 
/* 525 */       (offset < pixelRange.getFirst()) ? (this.reverseLayout ? 1 : -1) : (
/* 526 */       (offset > pixelRange.getLast()) ? (this.reverseLayout ? -1 : 1) : 
/* 527 */       0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object scrollTowardsCurrentOffset(Continuation $completion) {
/* 533 */     float it = this.offset.floatValue(); int $i$a$-let-TrackPressScroller$scrollTowardsCurrentOffset$2 = 0;
/* 534 */     int currentDirection = directionOfScrollTowards(it);
/* 535 */     if (currentDirection != this.direction) {
/* 536 */       return Unit.INSTANCE;
/*     */     }
/* 538 */     ScrollbarAdapter $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240 = this.sliderAdapter.getAdapter();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 723 */     int $i$a$-with-TrackPressScroller$scrollTowardsCurrentOffset$2$1 = 0;
/*     */     if ($this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.scrollTo($this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getScrollOffset() + currentDirection * $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getViewportSize(), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.scrollTo($this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getScrollOffset() + currentDirection * $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getViewportSize(), $completion); 
/*     */     $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.scrollTo($this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getScrollOffset() + currentDirection * $this$scrollTowardsCurrentOffset_u24lambda_u241_u24lambda_u240.getViewportSize(), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void startScrollingByPage() {
/*     */     if (this.job != null) {
/*     */       Job.DefaultImpls.cancel$default(this.job, null, 1, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.job = BuildersKt.launch$default(this.coroutineScope, null, null, new TrackPressScroller$startScrollingByPage$1(null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Scrollbar.kt", l = {547, 548, 550, 551}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.TrackPressScroller$startScrollingByPage$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TrackPressScroller$startScrollingByPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TrackPressScroller$startScrollingByPage$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 165, 0 -> 44, 1 -> 71, 2 -> 99, 3 -> 128, 4 -> 156
/*     */       //   44: aload_1
/*     */       //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   48: aload_0
/*     */       //   49: getfield this$0 : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   52: aload_0
/*     */       //   53: checkcast kotlin/coroutines/Continuation
/*     */       //   56: aload_0
/*     */       //   57: iconst_1
/*     */       //   58: putfield label : I
/*     */       //   61: invokestatic access$scrollTowardsCurrentOffset : (Lorg/jetbrains/jewel/ui/component/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   64: dup
/*     */       //   65: aload_2
/*     */       //   66: if_acmpne -> 76
/*     */       //   69: aload_2
/*     */       //   70: areturn
/*     */       //   71: aload_1
/*     */       //   72: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   75: aload_1
/*     */       //   76: pop
/*     */       //   77: ldc2_w 300
/*     */       //   80: aload_0
/*     */       //   81: checkcast kotlin/coroutines/Continuation
/*     */       //   84: aload_0
/*     */       //   85: iconst_2
/*     */       //   86: putfield label : I
/*     */       //   89: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   92: dup
/*     */       //   93: aload_2
/*     */       //   94: if_acmpne -> 104
/*     */       //   97: aload_2
/*     */       //   98: areturn
/*     */       //   99: aload_1
/*     */       //   100: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   103: aload_1
/*     */       //   104: pop
/*     */       //   105: aload_0
/*     */       //   106: getfield this$0 : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   109: aload_0
/*     */       //   110: checkcast kotlin/coroutines/Continuation
/*     */       //   113: aload_0
/*     */       //   114: iconst_3
/*     */       //   115: putfield label : I
/*     */       //   118: invokestatic access$scrollTowardsCurrentOffset : (Lorg/jetbrains/jewel/ui/component/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   121: dup
/*     */       //   122: aload_2
/*     */       //   123: if_acmpne -> 133
/*     */       //   126: aload_2
/*     */       //   127: areturn
/*     */       //   128: aload_1
/*     */       //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   132: aload_1
/*     */       //   133: pop
/*     */       //   134: ldc2_w 100
/*     */       //   137: aload_0
/*     */       //   138: checkcast kotlin/coroutines/Continuation
/*     */       //   141: aload_0
/*     */       //   142: iconst_4
/*     */       //   143: putfield label : I
/*     */       //   146: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   149: dup
/*     */       //   150: aload_2
/*     */       //   151: if_acmpne -> 161
/*     */       //   154: aload_2
/*     */       //   155: areturn
/*     */       //   156: aload_1
/*     */       //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   160: aload_1
/*     */       //   161: pop
/*     */       //   162: goto -> 105
/*     */       //   165: new java/lang/IllegalStateException
/*     */       //   168: dup
/*     */       //   169: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   171: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   174: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #546	-> 3
/*     */       //   #547	-> 48
/*     */       //   #546	-> 69
/*     */       //   #548	-> 76
/*     */       //   #546	-> 97
/*     */       //   #549	-> 104
/*     */       //   #550	-> 105
/*     */       //   #546	-> 126
/*     */       //   #551	-> 133
/*     */       //   #546	-> 154
/*     */       //   #551	-> 161
/*     */       //   #546	-> 165
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	175	0	this	Lorg/jetbrains/jewel/ui/component/TrackPressScroller$startScrollingByPage$1;
/*     */       //   48	117	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TrackPressScroller$startScrollingByPage$1> $completion) {
/*     */       return (Continuation<Unit>)new TrackPressScroller$startScrollingByPage$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TrackPressScroller$startScrollingByPage$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void onPress(float offset) {
/*     */     this.offset = Float.valueOf(offset);
/*     */     this.direction = directionOfScrollTowards(offset);
/*     */     if (this.direction == 0)
/*     */       return; 
/*     */     if (this.clickBehavior == TrackClickBehavior.NextPage) {
/*     */       startScrollingByPage();
/*     */     } else if (this.clickBehavior == TrackClickBehavior.JumpToSpot) {
/*     */       scrollToOffset(offset);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void onMovePressed(float offset) {
/*     */     this.offset = Float.valueOf(offset);
/*     */     if (this.clickBehavior == TrackClickBehavior.JumpToSpot)
/*     */       scrollToOffset(offset); 
/*     */   }
/*     */   
/*     */   private final void cleanupAfterGesture() {
/*     */     if (this.job != null) {
/*     */       Job.DefaultImpls.cancel$default(this.job, null, 1, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.direction = 0;
/*     */     this.offset = null;
/*     */   }
/*     */   
/*     */   public final void onRelease() {
/*     */     cleanupAfterGesture();
/*     */   }
/*     */   
/*     */   private final void scrollToOffset(float offset) {
/*     */     if (this.job != null) {
/*     */       Job.DefaultImpls.cancel$default(this.job, null, 1, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.job = BuildersKt.launch$default(this.coroutineScope, null, null, new TrackPressScroller$scrollToOffset$1(offset, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Scrollbar.kt", l = {591}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.TrackPressScroller$scrollToOffset$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TrackPressScroller$scrollToOffset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TrackPressScroller$scrollToOffset$1(float $offset, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       double contentSize, scrollOffset;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           contentSize = TrackPressScroller.this.sliderAdapter.getAdapter().getContentSize();
/*     */           scrollOffset = this.$offset / TrackPressScroller.this.sliderAdapter.getAdapter().getViewportSize() * contentSize;
/*     */           this.label = 1;
/*     */           if (TrackPressScroller.this.sliderAdapter.getAdapter().scrollTo(scrollOffset, (Continuation)this) == object)
/*     */             return object; 
/*     */           TrackPressScroller.this.sliderAdapter.getAdapter().scrollTo(scrollOffset, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TrackPressScroller$scrollToOffset$1> $completion) {
/*     */       return (Continuation<Unit>)new TrackPressScroller$scrollToOffset$1(this.$offset, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TrackPressScroller$scrollToOffset$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void onGestureCancelled() {
/*     */     cleanupAfterGesture();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TrackPressScroller.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */