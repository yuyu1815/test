/*     */ package androidx.compose.animation;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\t\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\000\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\016\020-\032\0020\0362\006\020.\032\0020#J\b\020/\032\0020\023H\002J\006\0200\032\0020\023J(\0201\032\0020\0362\006\0202\032\0020#2\006\0203\032\002042\006\0205\032\00206ø\001\000¢\006\004\b7\0208J\006\0209\032\0020\036J\016\020:\032\0020\0362\006\020.\032\0020#J\006\020+\032\0020\036J\006\020;\032\0020\036R/\020\b\032\004\030\0010\0072\b\020\006\032\004\030\0010\0078B@BX\002¢\006\022\n\004\b\r\020\016\032\004\b\t\020\n\"\004\b\013\020\fR/\020\017\032\004\030\0010\0072\b\020\006\032\004\030\0010\0078F@FX\002¢\006\022\n\004\b\022\020\016\032\004\b\020\020\n\"\004\b\021\020\fR+\020\024\032\0020\0232\006\020\006\032\0020\0238F@BX\002¢\006\022\n\004\b\031\020\016\032\004\b\025\020\026\"\004\b\027\020\030R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\032\020\033R\024\020\034\032\b\022\004\022\0020\0360\035X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\037\020 R\027\020!\032\b\022\004\022\0020#0\"¢\006\b\n\000\032\004\b$\020%R\023\020&\032\004\030\0010\0078F¢\006\006\032\004\b'\020\nR\"\020(\032\004\030\0010#2\b\020\006\032\004\030\0010#@BX\016¢\006\b\n\000\032\004\b)\020*R\032\020+\032\016\022\004\022\0020\000\022\004\022\0020\0360,X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006<"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "key", "scope", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "<set-?>", "Landroidx/compose/ui/geometry/Rect;", "_targetBounds", "get_targetBounds", "()Landroidx/compose/ui/geometry/Rect;", "set_targetBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "_targetBounds$delegate", "Landroidx/compose/runtime/MutableState;", "currentBounds", "getCurrentBounds", "setCurrentBounds", "currentBounds$delegate", "", "foundMatch", "getFoundMatch", "()Z", "setFoundMatch", "(Z)V", "foundMatch$delegate", "getKey", "()Ljava/lang/Object;", "observingVisibilityChange", "Lkotlin/Function0;", "", "getScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "states", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/SharedElementInternalState;", "getStates", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "targetBounds", "getTargetBounds", "targetBoundsProvider", "getTargetBoundsProvider$animation", "()Landroidx/compose/animation/SharedElementInternalState;", "updateMatch", "Lkotlin/Function1;", "addState", "sharedElementState", "hasVisibleContent", "isAnimating", "onLookaheadResult", "state", "lookaheadSize", "Landroidx/compose/ui/geometry/Size;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "onLookaheadResult-v_w8tDc", "(Landroidx/compose/animation/SharedElementInternalState;JJ)V", "onSharedTransitionFinished", "removeState", "updateTargetBoundsProvider", "animation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,254:1\n101#2,2:255\n33#2,6:257\n103#2:263\n33#2,6:273\n101#2,2:279\n33#2,6:281\n103#2:287\n51#2,6:288\n81#3:264\n107#3,2:265\n81#3:267\n107#3,2:268\n81#3:270\n107#3,2:271\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:255,2\n43#1:257,6\n43#1:263\n97#1:273,6\n115#1:279,2\n115#1:281,6\n115#1:287\n127#1:288,6\n45#1:264\n45#1:265,2\n79#1:267\n79#1:268,2\n83#1:270\n83#1:271,2\n*E\n"})
/*     */ public final class SharedElement {
/*     */   @NotNull
/*     */   private final Object key;
/*     */   @NotNull
/*     */   private final SharedTransitionScopeImpl scope;
/*     */   @NotNull
/*     */   private final MutableState _targetBounds$delegate;
/*     */   @NotNull
/*     */   private final MutableState foundMatch$delegate;
/*     */   @NotNull
/*     */   private final MutableState currentBounds$delegate;
/*     */   @Nullable
/*     */   private SharedElementInternalState targetBoundsProvider;
/*     */   @NotNull
/*     */   private final SnapshotStateList<SharedElementInternalState> states;
/*     */   @NotNull
/*     */   private final Function1<SharedElement, Unit> updateMatch;
/*     */   @NotNull
/*     */   private final Function0<Unit> observingVisibilityChange;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public SharedElement(@NotNull Object key, @NotNull SharedTransitionScopeImpl scope) {
/*  42 */     this.key = key; this.scope = scope;
/*     */ 
/*     */     
/*  45 */     this._targetBounds$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     this.foundMatch$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*     */ 
/*     */ 
/*     */     
/*  83 */     this.currentBounds$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     this.states = SnapshotStateKt.mutableStateListOf();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     this.updateMatch = new SharedElement$updateMatch$1();
/*     */ 
/*     */ 
/*     */     
/* 149 */     this.observingVisibilityChange = new SharedElement$observingVisibilityChange$1();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Object getKey() {
/*     */     return this.key;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SharedTransitionScopeImpl getScope() {
/*     */     return this.scope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isAnimating()
/*     */   {
/*     */     List $this$fastAny$iv = (List)this.states;
/*     */     int $i$f$fastAny = 0;
/* 256 */     List $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*     */     
/* 258 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     return (false && getFoundMatch()); } private final Rect get_targetBounds() { State state = (State)this._targetBounds$delegate; KProperty property$iv = null; int $i$f$getValue = 0;
/* 264 */     return (Rect)state.getValue(); }
/* 265 */   @Nullable public final Rect getTargetBounds() { SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider; SharedElement sharedElement = this; int $i$a$-run-SharedElement$targetBounds$1 = 0; set_targetBounds((this.targetBoundsProvider != null) ? RectKt.Rect-tz77jQw(sharedElementInternalState.calculateLookaheadOffset-F1C5BW0(), sharedElementInternalState.getNonNullLookaheadSize-NH-jbRc()) : null); return get_targetBounds(); } private final void set_targetBounds(Rect <set-?>) { MutableState mutableState = this._targetBounds$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*     */   public final void updateMatch() { boolean hasVisibleContent = hasVisibleContent(); if (this.states.size() > 1 && hasVisibleContent) { setFoundMatch(true); } else if (this.scope.isTransitionActive()) { if (!hasVisibleContent) setFoundMatch(false);  } else { setFoundMatch(false); }  if (!((Collection)this.states).isEmpty())
/* 267 */       SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);  } public final boolean getFoundMatch() { State state = (State)this.foundMatch$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private final void setFoundMatch(boolean <set-?>) { MutableState mutableState = this.foundMatch$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 268 */     mutableState.setValue(value$iv); } @Nullable public final Rect getCurrentBounds() { State state = (State)this.currentBounds$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 270 */     return (Rect)state.getValue(); } public final void setCurrentBounds(@Nullable Rect <set-?>) { MutableState mutableState = this.currentBounds$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 271 */     mutableState.setValue(<set-?>); } @Nullable
/*     */   public final SharedElementInternalState getTargetBoundsProvider$animation() { return this.targetBoundsProvider; } public final void onLookaheadResult-v_w8tDc(@NotNull SharedElementInternalState state, long lookaheadSize, long topLeft) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'state'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokevirtual getBoundsAnimation : ()Landroidx/compose/animation/BoundsAnimation;
/*     */     //   10: invokevirtual getTarget : ()Z
/*     */     //   13: ifeq -> 192
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: putfield targetBoundsProvider : Landroidx/compose/animation/SharedElementInternalState;
/*     */     //   21: aload_0
/*     */     //   22: invokespecial get_targetBounds : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   25: dup
/*     */     //   26: ifnull -> 38
/*     */     //   29: invokevirtual getTopLeft-F1C5BW0 : ()J
/*     */     //   32: invokestatic box-impl : (J)Landroidx/compose/ui/geometry/Offset;
/*     */     //   35: goto -> 40
/*     */     //   38: pop
/*     */     //   39: aconst_null
/*     */     //   40: dup
/*     */     //   41: ifnonnull -> 49
/*     */     //   44: pop
/*     */     //   45: iconst_0
/*     */     //   46: goto -> 57
/*     */     //   49: invokevirtual unbox-impl : ()J
/*     */     //   52: lload #4
/*     */     //   54: invokestatic equals-impl0 : (JJ)Z
/*     */     //   57: ifeq -> 98
/*     */     //   60: aload_0
/*     */     //   61: invokespecial get_targetBounds : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   64: dup
/*     */     //   65: ifnull -> 77
/*     */     //   68: invokevirtual getSize-NH-jbRc : ()J
/*     */     //   71: invokestatic box-impl : (J)Landroidx/compose/ui/geometry/Size;
/*     */     //   74: goto -> 79
/*     */     //   77: pop
/*     */     //   78: aconst_null
/*     */     //   79: dup
/*     */     //   80: ifnonnull -> 88
/*     */     //   83: pop
/*     */     //   84: iconst_0
/*     */     //   85: goto -> 95
/*     */     //   88: invokevirtual unbox-impl : ()J
/*     */     //   91: lload_2
/*     */     //   92: invokestatic equals-impl0 : (JJ)Z
/*     */     //   95: ifne -> 192
/*     */     //   98: lload #4
/*     */     //   100: lload_2
/*     */     //   101: invokestatic Rect-tz77jQw : (JJ)Landroidx/compose/ui/geometry/Rect;
/*     */     //   104: astore #6
/*     */     //   106: aload_0
/*     */     //   107: aload #6
/*     */     //   109: invokespecial set_targetBounds : (Landroidx/compose/ui/geometry/Rect;)V
/*     */     //   112: aload_0
/*     */     //   113: getfield states : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   116: checkcast java/util/List
/*     */     //   119: astore #7
/*     */     //   121: iconst_0
/*     */     //   122: istore #8
/*     */     //   124: nop
/*     */     //   125: iconst_0
/*     */     //   126: istore #9
/*     */     //   128: aload #7
/*     */     //   130: invokeinterface size : ()I
/*     */     //   135: istore #10
/*     */     //   137: iload #9
/*     */     //   139: iload #10
/*     */     //   141: if_icmpge -> 191
/*     */     //   144: aload #7
/*     */     //   146: iload #9
/*     */     //   148: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   153: astore #11
/*     */     //   155: aload #11
/*     */     //   157: checkcast androidx/compose/animation/SharedElementInternalState
/*     */     //   160: astore #12
/*     */     //   162: iconst_0
/*     */     //   163: istore #13
/*     */     //   165: aload #12
/*     */     //   167: invokevirtual getBoundsAnimation : ()Landroidx/compose/animation/BoundsAnimation;
/*     */     //   170: aload_0
/*     */     //   171: invokevirtual getCurrentBounds : ()Landroidx/compose/ui/geometry/Rect;
/*     */     //   174: dup
/*     */     //   175: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   178: aload #6
/*     */     //   180: invokevirtual animate : (Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V
/*     */     //   183: nop
/*     */     //   184: nop
/*     */     //   185: iinc #9, 1
/*     */     //   188: goto -> 137
/*     */     //   191: nop
/*     */     //   192: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 6
/*     */     //   #90	-> 16
/*     */     //   #94	-> 21
/*     */     //   #95	-> 98
/*     */     //   #96	-> 106
/*     */     //   #97	-> 112
/*     */     //   #273	-> 124
/*     */     //   #274	-> 125
/*     */     //   #275	-> 144
/*     */     //   #276	-> 155
/*     */     //   #98	-> 165
/*     */     //   #99	-> 183
/*     */     //   #276	-> 184
/*     */     //   #274	-> 185
/*     */     //   #278	-> 191
/*     */     //   #102	-> 192
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   165	19	13	$i$a$-fastForEach-SharedElement$onLookaheadResult$1	I
/*     */     //   162	22	12	it	Landroidx/compose/animation/SharedElementInternalState;
/*     */     //   155	30	11	item$iv	Ljava/lang/Object;
/*     */     //   128	63	9	index$iv	I
/*     */     //   124	68	8	$i$f$fastForEach	I
/*     */     //   121	71	7	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   106	86	6	target	Landroidx/compose/ui/geometry/Rect;
/*     */     //   0	193	0	this	Landroidx/compose/animation/SharedElement;
/*     */     //   0	193	1	state	Landroidx/compose/animation/SharedElementInternalState;
/*     */     //   0	193	2	lookaheadSize	J
/*     */     //   0	193	4	topLeft	J }
/*     */   @NotNull
/*     */   public final SnapshotStateList<SharedElementInternalState> getStates() {
/*     */     return this.states;
/*     */   }
/*     */   private final boolean hasVisibleContent() {
/*     */     List $this$fastAny$iv = (List)this.states;
/*     */     int $i$f$fastAny = 0;
/* 280 */     List $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*     */     
/* 282 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*     */     return false;
/*     */   }
/*     */   public final void updateTargetBoundsProvider() {
/*     */     Object targetProvider = null;
/*     */     List $this$fastForEachReversed$iv = (List)this.states;
/*     */     int $i$f$fastForEachReversed = 0;
/* 289 */     int i = $this$fastForEachReversed$iv.size() + -1; if (0 <= i) do { int index$iv = i; i--;
/* 290 */         Object item$iv = $this$fastForEachReversed$iv.get(index$iv);
/* 291 */         SharedElementInternalState it = (SharedElementInternalState)item$iv; int $i$a$-fastForEachReversed-SharedElement$updateTargetBoundsProvider$1 = 0;
/*     */         if (it.getBoundsAnimation().getTarget()) {
/*     */           targetProvider = it;
/*     */         } else {
/*     */         
/*     */         }  }
/*     */       while (0 <= i); 
/*     */     if (Intrinsics.areEqual(targetProvider, this.targetBoundsProvider))
/*     */       return; 
/*     */     this.targetBoundsProvider = (SharedElementInternalState)targetProvider;
/*     */     set_targetBounds(null);
/*     */   }
/*     */   
/*     */   public final void onSharedTransitionFinished() {
/*     */     setFoundMatch((this.states.size() > 1 && hasVisibleContent()));
/*     */     set_targetBounds(null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/SharedElement;", "invoke"})
/*     */   static final class SharedElement$updateMatch$1 extends Lambda implements Function1<SharedElement, Unit> {
/*     */     public final void invoke(@NotNull SharedElement it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       SharedElement.this.updateMatch();
/*     */     }
/*     */     
/*     */     SharedElement$updateMatch$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class SharedElement$observingVisibilityChange$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       SharedElement.this.hasVisibleContent();
/*     */     }
/*     */     
/*     */     SharedElement$observingVisibilityChange$1() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void addState(@NotNull SharedElementInternalState sharedElementState) {
/*     */     Intrinsics.checkNotNullParameter(sharedElementState, "sharedElementState");
/*     */     this.states.add(sharedElementState);
/*     */     SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
/*     */   }
/*     */   
/*     */   public final void removeState(@NotNull SharedElementInternalState sharedElementState) {
/*     */     Intrinsics.checkNotNullParameter(sharedElementState, "sharedElementState");
/*     */     this.states.remove(sharedElementState);
/*     */     if (this.states.isEmpty()) {
/*     */       updateMatch();
/*     */       SharedTransitionScopeKt.getSharedTransitionObserver().clear(this);
/*     */     } else {
/*     */       SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */