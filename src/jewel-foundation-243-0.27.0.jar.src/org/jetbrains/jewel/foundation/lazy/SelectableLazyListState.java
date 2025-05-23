/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.foundation.MutatePriority;
/*     */ import androidx.compose.foundation.gestures.ScrollableState;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\005\n\002\020\"\n\002\020\000\n\002\b\b\n\002\020\b\n\002\b\006\n\002\020\002\n\002\b\005\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\013\b\007\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J*\020 \032\0020!2\006\020\"\032\0020\0322\b\b\002\020#\032\0020\n2\b\b\002\020$\032\0020\032H@¢\006\002\020%J\021\0205\032\002062\006\0207\032\00206H\001J?\0208\032\0020!2\006\0209\032\0020:2'\020;\032#\b\001\022\004\022\0020=\022\n\022\b\022\004\022\0020!0>\022\006\022\004\030\0010\0210<¢\006\002\b?HA¢\006\002\020@R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\bR\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R7\020\022\032\b\022\004\022\0020\0210\0202\f\020\017\032\b\022\004\022\0020\0210\0208V@VX\002¢\006\022\n\004\b\027\020\030\032\004\b\023\020\024\"\004\b\025\020\026R\036\020\031\032\004\030\0010\032X\016¢\006\020\n\002\020\037\032\004\b\033\020\034\"\004\b\035\020\036R\021\020&\032\0020'8F¢\006\006\032\004\b(\020)R\021\020*\032\0020\0328F¢\006\006\032\004\b+\020,R\027\020-\032\0020\0328F¢\006\f\022\004\b.\020/\032\004\b0\020,R\021\0201\032\002028F¢\006\006\032\004\b3\0204R\024\020A\032\0020\n8VX\005¢\006\006\032\004\bB\020\fR\024\020C\032\0020\n8VX\005¢\006\006\032\004\bD\020\fR\022\020E\032\0020\nX\005¢\006\006\032\004\bE\020\fR\024\020F\032\0020\n8VX\005¢\006\006\032\004\bG\020\fR\024\020H\032\0020\n8VX\005¢\006\006\032\004\bI\020\f¨\006J"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableScope;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "lastKeyEventUsedMouse", "", "getLastKeyEventUsedMouse$foundation", "()Z", "setLastKeyEventUsedMouse$foundation", "(Z)V", "<set-?>", "", "", "selectedKeys", "getSelectedKeys", "()Ljava/util/Set;", "setSelectedKeys", "(Ljava/util/Set;)V", "selectedKeys$delegate", "Landroidx/compose/runtime/MutableState;", "lastActiveItemIndex", "", "getLastActiveItemIndex", "()Ljava/lang/Integer;", "setLastActiveItemIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scrollToItem", "", "itemIndex", "animateScroll", "scrollOffset", "(IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset$annotations", "()V", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "dispatchRawDelta", "", "delta", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScrollBackward", "getCanScrollBackward", "canScrollForward", "getCanScrollForward", "isScrollInProgress", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSelectableLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyListState.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,155:1\n81#2:156\n107#2,2:157\n*S KotlinDebug\n*F\n+ 1 SelectableLazyListState.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyListState\n*L\n35#1:156\n35#1:157,2\n*E\n"})
/*     */ public final class SelectableLazyListState implements ScrollableState, SelectableScope {
/*     */   @NotNull
/*     */   private final LazyListState lazyListState;
/*     */   private boolean lastKeyEventUsedMouse;
/*     */   @NotNull
/*     */   private final MutableState selectedKeys$delegate;
/*     */   @Nullable
/*     */   private Integer lastActiveItemIndex;
/*     */   public static final int $stable = 8;
/*     */   
/*  31 */   public SelectableLazyListState(@NotNull LazyListState lazyListState) { this.lazyListState = lazyListState;
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.selectedKeys$delegate = SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null); } @NotNull public final LazyListState getLazyListState() { return this.lazyListState; } @NotNull public Set<Object> getSelectedKeys() { State state = (State)this.selectedKeys$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       (Set<Object>)state.getValue(); }
/* 157 */   public final boolean getLastKeyEventUsedMouse$foundation() { return this.lastKeyEventUsedMouse; } public final void setLastKeyEventUsedMouse$foundation(boolean <set-?>) { this.lastKeyEventUsedMouse = <set-?>; } public void setSelectedKeys(@NotNull Set <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MutableState mutableState = this.selectedKeys$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Integer getLastActiveItemIndex() {
/*     */     return this.lastActiveItemIndex;
/*     */   }
/*     */   
/*     */   public final void setLastActiveItemIndex(@Nullable Integer <set-?>) {
/*     */     this.lastActiveItemIndex = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object scrollToItem(int itemIndex, boolean animateScroll, int scrollOffset, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListState$scrollToItem$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListState$scrollToItem$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new org/jetbrains/jewel/foundation/lazy/SelectableLazyListState$scrollToItem$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 359, 0 -> 96, 1 -> 222, 2 -> 324
/*     */     //   96: aload #6
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: invokestatic getVisibleItemsRange : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;)Lkotlin/ranges/IntRange;
/*     */     //   105: checkcast java/lang/Iterable
/*     */     //   108: iconst_2
/*     */     //   109: invokestatic drop : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   112: iconst_4
/*     */     //   113: invokestatic dropLast : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   116: astore #5
/*     */     //   118: aload #5
/*     */     //   120: iload_1
/*     */     //   121: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   124: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   129: ifne -> 347
/*     */     //   132: aload #5
/*     */     //   134: checkcast java/util/Collection
/*     */     //   137: invokeinterface isEmpty : ()Z
/*     */     //   142: ifne -> 149
/*     */     //   145: iconst_1
/*     */     //   146: goto -> 150
/*     */     //   149: iconst_0
/*     */     //   150: ifeq -> 347
/*     */     //   153: nop
/*     */     //   154: iload_1
/*     */     //   155: aload #5
/*     */     //   157: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   160: checkcast java/lang/Number
/*     */     //   163: invokevirtual intValue : ()I
/*     */     //   166: if_icmpge -> 248
/*     */     //   169: aload_0
/*     */     //   170: getfield lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   173: iconst_0
/*     */     //   174: iload_1
/*     */     //   175: iconst_2
/*     */     //   176: isub
/*     */     //   177: invokestatic max : (II)I
/*     */     //   180: iload_2
/*     */     //   181: ifeq -> 188
/*     */     //   184: iconst_1
/*     */     //   185: goto -> 189
/*     */     //   188: iconst_0
/*     */     //   189: iload_3
/*     */     //   190: aload #7
/*     */     //   192: aload #7
/*     */     //   194: aload_0
/*     */     //   195: putfield L$0 : Ljava/lang/Object;
/*     */     //   198: aload #7
/*     */     //   200: iload_1
/*     */     //   201: putfield I$0 : I
/*     */     //   204: aload #7
/*     */     //   206: iconst_1
/*     */     //   207: putfield label : I
/*     */     //   210: invokestatic access$scrollToItem : (Landroidx/compose/foundation/lazy/LazyListState;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   213: dup
/*     */     //   214: aload #8
/*     */     //   216: if_acmpne -> 244
/*     */     //   219: aload #8
/*     */     //   221: areturn
/*     */     //   222: aload #7
/*     */     //   224: getfield I$0 : I
/*     */     //   227: istore_1
/*     */     //   228: aload #7
/*     */     //   230: getfield L$0 : Ljava/lang/Object;
/*     */     //   233: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListState
/*     */     //   236: astore_0
/*     */     //   237: aload #6
/*     */     //   239: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   242: aload #6
/*     */     //   244: pop
/*     */     //   245: goto -> 347
/*     */     //   248: iload_1
/*     */     //   249: aload #5
/*     */     //   251: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   254: checkcast java/lang/Number
/*     */     //   257: invokevirtual intValue : ()I
/*     */     //   260: if_icmple -> 347
/*     */     //   263: aload_0
/*     */     //   264: getfield lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   267: iload_1
/*     */     //   268: aload #5
/*     */     //   270: invokeinterface size : ()I
/*     */     //   275: iconst_2
/*     */     //   276: iadd
/*     */     //   277: isub
/*     */     //   278: iconst_0
/*     */     //   279: invokestatic max : (II)I
/*     */     //   282: iload_2
/*     */     //   283: ifeq -> 290
/*     */     //   286: iconst_1
/*     */     //   287: goto -> 291
/*     */     //   290: iconst_0
/*     */     //   291: iconst_0
/*     */     //   292: aload #7
/*     */     //   294: aload #7
/*     */     //   296: aload_0
/*     */     //   297: putfield L$0 : Ljava/lang/Object;
/*     */     //   300: aload #7
/*     */     //   302: iload_1
/*     */     //   303: putfield I$0 : I
/*     */     //   306: aload #7
/*     */     //   308: iconst_2
/*     */     //   309: putfield label : I
/*     */     //   312: invokestatic access$scrollToItem : (Landroidx/compose/foundation/lazy/LazyListState;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   315: dup
/*     */     //   316: aload #8
/*     */     //   318: if_acmpne -> 346
/*     */     //   321: aload #8
/*     */     //   323: areturn
/*     */     //   324: aload #7
/*     */     //   326: getfield I$0 : I
/*     */     //   329: istore_1
/*     */     //   330: aload #7
/*     */     //   332: getfield L$0 : Ljava/lang/Object;
/*     */     //   335: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListState
/*     */     //   338: astore_0
/*     */     //   339: aload #6
/*     */     //   341: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   344: aload #6
/*     */     //   346: pop
/*     */     //   347: aload_0
/*     */     //   348: iload_1
/*     */     //   349: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   352: putfield lastActiveItemIndex : Ljava/lang/Integer;
/*     */     //   355: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   358: areturn
/*     */     //   359: new java/lang/IllegalStateException
/*     */     //   362: dup
/*     */     //   363: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   365: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   368: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 63
/*     */     //   #45	-> 101
/*     */     //   #46	-> 118
/*     */     //   #46	-> 150
/*     */     //   #47	-> 153
/*     */     //   #48	-> 154
/*     */     //   #49	-> 169
/*     */     //   #49	-> 180
/*     */     //   #44	-> 219
/*     */     //   #49	-> 244
/*     */     //   #51	-> 248
/*     */     //   #52	-> 263
/*     */     //   #53	-> 267
/*     */     //   #54	-> 282
/*     */     //   #55	-> 291
/*     */     //   #52	-> 294
/*     */     //   #44	-> 321
/*     */     //   #59	-> 346
/*     */     //   #60	-> 355
/*     */     //   #44	-> 359
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	49	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   150	30	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   180	42	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   237	45	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   282	42	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   339	20	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   101	49	1	itemIndex	I
/*     */     //   150	30	1	itemIndex	I
/*     */     //   180	42	1	itemIndex	I
/*     */     //   228	54	1	itemIndex	I
/*     */     //   282	42	1	itemIndex	I
/*     */     //   330	29	1	itemIndex	I
/*     */     //   101	49	2	animateScroll	Z
/*     */     //   150	30	2	animateScroll	Z
/*     */     //   180	8	2	animateScroll	Z
/*     */     //   248	34	2	animateScroll	Z
/*     */     //   282	8	2	animateScroll	Z
/*     */     //   101	49	3	scrollOffset	I
/*     */     //   150	30	3	scrollOffset	I
/*     */     //   180	33	3	scrollOffset	I
/*     */     //   118	32	5	visibleRange	Ljava/util/List;
/*     */     //   150	19	5	visibleRange	Ljava/util/List;
/*     */     //   248	34	5	visibleRange	Ljava/util/List;
/*     */     //   0	369	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	306	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	299	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LazyListLayoutInfo getLayoutInfo() {
/*     */     return this.lazyListState.getLayoutInfo();
/*     */   }
/*     */   
/*     */   public final int getFirstVisibleItemIndex() {
/*     */     return this.lazyListState.getFirstVisibleItemIndex();
/*     */   }
/*     */   
/*     */   public final int getFirstVisibleItemScrollOffset() {
/*     */     return this.lazyListState.getFirstVisibleItemScrollOffset();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final InteractionSource getInteractionSource() {
/*     */     return this.lazyListState.getInteractionSource();
/*     */   }
/*     */   
/*     */   public float dispatchRawDelta(float delta) {
/*     */     return this.lazyListState.dispatchRawDelta(delta);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object scroll(@NotNull MutatePriority scrollPriority, @NotNull Function2 block, @NotNull Continuation $completion) {
/*     */     return this.lazyListState.scroll(scrollPriority, block, $completion);
/*     */   }
/*     */   
/*     */   public boolean getCanScrollBackward() {
/*     */     return this.lazyListState.getCanScrollBackward();
/*     */   }
/*     */   
/*     */   public boolean getCanScrollForward() {
/*     */     return this.lazyListState.getCanScrollForward();
/*     */   }
/*     */   
/*     */   public boolean isScrollInProgress() {
/*     */     return this.lazyListState.isScrollInProgress();
/*     */   }
/*     */   
/*     */   public boolean getLastScrolledBackward() {
/*     */     return this.lazyListState.getLastScrolledBackward();
/*     */   }
/*     */   
/*     */   public boolean getLastScrolledForward() {
/*     */     return this.lazyListState.getLastScrolledForward();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SelectableLazyListState.kt", l = {49, 52}, i = {0, 0, 1, 1}, s = {"L$0", "I$0", "L$0", "I$0"}, n = {"this", "itemIndex", "this", "itemIndex"}, m = "scrollToItem", c = "org.jetbrains.jewel.foundation.lazy.SelectableLazyListState")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SelectableLazyListState$scrollToItem$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     SelectableLazyListState$scrollToItem$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SelectableLazyListState.this.scrollToItem(0, false, 0, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */