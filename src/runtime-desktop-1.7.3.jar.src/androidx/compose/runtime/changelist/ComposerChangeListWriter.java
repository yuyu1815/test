/*     */ package androidx.compose.runtime.changelist;
/*     */ 
/*     */ import androidx.compose.runtime.Anchor;
/*     */ import androidx.compose.runtime.Composition;
/*     */ import androidx.compose.runtime.CompositionContext;
/*     */ import androidx.compose.runtime.MovableContentStateReference;
/*     */ import androidx.compose.runtime.SlotTable;
/*     */ import androidx.compose.runtime.internal.IntRef;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000®\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\005\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\016\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\n\n\002\030\002\n\002\030\002\n\002\b\b\b\000\030\000 \0012\0020\001:\002\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\030\020#\032\0020$2\006\020%\032\0020&2\b\020'\032\004\030\0010\001J\036\020(\032\0020$2\016\020)\032\n\022\006\022\004\030\0010\0010*2\006\020+\032\0020,J(\020-\032\0020$2\b\020.\032\004\030\0010/2\006\0200\032\002012\006\0202\032\002032\006\0204\032\00203J\006\0205\032\0020$J\026\0206\032\0020$2\006\0207\032\0020,2\006\020%\032\0020&J\"\0208\032\0020$2\022\0209\032\016\022\004\022\0020;\022\004\022\0020$0:2\006\020<\032\0020;J\006\020=\032\0020$J\006\020>\032\0020$J\006\020?\032\0020$J\026\020@\032\0020$2\006\020A\032\0020\0222\006\020B\032\0020\022J\006\020C\032\0020$J\020\020D\032\0020$2\006\020%\032\0020&H\002J\b\020E\032\0020$H\002J\006\020F\032\0020$J\032\020G\032\0020$2\006\020H\032\0020\0052\n\b\002\020+\032\004\030\0010,J\026\020I\032\0020$2\006\020%\032\0020&2\006\0202\032\0020JJ\036\020I\032\0020$2\006\020%\032\0020&2\006\0202\032\0020J2\006\020K\032\0020LJ\016\020M\032\0020$2\006\020N\032\0020\022J\020\020O\032\0020$2\b\020P\032\004\030\0010\001J\036\020Q\032\0020$2\006\0202\032\0020\0222\006\0204\032\0020\0222\006\020R\032\0020\022J\016\020S\032\0020$2\006\020T\032\0020\022J\016\020U\032\0020$2\006\020T\032\0020\022J\006\020V\032\0020$J\b\020W\032\0020$H\002J\b\020X\032\0020$H\002J\b\020Y\032\0020$H\002J\022\020Z\032\0020$2\b\b\002\020[\032\0020\fH\002J \020\\\032\0020$2\006\0204\032\0020\0222\006\0202\032\0020\0222\006\020R\032\0020\022H\002J\b\020]\032\0020$H\002J\022\020^\032\0020$2\b\b\002\020_\032\0020\fH\002J\030\020`\032\0020$2\006\020\036\032\0020\0222\006\020\021\032\0020\022H\002J\006\020a\032\0020$J\006\020b\032\0020$J\036\020c\032\0020$2\006\020<\032\0020d2\006\0200\032\002012\006\020e\032\00203J\016\020f\032\0020$2\006\020'\032\0020gJ\006\020h\032\0020$J\026\020i\032\0020$2\006\020A\032\0020\0222\006\020R\032\0020\022J\006\020j\032\0020$J\006\020k\032\0020$J\024\020l\032\0020$2\f\020m\032\b\022\004\022\0020$0nJ\006\020o\032\0020$J\016\020p\032\0020$2\006\020R\032\0020\022J \020q\032\0020$2\b\020'\032\004\030\0010\0012\006\020%\032\0020&2\006\020r\032\0020\022J\020\020s\032\0020$2\b\020t\032\004\030\0010\001J>\020u\032\0020$\"\004\b\000\020v\"\004\b\001\020w2\006\020'\032\002Hw2\035\020x\032\031\022\004\022\002Hv\022\004\022\002Hw\022\004\022\0020$0y¢\006\002\bz¢\006\002\020{J\030\020|\032\0020$2\b\020'\032\004\030\0010\0012\006\020r\032\0020\022J\020\020}\032\0020$2\b\020P\032\004\030\0010\001J\"\020~\032\0020$2\006\020\032\0020\0052\f\020x\032\b\022\004\022\0020$0nH\bø\001\000J\033\020\001\032\0020$2\f\020x\032\b\022\004\022\0020$0nH\bø\001\000R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\016\020\021\032\0020\022X\016¢\006\002\n\000R\016\020\023\032\0020\022X\016¢\006\002\n\000R\016\020\024\032\0020\022X\016¢\006\002\n\000R\021\020\025\032\0020\f8F¢\006\006\032\004\b\026\020\016R\026\020\027\032\n\022\006\022\004\030\0010\0010\030X\016¢\006\002\n\000R\016\020\031\032\0020\022X\016¢\006\002\n\000R\024\020\032\032\0020\0338BX\004¢\006\006\032\004\b\034\020\035R\016\020\036\032\0020\022X\016¢\006\002\n\000R\016\020\037\032\0020\fX\016¢\006\002\n\000R\016\020 \032\0020!X\004¢\006\002\n\000R\016\020\"\032\0020\022X\016¢\006\002\n\000\002\007\n\005\b20\001¨\006\001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "implicitRootStart", "", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "moveCount", "", "moveFrom", "moveTo", "pastParent", "getPastParent", "pendingDownNodes", "Landroidx/compose/runtime/Stack;", "pendingUps", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "removeFrom", "startedGroup", "startedGroups", "Landroidx/compose/runtime/IntStack;", "writersReaderDelta", "appendValue", "", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "copyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "copySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "deactivateCurrentGroup", "determineMovableContentNodeIndex", "effectiveNodeIndexOut", "endCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "endCurrentGroup", "endMovableContentPlacement", "endNodeMovement", "endNodeMovementAndDeleteNode", "nodeIndex", "group", "endRoot", "ensureGroupStarted", "ensureRootStarted", "finalizeComposition", "includeOperationsIn", "other", "insertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "moveCurrentGroup", "offset", "moveDown", "node", "moveNode", "count", "moveReaderRelativeTo", "location", "moveReaderToAbsolute", "moveUp", "pushApplierOperationPreamble", "pushPendingUpsAndDowns", "pushSlotEditingOperationPreamble", "pushSlotTableOperationPreamble", "useParentSlot", "realizeMoveNode", "realizeNodeMovementOperations", "realizeOperationLocation", "forParent", "realizeRemoveNode", "recordSlotEditing", "releaseMovableContent", "releaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "remember", "Landroidx/compose/runtime/RememberObserver;", "removeCurrentGroup", "removeNode", "resetSlots", "resetTransientState", "sideEffect", "effect", "Lkotlin/Function0;", "skipToEndOfCurrentGroup", "trimValues", "updateAnchoredValue", "groupSlotIndex", "updateAuxData", "data", "updateNode", "T", "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "updateValue", "useNode", "withChangeList", "newChangeList", "withoutImplicitRootStart", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n4553#2,7:485\n4553#2,7:492\n4553#2,7:499\n4553#2,7:506\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:485,7\n248#1:492,7\n318#1:499,7\n466#1:506,7\n*E\n"})
/*     */ public final class ComposerChangeListWriter {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ComposerImpl composer;
/*     */   @NotNull
/*     */   private ChangeList changeList;
/*     */   private boolean startedGroup;
/*     */   @NotNull
/*     */   private final IntStack startedGroups;
/*     */   private boolean implicitRootStart;
/*     */   private int writersReaderDelta;
/*     */   private int pendingUps;
/*     */   @NotNull
/*     */   private Stack<Object> pendingDownNodes;
/*     */   private int removeFrom;
/*     */   private int moveFrom;
/*     */   private int moveTo;
/*     */   private int moveCount;
/*     */   public static final int $stable = 8;
/*     */   private static final int invalidGroupLocation = -2;
/*     */   
/*  40 */   public ComposerChangeListWriter(@NotNull ComposerImpl composer, @NotNull ChangeList changeList) { this.composer = composer;
/*     */ 
/*     */ 
/*     */     
/*  44 */     this.changeList = changeList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     this.startedGroups = new IntStack();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     this.implicitRootStart = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     this.pendingDownNodes = new Stack();
/*     */     
/* 101 */     this.removeFrom = -1;
/* 102 */     this.moveFrom = -1;
/* 103 */     this.moveTo = -1; }
/*     */   @NotNull
/*     */   public final ChangeList getChangeList() { return this.changeList; }
/*     */   public final void setChangeList(@NotNull ChangeList <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/* 107 */     this.changeList = <set-?>; } private final void pushApplierOperationPreamble() { pushPendingUpsAndDowns(); }
/*     */   private final SlotReader getReader() { return this.composer.getReader$runtime(); }
/*     */   public final boolean getImplicitRootStart() { return this.implicitRootStart; }
/*     */   public final void setImplicitRootStart(boolean <set-?>) { this.implicitRootStart = <set-?>; } private final void pushSlotEditingOperationPreamble() {
/* 111 */     realizeOperationLocation$default(this, false, 1, null);
/* 112 */     recordSlotEditing();
/*     */   }
/*     */   
/*     */   private final void pushSlotTableOperationPreamble(boolean useParentSlot) {
/* 116 */     realizeOperationLocation(useParentSlot);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void moveReaderRelativeTo(int location) {
/* 124 */     this.writersReaderDelta += location - getReader().getCurrentGroup();
/*     */   }
/*     */   
/*     */   public final void moveReaderToAbsolute(int location) {
/* 128 */     this.writersReaderDelta = location;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void recordSlotEditing() {
/* 134 */     if (getReader().getSize() > 0) {
/* 135 */       SlotReader reader = getReader();
/* 136 */       int location = reader.getParent();
/*     */       
/* 138 */       if (this.startedGroups.peekOr(-2) != location) {
/* 139 */         ensureRootStarted();
/*     */         
/* 141 */         if (location > 0) {
/* 142 */           Anchor anchor = reader.anchor(location);
/* 143 */           this.startedGroups.push(location);
/* 144 */           ensureGroupStarted(anchor);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void ensureRootStarted() {
/* 151 */     if (!this.startedGroup && this.implicitRootStart) {
/* 152 */       pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 153 */       this.changeList.pushEnsureRootStarted();
/* 154 */       this.startedGroup = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void ensureGroupStarted(Anchor anchor) {
/* 159 */     pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 160 */     this.changeList.pushEnsureGroupStarted(anchor);
/* 161 */     this.startedGroup = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void realizeOperationLocation(boolean forParent) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: ifeq -> 14
/*     */     //   4: aload_0
/*     */     //   5: invokespecial getReader : ()Landroidx/compose/runtime/SlotReader;
/*     */     //   8: invokevirtual getParent : ()I
/*     */     //   11: goto -> 21
/*     */     //   14: aload_0
/*     */     //   15: invokespecial getReader : ()Landroidx/compose/runtime/SlotReader;
/*     */     //   18: invokevirtual getCurrentGroup : ()I
/*     */     //   21: istore_2
/*     */     //   22: iload_2
/*     */     //   23: aload_0
/*     */     //   24: getfield writersReaderDelta : I
/*     */     //   27: isub
/*     */     //   28: istore_3
/*     */     //   29: iload_3
/*     */     //   30: iflt -> 37
/*     */     //   33: iconst_1
/*     */     //   34: goto -> 38
/*     */     //   37: iconst_0
/*     */     //   38: istore #4
/*     */     //   40: iconst_0
/*     */     //   41: istore #5
/*     */     //   43: nop
/*     */     //   44: iload #4
/*     */     //   46: ifne -> 57
/*     */     //   49: iconst_0
/*     */     //   50: istore #6
/*     */     //   52: ldc 'Tried to seek backward'
/*     */     //   54: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*     */     //   57: nop
/*     */     //   58: iload_3
/*     */     //   59: ifle -> 75
/*     */     //   62: aload_0
/*     */     //   63: getfield changeList : Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   66: iload_3
/*     */     //   67: invokevirtual pushAdvanceSlotsBy : (I)V
/*     */     //   70: aload_0
/*     */     //   71: iload_2
/*     */     //   72: putfield writersReaderDelta : I
/*     */     //   75: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 0
/*     */     //   #166	-> 22
/*     */     //   #167	-> 29
/*     */     //   #485	-> 43
/*     */     //   #488	-> 44
/*     */     //   #489	-> 49
/*     */     //   #168	-> 52
/*     */     //   #489	-> 54
/*     */     //   #491	-> 57
/*     */     //   #170	-> 58
/*     */     //   #171	-> 62
/*     */     //   #172	-> 70
/*     */     //   #174	-> 75
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   52	2	6	$i$a$-runtimeCheck-ComposerChangeListWriter$realizeOperationLocation$1	I
/*     */     //   43	15	5	$i$f$runtimeCheck	I
/*     */     //   40	18	4	value$iv	Z
/*     */     //   22	54	2	location	I
/*     */     //   29	47	3	distance	I
/*     */     //   0	76	0	this	Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*     */     //   0	76	1	forParent	Z
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getPastParent() {
/* 176 */     return (getReader().getParent() - this.writersReaderDelta < 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void withChangeList(@NotNull ChangeList newChangeList, @NotNull Function0 block) {
/* 182 */     Intrinsics.checkNotNullParameter(newChangeList, "newChangeList"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withChangeList = 0; ChangeList previousChangeList = getChangeList();
/*     */     try {
/* 184 */       setChangeList(newChangeList);
/* 185 */       block.invoke();
/*     */     } finally {
/* 187 */       InlineMarker.finallyStart(1); setChangeList(previousChangeList); InlineMarker.finallyEnd(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void withoutImplicitRootStart(@NotNull Function0 block) {
/* 192 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withoutImplicitRootStart = 0; boolean previousImplicitRootStart = getImplicitRootStart();
/*     */     try {
/* 194 */       setImplicitRootStart(false);
/* 195 */       block.invoke();
/*     */     } finally {
/* 197 */       InlineMarker.finallyStart(1); setImplicitRootStart(previousImplicitRootStart); InlineMarker.finallyEnd(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void remember(@NotNull RememberObserver value) {
/* 202 */     Intrinsics.checkNotNullParameter(value, "value"); this.changeList.pushRemember(value);
/*     */   }
/*     */   
/*     */   public final void updateValue(@Nullable Object value, int groupSlotIndex) {
/* 206 */     pushSlotTableOperationPreamble(true);
/* 207 */     this.changeList.pushUpdateValue(value, groupSlotIndex);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void updateAnchoredValue(@Nullable Object value, @NotNull Anchor anchor, int groupSlotIndex) {
/* 212 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); this.changeList.pushUpdateAnchoredValue(value, anchor, groupSlotIndex);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void appendValue(@NotNull Anchor anchor, @Nullable Object value) {
/* 217 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); this.changeList.pushAppendValue(anchor, value);
/*     */   }
/*     */   
/*     */   public final void trimValues(int count) {
/* 221 */     if (count > 0) {
/* 222 */       pushSlotEditingOperationPreamble();
/* 223 */       this.changeList.pushTrimValues(count);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void resetSlots() {
/* 228 */     this.changeList.pushResetSlots();
/*     */   }
/*     */   
/*     */   public final void updateAuxData(@Nullable Object data) {
/* 232 */     pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 233 */     this.changeList.pushUpdateAuxData(data);
/*     */   }
/*     */   
/*     */   public final void endRoot() {
/* 237 */     if (this.startedGroup) {
/* 238 */       pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 239 */       pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 240 */       this.changeList.pushEndCurrentGroup();
/* 241 */       this.startedGroup = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void endCurrentGroup() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial getReader : ()Landroidx/compose/runtime/SlotReader;
/*     */     //   4: invokevirtual getParent : ()I
/*     */     //   7: istore_1
/*     */     //   8: aload_0
/*     */     //   9: getfield startedGroups : Landroidx/compose/runtime/IntStack;
/*     */     //   12: iconst_m1
/*     */     //   13: invokevirtual peekOr : (I)I
/*     */     //   16: istore_2
/*     */     //   17: iload_2
/*     */     //   18: iload_1
/*     */     //   19: if_icmpgt -> 26
/*     */     //   22: iconst_1
/*     */     //   23: goto -> 27
/*     */     //   26: iconst_0
/*     */     //   27: istore_3
/*     */     //   28: iconst_0
/*     */     //   29: istore #4
/*     */     //   31: nop
/*     */     //   32: iload_3
/*     */     //   33: ifne -> 44
/*     */     //   36: iconst_0
/*     */     //   37: istore #5
/*     */     //   39: ldc 'Missed recording an endGroup'
/*     */     //   41: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*     */     //   44: nop
/*     */     //   45: aload_0
/*     */     //   46: getfield startedGroups : Landroidx/compose/runtime/IntStack;
/*     */     //   49: iconst_m1
/*     */     //   50: invokevirtual peekOr : (I)I
/*     */     //   53: iload_1
/*     */     //   54: if_icmpne -> 79
/*     */     //   57: aload_0
/*     */     //   58: iconst_0
/*     */     //   59: iconst_1
/*     */     //   60: aconst_null
/*     */     //   61: invokestatic pushSlotTableOperationPreamble$default : (Landroidx/compose/runtime/changelist/ComposerChangeListWriter;ZILjava/lang/Object;)V
/*     */     //   64: aload_0
/*     */     //   65: getfield startedGroups : Landroidx/compose/runtime/IntStack;
/*     */     //   68: invokevirtual pop : ()I
/*     */     //   71: pop
/*     */     //   72: aload_0
/*     */     //   73: getfield changeList : Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   76: invokevirtual pushEndCurrentGroup : ()V
/*     */     //   79: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #246	-> 0
/*     */     //   #247	-> 8
/*     */     //   #248	-> 17
/*     */     //   #492	-> 31
/*     */     //   #495	-> 32
/*     */     //   #496	-> 36
/*     */     //   #248	-> 39
/*     */     //   #496	-> 41
/*     */     //   #498	-> 44
/*     */     //   #249	-> 45
/*     */     //   #250	-> 57
/*     */     //   #251	-> 64
/*     */     //   #252	-> 72
/*     */     //   #254	-> 79
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   39	2	5	$i$a$-runtimeCheck-ComposerChangeListWriter$endCurrentGroup$1	I
/*     */     //   31	14	4	$i$f$runtimeCheck	I
/*     */     //   28	17	3	value$iv	Z
/*     */     //   8	72	1	location	I
/*     */     //   17	63	2	currentStartedGroup	I
/*     */     //   0	80	0	this	Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void skipToEndOfCurrentGroup() {
/* 257 */     this.changeList.pushSkipToEndOfCurrentGroup();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void removeCurrentGroup() {
/* 266 */     pushSlotEditingOperationPreamble();
/* 267 */     this.changeList.pushRemoveCurrentGroup();
/* 268 */     this.writersReaderDelta += getReader().getGroupSize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
/* 275 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); Intrinsics.checkNotNullParameter(from, "from"); pushPendingUpsAndDowns();
/* 276 */     pushSlotEditingOperationPreamble();
/* 277 */     realizeNodeMovementOperations();
/* 278 */     this.changeList.pushInsertSlots(anchor, from);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
/* 286 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); Intrinsics.checkNotNullParameter(from, "from"); Intrinsics.checkNotNullParameter(fixups, "fixups"); pushPendingUpsAndDowns();
/* 287 */     pushSlotEditingOperationPreamble();
/* 288 */     realizeNodeMovementOperations();
/* 289 */     this.changeList.pushInsertSlots(anchor, from, fixups);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void moveCurrentGroup(int offset) {
/* 295 */     pushSlotEditingOperationPreamble();
/* 296 */     this.changeList.pushMoveCurrentGroup(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void endCompositionScope(@NotNull Function1<? super Composition, Unit> action, @NotNull Composition composition) {
/* 303 */     Intrinsics.checkNotNullParameter(action, "action"); Intrinsics.checkNotNullParameter(composition, "composition"); this.changeList.pushEndCompositionScope(action, composition);
/*     */   }
/*     */   
/*     */   public final void useNode(@Nullable Object node) {
/* 307 */     pushApplierOperationPreamble();
/* 308 */     this.changeList.pushUseNode(node);
/*     */   }
/*     */   
/*     */   public final <T, V> void updateNode(Object value, @NotNull Function2<?, ? super Object, Unit> block) {
/* 312 */     Intrinsics.checkNotNullParameter(block, "block"); pushApplierOperationPreamble();
/* 313 */     this.changeList.pushUpdateNode(value, block);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void removeNode(int nodeIndex, int count) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: ifle -> 84
/*     */     //   4: iload_1
/*     */     //   5: iflt -> 12
/*     */     //   8: iconst_1
/*     */     //   9: goto -> 13
/*     */     //   12: iconst_0
/*     */     //   13: istore_3
/*     */     //   14: iconst_0
/*     */     //   15: istore #4
/*     */     //   17: nop
/*     */     //   18: iload_3
/*     */     //   19: ifne -> 48
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: new java/lang/StringBuilder
/*     */     //   28: dup
/*     */     //   29: invokespecial <init> : ()V
/*     */     //   32: ldc_w 'Invalid remove index '
/*     */     //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   38: iload_1
/*     */     //   39: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   42: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   45: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*     */     //   48: nop
/*     */     //   49: aload_0
/*     */     //   50: getfield removeFrom : I
/*     */     //   53: iload_1
/*     */     //   54: if_icmpne -> 70
/*     */     //   57: aload_0
/*     */     //   58: aload_0
/*     */     //   59: getfield moveCount : I
/*     */     //   62: iload_2
/*     */     //   63: iadd
/*     */     //   64: putfield moveCount : I
/*     */     //   67: goto -> 84
/*     */     //   70: aload_0
/*     */     //   71: invokespecial realizeNodeMovementOperations : ()V
/*     */     //   74: aload_0
/*     */     //   75: iload_1
/*     */     //   76: putfield removeFrom : I
/*     */     //   79: aload_0
/*     */     //   80: iload_2
/*     */     //   81: putfield moveCount : I
/*     */     //   84: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #317	-> 0
/*     */     //   #318	-> 4
/*     */     //   #499	-> 17
/*     */     //   #502	-> 18
/*     */     //   #503	-> 22
/*     */     //   #318	-> 25
/*     */     //   #503	-> 45
/*     */     //   #505	-> 48
/*     */     //   #319	-> 49
/*     */     //   #320	-> 57
/*     */     //   #322	-> 70
/*     */     //   #323	-> 74
/*     */     //   #324	-> 79
/*     */     //   #327	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	20	5	$i$a$-runtimeCheck-ComposerChangeListWriter$removeNode$1	I
/*     */     //   17	32	4	$i$f$runtimeCheck	I
/*     */     //   14	35	3	value$iv	Z
/*     */     //   0	85	0	this	Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*     */     //   0	85	1	nodeIndex	I
/*     */     //   0	85	2	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void moveNode(int from, int to, int count) {
/* 330 */     if (count > 0) {
/* 331 */       if (this.moveCount > 0 && this.moveFrom == from - this.moveCount && this.moveTo == to - this.moveCount) {
/* 332 */         this.moveCount += count;
/*     */       } else {
/* 334 */         realizeNodeMovementOperations();
/* 335 */         this.moveFrom = from;
/* 336 */         this.moveTo = to;
/* 337 */         this.moveCount = count;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public final void releaseMovableContent() {
/* 343 */     pushPendingUpsAndDowns();
/* 344 */     if (this.startedGroup) {
/* 345 */       skipToEndOfCurrentGroup();
/* 346 */       endRoot();
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void endNodeMovement() {
/* 351 */     realizeNodeMovementOperations();
/*     */   }
/*     */   
/*     */   public final void endNodeMovementAndDeleteNode(int nodeIndex, int group) {
/* 355 */     endNodeMovement();
/* 356 */     pushPendingUpsAndDowns();
/* 357 */     int nodeCount = getReader().isNode(group) ? 1 : getReader().nodeCount(group);
/* 358 */     if (nodeCount > 0) {
/* 359 */       removeNode(nodeIndex, nodeCount);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void realizeNodeMovementOperations() {
/* 364 */     if (this.moveCount > 0) {
/* 365 */       if (this.removeFrom >= 0) {
/* 366 */         realizeRemoveNode(this.removeFrom, this.moveCount);
/* 367 */         this.removeFrom = -1;
/*     */       } else {
/* 369 */         realizeMoveNode(this.moveTo, this.moveFrom, this.moveCount);
/*     */         
/* 371 */         this.moveFrom = -1;
/* 372 */         this.moveTo = -1;
/*     */       } 
/* 374 */       this.moveCount = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void realizeRemoveNode(int removeFrom, int moveCount) {
/* 379 */     pushApplierOperationPreamble();
/* 380 */     this.changeList.pushRemoveNode(removeFrom, moveCount);
/*     */   }
/*     */   
/*     */   private final void realizeMoveNode(int to, int from, int count) {
/* 384 */     pushApplierOperationPreamble();
/* 385 */     this.changeList.pushMoveNode(to, from, count);
/*     */   }
/*     */   
/*     */   public final void moveUp() {
/* 389 */     realizeNodeMovementOperations();
/* 390 */     if (this.pendingDownNodes.isNotEmpty()) {
/* 391 */       this.pendingDownNodes.pop();
/*     */     } else {
/* 393 */       int i = this.pendingUps; this.pendingUps = i + 1;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void moveDown(@Nullable Object node) {
/* 398 */     realizeNodeMovementOperations();
/* 399 */     this.pendingDownNodes.push(node);
/*     */   }
/*     */   
/*     */   private final void pushPendingUpsAndDowns() {
/* 403 */     if (this.pendingUps > 0) {
/* 404 */       this.changeList.pushUps(this.pendingUps);
/* 405 */       this.pendingUps = 0;
/*     */     } 
/*     */     
/* 408 */     if (this.pendingDownNodes.isNotEmpty()) {
/* 409 */       this.changeList.pushDowns(this.pendingDownNodes.toArray());
/* 410 */       this.pendingDownNodes.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void sideEffect(@NotNull Function0<Unit> effect) {
/* 415 */     Intrinsics.checkNotNullParameter(effect, "effect"); this.changeList.pushSideEffect(effect);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void determineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
/* 422 */     Intrinsics.checkNotNullParameter(effectiveNodeIndexOut, "effectiveNodeIndexOut"); Intrinsics.checkNotNullParameter(anchor, "anchor"); pushPendingUpsAndDowns();
/* 423 */     this.changeList.pushDetermineMovableContentNodeIndex(effectiveNodeIndexOut, anchor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void copyNodesToNewAnchorLocation(@NotNull List<? extends Object> nodes, @NotNull IntRef effectiveNodeIndex) {
/* 430 */     Intrinsics.checkNotNullParameter(nodes, "nodes"); Intrinsics.checkNotNullParameter(effectiveNodeIndex, "effectiveNodeIndex"); this.changeList.pushCopyNodesToNewAnchorLocation(nodes, effectiveNodeIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void copySlotTableToAnchorLocation(@Nullable MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to) {
/* 440 */     Intrinsics.checkNotNullParameter(parentContext, "parentContext"); Intrinsics.checkNotNullParameter(from, "from"); Intrinsics.checkNotNullParameter(to, "to"); this.changeList.pushCopySlotTableToAnchorLocation(resolvedState, parentContext, from, to);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void releaseMovableGroupAtCurrent(@NotNull ControlledComposition composition, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference reference) {
/* 449 */     Intrinsics.checkNotNullParameter(composition, "composition"); Intrinsics.checkNotNullParameter(parentContext, "parentContext"); Intrinsics.checkNotNullParameter(reference, "reference"); this.changeList.pushReleaseMovableGroupAtCurrent(composition, parentContext, reference);
/*     */   }
/*     */   
/*     */   public final void endMovableContentPlacement() {
/* 453 */     this.changeList.pushEndMovableContentPlacement();
/* 454 */     this.writersReaderDelta = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void includeOperationsIn(@NotNull ChangeList other, @Nullable IntRef effectiveNodeIndex) {
/* 461 */     Intrinsics.checkNotNullParameter(other, "other"); this.changeList.pushExecuteOperationsIn(other, effectiveNodeIndex);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void finalizeComposition() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial pushPendingUpsAndDowns : ()V
/*     */     //   4: aload_0
/*     */     //   5: getfield startedGroups : Landroidx/compose/runtime/IntStack;
/*     */     //   8: invokevirtual isEmpty : ()Z
/*     */     //   11: istore_1
/*     */     //   12: iconst_0
/*     */     //   13: istore_2
/*     */     //   14: nop
/*     */     //   15: iload_1
/*     */     //   16: ifne -> 27
/*     */     //   19: iconst_0
/*     */     //   20: istore_3
/*     */     //   21: ldc_w 'Missed recording an endGroup()'
/*     */     //   24: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*     */     //   27: nop
/*     */     //   28: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #465	-> 0
/*     */     //   #466	-> 4
/*     */     //   #506	-> 14
/*     */     //   #509	-> 15
/*     */     //   #510	-> 19
/*     */     //   #466	-> 21
/*     */     //   #510	-> 24
/*     */     //   #512	-> 27
/*     */     //   #467	-> 28
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	3	3	$i$a$-runtimeCheck-ComposerChangeListWriter$finalizeComposition$1	I
/*     */     //   14	14	2	$i$f$runtimeCheck	I
/*     */     //   12	16	1	value$iv	Z
/*     */     //   0	29	0	this	Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*     */   }
/*     */   
/*     */   public final void resetTransientState() {
/* 470 */     this.startedGroup = false;
/* 471 */     this.startedGroups.clear();
/* 472 */     this.writersReaderDelta = 0;
/*     */   }
/*     */   
/*     */   public final void deactivateCurrentGroup() {
/* 476 */     pushSlotTableOperationPreamble$default(this, false, 1, null);
/* 477 */     this.changeList.pushDeactivateCurrentGroup();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter$Companion;", "", "()V", "invalidGroupLocation", "", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\ComposerChangeListWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */