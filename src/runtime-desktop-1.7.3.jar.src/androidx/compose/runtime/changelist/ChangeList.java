/*     */ package androidx.compose.runtime.changelist;
/*     */ 
/*     */ import androidx.compose.runtime.Anchor;
/*     */ import androidx.compose.runtime.Applier;
/*     */ import androidx.compose.runtime.Composition;
/*     */ import androidx.compose.runtime.CompositionContext;
/*     */ import androidx.compose.runtime.ControlledComposition;
/*     */ import androidx.compose.runtime.MovableContentState;
/*     */ import androidx.compose.runtime.MovableContentStateReference;
/*     */ import androidx.compose.runtime.RememberManager;
/*     */ import androidx.compose.runtime.RememberObserver;
/*     */ import androidx.compose.runtime.SlotTable;
/*     */ import androidx.compose.runtime.SlotWriter;
/*     */ import androidx.compose.runtime.internal.IntRef;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000º\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\n\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020\t\032\0020\nJ\"\020\013\032\0020\n2\n\020\f\032\006\022\002\b\0030\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021J\006\020\022\032\0020\023J\006\020\024\032\0020\023J\016\020\025\032\0020\n2\006\020\026\032\0020\006J\030\020\027\032\0020\n2\006\020\030\032\0020\0312\b\020\032\032\004\030\0010\033J\036\020\034\032\0020\n2\016\020\035\032\n\022\006\022\004\030\0010\0330\0362\006\020\037\032\0020 J(\020!\032\0020\n2\b\020\"\032\004\030\0010#2\006\020$\032\0020%2\006\020&\032\0020'2\006\020(\032\0020'J\006\020)\032\0020\nJ\026\020*\032\0020\n2\006\020+\032\0020 2\006\020\030\032\0020\031J\033\020,\032\0020\n2\016\020\035\032\n\022\006\022\004\030\0010\0330-¢\006\002\020.J\"\020/\032\0020\n2\022\0200\032\016\022\004\022\00202\022\004\022\0020\n012\006\0203\032\00202J\006\0204\032\0020\nJ\006\0205\032\0020\nJ\016\0206\032\0020\n2\006\020\030\032\0020\031J\006\0207\032\0020\nJ\032\0208\032\0020\n2\006\0209\032\0020\0002\n\b\002\020\037\032\004\030\0010 J\026\020:\032\0020\n2\006\020\030\032\0020\0312\006\020&\032\0020;J\036\020:\032\0020\n2\006\020\030\032\0020\0312\006\020&\032\0020;2\006\020<\032\0020=J\016\020>\032\0020\n2\006\020?\032\0020\006J\036\020@\032\0020\n2\006\020(\032\0020\0062\006\020&\032\0020\0062\006\020A\032\0020\006J\036\020B\032\0020\n2\006\0203\032\0020C2\006\020$\032\0020%2\006\020D\032\0020'J\016\020E\032\0020\n2\006\020\032\032\0020FJ\006\020G\032\0020\nJ\026\020H\032\0020\n2\006\020I\032\0020\0062\006\020J\032\0020\006J\006\020K\032\0020\nJ\024\020L\032\0020\n2\f\020M\032\b\022\004\022\0020\n0NJ\006\020O\032\0020\nJ\016\020P\032\0020\n2\006\020A\032\0020\006J \020Q\032\0020\n2\b\020\032\032\004\030\0010\0332\006\020\030\032\0020\0312\006\020R\032\0020\006J\020\020S\032\0020\n2\b\020T\032\004\030\0010\033J>\020U\032\0020\n\"\004\b\000\020V\"\004\b\001\020W2\006\020\032\032\002HW2\035\020X\032\031\022\004\022\002HV\022\004\022\002HW\022\004\022\0020\n0Y¢\006\002\bZ¢\006\002\020[J\030\020\\\032\0020\n2\b\020\032\032\004\030\0010\0332\006\020R\032\0020\006J\016\020]\032\0020\n2\006\020A\032\0020\006J\020\020^\032\0020\n2\b\020_\032\004\030\0010\033J\020\020`\032\0020a2\006\020b\032\0020aH\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\021\020\005\032\0020\0068F¢\006\006\032\004\b\007\020\b¨\006c"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "size", "", "getSize", "()I", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "pushAdvanceSlotsBy", "distance", "pushAppendValue", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "", "pushCopyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "pushDeactivateCurrentGroup", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", "pushDowns", "", "([Ljava/lang/Object;)V", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushEndCurrentGroup", "pushEndMovableContentPlacement", "pushEnsureGroupStarted", "pushEnsureRootStarted", "pushExecuteOperationsIn", "changeList", "pushInsertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", "offset", "pushMoveNode", "count", "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushRemember", "Landroidx/compose/runtime/RememberObserver;", "pushRemoveCurrentGroup", "pushRemoveNode", "removeFrom", "moveCount", "pushResetSlots", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushSkipToEndOfCurrentGroup", "pushTrimValues", "pushUpdateAnchoredValue", "groupSlotIndex", "pushUpdateAuxData", "data", "pushUpdateNode", "T", "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushUpdateValue", "pushUps", "pushUseNode", "node", "toDebugString", "", "linePrefix", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,326:1\n167#2,5:327\n175#2,2:333\n174#2:335\n178#2,25:341\n204#2:367\n167#2,5:368\n175#2,2:375\n174#2:377\n178#2,25:383\n204#2:409\n167#2,5:410\n175#2,2:418\n174#2:420\n178#2,25:426\n204#2:452\n167#2,5:453\n175#2,2:460\n174#2:462\n178#2,25:468\n204#2:494\n167#2,5:495\n175#2,2:501\n174#2:503\n178#2,25:509\n204#2:535\n167#2,5:536\n175#2,2:542\n174#2:544\n178#2,25:550\n204#2:576\n167#2,5:577\n175#2,2:583\n174#2:585\n178#2,25:591\n204#2:617\n167#2,5:618\n175#2,2:625\n174#2:627\n178#2,25:633\n204#2:659\n167#2,5:660\n175#2,2:668\n174#2:670\n178#2,25:676\n204#2:702\n167#2,5:703\n175#2,2:709\n174#2:711\n178#2,25:717\n204#2:743\n167#2,5:744\n175#2,2:751\n174#2:753\n178#2,25:759\n204#2:785\n167#2,5:786\n175#2,2:793\n174#2:795\n178#2,25:801\n204#2:827\n167#2,5:828\n175#2,2:835\n174#2:837\n178#2,25:843\n204#2:869\n167#2,5:870\n175#2,2:878\n174#2:880\n178#2,25:886\n204#2:912\n167#2,5:913\n175#2,2:919\n174#2:921\n178#2,25:927\n204#2:953\n167#2,5:954\n175#2,2:960\n174#2:962\n178#2,25:968\n204#2:994\n167#2,5:995\n175#2,2:1001\n174#2:1003\n178#2,25:1009\n204#2:1035\n167#2,5:1036\n175#2,2:1042\n174#2:1044\n178#2,25:1050\n204#2:1076\n167#2,5:1077\n175#2,2:1084\n174#2:1086\n178#2,25:1092\n204#2:1118\n167#2,5:1119\n175#2,2:1126\n174#2:1128\n178#2,25:1134\n204#2:1160\n167#2,5:1161\n175#2,2:1170\n174#2:1172\n178#2,25:1178\n204#2:1204\n167#2,5:1205\n175#2,2:1213\n174#2:1215\n178#2,25:1221\n204#2:1247\n167#2,5:1248\n175#2,2:1255\n174#2:1257\n178#2,25:1263\n204#2:1289\n154#3:332\n50#4,5:336\n56#4:366\n50#4,5:378\n56#4:408\n50#4,5:421\n56#4:451\n50#4,5:463\n56#4:493\n50#4,5:504\n56#4:534\n50#4,5:545\n56#4:575\n50#4,5:586\n56#4:616\n50#4,5:628\n56#4:658\n50#4,5:671\n56#4:701\n50#4,5:712\n56#4:742\n50#4,5:754\n56#4:784\n50#4,5:796\n56#4:826\n50#4,5:838\n56#4:868\n50#4,5:881\n56#4:911\n50#4,5:922\n56#4:952\n50#4,5:963\n56#4:993\n50#4,5:1004\n56#4:1034\n50#4,5:1045\n56#4:1075\n50#4,5:1087\n56#4:1117\n50#4,5:1129\n56#4:1159\n50#4,5:1173\n56#4:1203\n50#4,5:1216\n56#4:1246\n50#4,5:1258\n56#4:1288\n225#5:373\n226#5:374\n264#6:415\n265#6:416\n266#6:417\n171#7:458\n172#7:459\n195#8:500\n312#9:541\n339#10:582\n503#11:623\n504#11:624\n531#12:665\n532#12:666\n533#12:667\n366#13:708\n403#14:749\n404#14:750\n435#15:791\n436#15:792\n456#16:833\n457#16:834\n479#17:875\n478#17:876\n480#17:877\n118#18:918\n79#19:959\n96#20:1000\n137#21:1041\n648#22:1082\n649#22:1083\n677#23:1124\n676#23:1125\n703#24:1166\n704#24:1167\n706#24:1168\n705#24:1169\n764#25:1210\n765#25:1211\n766#25:1212\n790#26:1253\n791#26:1254\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n84#1:327,5\n84#1:333,2\n84#1:335\n84#1:341,25\n84#1:367\n90#1:368,5\n90#1:375,2\n90#1:377\n90#1:383,25\n90#1:409\n97#1:410,5\n97#1:418,2\n97#1:420\n97#1:426,25\n97#1:452\n105#1:453,5\n105#1:460,2\n105#1:462\n105#1:468,25\n105#1:494\n112#1:495,5\n112#1:501,2\n112#1:503\n112#1:509,25\n112#1:535\n126#1:536,5\n126#1:542,2\n126#1:544\n126#1:550,25\n126#1:576\n136#1:577,5\n136#1:583,2\n136#1:585\n136#1:591,25\n136#1:617\n157#1:618,5\n157#1:625,2\n157#1:627\n157#1:633,25\n157#1:659\n168#1:660,5\n168#1:668,2\n168#1:670\n168#1:676,25\n168#1:702\n178#1:703,5\n178#1:709,2\n178#1:711\n178#1:717,25\n178#1:743\n187#1:744,5\n187#1:751,2\n187#1:753\n187#1:759,25\n187#1:785\n200#1:786,5\n200#1:793,2\n200#1:795\n200#1:801,25\n200#1:827\n208#1:828,5\n208#1:835,2\n208#1:837\n208#1:843,25\n208#1:869\n215#1:870,5\n215#1:878,2\n215#1:880\n215#1:886,25\n215#1:912\n223#1:913,5\n223#1:919,2\n223#1:921\n223#1:927,25\n223#1:953\n229#1:954,5\n229#1:960,2\n229#1:962\n229#1:968,25\n229#1:994\n236#1:995,5\n236#1:1001,2\n236#1:1003\n236#1:1009,25\n236#1:1035\n243#1:1036,5\n243#1:1042,2\n243#1:1044\n243#1:1050,25\n243#1:1076\n252#1:1077,5\n252#1:1084,2\n252#1:1086\n252#1:1092,25\n252#1:1118\n263#1:1119,5\n263#1:1126,2\n263#1:1128\n263#1:1134,25\n263#1:1160\n277#1:1161,5\n277#1:1170,2\n277#1:1172\n277#1:1178,25\n277#1:1204\n291#1:1205,5\n291#1:1213,2\n291#1:1215\n291#1:1221,25\n291#1:1247\n307#1:1248,5\n307#1:1255,2\n307#1:1257\n307#1:1263,25\n307#1:1289\n85#1:332\n84#1:336,5\n84#1:366\n90#1:378,5\n90#1:408\n97#1:421,5\n97#1:451\n105#1:463,5\n105#1:493\n112#1:504,5\n112#1:534\n126#1:545,5\n126#1:575\n136#1:586,5\n136#1:616\n157#1:628,5\n157#1:658\n168#1:671,5\n168#1:701\n178#1:712,5\n178#1:742\n187#1:754,5\n187#1:784\n200#1:796,5\n200#1:826\n208#1:838,5\n208#1:868\n215#1:881,5\n215#1:911\n223#1:922,5\n223#1:952\n229#1:963,5\n229#1:993\n236#1:1004,5\n236#1:1034\n243#1:1045,5\n243#1:1075\n252#1:1087,5\n252#1:1117\n263#1:1129,5\n263#1:1159\n277#1:1173,5\n277#1:1203\n291#1:1216,5\n291#1:1246\n307#1:1258,5\n307#1:1288\n91#1:373\n92#1:374\n98#1:415\n99#1:416\n100#1:417\n106#1:458\n107#1:459\n113#1:500\n127#1:541\n137#1:582\n158#1:623\n159#1:624\n169#1:665\n170#1:666\n171#1:667\n179#1:708\n188#1:749\n189#1:750\n201#1:791\n203#1:792\n209#1:833\n210#1:834\n216#1:875\n217#1:876\n218#1:877\n224#1:918\n230#1:959\n237#1:1000\n244#1:1041\n253#1:1082\n254#1:1083\n264#1:1124\n265#1:1125\n278#1:1166\n279#1:1167\n280#1:1168\n281#1:1169\n292#1:1210\n293#1:1211\n294#1:1212\n308#1:1253\n309#1:1254\n*E\n"})
/*     */ public final class ChangeList
/*     */   extends OperationsDebugStringFormattable
/*     */ {
/*     */   @NotNull
/*  67 */   private final Operations operations = new Operations();
/*     */   public static final int $stable = 8;
/*  69 */   public final int getSize() { return this.operations.getSize(); }
/*  70 */   public final boolean isEmpty() { return this.operations.isEmpty(); } public final boolean isNotEmpty() {
/*  71 */     return this.operations.isNotEmpty();
/*     */   }
/*     */   public final void clear() {
/*  74 */     this.operations.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void executeAndFlushAllPendingChanges(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*  81 */     Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushRemember(@NotNull RememberObserver value) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'value'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   10: astore_2
/*     */     //   11: getstatic androidx/compose/runtime/changelist/Operation$Remember.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Remember;
/*     */     //   14: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   17: astore_3
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: nop
/*     */     //   22: aload_2
/*     */     //   23: aload_3
/*     */     //   24: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   27: aload_2
/*     */     //   28: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   31: astore #5
/*     */     //   33: iconst_0
/*     */     //   34: istore #6
/*     */     //   36: aload #5
/*     */     //   38: getstatic androidx/compose/runtime/changelist/Operation$Remember.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Remember;
/*     */     //   41: astore #7
/*     */     //   43: iconst_0
/*     */     //   44: istore #8
/*     */     //   46: iconst_0
/*     */     //   47: invokestatic constructor-impl : (I)I
/*     */     //   50: aload_1
/*     */     //   51: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   54: nop
/*     */     //   55: nop
/*     */     //   56: aload_2
/*     */     //   57: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   60: aload_2
/*     */     //   61: aload_3
/*     */     //   62: invokevirtual getInts : ()I
/*     */     //   65: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   68: if_icmpne -> 90
/*     */     //   71: aload_2
/*     */     //   72: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   75: aload_2
/*     */     //   76: aload_3
/*     */     //   77: invokevirtual getObjects : ()I
/*     */     //   80: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   83: if_icmpne -> 90
/*     */     //   86: iconst_1
/*     */     //   87: goto -> 91
/*     */     //   90: iconst_0
/*     */     //   91: istore #9
/*     */     //   93: nop
/*     */     //   94: iconst_0
/*     */     //   95: istore #10
/*     */     //   97: nop
/*     */     //   98: iload #9
/*     */     //   100: ifne -> 391
/*     */     //   103: iconst_0
/*     */     //   104: istore #11
/*     */     //   106: iconst_0
/*     */     //   107: istore #12
/*     */     //   109: new java/lang/StringBuilder
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: astore #13
/*     */     //   118: aload #13
/*     */     //   120: astore #14
/*     */     //   122: iconst_0
/*     */     //   123: istore #15
/*     */     //   125: aload_3
/*     */     //   126: invokevirtual getInts : ()I
/*     */     //   129: istore #16
/*     */     //   131: iconst_0
/*     */     //   132: istore #17
/*     */     //   134: iload #17
/*     */     //   136: iload #16
/*     */     //   138: if_icmpge -> 201
/*     */     //   141: iload #17
/*     */     //   143: istore #18
/*     */     //   145: iconst_0
/*     */     //   146: istore #19
/*     */     //   148: iconst_1
/*     */     //   149: iload #18
/*     */     //   151: ishl
/*     */     //   152: aload_2
/*     */     //   153: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   156: iand
/*     */     //   157: ifeq -> 194
/*     */     //   160: iload #12
/*     */     //   162: ifle -> 173
/*     */     //   165: aload #14
/*     */     //   167: ldc ', '
/*     */     //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   172: pop
/*     */     //   173: aload #14
/*     */     //   175: aload_3
/*     */     //   176: iload #18
/*     */     //   178: invokestatic constructor-impl : (I)I
/*     */     //   181: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   187: pop
/*     */     //   188: iload #12
/*     */     //   190: iconst_1
/*     */     //   191: iadd
/*     */     //   192: istore #12
/*     */     //   194: nop
/*     */     //   195: iinc #17, 1
/*     */     //   198: goto -> 134
/*     */     //   201: nop
/*     */     //   202: aload #13
/*     */     //   204: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   207: dup
/*     */     //   208: ldc 'toString(...)'
/*     */     //   210: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   213: astore #21
/*     */     //   215: iconst_0
/*     */     //   216: istore #13
/*     */     //   218: new java/lang/StringBuilder
/*     */     //   221: dup
/*     */     //   222: invokespecial <init> : ()V
/*     */     //   225: astore #15
/*     */     //   227: aload #15
/*     */     //   229: astore #16
/*     */     //   231: iconst_0
/*     */     //   232: istore #17
/*     */     //   234: aload_3
/*     */     //   235: invokevirtual getObjects : ()I
/*     */     //   238: istore #18
/*     */     //   240: iconst_0
/*     */     //   241: istore #19
/*     */     //   243: iload #19
/*     */     //   245: iload #18
/*     */     //   247: if_icmpge -> 310
/*     */     //   250: iload #19
/*     */     //   252: istore #20
/*     */     //   254: iconst_0
/*     */     //   255: istore #22
/*     */     //   257: iconst_1
/*     */     //   258: iload #20
/*     */     //   260: ishl
/*     */     //   261: aload_2
/*     */     //   262: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   265: iand
/*     */     //   266: ifeq -> 303
/*     */     //   269: iload #12
/*     */     //   271: ifle -> 282
/*     */     //   274: aload #16
/*     */     //   276: ldc ', '
/*     */     //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   281: pop
/*     */     //   282: aload #16
/*     */     //   284: aload_3
/*     */     //   285: iload #20
/*     */     //   287: invokestatic constructor-impl : (I)I
/*     */     //   290: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   296: pop
/*     */     //   297: iload #13
/*     */     //   299: iconst_1
/*     */     //   300: iadd
/*     */     //   301: istore #13
/*     */     //   303: nop
/*     */     //   304: iinc #19, 1
/*     */     //   307: goto -> 243
/*     */     //   310: nop
/*     */     //   311: aload #15
/*     */     //   313: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   316: dup
/*     */     //   317: ldc 'toString(...)'
/*     */     //   319: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   322: astore #14
/*     */     //   324: new java/lang/StringBuilder
/*     */     //   327: dup
/*     */     //   328: invokespecial <init> : ()V
/*     */     //   331: ldc 'Error while pushing '
/*     */     //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   336: aload_3
/*     */     //   337: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   340: ldc '. Not all arguments were provided. Missing '
/*     */     //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   345: iload #12
/*     */     //   347: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   350: ldc ' int arguments ('
/*     */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   355: aload #21
/*     */     //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   360: ldc ') and '
/*     */     //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   365: iload #13
/*     */     //   367: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   370: ldc ' object arguments ('
/*     */     //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   375: aload #14
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: ldc ').'
/*     */     //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   385: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   388: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   391: nop
/*     */     //   392: nop
/*     */     //   393: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 6
/*     */     //   #327	-> 21
/*     */     //   #330	-> 22
/*     */     //   #331	-> 27
/*     */     //   #85	-> 36
/*     */     //   #332	-> 46
/*     */     //   #85	-> 50
/*     */     //   #86	-> 54
/*     */     //   #331	-> 55
/*     */     //   #333	-> 56
/*     */     //   #334	-> 71
/*     */     //   #335	-> 93
/*     */     //   #336	-> 97
/*     */     //   #339	-> 98
/*     */     //   #340	-> 103
/*     */     //   #341	-> 106
/*     */     //   #342	-> 109
/*     */     //   #343	-> 125
/*     */     //   #344	-> 148
/*     */     //   #345	-> 160
/*     */     //   #346	-> 173
/*     */     //   #347	-> 188
/*     */     //   #349	-> 194
/*     */     //   #343	-> 195
/*     */     //   #350	-> 201
/*     */     //   #342	-> 202
/*     */     //   #342	-> 213
/*     */     //   #352	-> 215
/*     */     //   #353	-> 218
/*     */     //   #354	-> 234
/*     */     //   #355	-> 257
/*     */     //   #356	-> 269
/*     */     //   #357	-> 282
/*     */     //   #358	-> 297
/*     */     //   #360	-> 303
/*     */     //   #354	-> 304
/*     */     //   #361	-> 310
/*     */     //   #353	-> 311
/*     */     //   #353	-> 322
/*     */     //   #363	-> 324
/*     */     //   #364	-> 345
/*     */     //   #363	-> 347
/*     */     //   #364	-> 350
/*     */     //   #363	-> 352
/*     */     //   #364	-> 355
/*     */     //   #363	-> 357
/*     */     //   #364	-> 360
/*     */     //   #363	-> 362
/*     */     //   #365	-> 365
/*     */     //   #363	-> 367
/*     */     //   #365	-> 370
/*     */     //   #363	-> 372
/*     */     //   #365	-> 375
/*     */     //   #363	-> 377
/*     */     //   #365	-> 380
/*     */     //   #363	-> 382
/*     */     //   #340	-> 388
/*     */     //   #366	-> 391
/*     */     //   #367	-> 392
/*     */     //   #87	-> 393
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   46	4	8	$i$f$getValue-HpuvwBQ	I
/*     */     //   43	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$Remember;
/*     */     //   36	19	6	$i$a$-push-ChangeList$pushRemember$1	I
/*     */     //   33	22	5	$this$pushRemember_u24lambda_u240	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   148	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   145	50	18	arg$iv	I
/*     */     //   125	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   122	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   257	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   254	50	20	arg$iv	I
/*     */     //   234	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   231	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   106	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   109	279	12	missingIntCount$iv	I
/*     */     //   215	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   218	170	13	missingObjectCount$iv	I
/*     */     //   324	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   97	295	10	$i$f$checkPrecondition	I
/*     */     //   94	298	9	value$iv$iv	Z
/*     */     //   21	372	4	$i$f$push	I
/*     */     //   18	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   18	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	394	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	394	1	value	Landroidx/compose/runtime/RememberObserver;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushUpdateValue(@Nullable Object value, int groupSlotIndex) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_3
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$UpdateValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateValue;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore #4
/*     */     //   13: iconst_0
/*     */     //   14: istore #5
/*     */     //   16: nop
/*     */     //   17: aload_3
/*     */     //   18: aload #4
/*     */     //   20: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   23: aload_3
/*     */     //   24: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   27: astore #6
/*     */     //   29: iconst_0
/*     */     //   30: istore #7
/*     */     //   32: aload #6
/*     */     //   34: getstatic androidx/compose/runtime/changelist/Operation$UpdateValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateValue;
/*     */     //   37: astore #8
/*     */     //   39: iconst_0
/*     */     //   40: istore #9
/*     */     //   42: iconst_0
/*     */     //   43: invokestatic constructor-impl : (I)I
/*     */     //   46: aload_1
/*     */     //   47: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   50: aload #6
/*     */     //   52: getstatic androidx/compose/runtime/changelist/Operation$UpdateValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateValue;
/*     */     //   55: astore #8
/*     */     //   57: iconst_0
/*     */     //   58: istore #9
/*     */     //   60: iconst_0
/*     */     //   61: invokestatic constructor-impl : (I)I
/*     */     //   64: iload_2
/*     */     //   65: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   68: nop
/*     */     //   69: nop
/*     */     //   70: aload_3
/*     */     //   71: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   74: aload_3
/*     */     //   75: aload #4
/*     */     //   77: invokevirtual getInts : ()I
/*     */     //   80: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   83: if_icmpne -> 106
/*     */     //   86: aload_3
/*     */     //   87: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   90: aload_3
/*     */     //   91: aload #4
/*     */     //   93: invokevirtual getObjects : ()I
/*     */     //   96: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   99: if_icmpne -> 106
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 107
/*     */     //   106: iconst_0
/*     */     //   107: istore #10
/*     */     //   109: nop
/*     */     //   110: iconst_0
/*     */     //   111: istore #11
/*     */     //   113: nop
/*     */     //   114: iload #10
/*     */     //   116: ifne -> 412
/*     */     //   119: iconst_0
/*     */     //   120: istore #12
/*     */     //   122: iconst_0
/*     */     //   123: istore #13
/*     */     //   125: new java/lang/StringBuilder
/*     */     //   128: dup
/*     */     //   129: invokespecial <init> : ()V
/*     */     //   132: astore #14
/*     */     //   134: aload #14
/*     */     //   136: astore #15
/*     */     //   138: iconst_0
/*     */     //   139: istore #16
/*     */     //   141: aload #4
/*     */     //   143: invokevirtual getInts : ()I
/*     */     //   146: istore #17
/*     */     //   148: iconst_0
/*     */     //   149: istore #18
/*     */     //   151: iload #18
/*     */     //   153: iload #17
/*     */     //   155: if_icmpge -> 219
/*     */     //   158: iload #18
/*     */     //   160: istore #19
/*     */     //   162: iconst_0
/*     */     //   163: istore #20
/*     */     //   165: iconst_1
/*     */     //   166: iload #19
/*     */     //   168: ishl
/*     */     //   169: aload_3
/*     */     //   170: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   173: iand
/*     */     //   174: ifeq -> 212
/*     */     //   177: iload #13
/*     */     //   179: ifle -> 190
/*     */     //   182: aload #15
/*     */     //   184: ldc ', '
/*     */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   189: pop
/*     */     //   190: aload #15
/*     */     //   192: aload #4
/*     */     //   194: iload #19
/*     */     //   196: invokestatic constructor-impl : (I)I
/*     */     //   199: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   205: pop
/*     */     //   206: iload #13
/*     */     //   208: iconst_1
/*     */     //   209: iadd
/*     */     //   210: istore #13
/*     */     //   212: nop
/*     */     //   213: iinc #18, 1
/*     */     //   216: goto -> 151
/*     */     //   219: nop
/*     */     //   220: aload #14
/*     */     //   222: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   225: dup
/*     */     //   226: ldc 'toString(...)'
/*     */     //   228: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   231: astore #22
/*     */     //   233: iconst_0
/*     */     //   234: istore #14
/*     */     //   236: new java/lang/StringBuilder
/*     */     //   239: dup
/*     */     //   240: invokespecial <init> : ()V
/*     */     //   243: astore #16
/*     */     //   245: aload #16
/*     */     //   247: astore #17
/*     */     //   249: iconst_0
/*     */     //   250: istore #18
/*     */     //   252: aload #4
/*     */     //   254: invokevirtual getObjects : ()I
/*     */     //   257: istore #19
/*     */     //   259: iconst_0
/*     */     //   260: istore #20
/*     */     //   262: iload #20
/*     */     //   264: iload #19
/*     */     //   266: if_icmpge -> 330
/*     */     //   269: iload #20
/*     */     //   271: istore #21
/*     */     //   273: iconst_0
/*     */     //   274: istore #23
/*     */     //   276: iconst_1
/*     */     //   277: iload #21
/*     */     //   279: ishl
/*     */     //   280: aload_3
/*     */     //   281: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   284: iand
/*     */     //   285: ifeq -> 323
/*     */     //   288: iload #13
/*     */     //   290: ifle -> 301
/*     */     //   293: aload #17
/*     */     //   295: ldc ', '
/*     */     //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   300: pop
/*     */     //   301: aload #17
/*     */     //   303: aload #4
/*     */     //   305: iload #21
/*     */     //   307: invokestatic constructor-impl : (I)I
/*     */     //   310: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   316: pop
/*     */     //   317: iload #14
/*     */     //   319: iconst_1
/*     */     //   320: iadd
/*     */     //   321: istore #14
/*     */     //   323: nop
/*     */     //   324: iinc #20, 1
/*     */     //   327: goto -> 262
/*     */     //   330: nop
/*     */     //   331: aload #16
/*     */     //   333: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   336: dup
/*     */     //   337: ldc 'toString(...)'
/*     */     //   339: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   342: astore #15
/*     */     //   344: new java/lang/StringBuilder
/*     */     //   347: dup
/*     */     //   348: invokespecial <init> : ()V
/*     */     //   351: ldc 'Error while pushing '
/*     */     //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   356: aload #4
/*     */     //   358: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   361: ldc '. Not all arguments were provided. Missing '
/*     */     //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   366: iload #13
/*     */     //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   371: ldc ' int arguments ('
/*     */     //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   376: aload #22
/*     */     //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   381: ldc ') and '
/*     */     //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   386: iload #14
/*     */     //   388: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   391: ldc ' object arguments ('
/*     */     //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   396: aload #15
/*     */     //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   401: ldc ').'
/*     */     //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   406: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   409: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   412: nop
/*     */     //   413: nop
/*     */     //   414: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 0
/*     */     //   #368	-> 16
/*     */     //   #371	-> 17
/*     */     //   #372	-> 23
/*     */     //   #91	-> 32
/*     */     //   #373	-> 42
/*     */     //   #91	-> 46
/*     */     //   #92	-> 50
/*     */     //   #374	-> 60
/*     */     //   #92	-> 64
/*     */     //   #93	-> 68
/*     */     //   #372	-> 69
/*     */     //   #375	-> 70
/*     */     //   #376	-> 86
/*     */     //   #377	-> 109
/*     */     //   #378	-> 113
/*     */     //   #381	-> 114
/*     */     //   #382	-> 119
/*     */     //   #383	-> 122
/*     */     //   #384	-> 125
/*     */     //   #385	-> 141
/*     */     //   #386	-> 165
/*     */     //   #387	-> 177
/*     */     //   #388	-> 190
/*     */     //   #389	-> 206
/*     */     //   #391	-> 212
/*     */     //   #385	-> 213
/*     */     //   #392	-> 219
/*     */     //   #384	-> 220
/*     */     //   #384	-> 231
/*     */     //   #394	-> 233
/*     */     //   #395	-> 236
/*     */     //   #396	-> 252
/*     */     //   #397	-> 276
/*     */     //   #398	-> 288
/*     */     //   #399	-> 301
/*     */     //   #400	-> 317
/*     */     //   #402	-> 323
/*     */     //   #396	-> 324
/*     */     //   #403	-> 330
/*     */     //   #395	-> 331
/*     */     //   #395	-> 342
/*     */     //   #405	-> 344
/*     */     //   #406	-> 366
/*     */     //   #405	-> 368
/*     */     //   #406	-> 371
/*     */     //   #405	-> 373
/*     */     //   #406	-> 376
/*     */     //   #405	-> 378
/*     */     //   #406	-> 381
/*     */     //   #405	-> 383
/*     */     //   #407	-> 386
/*     */     //   #405	-> 388
/*     */     //   #407	-> 391
/*     */     //   #405	-> 393
/*     */     //   #407	-> 396
/*     */     //   #405	-> 398
/*     */     //   #407	-> 401
/*     */     //   #405	-> 403
/*     */     //   #382	-> 409
/*     */     //   #408	-> 412
/*     */     //   #409	-> 413
/*     */     //   #94	-> 414
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	4	9	$i$f$getValue-HpuvwBQ	I
/*     */     //   39	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateValue;
/*     */     //   60	4	9	$i$f$getGroupSlotIndex-jn0FJLE	I
/*     */     //   57	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateValue;
/*     */     //   32	37	7	$i$a$-push-ChangeList$pushUpdateValue$1	I
/*     */     //   29	40	6	$this$pushUpdateValue_u24lambda_u241	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   165	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   162	51	19	arg$iv	I
/*     */     //   141	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   138	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   276	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   273	51	21	arg$iv	I
/*     */     //   252	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   249	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   122	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   125	284	13	missingIntCount$iv	I
/*     */     //   233	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   236	173	14	missingObjectCount$iv	I
/*     */     //   344	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   113	300	11	$i$f$checkPrecondition	I
/*     */     //   110	303	10	value$iv$iv	Z
/*     */     //   16	398	5	$i$f$push	I
/*     */     //   13	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   13	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	415	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	415	1	value	Ljava/lang/Object;
/*     */     //   0	415	2	groupSlotIndex	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushUpdateAnchoredValue(@Nullable Object value, @NotNull Anchor anchor, int groupSlotIndex) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 'anchor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   10: astore #4
/*     */     //   12: getstatic androidx/compose/runtime/changelist/Operation$UpdateAnchoredValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   15: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   18: astore #5
/*     */     //   20: iconst_0
/*     */     //   21: istore #6
/*     */     //   23: nop
/*     */     //   24: aload #4
/*     */     //   26: aload #5
/*     */     //   28: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   31: aload #4
/*     */     //   33: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   36: astore #7
/*     */     //   38: iconst_0
/*     */     //   39: istore #8
/*     */     //   41: aload #7
/*     */     //   43: getstatic androidx/compose/runtime/changelist/Operation$UpdateAnchoredValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   46: astore #9
/*     */     //   48: iconst_0
/*     */     //   49: istore #10
/*     */     //   51: iconst_0
/*     */     //   52: invokestatic constructor-impl : (I)I
/*     */     //   55: aload_1
/*     */     //   56: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   59: aload #7
/*     */     //   61: getstatic androidx/compose/runtime/changelist/Operation$UpdateAnchoredValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   64: astore #9
/*     */     //   66: iconst_0
/*     */     //   67: istore #10
/*     */     //   69: iconst_1
/*     */     //   70: invokestatic constructor-impl : (I)I
/*     */     //   73: aload_2
/*     */     //   74: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   77: aload #7
/*     */     //   79: getstatic androidx/compose/runtime/changelist/Operation$UpdateAnchoredValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   82: astore #9
/*     */     //   84: iconst_0
/*     */     //   85: istore #10
/*     */     //   87: iconst_0
/*     */     //   88: invokestatic constructor-impl : (I)I
/*     */     //   91: iload_3
/*     */     //   92: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   95: nop
/*     */     //   96: nop
/*     */     //   97: aload #4
/*     */     //   99: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   102: aload #4
/*     */     //   104: aload #5
/*     */     //   106: invokevirtual getInts : ()I
/*     */     //   109: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   112: if_icmpne -> 137
/*     */     //   115: aload #4
/*     */     //   117: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   120: aload #4
/*     */     //   122: aload #5
/*     */     //   124: invokevirtual getObjects : ()I
/*     */     //   127: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   130: if_icmpne -> 137
/*     */     //   133: iconst_1
/*     */     //   134: goto -> 138
/*     */     //   137: iconst_0
/*     */     //   138: istore #11
/*     */     //   140: nop
/*     */     //   141: iconst_0
/*     */     //   142: istore #12
/*     */     //   144: nop
/*     */     //   145: iload #11
/*     */     //   147: ifne -> 445
/*     */     //   150: iconst_0
/*     */     //   151: istore #13
/*     */     //   153: iconst_0
/*     */     //   154: istore #14
/*     */     //   156: new java/lang/StringBuilder
/*     */     //   159: dup
/*     */     //   160: invokespecial <init> : ()V
/*     */     //   163: astore #15
/*     */     //   165: aload #15
/*     */     //   167: astore #16
/*     */     //   169: iconst_0
/*     */     //   170: istore #17
/*     */     //   172: aload #5
/*     */     //   174: invokevirtual getInts : ()I
/*     */     //   177: istore #18
/*     */     //   179: iconst_0
/*     */     //   180: istore #19
/*     */     //   182: iload #19
/*     */     //   184: iload #18
/*     */     //   186: if_icmpge -> 251
/*     */     //   189: iload #19
/*     */     //   191: istore #20
/*     */     //   193: iconst_0
/*     */     //   194: istore #21
/*     */     //   196: iconst_1
/*     */     //   197: iload #20
/*     */     //   199: ishl
/*     */     //   200: aload #4
/*     */     //   202: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   205: iand
/*     */     //   206: ifeq -> 244
/*     */     //   209: iload #14
/*     */     //   211: ifle -> 222
/*     */     //   214: aload #16
/*     */     //   216: ldc ', '
/*     */     //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   221: pop
/*     */     //   222: aload #16
/*     */     //   224: aload #5
/*     */     //   226: iload #20
/*     */     //   228: invokestatic constructor-impl : (I)I
/*     */     //   231: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   237: pop
/*     */     //   238: iload #14
/*     */     //   240: iconst_1
/*     */     //   241: iadd
/*     */     //   242: istore #14
/*     */     //   244: nop
/*     */     //   245: iinc #19, 1
/*     */     //   248: goto -> 182
/*     */     //   251: nop
/*     */     //   252: aload #15
/*     */     //   254: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   257: dup
/*     */     //   258: ldc 'toString(...)'
/*     */     //   260: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   263: astore #23
/*     */     //   265: iconst_0
/*     */     //   266: istore #15
/*     */     //   268: new java/lang/StringBuilder
/*     */     //   271: dup
/*     */     //   272: invokespecial <init> : ()V
/*     */     //   275: astore #17
/*     */     //   277: aload #17
/*     */     //   279: astore #18
/*     */     //   281: iconst_0
/*     */     //   282: istore #19
/*     */     //   284: aload #5
/*     */     //   286: invokevirtual getObjects : ()I
/*     */     //   289: istore #20
/*     */     //   291: iconst_0
/*     */     //   292: istore #21
/*     */     //   294: iload #21
/*     */     //   296: iload #20
/*     */     //   298: if_icmpge -> 363
/*     */     //   301: iload #21
/*     */     //   303: istore #22
/*     */     //   305: iconst_0
/*     */     //   306: istore #24
/*     */     //   308: iconst_1
/*     */     //   309: iload #22
/*     */     //   311: ishl
/*     */     //   312: aload #4
/*     */     //   314: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   317: iand
/*     */     //   318: ifeq -> 356
/*     */     //   321: iload #14
/*     */     //   323: ifle -> 334
/*     */     //   326: aload #18
/*     */     //   328: ldc ', '
/*     */     //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   333: pop
/*     */     //   334: aload #18
/*     */     //   336: aload #5
/*     */     //   338: iload #22
/*     */     //   340: invokestatic constructor-impl : (I)I
/*     */     //   343: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: pop
/*     */     //   350: iload #15
/*     */     //   352: iconst_1
/*     */     //   353: iadd
/*     */     //   354: istore #15
/*     */     //   356: nop
/*     */     //   357: iinc #21, 1
/*     */     //   360: goto -> 294
/*     */     //   363: nop
/*     */     //   364: aload #17
/*     */     //   366: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   369: dup
/*     */     //   370: ldc 'toString(...)'
/*     */     //   372: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   375: astore #16
/*     */     //   377: new java/lang/StringBuilder
/*     */     //   380: dup
/*     */     //   381: invokespecial <init> : ()V
/*     */     //   384: ldc 'Error while pushing '
/*     */     //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   389: aload #5
/*     */     //   391: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   394: ldc '. Not all arguments were provided. Missing '
/*     */     //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   399: iload #14
/*     */     //   401: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   404: ldc ' int arguments ('
/*     */     //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   409: aload #23
/*     */     //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   414: ldc ') and '
/*     */     //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   419: iload #15
/*     */     //   421: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   424: ldc ' object arguments ('
/*     */     //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   429: aload #16
/*     */     //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   434: ldc ').'
/*     */     //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   439: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   442: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   445: nop
/*     */     //   446: nop
/*     */     //   447: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 6
/*     */     //   #410	-> 23
/*     */     //   #413	-> 24
/*     */     //   #414	-> 31
/*     */     //   #98	-> 41
/*     */     //   #415	-> 51
/*     */     //   #98	-> 55
/*     */     //   #99	-> 59
/*     */     //   #416	-> 69
/*     */     //   #99	-> 73
/*     */     //   #100	-> 77
/*     */     //   #417	-> 87
/*     */     //   #100	-> 91
/*     */     //   #101	-> 95
/*     */     //   #414	-> 96
/*     */     //   #418	-> 97
/*     */     //   #419	-> 115
/*     */     //   #420	-> 140
/*     */     //   #421	-> 144
/*     */     //   #424	-> 145
/*     */     //   #425	-> 150
/*     */     //   #426	-> 153
/*     */     //   #427	-> 156
/*     */     //   #428	-> 172
/*     */     //   #429	-> 196
/*     */     //   #430	-> 209
/*     */     //   #431	-> 222
/*     */     //   #432	-> 238
/*     */     //   #434	-> 244
/*     */     //   #428	-> 245
/*     */     //   #435	-> 251
/*     */     //   #427	-> 252
/*     */     //   #427	-> 263
/*     */     //   #437	-> 265
/*     */     //   #438	-> 268
/*     */     //   #439	-> 284
/*     */     //   #440	-> 308
/*     */     //   #441	-> 321
/*     */     //   #442	-> 334
/*     */     //   #443	-> 350
/*     */     //   #445	-> 356
/*     */     //   #439	-> 357
/*     */     //   #446	-> 363
/*     */     //   #438	-> 364
/*     */     //   #438	-> 375
/*     */     //   #448	-> 377
/*     */     //   #449	-> 399
/*     */     //   #448	-> 401
/*     */     //   #449	-> 404
/*     */     //   #448	-> 406
/*     */     //   #449	-> 409
/*     */     //   #448	-> 411
/*     */     //   #449	-> 414
/*     */     //   #448	-> 416
/*     */     //   #450	-> 419
/*     */     //   #448	-> 421
/*     */     //   #450	-> 424
/*     */     //   #448	-> 426
/*     */     //   #450	-> 429
/*     */     //   #448	-> 431
/*     */     //   #450	-> 434
/*     */     //   #448	-> 436
/*     */     //   #425	-> 442
/*     */     //   #451	-> 445
/*     */     //   #452	-> 446
/*     */     //   #102	-> 447
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   51	4	10	$i$f$getValue-HpuvwBQ	I
/*     */     //   48	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   69	4	10	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   66	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   87	4	10	$i$f$getGroupSlotIndex-jn0FJLE	I
/*     */     //   84	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
/*     */     //   41	55	8	$i$a$-push-ChangeList$pushUpdateAnchoredValue$1	I
/*     */     //   38	58	7	$this$pushUpdateAnchoredValue_u24lambda_u242	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   196	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   193	52	20	arg$iv	I
/*     */     //   172	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   169	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   308	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   305	52	22	arg$iv	I
/*     */     //   284	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   281	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   153	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   156	286	14	missingIntCount$iv	I
/*     */     //   265	177	23	missingInts$iv	Ljava/lang/String;
/*     */     //   268	174	15	missingObjectCount$iv	I
/*     */     //   377	65	16	missingObjects$iv	Ljava/lang/String;
/*     */     //   144	302	12	$i$f$checkPrecondition	I
/*     */     //   141	305	11	value$iv$iv	Z
/*     */     //   23	424	6	$i$f$push	I
/*     */     //   20	427	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   20	427	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	448	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	448	1	value	Ljava/lang/Object;
/*     */     //   0	448	2	anchor	Landroidx/compose/runtime/Anchor;
/*     */     //   0	448	3	groupSlotIndex	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushAppendValue(@NotNull Anchor anchor, @Nullable Object value) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'anchor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   10: astore_3
/*     */     //   11: getstatic androidx/compose/runtime/changelist/Operation$AppendValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$AppendValue;
/*     */     //   14: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   17: astore #4
/*     */     //   19: iconst_0
/*     */     //   20: istore #5
/*     */     //   22: nop
/*     */     //   23: aload_3
/*     */     //   24: aload #4
/*     */     //   26: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   29: aload_3
/*     */     //   30: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   33: astore #6
/*     */     //   35: iconst_0
/*     */     //   36: istore #7
/*     */     //   38: aload #6
/*     */     //   40: getstatic androidx/compose/runtime/changelist/Operation$AppendValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$AppendValue;
/*     */     //   43: astore #8
/*     */     //   45: iconst_0
/*     */     //   46: istore #9
/*     */     //   48: iconst_0
/*     */     //   49: invokestatic constructor-impl : (I)I
/*     */     //   52: aload_1
/*     */     //   53: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   56: aload #6
/*     */     //   58: getstatic androidx/compose/runtime/changelist/Operation$AppendValue.INSTANCE : Landroidx/compose/runtime/changelist/Operation$AppendValue;
/*     */     //   61: astore #8
/*     */     //   63: iconst_0
/*     */     //   64: istore #9
/*     */     //   66: iconst_1
/*     */     //   67: invokestatic constructor-impl : (I)I
/*     */     //   70: aload_2
/*     */     //   71: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   74: nop
/*     */     //   75: nop
/*     */     //   76: aload_3
/*     */     //   77: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   80: aload_3
/*     */     //   81: aload #4
/*     */     //   83: invokevirtual getInts : ()I
/*     */     //   86: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   89: if_icmpne -> 112
/*     */     //   92: aload_3
/*     */     //   93: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   96: aload_3
/*     */     //   97: aload #4
/*     */     //   99: invokevirtual getObjects : ()I
/*     */     //   102: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   105: if_icmpne -> 112
/*     */     //   108: iconst_1
/*     */     //   109: goto -> 113
/*     */     //   112: iconst_0
/*     */     //   113: istore #10
/*     */     //   115: nop
/*     */     //   116: iconst_0
/*     */     //   117: istore #11
/*     */     //   119: nop
/*     */     //   120: iload #10
/*     */     //   122: ifne -> 418
/*     */     //   125: iconst_0
/*     */     //   126: istore #12
/*     */     //   128: iconst_0
/*     */     //   129: istore #13
/*     */     //   131: new java/lang/StringBuilder
/*     */     //   134: dup
/*     */     //   135: invokespecial <init> : ()V
/*     */     //   138: astore #14
/*     */     //   140: aload #14
/*     */     //   142: astore #15
/*     */     //   144: iconst_0
/*     */     //   145: istore #16
/*     */     //   147: aload #4
/*     */     //   149: invokevirtual getInts : ()I
/*     */     //   152: istore #17
/*     */     //   154: iconst_0
/*     */     //   155: istore #18
/*     */     //   157: iload #18
/*     */     //   159: iload #17
/*     */     //   161: if_icmpge -> 225
/*     */     //   164: iload #18
/*     */     //   166: istore #19
/*     */     //   168: iconst_0
/*     */     //   169: istore #20
/*     */     //   171: iconst_1
/*     */     //   172: iload #19
/*     */     //   174: ishl
/*     */     //   175: aload_3
/*     */     //   176: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   179: iand
/*     */     //   180: ifeq -> 218
/*     */     //   183: iload #13
/*     */     //   185: ifle -> 196
/*     */     //   188: aload #15
/*     */     //   190: ldc ', '
/*     */     //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   195: pop
/*     */     //   196: aload #15
/*     */     //   198: aload #4
/*     */     //   200: iload #19
/*     */     //   202: invokestatic constructor-impl : (I)I
/*     */     //   205: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   211: pop
/*     */     //   212: iload #13
/*     */     //   214: iconst_1
/*     */     //   215: iadd
/*     */     //   216: istore #13
/*     */     //   218: nop
/*     */     //   219: iinc #18, 1
/*     */     //   222: goto -> 157
/*     */     //   225: nop
/*     */     //   226: aload #14
/*     */     //   228: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   231: dup
/*     */     //   232: ldc 'toString(...)'
/*     */     //   234: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   237: astore #22
/*     */     //   239: iconst_0
/*     */     //   240: istore #14
/*     */     //   242: new java/lang/StringBuilder
/*     */     //   245: dup
/*     */     //   246: invokespecial <init> : ()V
/*     */     //   249: astore #16
/*     */     //   251: aload #16
/*     */     //   253: astore #17
/*     */     //   255: iconst_0
/*     */     //   256: istore #18
/*     */     //   258: aload #4
/*     */     //   260: invokevirtual getObjects : ()I
/*     */     //   263: istore #19
/*     */     //   265: iconst_0
/*     */     //   266: istore #20
/*     */     //   268: iload #20
/*     */     //   270: iload #19
/*     */     //   272: if_icmpge -> 336
/*     */     //   275: iload #20
/*     */     //   277: istore #21
/*     */     //   279: iconst_0
/*     */     //   280: istore #23
/*     */     //   282: iconst_1
/*     */     //   283: iload #21
/*     */     //   285: ishl
/*     */     //   286: aload_3
/*     */     //   287: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   290: iand
/*     */     //   291: ifeq -> 329
/*     */     //   294: iload #13
/*     */     //   296: ifle -> 307
/*     */     //   299: aload #17
/*     */     //   301: ldc ', '
/*     */     //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   306: pop
/*     */     //   307: aload #17
/*     */     //   309: aload #4
/*     */     //   311: iload #21
/*     */     //   313: invokestatic constructor-impl : (I)I
/*     */     //   316: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   322: pop
/*     */     //   323: iload #14
/*     */     //   325: iconst_1
/*     */     //   326: iadd
/*     */     //   327: istore #14
/*     */     //   329: nop
/*     */     //   330: iinc #20, 1
/*     */     //   333: goto -> 268
/*     */     //   336: nop
/*     */     //   337: aload #16
/*     */     //   339: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   342: dup
/*     */     //   343: ldc 'toString(...)'
/*     */     //   345: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   348: astore #15
/*     */     //   350: new java/lang/StringBuilder
/*     */     //   353: dup
/*     */     //   354: invokespecial <init> : ()V
/*     */     //   357: ldc 'Error while pushing '
/*     */     //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   362: aload #4
/*     */     //   364: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   367: ldc '. Not all arguments were provided. Missing '
/*     */     //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   372: iload #13
/*     */     //   374: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   377: ldc ' int arguments ('
/*     */     //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   382: aload #22
/*     */     //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   387: ldc ') and '
/*     */     //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   392: iload #14
/*     */     //   394: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   397: ldc ' object arguments ('
/*     */     //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   402: aload #15
/*     */     //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   407: ldc ').'
/*     */     //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   412: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   415: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   418: nop
/*     */     //   419: nop
/*     */     //   420: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #105	-> 6
/*     */     //   #453	-> 22
/*     */     //   #456	-> 23
/*     */     //   #457	-> 29
/*     */     //   #106	-> 38
/*     */     //   #458	-> 48
/*     */     //   #106	-> 52
/*     */     //   #107	-> 56
/*     */     //   #459	-> 66
/*     */     //   #107	-> 70
/*     */     //   #108	-> 74
/*     */     //   #457	-> 75
/*     */     //   #460	-> 76
/*     */     //   #461	-> 92
/*     */     //   #462	-> 115
/*     */     //   #463	-> 119
/*     */     //   #466	-> 120
/*     */     //   #467	-> 125
/*     */     //   #468	-> 128
/*     */     //   #469	-> 131
/*     */     //   #470	-> 147
/*     */     //   #471	-> 171
/*     */     //   #472	-> 183
/*     */     //   #473	-> 196
/*     */     //   #474	-> 212
/*     */     //   #476	-> 218
/*     */     //   #470	-> 219
/*     */     //   #477	-> 225
/*     */     //   #469	-> 226
/*     */     //   #469	-> 237
/*     */     //   #479	-> 239
/*     */     //   #480	-> 242
/*     */     //   #481	-> 258
/*     */     //   #482	-> 282
/*     */     //   #483	-> 294
/*     */     //   #484	-> 307
/*     */     //   #485	-> 323
/*     */     //   #487	-> 329
/*     */     //   #481	-> 330
/*     */     //   #488	-> 336
/*     */     //   #480	-> 337
/*     */     //   #480	-> 348
/*     */     //   #490	-> 350
/*     */     //   #491	-> 372
/*     */     //   #490	-> 374
/*     */     //   #491	-> 377
/*     */     //   #490	-> 379
/*     */     //   #491	-> 382
/*     */     //   #490	-> 384
/*     */     //   #491	-> 387
/*     */     //   #490	-> 389
/*     */     //   #492	-> 392
/*     */     //   #490	-> 394
/*     */     //   #492	-> 397
/*     */     //   #490	-> 399
/*     */     //   #492	-> 402
/*     */     //   #490	-> 404
/*     */     //   #492	-> 407
/*     */     //   #490	-> 409
/*     */     //   #467	-> 415
/*     */     //   #493	-> 418
/*     */     //   #494	-> 419
/*     */     //   #109	-> 420
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	4	9	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   45	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$AppendValue;
/*     */     //   66	4	9	$i$f$getValue-HpuvwBQ	I
/*     */     //   63	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$AppendValue;
/*     */     //   38	37	7	$i$a$-push-ChangeList$pushAppendValue$1	I
/*     */     //   35	40	6	$this$pushAppendValue_u24lambda_u243	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   171	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   168	51	19	arg$iv	I
/*     */     //   147	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   144	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   282	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   279	51	21	arg$iv	I
/*     */     //   258	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   255	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   128	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   131	284	13	missingIntCount$iv	I
/*     */     //   239	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   242	173	14	missingObjectCount$iv	I
/*     */     //   350	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   119	300	11	$i$f$checkPrecondition	I
/*     */     //   116	303	10	value$iv$iv	Z
/*     */     //   22	398	5	$i$f$push	I
/*     */     //   19	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   19	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	421	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	421	1	anchor	Landroidx/compose/runtime/Anchor;
/*     */     //   0	421	2	value	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushTrimValues(int count) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_2
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$TrimParentValues.INSTANCE : Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: nop
/*     */     //   16: aload_2
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   21: aload_2
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #5
/*     */     //   27: iconst_0
/*     */     //   28: istore #6
/*     */     //   30: aload #5
/*     */     //   32: getstatic androidx/compose/runtime/changelist/Operation$TrimParentValues.INSTANCE : Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
/*     */     //   35: astore #7
/*     */     //   37: iconst_0
/*     */     //   38: istore #8
/*     */     //   40: iconst_0
/*     */     //   41: invokestatic constructor-impl : (I)I
/*     */     //   44: iload_1
/*     */     //   45: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   48: nop
/*     */     //   49: nop
/*     */     //   50: aload_2
/*     */     //   51: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   54: aload_2
/*     */     //   55: aload_3
/*     */     //   56: invokevirtual getInts : ()I
/*     */     //   59: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   62: if_icmpne -> 84
/*     */     //   65: aload_2
/*     */     //   66: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   69: aload_2
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getObjects : ()I
/*     */     //   74: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   77: if_icmpne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: istore #9
/*     */     //   87: nop
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: nop
/*     */     //   92: iload #9
/*     */     //   94: ifne -> 385
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: istore #12
/*     */     //   103: new java/lang/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #13
/*     */     //   112: aload #13
/*     */     //   114: astore #14
/*     */     //   116: iconst_0
/*     */     //   117: istore #15
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: istore #16
/*     */     //   125: iconst_0
/*     */     //   126: istore #17
/*     */     //   128: iload #17
/*     */     //   130: iload #16
/*     */     //   132: if_icmpge -> 195
/*     */     //   135: iload #17
/*     */     //   137: istore #18
/*     */     //   139: iconst_0
/*     */     //   140: istore #19
/*     */     //   142: iconst_1
/*     */     //   143: iload #18
/*     */     //   145: ishl
/*     */     //   146: aload_2
/*     */     //   147: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   150: iand
/*     */     //   151: ifeq -> 188
/*     */     //   154: iload #12
/*     */     //   156: ifle -> 167
/*     */     //   159: aload #14
/*     */     //   161: ldc ', '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: pop
/*     */     //   167: aload #14
/*     */     //   169: aload_3
/*     */     //   170: iload #18
/*     */     //   172: invokestatic constructor-impl : (I)I
/*     */     //   175: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: pop
/*     */     //   182: iload #12
/*     */     //   184: iconst_1
/*     */     //   185: iadd
/*     */     //   186: istore #12
/*     */     //   188: nop
/*     */     //   189: iinc #17, 1
/*     */     //   192: goto -> 128
/*     */     //   195: nop
/*     */     //   196: aload #13
/*     */     //   198: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ldc 'toString(...)'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: astore #21
/*     */     //   209: iconst_0
/*     */     //   210: istore #13
/*     */     //   212: new java/lang/StringBuilder
/*     */     //   215: dup
/*     */     //   216: invokespecial <init> : ()V
/*     */     //   219: astore #15
/*     */     //   221: aload #15
/*     */     //   223: astore #16
/*     */     //   225: iconst_0
/*     */     //   226: istore #17
/*     */     //   228: aload_3
/*     */     //   229: invokevirtual getObjects : ()I
/*     */     //   232: istore #18
/*     */     //   234: iconst_0
/*     */     //   235: istore #19
/*     */     //   237: iload #19
/*     */     //   239: iload #18
/*     */     //   241: if_icmpge -> 304
/*     */     //   244: iload #19
/*     */     //   246: istore #20
/*     */     //   248: iconst_0
/*     */     //   249: istore #22
/*     */     //   251: iconst_1
/*     */     //   252: iload #20
/*     */     //   254: ishl
/*     */     //   255: aload_2
/*     */     //   256: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   259: iand
/*     */     //   260: ifeq -> 297
/*     */     //   263: iload #12
/*     */     //   265: ifle -> 276
/*     */     //   268: aload #16
/*     */     //   270: ldc ', '
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #16
/*     */     //   278: aload_3
/*     */     //   279: iload #20
/*     */     //   281: invokestatic constructor-impl : (I)I
/*     */     //   284: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   290: pop
/*     */     //   291: iload #13
/*     */     //   293: iconst_1
/*     */     //   294: iadd
/*     */     //   295: istore #13
/*     */     //   297: nop
/*     */     //   298: iinc #19, 1
/*     */     //   301: goto -> 237
/*     */     //   304: nop
/*     */     //   305: aload #15
/*     */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   310: dup
/*     */     //   311: ldc 'toString(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: astore #14
/*     */     //   318: new java/lang/StringBuilder
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: ldc 'Error while pushing '
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: aload_3
/*     */     //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   334: ldc '. Not all arguments were provided. Missing '
/*     */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   339: iload #12
/*     */     //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   344: ldc ' int arguments ('
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: aload #21
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   354: ldc ') and '
/*     */     //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   359: iload #13
/*     */     //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   364: ldc ' object arguments ('
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #14
/*     */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc ').'
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   382: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 0
/*     */     //   #495	-> 15
/*     */     //   #498	-> 16
/*     */     //   #499	-> 21
/*     */     //   #113	-> 30
/*     */     //   #500	-> 40
/*     */     //   #113	-> 44
/*     */     //   #114	-> 48
/*     */     //   #499	-> 49
/*     */     //   #501	-> 50
/*     */     //   #502	-> 65
/*     */     //   #503	-> 87
/*     */     //   #504	-> 91
/*     */     //   #507	-> 92
/*     */     //   #508	-> 97
/*     */     //   #509	-> 100
/*     */     //   #510	-> 103
/*     */     //   #511	-> 119
/*     */     //   #512	-> 142
/*     */     //   #513	-> 154
/*     */     //   #514	-> 167
/*     */     //   #515	-> 182
/*     */     //   #517	-> 188
/*     */     //   #511	-> 189
/*     */     //   #518	-> 195
/*     */     //   #510	-> 196
/*     */     //   #510	-> 207
/*     */     //   #520	-> 209
/*     */     //   #521	-> 212
/*     */     //   #522	-> 228
/*     */     //   #523	-> 251
/*     */     //   #524	-> 263
/*     */     //   #525	-> 276
/*     */     //   #526	-> 291
/*     */     //   #528	-> 297
/*     */     //   #522	-> 298
/*     */     //   #529	-> 304
/*     */     //   #521	-> 305
/*     */     //   #521	-> 316
/*     */     //   #531	-> 318
/*     */     //   #532	-> 339
/*     */     //   #531	-> 341
/*     */     //   #532	-> 344
/*     */     //   #531	-> 346
/*     */     //   #532	-> 349
/*     */     //   #531	-> 351
/*     */     //   #532	-> 354
/*     */     //   #531	-> 356
/*     */     //   #533	-> 359
/*     */     //   #531	-> 361
/*     */     //   #533	-> 364
/*     */     //   #531	-> 366
/*     */     //   #533	-> 369
/*     */     //   #531	-> 371
/*     */     //   #533	-> 374
/*     */     //   #531	-> 376
/*     */     //   #508	-> 382
/*     */     //   #534	-> 385
/*     */     //   #535	-> 386
/*     */     //   #115	-> 387
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	4	8	$i$f$getCount-jn0FJLE	I
/*     */     //   37	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
/*     */     //   30	19	6	$i$a$-push-ChangeList$pushTrimValues$1	I
/*     */     //   27	22	5	$this$pushTrimValues_u24lambda_u244	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   142	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   139	50	18	arg$iv	I
/*     */     //   119	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   116	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   251	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   248	50	20	arg$iv	I
/*     */     //   228	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   225	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   100	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   103	279	12	missingIntCount$iv	I
/*     */     //   209	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   212	170	13	missingObjectCount$iv	I
/*     */     //   318	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   91	295	10	$i$f$checkPrecondition	I
/*     */     //   88	298	9	value$iv$iv	Z
/*     */     //   15	372	4	$i$f$push	I
/*     */     //   12	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   12	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	388	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	388	1	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushResetSlots() {
/* 118 */     this.operations.push(Operation.ResetSlots.INSTANCE);
/*     */   }
/*     */   
/*     */   public final void pushDeactivateCurrentGroup() {
/* 122 */     this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void pushUpdateAuxData(@Nullable Object data) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_2
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$UpdateAuxData.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: nop
/*     */     //   16: aload_2
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   21: aload_2
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #5
/*     */     //   27: iconst_0
/*     */     //   28: istore #6
/*     */     //   30: aload #5
/*     */     //   32: getstatic androidx/compose/runtime/changelist/Operation$UpdateAuxData.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;
/*     */     //   35: astore #7
/*     */     //   37: iconst_0
/*     */     //   38: istore #8
/*     */     //   40: iconst_0
/*     */     //   41: invokestatic constructor-impl : (I)I
/*     */     //   44: aload_1
/*     */     //   45: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   48: nop
/*     */     //   49: nop
/*     */     //   50: aload_2
/*     */     //   51: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   54: aload_2
/*     */     //   55: aload_3
/*     */     //   56: invokevirtual getInts : ()I
/*     */     //   59: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   62: if_icmpne -> 84
/*     */     //   65: aload_2
/*     */     //   66: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   69: aload_2
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getObjects : ()I
/*     */     //   74: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   77: if_icmpne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: istore #9
/*     */     //   87: nop
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: nop
/*     */     //   92: iload #9
/*     */     //   94: ifne -> 385
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: istore #12
/*     */     //   103: new java/lang/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #13
/*     */     //   112: aload #13
/*     */     //   114: astore #14
/*     */     //   116: iconst_0
/*     */     //   117: istore #15
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: istore #16
/*     */     //   125: iconst_0
/*     */     //   126: istore #17
/*     */     //   128: iload #17
/*     */     //   130: iload #16
/*     */     //   132: if_icmpge -> 195
/*     */     //   135: iload #17
/*     */     //   137: istore #18
/*     */     //   139: iconst_0
/*     */     //   140: istore #19
/*     */     //   142: iconst_1
/*     */     //   143: iload #18
/*     */     //   145: ishl
/*     */     //   146: aload_2
/*     */     //   147: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   150: iand
/*     */     //   151: ifeq -> 188
/*     */     //   154: iload #12
/*     */     //   156: ifle -> 167
/*     */     //   159: aload #14
/*     */     //   161: ldc ', '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: pop
/*     */     //   167: aload #14
/*     */     //   169: aload_3
/*     */     //   170: iload #18
/*     */     //   172: invokestatic constructor-impl : (I)I
/*     */     //   175: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: pop
/*     */     //   182: iload #12
/*     */     //   184: iconst_1
/*     */     //   185: iadd
/*     */     //   186: istore #12
/*     */     //   188: nop
/*     */     //   189: iinc #17, 1
/*     */     //   192: goto -> 128
/*     */     //   195: nop
/*     */     //   196: aload #13
/*     */     //   198: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ldc 'toString(...)'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: astore #21
/*     */     //   209: iconst_0
/*     */     //   210: istore #13
/*     */     //   212: new java/lang/StringBuilder
/*     */     //   215: dup
/*     */     //   216: invokespecial <init> : ()V
/*     */     //   219: astore #15
/*     */     //   221: aload #15
/*     */     //   223: astore #16
/*     */     //   225: iconst_0
/*     */     //   226: istore #17
/*     */     //   228: aload_3
/*     */     //   229: invokevirtual getObjects : ()I
/*     */     //   232: istore #18
/*     */     //   234: iconst_0
/*     */     //   235: istore #19
/*     */     //   237: iload #19
/*     */     //   239: iload #18
/*     */     //   241: if_icmpge -> 304
/*     */     //   244: iload #19
/*     */     //   246: istore #20
/*     */     //   248: iconst_0
/*     */     //   249: istore #22
/*     */     //   251: iconst_1
/*     */     //   252: iload #20
/*     */     //   254: ishl
/*     */     //   255: aload_2
/*     */     //   256: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   259: iand
/*     */     //   260: ifeq -> 297
/*     */     //   263: iload #12
/*     */     //   265: ifle -> 276
/*     */     //   268: aload #16
/*     */     //   270: ldc ', '
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #16
/*     */     //   278: aload_3
/*     */     //   279: iload #20
/*     */     //   281: invokestatic constructor-impl : (I)I
/*     */     //   284: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   290: pop
/*     */     //   291: iload #13
/*     */     //   293: iconst_1
/*     */     //   294: iadd
/*     */     //   295: istore #13
/*     */     //   297: nop
/*     */     //   298: iinc #19, 1
/*     */     //   301: goto -> 237
/*     */     //   304: nop
/*     */     //   305: aload #15
/*     */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   310: dup
/*     */     //   311: ldc 'toString(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: astore #14
/*     */     //   318: new java/lang/StringBuilder
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: ldc 'Error while pushing '
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: aload_3
/*     */     //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   334: ldc '. Not all arguments were provided. Missing '
/*     */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   339: iload #12
/*     */     //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   344: ldc ' int arguments ('
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: aload #21
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   354: ldc ') and '
/*     */     //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   359: iload #13
/*     */     //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   364: ldc ' object arguments ('
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #14
/*     */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc ').'
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   382: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #126	-> 0
/*     */     //   #536	-> 15
/*     */     //   #539	-> 16
/*     */     //   #540	-> 21
/*     */     //   #127	-> 30
/*     */     //   #541	-> 40
/*     */     //   #127	-> 44
/*     */     //   #128	-> 48
/*     */     //   #540	-> 49
/*     */     //   #542	-> 50
/*     */     //   #543	-> 65
/*     */     //   #544	-> 87
/*     */     //   #545	-> 91
/*     */     //   #548	-> 92
/*     */     //   #549	-> 97
/*     */     //   #550	-> 100
/*     */     //   #551	-> 103
/*     */     //   #552	-> 119
/*     */     //   #553	-> 142
/*     */     //   #554	-> 154
/*     */     //   #555	-> 167
/*     */     //   #556	-> 182
/*     */     //   #558	-> 188
/*     */     //   #552	-> 189
/*     */     //   #559	-> 195
/*     */     //   #551	-> 196
/*     */     //   #551	-> 207
/*     */     //   #561	-> 209
/*     */     //   #562	-> 212
/*     */     //   #563	-> 228
/*     */     //   #564	-> 251
/*     */     //   #565	-> 263
/*     */     //   #566	-> 276
/*     */     //   #567	-> 291
/*     */     //   #569	-> 297
/*     */     //   #563	-> 298
/*     */     //   #570	-> 304
/*     */     //   #562	-> 305
/*     */     //   #562	-> 316
/*     */     //   #572	-> 318
/*     */     //   #573	-> 339
/*     */     //   #572	-> 341
/*     */     //   #573	-> 344
/*     */     //   #572	-> 346
/*     */     //   #573	-> 349
/*     */     //   #572	-> 351
/*     */     //   #573	-> 354
/*     */     //   #572	-> 356
/*     */     //   #574	-> 359
/*     */     //   #572	-> 361
/*     */     //   #574	-> 364
/*     */     //   #572	-> 366
/*     */     //   #574	-> 369
/*     */     //   #572	-> 371
/*     */     //   #574	-> 374
/*     */     //   #572	-> 376
/*     */     //   #549	-> 382
/*     */     //   #575	-> 385
/*     */     //   #576	-> 386
/*     */     //   #129	-> 387
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	4	8	$i$f$getData-HpuvwBQ	I
/*     */     //   37	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;
/*     */     //   30	19	6	$i$a$-push-ChangeList$pushUpdateAuxData$1	I
/*     */     //   27	22	5	$this$pushUpdateAuxData_u24lambda_u245	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   142	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   139	50	18	arg$iv	I
/*     */     //   119	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   116	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   251	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   248	50	20	arg$iv	I
/*     */     //   228	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   225	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   100	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   103	279	12	missingIntCount$iv	I
/*     */     //   209	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   212	170	13	missingObjectCount$iv	I
/*     */     //   318	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   91	295	10	$i$f$checkPrecondition	I
/*     */     //   88	298	9	value$iv$iv	Z
/*     */     //   15	372	4	$i$f$push	I
/*     */     //   12	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   12	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	388	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	388	1	data	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void pushEnsureRootStarted() {
/* 132 */     this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void pushEnsureGroupStarted(@NotNull Anchor anchor) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'anchor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   10: astore_2
/*     */     //   11: getstatic androidx/compose/runtime/changelist/Operation$EnsureGroupStarted.INSTANCE : Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;
/*     */     //   14: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   17: astore_3
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: nop
/*     */     //   22: aload_2
/*     */     //   23: aload_3
/*     */     //   24: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   27: aload_2
/*     */     //   28: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   31: astore #5
/*     */     //   33: iconst_0
/*     */     //   34: istore #6
/*     */     //   36: aload #5
/*     */     //   38: getstatic androidx/compose/runtime/changelist/Operation$EnsureGroupStarted.INSTANCE : Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;
/*     */     //   41: astore #7
/*     */     //   43: iconst_0
/*     */     //   44: istore #8
/*     */     //   46: iconst_0
/*     */     //   47: invokestatic constructor-impl : (I)I
/*     */     //   50: aload_1
/*     */     //   51: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   54: nop
/*     */     //   55: nop
/*     */     //   56: aload_2
/*     */     //   57: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   60: aload_2
/*     */     //   61: aload_3
/*     */     //   62: invokevirtual getInts : ()I
/*     */     //   65: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   68: if_icmpne -> 90
/*     */     //   71: aload_2
/*     */     //   72: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   75: aload_2
/*     */     //   76: aload_3
/*     */     //   77: invokevirtual getObjects : ()I
/*     */     //   80: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   83: if_icmpne -> 90
/*     */     //   86: iconst_1
/*     */     //   87: goto -> 91
/*     */     //   90: iconst_0
/*     */     //   91: istore #9
/*     */     //   93: nop
/*     */     //   94: iconst_0
/*     */     //   95: istore #10
/*     */     //   97: nop
/*     */     //   98: iload #9
/*     */     //   100: ifne -> 391
/*     */     //   103: iconst_0
/*     */     //   104: istore #11
/*     */     //   106: iconst_0
/*     */     //   107: istore #12
/*     */     //   109: new java/lang/StringBuilder
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: astore #13
/*     */     //   118: aload #13
/*     */     //   120: astore #14
/*     */     //   122: iconst_0
/*     */     //   123: istore #15
/*     */     //   125: aload_3
/*     */     //   126: invokevirtual getInts : ()I
/*     */     //   129: istore #16
/*     */     //   131: iconst_0
/*     */     //   132: istore #17
/*     */     //   134: iload #17
/*     */     //   136: iload #16
/*     */     //   138: if_icmpge -> 201
/*     */     //   141: iload #17
/*     */     //   143: istore #18
/*     */     //   145: iconst_0
/*     */     //   146: istore #19
/*     */     //   148: iconst_1
/*     */     //   149: iload #18
/*     */     //   151: ishl
/*     */     //   152: aload_2
/*     */     //   153: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   156: iand
/*     */     //   157: ifeq -> 194
/*     */     //   160: iload #12
/*     */     //   162: ifle -> 173
/*     */     //   165: aload #14
/*     */     //   167: ldc ', '
/*     */     //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   172: pop
/*     */     //   173: aload #14
/*     */     //   175: aload_3
/*     */     //   176: iload #18
/*     */     //   178: invokestatic constructor-impl : (I)I
/*     */     //   181: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   187: pop
/*     */     //   188: iload #12
/*     */     //   190: iconst_1
/*     */     //   191: iadd
/*     */     //   192: istore #12
/*     */     //   194: nop
/*     */     //   195: iinc #17, 1
/*     */     //   198: goto -> 134
/*     */     //   201: nop
/*     */     //   202: aload #13
/*     */     //   204: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   207: dup
/*     */     //   208: ldc 'toString(...)'
/*     */     //   210: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   213: astore #21
/*     */     //   215: iconst_0
/*     */     //   216: istore #13
/*     */     //   218: new java/lang/StringBuilder
/*     */     //   221: dup
/*     */     //   222: invokespecial <init> : ()V
/*     */     //   225: astore #15
/*     */     //   227: aload #15
/*     */     //   229: astore #16
/*     */     //   231: iconst_0
/*     */     //   232: istore #17
/*     */     //   234: aload_3
/*     */     //   235: invokevirtual getObjects : ()I
/*     */     //   238: istore #18
/*     */     //   240: iconst_0
/*     */     //   241: istore #19
/*     */     //   243: iload #19
/*     */     //   245: iload #18
/*     */     //   247: if_icmpge -> 310
/*     */     //   250: iload #19
/*     */     //   252: istore #20
/*     */     //   254: iconst_0
/*     */     //   255: istore #22
/*     */     //   257: iconst_1
/*     */     //   258: iload #20
/*     */     //   260: ishl
/*     */     //   261: aload_2
/*     */     //   262: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   265: iand
/*     */     //   266: ifeq -> 303
/*     */     //   269: iload #12
/*     */     //   271: ifle -> 282
/*     */     //   274: aload #16
/*     */     //   276: ldc ', '
/*     */     //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   281: pop
/*     */     //   282: aload #16
/*     */     //   284: aload_3
/*     */     //   285: iload #20
/*     */     //   287: invokestatic constructor-impl : (I)I
/*     */     //   290: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   296: pop
/*     */     //   297: iload #13
/*     */     //   299: iconst_1
/*     */     //   300: iadd
/*     */     //   301: istore #13
/*     */     //   303: nop
/*     */     //   304: iinc #19, 1
/*     */     //   307: goto -> 243
/*     */     //   310: nop
/*     */     //   311: aload #15
/*     */     //   313: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   316: dup
/*     */     //   317: ldc 'toString(...)'
/*     */     //   319: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   322: astore #14
/*     */     //   324: new java/lang/StringBuilder
/*     */     //   327: dup
/*     */     //   328: invokespecial <init> : ()V
/*     */     //   331: ldc 'Error while pushing '
/*     */     //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   336: aload_3
/*     */     //   337: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   340: ldc '. Not all arguments were provided. Missing '
/*     */     //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   345: iload #12
/*     */     //   347: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   350: ldc ' int arguments ('
/*     */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   355: aload #21
/*     */     //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   360: ldc ') and '
/*     */     //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   365: iload #13
/*     */     //   367: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   370: ldc ' object arguments ('
/*     */     //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   375: aload #14
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: ldc ').'
/*     */     //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   385: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   388: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   391: nop
/*     */     //   392: nop
/*     */     //   393: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 6
/*     */     //   #577	-> 21
/*     */     //   #580	-> 22
/*     */     //   #581	-> 27
/*     */     //   #137	-> 36
/*     */     //   #582	-> 46
/*     */     //   #137	-> 50
/*     */     //   #138	-> 54
/*     */     //   #581	-> 55
/*     */     //   #583	-> 56
/*     */     //   #584	-> 71
/*     */     //   #585	-> 93
/*     */     //   #586	-> 97
/*     */     //   #589	-> 98
/*     */     //   #590	-> 103
/*     */     //   #591	-> 106
/*     */     //   #592	-> 109
/*     */     //   #593	-> 125
/*     */     //   #594	-> 148
/*     */     //   #595	-> 160
/*     */     //   #596	-> 173
/*     */     //   #597	-> 188
/*     */     //   #599	-> 194
/*     */     //   #593	-> 195
/*     */     //   #600	-> 201
/*     */     //   #592	-> 202
/*     */     //   #592	-> 213
/*     */     //   #602	-> 215
/*     */     //   #603	-> 218
/*     */     //   #604	-> 234
/*     */     //   #605	-> 257
/*     */     //   #606	-> 269
/*     */     //   #607	-> 282
/*     */     //   #608	-> 297
/*     */     //   #610	-> 303
/*     */     //   #604	-> 304
/*     */     //   #611	-> 310
/*     */     //   #603	-> 311
/*     */     //   #603	-> 322
/*     */     //   #613	-> 324
/*     */     //   #614	-> 345
/*     */     //   #613	-> 347
/*     */     //   #614	-> 350
/*     */     //   #613	-> 352
/*     */     //   #614	-> 355
/*     */     //   #613	-> 357
/*     */     //   #614	-> 360
/*     */     //   #613	-> 362
/*     */     //   #615	-> 365
/*     */     //   #613	-> 367
/*     */     //   #615	-> 370
/*     */     //   #613	-> 372
/*     */     //   #615	-> 375
/*     */     //   #613	-> 377
/*     */     //   #615	-> 380
/*     */     //   #613	-> 382
/*     */     //   #590	-> 388
/*     */     //   #616	-> 391
/*     */     //   #617	-> 392
/*     */     //   #139	-> 393
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   46	4	8	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   43	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;
/*     */     //   36	19	6	$i$a$-push-ChangeList$pushEnsureGroupStarted$1	I
/*     */     //   33	22	5	$this$pushEnsureGroupStarted_u24lambda_u246	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   148	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   145	50	18	arg$iv	I
/*     */     //   125	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   122	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   257	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   254	50	20	arg$iv	I
/*     */     //   234	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   231	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   106	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   109	279	12	missingIntCount$iv	I
/*     */     //   215	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   218	170	13	missingObjectCount$iv	I
/*     */     //   324	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   97	295	10	$i$f$checkPrecondition	I
/*     */     //   94	298	9	value$iv$iv	Z
/*     */     //   21	372	4	$i$f$push	I
/*     */     //   18	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   18	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	394	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	394	1	anchor	Landroidx/compose/runtime/Anchor;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void pushEndCurrentGroup() {
/* 142 */     this.operations.push(Operation.EndCurrentGroup.INSTANCE);
/*     */   }
/*     */   
/*     */   public final void pushSkipToEndOfCurrentGroup() {
/* 146 */     this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
/*     */   }
/*     */   
/*     */   public final void pushRemoveCurrentGroup() {
/* 150 */     this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'anchor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 'from'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_0
/*     */     //   14: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   17: astore_3
/*     */     //   18: getstatic androidx/compose/runtime/changelist/Operation$InsertSlots.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlots;
/*     */     //   21: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   24: astore #4
/*     */     //   26: iconst_0
/*     */     //   27: istore #5
/*     */     //   29: nop
/*     */     //   30: aload_3
/*     */     //   31: aload #4
/*     */     //   33: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   36: aload_3
/*     */     //   37: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   40: astore #6
/*     */     //   42: iconst_0
/*     */     //   43: istore #7
/*     */     //   45: aload #6
/*     */     //   47: getstatic androidx/compose/runtime/changelist/Operation$InsertSlots.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlots;
/*     */     //   50: astore #8
/*     */     //   52: iconst_0
/*     */     //   53: istore #9
/*     */     //   55: iconst_0
/*     */     //   56: invokestatic constructor-impl : (I)I
/*     */     //   59: aload_1
/*     */     //   60: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   63: aload #6
/*     */     //   65: getstatic androidx/compose/runtime/changelist/Operation$InsertSlots.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlots;
/*     */     //   68: astore #8
/*     */     //   70: iconst_0
/*     */     //   71: istore #9
/*     */     //   73: iconst_1
/*     */     //   74: invokestatic constructor-impl : (I)I
/*     */     //   77: aload_2
/*     */     //   78: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   81: nop
/*     */     //   82: nop
/*     */     //   83: aload_3
/*     */     //   84: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   87: aload_3
/*     */     //   88: aload #4
/*     */     //   90: invokevirtual getInts : ()I
/*     */     //   93: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   96: if_icmpne -> 119
/*     */     //   99: aload_3
/*     */     //   100: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   103: aload_3
/*     */     //   104: aload #4
/*     */     //   106: invokevirtual getObjects : ()I
/*     */     //   109: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   112: if_icmpne -> 119
/*     */     //   115: iconst_1
/*     */     //   116: goto -> 120
/*     */     //   119: iconst_0
/*     */     //   120: istore #10
/*     */     //   122: nop
/*     */     //   123: iconst_0
/*     */     //   124: istore #11
/*     */     //   126: nop
/*     */     //   127: iload #10
/*     */     //   129: ifne -> 425
/*     */     //   132: iconst_0
/*     */     //   133: istore #12
/*     */     //   135: iconst_0
/*     */     //   136: istore #13
/*     */     //   138: new java/lang/StringBuilder
/*     */     //   141: dup
/*     */     //   142: invokespecial <init> : ()V
/*     */     //   145: astore #14
/*     */     //   147: aload #14
/*     */     //   149: astore #15
/*     */     //   151: iconst_0
/*     */     //   152: istore #16
/*     */     //   154: aload #4
/*     */     //   156: invokevirtual getInts : ()I
/*     */     //   159: istore #17
/*     */     //   161: iconst_0
/*     */     //   162: istore #18
/*     */     //   164: iload #18
/*     */     //   166: iload #17
/*     */     //   168: if_icmpge -> 232
/*     */     //   171: iload #18
/*     */     //   173: istore #19
/*     */     //   175: iconst_0
/*     */     //   176: istore #20
/*     */     //   178: iconst_1
/*     */     //   179: iload #19
/*     */     //   181: ishl
/*     */     //   182: aload_3
/*     */     //   183: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   186: iand
/*     */     //   187: ifeq -> 225
/*     */     //   190: iload #13
/*     */     //   192: ifle -> 203
/*     */     //   195: aload #15
/*     */     //   197: ldc ', '
/*     */     //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   202: pop
/*     */     //   203: aload #15
/*     */     //   205: aload #4
/*     */     //   207: iload #19
/*     */     //   209: invokestatic constructor-impl : (I)I
/*     */     //   212: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   218: pop
/*     */     //   219: iload #13
/*     */     //   221: iconst_1
/*     */     //   222: iadd
/*     */     //   223: istore #13
/*     */     //   225: nop
/*     */     //   226: iinc #18, 1
/*     */     //   229: goto -> 164
/*     */     //   232: nop
/*     */     //   233: aload #14
/*     */     //   235: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   238: dup
/*     */     //   239: ldc 'toString(...)'
/*     */     //   241: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   244: astore #22
/*     */     //   246: iconst_0
/*     */     //   247: istore #14
/*     */     //   249: new java/lang/StringBuilder
/*     */     //   252: dup
/*     */     //   253: invokespecial <init> : ()V
/*     */     //   256: astore #16
/*     */     //   258: aload #16
/*     */     //   260: astore #17
/*     */     //   262: iconst_0
/*     */     //   263: istore #18
/*     */     //   265: aload #4
/*     */     //   267: invokevirtual getObjects : ()I
/*     */     //   270: istore #19
/*     */     //   272: iconst_0
/*     */     //   273: istore #20
/*     */     //   275: iload #20
/*     */     //   277: iload #19
/*     */     //   279: if_icmpge -> 343
/*     */     //   282: iload #20
/*     */     //   284: istore #21
/*     */     //   286: iconst_0
/*     */     //   287: istore #23
/*     */     //   289: iconst_1
/*     */     //   290: iload #21
/*     */     //   292: ishl
/*     */     //   293: aload_3
/*     */     //   294: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   297: iand
/*     */     //   298: ifeq -> 336
/*     */     //   301: iload #13
/*     */     //   303: ifle -> 314
/*     */     //   306: aload #17
/*     */     //   308: ldc ', '
/*     */     //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   313: pop
/*     */     //   314: aload #17
/*     */     //   316: aload #4
/*     */     //   318: iload #21
/*     */     //   320: invokestatic constructor-impl : (I)I
/*     */     //   323: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   329: pop
/*     */     //   330: iload #14
/*     */     //   332: iconst_1
/*     */     //   333: iadd
/*     */     //   334: istore #14
/*     */     //   336: nop
/*     */     //   337: iinc #20, 1
/*     */     //   340: goto -> 275
/*     */     //   343: nop
/*     */     //   344: aload #16
/*     */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   349: dup
/*     */     //   350: ldc 'toString(...)'
/*     */     //   352: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   355: astore #15
/*     */     //   357: new java/lang/StringBuilder
/*     */     //   360: dup
/*     */     //   361: invokespecial <init> : ()V
/*     */     //   364: ldc 'Error while pushing '
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #4
/*     */     //   371: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc '. Not all arguments were provided. Missing '
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: iload #13
/*     */     //   381: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   384: ldc ' int arguments ('
/*     */     //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   389: aload #22
/*     */     //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   394: ldc ') and '
/*     */     //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   399: iload #14
/*     */     //   401: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   404: ldc ' object arguments ('
/*     */     //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   409: aload #15
/*     */     //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   414: ldc ').'
/*     */     //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   419: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   422: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   425: nop
/*     */     //   426: nop
/*     */     //   427: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 13
/*     */     //   #618	-> 29
/*     */     //   #621	-> 30
/*     */     //   #622	-> 36
/*     */     //   #158	-> 45
/*     */     //   #623	-> 55
/*     */     //   #158	-> 59
/*     */     //   #159	-> 63
/*     */     //   #624	-> 73
/*     */     //   #159	-> 77
/*     */     //   #160	-> 81
/*     */     //   #622	-> 82
/*     */     //   #625	-> 83
/*     */     //   #626	-> 99
/*     */     //   #627	-> 122
/*     */     //   #628	-> 126
/*     */     //   #631	-> 127
/*     */     //   #632	-> 132
/*     */     //   #633	-> 135
/*     */     //   #634	-> 138
/*     */     //   #635	-> 154
/*     */     //   #636	-> 178
/*     */     //   #637	-> 190
/*     */     //   #638	-> 203
/*     */     //   #639	-> 219
/*     */     //   #641	-> 225
/*     */     //   #635	-> 226
/*     */     //   #642	-> 232
/*     */     //   #634	-> 233
/*     */     //   #634	-> 244
/*     */     //   #644	-> 246
/*     */     //   #645	-> 249
/*     */     //   #646	-> 265
/*     */     //   #647	-> 289
/*     */     //   #648	-> 301
/*     */     //   #649	-> 314
/*     */     //   #650	-> 330
/*     */     //   #652	-> 336
/*     */     //   #646	-> 337
/*     */     //   #653	-> 343
/*     */     //   #645	-> 344
/*     */     //   #645	-> 355
/*     */     //   #655	-> 357
/*     */     //   #656	-> 379
/*     */     //   #655	-> 381
/*     */     //   #656	-> 384
/*     */     //   #655	-> 386
/*     */     //   #656	-> 389
/*     */     //   #655	-> 391
/*     */     //   #656	-> 394
/*     */     //   #655	-> 396
/*     */     //   #657	-> 399
/*     */     //   #655	-> 401
/*     */     //   #657	-> 404
/*     */     //   #655	-> 406
/*     */     //   #657	-> 409
/*     */     //   #655	-> 411
/*     */     //   #657	-> 414
/*     */     //   #655	-> 416
/*     */     //   #632	-> 422
/*     */     //   #658	-> 425
/*     */     //   #659	-> 426
/*     */     //   #161	-> 427
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	4	9	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   52	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertSlots;
/*     */     //   73	4	9	$i$f$getFromSlotTable-HpuvwBQ	I
/*     */     //   70	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertSlots;
/*     */     //   45	37	7	$i$a$-push-ChangeList$pushInsertSlots$1	I
/*     */     //   42	40	6	$this$pushInsertSlots_u24lambda_u247	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   178	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   175	51	19	arg$iv	I
/*     */     //   154	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   151	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   289	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   286	51	21	arg$iv	I
/*     */     //   265	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   262	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   135	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   138	284	13	missingIntCount$iv	I
/*     */     //   246	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   249	173	14	missingObjectCount$iv	I
/*     */     //   357	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   126	300	11	$i$f$checkPrecondition	I
/*     */     //   123	303	10	value$iv$iv	Z
/*     */     //   29	398	5	$i$f$push	I
/*     */     //   26	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   26	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	428	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	428	1	anchor	Landroidx/compose/runtime/Anchor;
/*     */     //   0	428	2	from	Landroidx/compose/runtime/SlotTable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'anchor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 'from'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc_w 'fixups'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload_0
/*     */     //   21: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   24: astore #4
/*     */     //   26: getstatic androidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   29: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   32: astore #5
/*     */     //   34: iconst_0
/*     */     //   35: istore #6
/*     */     //   37: nop
/*     */     //   38: aload #4
/*     */     //   40: aload #5
/*     */     //   42: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   45: aload #4
/*     */     //   47: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   50: astore #7
/*     */     //   52: iconst_0
/*     */     //   53: istore #8
/*     */     //   55: aload #7
/*     */     //   57: getstatic androidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   60: astore #9
/*     */     //   62: iconst_0
/*     */     //   63: istore #10
/*     */     //   65: iconst_0
/*     */     //   66: invokestatic constructor-impl : (I)I
/*     */     //   69: aload_1
/*     */     //   70: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   73: aload #7
/*     */     //   75: getstatic androidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   78: astore #9
/*     */     //   80: iconst_0
/*     */     //   81: istore #10
/*     */     //   83: iconst_1
/*     */     //   84: invokestatic constructor-impl : (I)I
/*     */     //   87: aload_2
/*     */     //   88: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   91: aload #7
/*     */     //   93: getstatic androidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   96: astore #9
/*     */     //   98: iconst_0
/*     */     //   99: istore #10
/*     */     //   101: iconst_2
/*     */     //   102: invokestatic constructor-impl : (I)I
/*     */     //   105: aload_3
/*     */     //   106: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   109: nop
/*     */     //   110: nop
/*     */     //   111: aload #4
/*     */     //   113: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   116: aload #4
/*     */     //   118: aload #5
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   126: if_icmpne -> 151
/*     */     //   129: aload #4
/*     */     //   131: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   134: aload #4
/*     */     //   136: aload #5
/*     */     //   138: invokevirtual getObjects : ()I
/*     */     //   141: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   144: if_icmpne -> 151
/*     */     //   147: iconst_1
/*     */     //   148: goto -> 152
/*     */     //   151: iconst_0
/*     */     //   152: istore #11
/*     */     //   154: nop
/*     */     //   155: iconst_0
/*     */     //   156: istore #12
/*     */     //   158: nop
/*     */     //   159: iload #11
/*     */     //   161: ifne -> 459
/*     */     //   164: iconst_0
/*     */     //   165: istore #13
/*     */     //   167: iconst_0
/*     */     //   168: istore #14
/*     */     //   170: new java/lang/StringBuilder
/*     */     //   173: dup
/*     */     //   174: invokespecial <init> : ()V
/*     */     //   177: astore #15
/*     */     //   179: aload #15
/*     */     //   181: astore #16
/*     */     //   183: iconst_0
/*     */     //   184: istore #17
/*     */     //   186: aload #5
/*     */     //   188: invokevirtual getInts : ()I
/*     */     //   191: istore #18
/*     */     //   193: iconst_0
/*     */     //   194: istore #19
/*     */     //   196: iload #19
/*     */     //   198: iload #18
/*     */     //   200: if_icmpge -> 265
/*     */     //   203: iload #19
/*     */     //   205: istore #20
/*     */     //   207: iconst_0
/*     */     //   208: istore #21
/*     */     //   210: iconst_1
/*     */     //   211: iload #20
/*     */     //   213: ishl
/*     */     //   214: aload #4
/*     */     //   216: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   219: iand
/*     */     //   220: ifeq -> 258
/*     */     //   223: iload #14
/*     */     //   225: ifle -> 236
/*     */     //   228: aload #16
/*     */     //   230: ldc ', '
/*     */     //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   235: pop
/*     */     //   236: aload #16
/*     */     //   238: aload #5
/*     */     //   240: iload #20
/*     */     //   242: invokestatic constructor-impl : (I)I
/*     */     //   245: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   251: pop
/*     */     //   252: iload #14
/*     */     //   254: iconst_1
/*     */     //   255: iadd
/*     */     //   256: istore #14
/*     */     //   258: nop
/*     */     //   259: iinc #19, 1
/*     */     //   262: goto -> 196
/*     */     //   265: nop
/*     */     //   266: aload #15
/*     */     //   268: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   271: dup
/*     */     //   272: ldc 'toString(...)'
/*     */     //   274: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   277: astore #23
/*     */     //   279: iconst_0
/*     */     //   280: istore #15
/*     */     //   282: new java/lang/StringBuilder
/*     */     //   285: dup
/*     */     //   286: invokespecial <init> : ()V
/*     */     //   289: astore #17
/*     */     //   291: aload #17
/*     */     //   293: astore #18
/*     */     //   295: iconst_0
/*     */     //   296: istore #19
/*     */     //   298: aload #5
/*     */     //   300: invokevirtual getObjects : ()I
/*     */     //   303: istore #20
/*     */     //   305: iconst_0
/*     */     //   306: istore #21
/*     */     //   308: iload #21
/*     */     //   310: iload #20
/*     */     //   312: if_icmpge -> 377
/*     */     //   315: iload #21
/*     */     //   317: istore #22
/*     */     //   319: iconst_0
/*     */     //   320: istore #24
/*     */     //   322: iconst_1
/*     */     //   323: iload #22
/*     */     //   325: ishl
/*     */     //   326: aload #4
/*     */     //   328: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   331: iand
/*     */     //   332: ifeq -> 370
/*     */     //   335: iload #14
/*     */     //   337: ifle -> 348
/*     */     //   340: aload #18
/*     */     //   342: ldc ', '
/*     */     //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   347: pop
/*     */     //   348: aload #18
/*     */     //   350: aload #5
/*     */     //   352: iload #22
/*     */     //   354: invokestatic constructor-impl : (I)I
/*     */     //   357: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   363: pop
/*     */     //   364: iload #15
/*     */     //   366: iconst_1
/*     */     //   367: iadd
/*     */     //   368: istore #15
/*     */     //   370: nop
/*     */     //   371: iinc #21, 1
/*     */     //   374: goto -> 308
/*     */     //   377: nop
/*     */     //   378: aload #17
/*     */     //   380: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   383: dup
/*     */     //   384: ldc 'toString(...)'
/*     */     //   386: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   389: astore #16
/*     */     //   391: new java/lang/StringBuilder
/*     */     //   394: dup
/*     */     //   395: invokespecial <init> : ()V
/*     */     //   398: ldc 'Error while pushing '
/*     */     //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   403: aload #5
/*     */     //   405: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   408: ldc '. Not all arguments were provided. Missing '
/*     */     //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   413: iload #14
/*     */     //   415: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   418: ldc ' int arguments ('
/*     */     //   420: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   423: aload #23
/*     */     //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   428: ldc ') and '
/*     */     //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   433: iload #15
/*     */     //   435: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   438: ldc ' object arguments ('
/*     */     //   440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   443: aload #16
/*     */     //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   448: ldc ').'
/*     */     //   450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   453: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   456: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   459: nop
/*     */     //   460: nop
/*     */     //   461: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #168	-> 20
/*     */     //   #660	-> 37
/*     */     //   #663	-> 38
/*     */     //   #664	-> 45
/*     */     //   #169	-> 55
/*     */     //   #665	-> 65
/*     */     //   #169	-> 69
/*     */     //   #170	-> 73
/*     */     //   #666	-> 83
/*     */     //   #170	-> 87
/*     */     //   #171	-> 91
/*     */     //   #667	-> 101
/*     */     //   #171	-> 105
/*     */     //   #172	-> 109
/*     */     //   #664	-> 110
/*     */     //   #668	-> 111
/*     */     //   #669	-> 129
/*     */     //   #670	-> 154
/*     */     //   #671	-> 158
/*     */     //   #674	-> 159
/*     */     //   #675	-> 164
/*     */     //   #676	-> 167
/*     */     //   #677	-> 170
/*     */     //   #678	-> 186
/*     */     //   #679	-> 210
/*     */     //   #680	-> 223
/*     */     //   #681	-> 236
/*     */     //   #682	-> 252
/*     */     //   #684	-> 258
/*     */     //   #678	-> 259
/*     */     //   #685	-> 265
/*     */     //   #677	-> 266
/*     */     //   #677	-> 277
/*     */     //   #687	-> 279
/*     */     //   #688	-> 282
/*     */     //   #689	-> 298
/*     */     //   #690	-> 322
/*     */     //   #691	-> 335
/*     */     //   #692	-> 348
/*     */     //   #693	-> 364
/*     */     //   #695	-> 370
/*     */     //   #689	-> 371
/*     */     //   #696	-> 377
/*     */     //   #688	-> 378
/*     */     //   #688	-> 389
/*     */     //   #698	-> 391
/*     */     //   #699	-> 413
/*     */     //   #698	-> 415
/*     */     //   #699	-> 418
/*     */     //   #698	-> 420
/*     */     //   #699	-> 423
/*     */     //   #698	-> 425
/*     */     //   #699	-> 428
/*     */     //   #698	-> 430
/*     */     //   #700	-> 433
/*     */     //   #698	-> 435
/*     */     //   #700	-> 438
/*     */     //   #698	-> 440
/*     */     //   #700	-> 443
/*     */     //   #698	-> 445
/*     */     //   #700	-> 448
/*     */     //   #698	-> 450
/*     */     //   #675	-> 456
/*     */     //   #701	-> 459
/*     */     //   #702	-> 460
/*     */     //   #173	-> 461
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   65	4	10	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   62	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   83	4	10	$i$f$getFromSlotTable-HpuvwBQ	I
/*     */     //   80	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   101	4	10	$i$f$getFixups-HpuvwBQ	I
/*     */     //   98	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;
/*     */     //   55	55	8	$i$a$-push-ChangeList$pushInsertSlots$2	I
/*     */     //   52	58	7	$this$pushInsertSlots_u24lambda_u248	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   210	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   207	52	20	arg$iv	I
/*     */     //   186	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   183	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   322	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   319	52	22	arg$iv	I
/*     */     //   298	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   295	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   167	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   170	286	14	missingIntCount$iv	I
/*     */     //   279	177	23	missingInts$iv	Ljava/lang/String;
/*     */     //   282	174	15	missingObjectCount$iv	I
/*     */     //   391	65	16	missingObjects$iv	Ljava/lang/String;
/*     */     //   158	302	12	$i$f$checkPrecondition	I
/*     */     //   155	305	11	value$iv$iv	Z
/*     */     //   37	424	6	$i$f$push	I
/*     */     //   34	427	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   34	427	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	462	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	462	1	anchor	Landroidx/compose/runtime/Anchor;
/*     */     //   0	462	2	from	Landroidx/compose/runtime/SlotTable;
/*     */     //   0	462	3	fixups	Landroidx/compose/runtime/changelist/FixupList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushMoveCurrentGroup(int offset) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_2
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$MoveCurrentGroup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: nop
/*     */     //   16: aload_2
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   21: aload_2
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #5
/*     */     //   27: iconst_0
/*     */     //   28: istore #6
/*     */     //   30: aload #5
/*     */     //   32: getstatic androidx/compose/runtime/changelist/Operation$MoveCurrentGroup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;
/*     */     //   35: astore #7
/*     */     //   37: iconst_0
/*     */     //   38: istore #8
/*     */     //   40: iconst_0
/*     */     //   41: invokestatic constructor-impl : (I)I
/*     */     //   44: iload_1
/*     */     //   45: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   48: nop
/*     */     //   49: nop
/*     */     //   50: aload_2
/*     */     //   51: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   54: aload_2
/*     */     //   55: aload_3
/*     */     //   56: invokevirtual getInts : ()I
/*     */     //   59: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   62: if_icmpne -> 84
/*     */     //   65: aload_2
/*     */     //   66: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   69: aload_2
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getObjects : ()I
/*     */     //   74: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   77: if_icmpne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: istore #9
/*     */     //   87: nop
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: nop
/*     */     //   92: iload #9
/*     */     //   94: ifne -> 385
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: istore #12
/*     */     //   103: new java/lang/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #13
/*     */     //   112: aload #13
/*     */     //   114: astore #14
/*     */     //   116: iconst_0
/*     */     //   117: istore #15
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: istore #16
/*     */     //   125: iconst_0
/*     */     //   126: istore #17
/*     */     //   128: iload #17
/*     */     //   130: iload #16
/*     */     //   132: if_icmpge -> 195
/*     */     //   135: iload #17
/*     */     //   137: istore #18
/*     */     //   139: iconst_0
/*     */     //   140: istore #19
/*     */     //   142: iconst_1
/*     */     //   143: iload #18
/*     */     //   145: ishl
/*     */     //   146: aload_2
/*     */     //   147: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   150: iand
/*     */     //   151: ifeq -> 188
/*     */     //   154: iload #12
/*     */     //   156: ifle -> 167
/*     */     //   159: aload #14
/*     */     //   161: ldc ', '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: pop
/*     */     //   167: aload #14
/*     */     //   169: aload_3
/*     */     //   170: iload #18
/*     */     //   172: invokestatic constructor-impl : (I)I
/*     */     //   175: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: pop
/*     */     //   182: iload #12
/*     */     //   184: iconst_1
/*     */     //   185: iadd
/*     */     //   186: istore #12
/*     */     //   188: nop
/*     */     //   189: iinc #17, 1
/*     */     //   192: goto -> 128
/*     */     //   195: nop
/*     */     //   196: aload #13
/*     */     //   198: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ldc 'toString(...)'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: astore #21
/*     */     //   209: iconst_0
/*     */     //   210: istore #13
/*     */     //   212: new java/lang/StringBuilder
/*     */     //   215: dup
/*     */     //   216: invokespecial <init> : ()V
/*     */     //   219: astore #15
/*     */     //   221: aload #15
/*     */     //   223: astore #16
/*     */     //   225: iconst_0
/*     */     //   226: istore #17
/*     */     //   228: aload_3
/*     */     //   229: invokevirtual getObjects : ()I
/*     */     //   232: istore #18
/*     */     //   234: iconst_0
/*     */     //   235: istore #19
/*     */     //   237: iload #19
/*     */     //   239: iload #18
/*     */     //   241: if_icmpge -> 304
/*     */     //   244: iload #19
/*     */     //   246: istore #20
/*     */     //   248: iconst_0
/*     */     //   249: istore #22
/*     */     //   251: iconst_1
/*     */     //   252: iload #20
/*     */     //   254: ishl
/*     */     //   255: aload_2
/*     */     //   256: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   259: iand
/*     */     //   260: ifeq -> 297
/*     */     //   263: iload #12
/*     */     //   265: ifle -> 276
/*     */     //   268: aload #16
/*     */     //   270: ldc ', '
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #16
/*     */     //   278: aload_3
/*     */     //   279: iload #20
/*     */     //   281: invokestatic constructor-impl : (I)I
/*     */     //   284: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   290: pop
/*     */     //   291: iload #13
/*     */     //   293: iconst_1
/*     */     //   294: iadd
/*     */     //   295: istore #13
/*     */     //   297: nop
/*     */     //   298: iinc #19, 1
/*     */     //   301: goto -> 237
/*     */     //   304: nop
/*     */     //   305: aload #15
/*     */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   310: dup
/*     */     //   311: ldc 'toString(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: astore #14
/*     */     //   318: new java/lang/StringBuilder
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: ldc 'Error while pushing '
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: aload_3
/*     */     //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   334: ldc '. Not all arguments were provided. Missing '
/*     */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   339: iload #12
/*     */     //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   344: ldc ' int arguments ('
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: aload #21
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   354: ldc ') and '
/*     */     //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   359: iload #13
/*     */     //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   364: ldc ' object arguments ('
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #14
/*     */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc ').'
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   382: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #178	-> 0
/*     */     //   #703	-> 15
/*     */     //   #706	-> 16
/*     */     //   #707	-> 21
/*     */     //   #179	-> 30
/*     */     //   #708	-> 40
/*     */     //   #179	-> 44
/*     */     //   #180	-> 48
/*     */     //   #707	-> 49
/*     */     //   #709	-> 50
/*     */     //   #710	-> 65
/*     */     //   #711	-> 87
/*     */     //   #712	-> 91
/*     */     //   #715	-> 92
/*     */     //   #716	-> 97
/*     */     //   #717	-> 100
/*     */     //   #718	-> 103
/*     */     //   #719	-> 119
/*     */     //   #720	-> 142
/*     */     //   #721	-> 154
/*     */     //   #722	-> 167
/*     */     //   #723	-> 182
/*     */     //   #725	-> 188
/*     */     //   #719	-> 189
/*     */     //   #726	-> 195
/*     */     //   #718	-> 196
/*     */     //   #718	-> 207
/*     */     //   #728	-> 209
/*     */     //   #729	-> 212
/*     */     //   #730	-> 228
/*     */     //   #731	-> 251
/*     */     //   #732	-> 263
/*     */     //   #733	-> 276
/*     */     //   #734	-> 291
/*     */     //   #736	-> 297
/*     */     //   #730	-> 298
/*     */     //   #737	-> 304
/*     */     //   #729	-> 305
/*     */     //   #729	-> 316
/*     */     //   #739	-> 318
/*     */     //   #740	-> 339
/*     */     //   #739	-> 341
/*     */     //   #740	-> 344
/*     */     //   #739	-> 346
/*     */     //   #740	-> 349
/*     */     //   #739	-> 351
/*     */     //   #740	-> 354
/*     */     //   #739	-> 356
/*     */     //   #741	-> 359
/*     */     //   #739	-> 361
/*     */     //   #741	-> 364
/*     */     //   #739	-> 366
/*     */     //   #741	-> 369
/*     */     //   #739	-> 371
/*     */     //   #741	-> 374
/*     */     //   #739	-> 376
/*     */     //   #716	-> 382
/*     */     //   #742	-> 385
/*     */     //   #743	-> 386
/*     */     //   #181	-> 387
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	4	8	$i$f$getOffset-jn0FJLE	I
/*     */     //   37	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;
/*     */     //   30	19	6	$i$a$-push-ChangeList$pushMoveCurrentGroup$1	I
/*     */     //   27	22	5	$this$pushMoveCurrentGroup_u24lambda_u249	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   142	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   139	50	18	arg$iv	I
/*     */     //   119	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   116	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   251	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   248	50	20	arg$iv	I
/*     */     //   228	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   225	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   100	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   103	279	12	missingIntCount$iv	I
/*     */     //   209	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   212	170	13	missingObjectCount$iv	I
/*     */     //   318	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   91	295	10	$i$f$checkPrecondition	I
/*     */     //   88	298	9	value$iv$iv	Z
/*     */     //   15	372	4	$i$f$push	I
/*     */     //   12	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   12	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	388	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	388	1	offset	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushEndCompositionScope(@NotNull Function1 action, @NotNull Composition composition) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'action'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'composition'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_0
/*     */     //   15: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   18: astore_3
/*     */     //   19: getstatic androidx/compose/runtime/changelist/Operation$EndCompositionScope.INSTANCE : Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;
/*     */     //   22: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   25: astore #4
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: nop
/*     */     //   31: aload_3
/*     */     //   32: aload #4
/*     */     //   34: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   37: aload_3
/*     */     //   38: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   41: astore #6
/*     */     //   43: iconst_0
/*     */     //   44: istore #7
/*     */     //   46: aload #6
/*     */     //   48: getstatic androidx/compose/runtime/changelist/Operation$EndCompositionScope.INSTANCE : Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;
/*     */     //   51: astore #8
/*     */     //   53: iconst_0
/*     */     //   54: istore #9
/*     */     //   56: iconst_0
/*     */     //   57: invokestatic constructor-impl : (I)I
/*     */     //   60: aload_1
/*     */     //   61: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   64: aload #6
/*     */     //   66: getstatic androidx/compose/runtime/changelist/Operation$EndCompositionScope.INSTANCE : Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;
/*     */     //   69: astore #8
/*     */     //   71: iconst_0
/*     */     //   72: istore #9
/*     */     //   74: iconst_1
/*     */     //   75: invokestatic constructor-impl : (I)I
/*     */     //   78: aload_2
/*     */     //   79: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   82: nop
/*     */     //   83: nop
/*     */     //   84: aload_3
/*     */     //   85: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   88: aload_3
/*     */     //   89: aload #4
/*     */     //   91: invokevirtual getInts : ()I
/*     */     //   94: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   97: if_icmpne -> 120
/*     */     //   100: aload_3
/*     */     //   101: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   104: aload_3
/*     */     //   105: aload #4
/*     */     //   107: invokevirtual getObjects : ()I
/*     */     //   110: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   113: if_icmpne -> 120
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 121
/*     */     //   120: iconst_0
/*     */     //   121: istore #10
/*     */     //   123: nop
/*     */     //   124: iconst_0
/*     */     //   125: istore #11
/*     */     //   127: nop
/*     */     //   128: iload #10
/*     */     //   130: ifne -> 426
/*     */     //   133: iconst_0
/*     */     //   134: istore #12
/*     */     //   136: iconst_0
/*     */     //   137: istore #13
/*     */     //   139: new java/lang/StringBuilder
/*     */     //   142: dup
/*     */     //   143: invokespecial <init> : ()V
/*     */     //   146: astore #14
/*     */     //   148: aload #14
/*     */     //   150: astore #15
/*     */     //   152: iconst_0
/*     */     //   153: istore #16
/*     */     //   155: aload #4
/*     */     //   157: invokevirtual getInts : ()I
/*     */     //   160: istore #17
/*     */     //   162: iconst_0
/*     */     //   163: istore #18
/*     */     //   165: iload #18
/*     */     //   167: iload #17
/*     */     //   169: if_icmpge -> 233
/*     */     //   172: iload #18
/*     */     //   174: istore #19
/*     */     //   176: iconst_0
/*     */     //   177: istore #20
/*     */     //   179: iconst_1
/*     */     //   180: iload #19
/*     */     //   182: ishl
/*     */     //   183: aload_3
/*     */     //   184: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   187: iand
/*     */     //   188: ifeq -> 226
/*     */     //   191: iload #13
/*     */     //   193: ifle -> 204
/*     */     //   196: aload #15
/*     */     //   198: ldc ', '
/*     */     //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   203: pop
/*     */     //   204: aload #15
/*     */     //   206: aload #4
/*     */     //   208: iload #19
/*     */     //   210: invokestatic constructor-impl : (I)I
/*     */     //   213: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   219: pop
/*     */     //   220: iload #13
/*     */     //   222: iconst_1
/*     */     //   223: iadd
/*     */     //   224: istore #13
/*     */     //   226: nop
/*     */     //   227: iinc #18, 1
/*     */     //   230: goto -> 165
/*     */     //   233: nop
/*     */     //   234: aload #14
/*     */     //   236: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   239: dup
/*     */     //   240: ldc 'toString(...)'
/*     */     //   242: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   245: astore #22
/*     */     //   247: iconst_0
/*     */     //   248: istore #14
/*     */     //   250: new java/lang/StringBuilder
/*     */     //   253: dup
/*     */     //   254: invokespecial <init> : ()V
/*     */     //   257: astore #16
/*     */     //   259: aload #16
/*     */     //   261: astore #17
/*     */     //   263: iconst_0
/*     */     //   264: istore #18
/*     */     //   266: aload #4
/*     */     //   268: invokevirtual getObjects : ()I
/*     */     //   271: istore #19
/*     */     //   273: iconst_0
/*     */     //   274: istore #20
/*     */     //   276: iload #20
/*     */     //   278: iload #19
/*     */     //   280: if_icmpge -> 344
/*     */     //   283: iload #20
/*     */     //   285: istore #21
/*     */     //   287: iconst_0
/*     */     //   288: istore #23
/*     */     //   290: iconst_1
/*     */     //   291: iload #21
/*     */     //   293: ishl
/*     */     //   294: aload_3
/*     */     //   295: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   298: iand
/*     */     //   299: ifeq -> 337
/*     */     //   302: iload #13
/*     */     //   304: ifle -> 315
/*     */     //   307: aload #17
/*     */     //   309: ldc ', '
/*     */     //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   314: pop
/*     */     //   315: aload #17
/*     */     //   317: aload #4
/*     */     //   319: iload #21
/*     */     //   321: invokestatic constructor-impl : (I)I
/*     */     //   324: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: pop
/*     */     //   331: iload #14
/*     */     //   333: iconst_1
/*     */     //   334: iadd
/*     */     //   335: istore #14
/*     */     //   337: nop
/*     */     //   338: iinc #20, 1
/*     */     //   341: goto -> 276
/*     */     //   344: nop
/*     */     //   345: aload #16
/*     */     //   347: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   350: dup
/*     */     //   351: ldc 'toString(...)'
/*     */     //   353: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   356: astore #15
/*     */     //   358: new java/lang/StringBuilder
/*     */     //   361: dup
/*     */     //   362: invokespecial <init> : ()V
/*     */     //   365: ldc 'Error while pushing '
/*     */     //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   370: aload #4
/*     */     //   372: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   375: ldc '. Not all arguments were provided. Missing '
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: iload #13
/*     */     //   382: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   385: ldc ' int arguments ('
/*     */     //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   390: aload #22
/*     */     //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   395: ldc ') and '
/*     */     //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   400: iload #14
/*     */     //   402: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   405: ldc ' object arguments ('
/*     */     //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   410: aload #15
/*     */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   415: ldc ').'
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   420: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   423: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   426: nop
/*     */     //   427: nop
/*     */     //   428: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #187	-> 14
/*     */     //   #744	-> 30
/*     */     //   #747	-> 31
/*     */     //   #748	-> 37
/*     */     //   #188	-> 46
/*     */     //   #749	-> 56
/*     */     //   #188	-> 60
/*     */     //   #189	-> 64
/*     */     //   #750	-> 74
/*     */     //   #189	-> 78
/*     */     //   #190	-> 82
/*     */     //   #748	-> 83
/*     */     //   #751	-> 84
/*     */     //   #752	-> 100
/*     */     //   #753	-> 123
/*     */     //   #754	-> 127
/*     */     //   #757	-> 128
/*     */     //   #758	-> 133
/*     */     //   #759	-> 136
/*     */     //   #760	-> 139
/*     */     //   #761	-> 155
/*     */     //   #762	-> 179
/*     */     //   #763	-> 191
/*     */     //   #764	-> 204
/*     */     //   #765	-> 220
/*     */     //   #767	-> 226
/*     */     //   #761	-> 227
/*     */     //   #768	-> 233
/*     */     //   #760	-> 234
/*     */     //   #760	-> 245
/*     */     //   #770	-> 247
/*     */     //   #771	-> 250
/*     */     //   #772	-> 266
/*     */     //   #773	-> 290
/*     */     //   #774	-> 302
/*     */     //   #775	-> 315
/*     */     //   #776	-> 331
/*     */     //   #778	-> 337
/*     */     //   #772	-> 338
/*     */     //   #779	-> 344
/*     */     //   #771	-> 345
/*     */     //   #771	-> 356
/*     */     //   #781	-> 358
/*     */     //   #782	-> 380
/*     */     //   #781	-> 382
/*     */     //   #782	-> 385
/*     */     //   #781	-> 387
/*     */     //   #782	-> 390
/*     */     //   #781	-> 392
/*     */     //   #782	-> 395
/*     */     //   #781	-> 397
/*     */     //   #783	-> 400
/*     */     //   #781	-> 402
/*     */     //   #783	-> 405
/*     */     //   #781	-> 407
/*     */     //   #783	-> 410
/*     */     //   #781	-> 412
/*     */     //   #783	-> 415
/*     */     //   #781	-> 417
/*     */     //   #758	-> 423
/*     */     //   #784	-> 426
/*     */     //   #785	-> 427
/*     */     //   #191	-> 428
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	4	9	$i$f$getAction-HpuvwBQ	I
/*     */     //   53	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;
/*     */     //   74	4	9	$i$f$getComposition-HpuvwBQ	I
/*     */     //   71	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;
/*     */     //   46	37	7	$i$a$-push-ChangeList$pushEndCompositionScope$1	I
/*     */     //   43	40	6	$this$pushEndCompositionScope_u24lambda_u2410	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   179	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   176	51	19	arg$iv	I
/*     */     //   155	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   152	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   290	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   287	51	21	arg$iv	I
/*     */     //   266	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   263	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   136	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   139	284	13	missingIntCount$iv	I
/*     */     //   247	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   250	173	14	missingObjectCount$iv	I
/*     */     //   358	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   127	300	11	$i$f$checkPrecondition	I
/*     */     //   124	303	10	value$iv$iv	Z
/*     */     //   30	398	5	$i$f$push	I
/*     */     //   27	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   27	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	429	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	429	1	action	Lkotlin/jvm/functions/Function1;
/*     */     //   0	429	2	composition	Landroidx/compose/runtime/Composition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushUseNode(@Nullable Object node) {
/* 194 */     if (node instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
/* 195 */       this.operations.push(Operation.UseCurrentNode.INSTANCE);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T, V> void pushUpdateNode(Object value, @NotNull Function2 block) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'block'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   11: astore_3
/*     */     //   12: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*     */     //   15: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   18: astore #4
/*     */     //   20: iconst_0
/*     */     //   21: istore #5
/*     */     //   23: nop
/*     */     //   24: aload_3
/*     */     //   25: aload #4
/*     */     //   27: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   30: aload_3
/*     */     //   31: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   34: astore #6
/*     */     //   36: iconst_0
/*     */     //   37: istore #7
/*     */     //   39: aload #6
/*     */     //   41: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*     */     //   44: astore #8
/*     */     //   46: iconst_0
/*     */     //   47: istore #9
/*     */     //   49: iconst_0
/*     */     //   50: invokestatic constructor-impl : (I)I
/*     */     //   53: aload_1
/*     */     //   54: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   57: aload #6
/*     */     //   59: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*     */     //   62: astore #8
/*     */     //   64: iconst_0
/*     */     //   65: istore #9
/*     */     //   67: iconst_1
/*     */     //   68: invokestatic constructor-impl : (I)I
/*     */     //   71: aload_2
/*     */     //   72: iconst_2
/*     */     //   73: invokestatic beforeCheckcastToFunctionOfArity : (Ljava/lang/Object;I)Ljava/lang/Object;
/*     */     //   76: checkcast kotlin/jvm/functions/Function2
/*     */     //   79: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   82: nop
/*     */     //   83: nop
/*     */     //   84: aload_3
/*     */     //   85: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   88: aload_3
/*     */     //   89: aload #4
/*     */     //   91: invokevirtual getInts : ()I
/*     */     //   94: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   97: if_icmpne -> 120
/*     */     //   100: aload_3
/*     */     //   101: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   104: aload_3
/*     */     //   105: aload #4
/*     */     //   107: invokevirtual getObjects : ()I
/*     */     //   110: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   113: if_icmpne -> 120
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 121
/*     */     //   120: iconst_0
/*     */     //   121: istore #10
/*     */     //   123: nop
/*     */     //   124: iconst_0
/*     */     //   125: istore #11
/*     */     //   127: nop
/*     */     //   128: iload #10
/*     */     //   130: ifne -> 426
/*     */     //   133: iconst_0
/*     */     //   134: istore #12
/*     */     //   136: iconst_0
/*     */     //   137: istore #13
/*     */     //   139: new java/lang/StringBuilder
/*     */     //   142: dup
/*     */     //   143: invokespecial <init> : ()V
/*     */     //   146: astore #14
/*     */     //   148: aload #14
/*     */     //   150: astore #15
/*     */     //   152: iconst_0
/*     */     //   153: istore #16
/*     */     //   155: aload #4
/*     */     //   157: invokevirtual getInts : ()I
/*     */     //   160: istore #17
/*     */     //   162: iconst_0
/*     */     //   163: istore #18
/*     */     //   165: iload #18
/*     */     //   167: iload #17
/*     */     //   169: if_icmpge -> 233
/*     */     //   172: iload #18
/*     */     //   174: istore #19
/*     */     //   176: iconst_0
/*     */     //   177: istore #20
/*     */     //   179: iconst_1
/*     */     //   180: iload #19
/*     */     //   182: ishl
/*     */     //   183: aload_3
/*     */     //   184: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   187: iand
/*     */     //   188: ifeq -> 226
/*     */     //   191: iload #13
/*     */     //   193: ifle -> 204
/*     */     //   196: aload #15
/*     */     //   198: ldc ', '
/*     */     //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   203: pop
/*     */     //   204: aload #15
/*     */     //   206: aload #4
/*     */     //   208: iload #19
/*     */     //   210: invokestatic constructor-impl : (I)I
/*     */     //   213: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   219: pop
/*     */     //   220: iload #13
/*     */     //   222: iconst_1
/*     */     //   223: iadd
/*     */     //   224: istore #13
/*     */     //   226: nop
/*     */     //   227: iinc #18, 1
/*     */     //   230: goto -> 165
/*     */     //   233: nop
/*     */     //   234: aload #14
/*     */     //   236: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   239: dup
/*     */     //   240: ldc 'toString(...)'
/*     */     //   242: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   245: astore #22
/*     */     //   247: iconst_0
/*     */     //   248: istore #14
/*     */     //   250: new java/lang/StringBuilder
/*     */     //   253: dup
/*     */     //   254: invokespecial <init> : ()V
/*     */     //   257: astore #16
/*     */     //   259: aload #16
/*     */     //   261: astore #17
/*     */     //   263: iconst_0
/*     */     //   264: istore #18
/*     */     //   266: aload #4
/*     */     //   268: invokevirtual getObjects : ()I
/*     */     //   271: istore #19
/*     */     //   273: iconst_0
/*     */     //   274: istore #20
/*     */     //   276: iload #20
/*     */     //   278: iload #19
/*     */     //   280: if_icmpge -> 344
/*     */     //   283: iload #20
/*     */     //   285: istore #21
/*     */     //   287: iconst_0
/*     */     //   288: istore #23
/*     */     //   290: iconst_1
/*     */     //   291: iload #21
/*     */     //   293: ishl
/*     */     //   294: aload_3
/*     */     //   295: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   298: iand
/*     */     //   299: ifeq -> 337
/*     */     //   302: iload #13
/*     */     //   304: ifle -> 315
/*     */     //   307: aload #17
/*     */     //   309: ldc ', '
/*     */     //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   314: pop
/*     */     //   315: aload #17
/*     */     //   317: aload #4
/*     */     //   319: iload #21
/*     */     //   321: invokestatic constructor-impl : (I)I
/*     */     //   324: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: pop
/*     */     //   331: iload #14
/*     */     //   333: iconst_1
/*     */     //   334: iadd
/*     */     //   335: istore #14
/*     */     //   337: nop
/*     */     //   338: iinc #20, 1
/*     */     //   341: goto -> 276
/*     */     //   344: nop
/*     */     //   345: aload #16
/*     */     //   347: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   350: dup
/*     */     //   351: ldc 'toString(...)'
/*     */     //   353: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   356: astore #15
/*     */     //   358: new java/lang/StringBuilder
/*     */     //   361: dup
/*     */     //   362: invokespecial <init> : ()V
/*     */     //   365: ldc 'Error while pushing '
/*     */     //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   370: aload #4
/*     */     //   372: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   375: ldc '. Not all arguments were provided. Missing '
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: iload #13
/*     */     //   382: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   385: ldc ' int arguments ('
/*     */     //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   390: aload #22
/*     */     //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   395: ldc ') and '
/*     */     //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   400: iload #14
/*     */     //   402: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   405: ldc ' object arguments ('
/*     */     //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   410: aload #15
/*     */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   415: ldc ').'
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   420: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   423: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   426: nop
/*     */     //   427: nop
/*     */     //   428: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #200	-> 7
/*     */     //   #786	-> 23
/*     */     //   #789	-> 24
/*     */     //   #790	-> 30
/*     */     //   #201	-> 39
/*     */     //   #791	-> 49
/*     */     //   #201	-> 53
/*     */     //   #203	-> 57
/*     */     //   #792	-> 67
/*     */     //   #203	-> 71
/*     */     //   #204	-> 82
/*     */     //   #790	-> 83
/*     */     //   #793	-> 84
/*     */     //   #794	-> 100
/*     */     //   #795	-> 123
/*     */     //   #796	-> 127
/*     */     //   #799	-> 128
/*     */     //   #800	-> 133
/*     */     //   #801	-> 136
/*     */     //   #802	-> 139
/*     */     //   #803	-> 155
/*     */     //   #804	-> 179
/*     */     //   #805	-> 191
/*     */     //   #806	-> 204
/*     */     //   #807	-> 220
/*     */     //   #809	-> 226
/*     */     //   #803	-> 227
/*     */     //   #810	-> 233
/*     */     //   #802	-> 234
/*     */     //   #802	-> 245
/*     */     //   #812	-> 247
/*     */     //   #813	-> 250
/*     */     //   #814	-> 266
/*     */     //   #815	-> 290
/*     */     //   #816	-> 302
/*     */     //   #817	-> 315
/*     */     //   #818	-> 331
/*     */     //   #820	-> 337
/*     */     //   #814	-> 338
/*     */     //   #821	-> 344
/*     */     //   #813	-> 345
/*     */     //   #813	-> 356
/*     */     //   #823	-> 358
/*     */     //   #824	-> 380
/*     */     //   #823	-> 382
/*     */     //   #824	-> 385
/*     */     //   #823	-> 387
/*     */     //   #824	-> 390
/*     */     //   #823	-> 392
/*     */     //   #824	-> 395
/*     */     //   #823	-> 397
/*     */     //   #825	-> 400
/*     */     //   #823	-> 402
/*     */     //   #825	-> 405
/*     */     //   #823	-> 407
/*     */     //   #825	-> 410
/*     */     //   #823	-> 412
/*     */     //   #825	-> 415
/*     */     //   #823	-> 417
/*     */     //   #800	-> 423
/*     */     //   #826	-> 426
/*     */     //   #827	-> 427
/*     */     //   #205	-> 428
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	4	9	$i$f$getValue-HpuvwBQ	I
/*     */     //   46	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*     */     //   67	4	9	$i$f$getBlock-HpuvwBQ	I
/*     */     //   64	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*     */     //   39	44	7	$i$a$-push-ChangeList$pushUpdateNode$1	I
/*     */     //   36	47	6	$this$pushUpdateNode_u24lambda_u2411	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   179	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   176	51	19	arg$iv	I
/*     */     //   155	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   152	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   290	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   287	51	21	arg$iv	I
/*     */     //   266	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   263	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   136	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   139	284	13	missingIntCount$iv	I
/*     */     //   247	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   250	173	14	missingObjectCount$iv	I
/*     */     //   358	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   127	300	11	$i$f$checkPrecondition	I
/*     */     //   124	303	10	value$iv$iv	Z
/*     */     //   23	405	5	$i$f$push	I
/*     */     //   20	408	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   20	408	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	429	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	429	1	value	Ljava/lang/Object;
/*     */     //   0	429	2	block	Lkotlin/jvm/functions/Function2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushRemoveNode(int removeFrom, int moveCount) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_3
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$RemoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$RemoveNode;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore #4
/*     */     //   13: iconst_0
/*     */     //   14: istore #5
/*     */     //   16: nop
/*     */     //   17: aload_3
/*     */     //   18: aload #4
/*     */     //   20: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   23: aload_3
/*     */     //   24: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   27: astore #6
/*     */     //   29: iconst_0
/*     */     //   30: istore #7
/*     */     //   32: aload #6
/*     */     //   34: getstatic androidx/compose/runtime/changelist/Operation$RemoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$RemoveNode;
/*     */     //   37: astore #8
/*     */     //   39: iconst_0
/*     */     //   40: istore #9
/*     */     //   42: iconst_0
/*     */     //   43: invokestatic constructor-impl : (I)I
/*     */     //   46: iload_1
/*     */     //   47: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   50: aload #6
/*     */     //   52: getstatic androidx/compose/runtime/changelist/Operation$RemoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$RemoveNode;
/*     */     //   55: astore #8
/*     */     //   57: iconst_0
/*     */     //   58: istore #9
/*     */     //   60: iconst_1
/*     */     //   61: invokestatic constructor-impl : (I)I
/*     */     //   64: iload_2
/*     */     //   65: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   68: nop
/*     */     //   69: nop
/*     */     //   70: aload_3
/*     */     //   71: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   74: aload_3
/*     */     //   75: aload #4
/*     */     //   77: invokevirtual getInts : ()I
/*     */     //   80: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   83: if_icmpne -> 106
/*     */     //   86: aload_3
/*     */     //   87: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   90: aload_3
/*     */     //   91: aload #4
/*     */     //   93: invokevirtual getObjects : ()I
/*     */     //   96: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   99: if_icmpne -> 106
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 107
/*     */     //   106: iconst_0
/*     */     //   107: istore #10
/*     */     //   109: nop
/*     */     //   110: iconst_0
/*     */     //   111: istore #11
/*     */     //   113: nop
/*     */     //   114: iload #10
/*     */     //   116: ifne -> 412
/*     */     //   119: iconst_0
/*     */     //   120: istore #12
/*     */     //   122: iconst_0
/*     */     //   123: istore #13
/*     */     //   125: new java/lang/StringBuilder
/*     */     //   128: dup
/*     */     //   129: invokespecial <init> : ()V
/*     */     //   132: astore #14
/*     */     //   134: aload #14
/*     */     //   136: astore #15
/*     */     //   138: iconst_0
/*     */     //   139: istore #16
/*     */     //   141: aload #4
/*     */     //   143: invokevirtual getInts : ()I
/*     */     //   146: istore #17
/*     */     //   148: iconst_0
/*     */     //   149: istore #18
/*     */     //   151: iload #18
/*     */     //   153: iload #17
/*     */     //   155: if_icmpge -> 219
/*     */     //   158: iload #18
/*     */     //   160: istore #19
/*     */     //   162: iconst_0
/*     */     //   163: istore #20
/*     */     //   165: iconst_1
/*     */     //   166: iload #19
/*     */     //   168: ishl
/*     */     //   169: aload_3
/*     */     //   170: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   173: iand
/*     */     //   174: ifeq -> 212
/*     */     //   177: iload #13
/*     */     //   179: ifle -> 190
/*     */     //   182: aload #15
/*     */     //   184: ldc ', '
/*     */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   189: pop
/*     */     //   190: aload #15
/*     */     //   192: aload #4
/*     */     //   194: iload #19
/*     */     //   196: invokestatic constructor-impl : (I)I
/*     */     //   199: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   205: pop
/*     */     //   206: iload #13
/*     */     //   208: iconst_1
/*     */     //   209: iadd
/*     */     //   210: istore #13
/*     */     //   212: nop
/*     */     //   213: iinc #18, 1
/*     */     //   216: goto -> 151
/*     */     //   219: nop
/*     */     //   220: aload #14
/*     */     //   222: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   225: dup
/*     */     //   226: ldc 'toString(...)'
/*     */     //   228: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   231: astore #22
/*     */     //   233: iconst_0
/*     */     //   234: istore #14
/*     */     //   236: new java/lang/StringBuilder
/*     */     //   239: dup
/*     */     //   240: invokespecial <init> : ()V
/*     */     //   243: astore #16
/*     */     //   245: aload #16
/*     */     //   247: astore #17
/*     */     //   249: iconst_0
/*     */     //   250: istore #18
/*     */     //   252: aload #4
/*     */     //   254: invokevirtual getObjects : ()I
/*     */     //   257: istore #19
/*     */     //   259: iconst_0
/*     */     //   260: istore #20
/*     */     //   262: iload #20
/*     */     //   264: iload #19
/*     */     //   266: if_icmpge -> 330
/*     */     //   269: iload #20
/*     */     //   271: istore #21
/*     */     //   273: iconst_0
/*     */     //   274: istore #23
/*     */     //   276: iconst_1
/*     */     //   277: iload #21
/*     */     //   279: ishl
/*     */     //   280: aload_3
/*     */     //   281: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   284: iand
/*     */     //   285: ifeq -> 323
/*     */     //   288: iload #13
/*     */     //   290: ifle -> 301
/*     */     //   293: aload #17
/*     */     //   295: ldc ', '
/*     */     //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   300: pop
/*     */     //   301: aload #17
/*     */     //   303: aload #4
/*     */     //   305: iload #21
/*     */     //   307: invokestatic constructor-impl : (I)I
/*     */     //   310: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   316: pop
/*     */     //   317: iload #14
/*     */     //   319: iconst_1
/*     */     //   320: iadd
/*     */     //   321: istore #14
/*     */     //   323: nop
/*     */     //   324: iinc #20, 1
/*     */     //   327: goto -> 262
/*     */     //   330: nop
/*     */     //   331: aload #16
/*     */     //   333: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   336: dup
/*     */     //   337: ldc 'toString(...)'
/*     */     //   339: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   342: astore #15
/*     */     //   344: new java/lang/StringBuilder
/*     */     //   347: dup
/*     */     //   348: invokespecial <init> : ()V
/*     */     //   351: ldc 'Error while pushing '
/*     */     //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   356: aload #4
/*     */     //   358: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   361: ldc '. Not all arguments were provided. Missing '
/*     */     //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   366: iload #13
/*     */     //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   371: ldc ' int arguments ('
/*     */     //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   376: aload #22
/*     */     //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   381: ldc ') and '
/*     */     //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   386: iload #14
/*     */     //   388: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   391: ldc ' object arguments ('
/*     */     //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   396: aload #15
/*     */     //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   401: ldc ').'
/*     */     //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   406: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   409: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   412: nop
/*     */     //   413: nop
/*     */     //   414: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #208	-> 0
/*     */     //   #828	-> 16
/*     */     //   #831	-> 17
/*     */     //   #832	-> 23
/*     */     //   #209	-> 32
/*     */     //   #833	-> 42
/*     */     //   #209	-> 46
/*     */     //   #210	-> 50
/*     */     //   #834	-> 60
/*     */     //   #210	-> 64
/*     */     //   #211	-> 68
/*     */     //   #832	-> 69
/*     */     //   #835	-> 70
/*     */     //   #836	-> 86
/*     */     //   #837	-> 109
/*     */     //   #838	-> 113
/*     */     //   #841	-> 114
/*     */     //   #842	-> 119
/*     */     //   #843	-> 122
/*     */     //   #844	-> 125
/*     */     //   #845	-> 141
/*     */     //   #846	-> 165
/*     */     //   #847	-> 177
/*     */     //   #848	-> 190
/*     */     //   #849	-> 206
/*     */     //   #851	-> 212
/*     */     //   #845	-> 213
/*     */     //   #852	-> 219
/*     */     //   #844	-> 220
/*     */     //   #844	-> 231
/*     */     //   #854	-> 233
/*     */     //   #855	-> 236
/*     */     //   #856	-> 252
/*     */     //   #857	-> 276
/*     */     //   #858	-> 288
/*     */     //   #859	-> 301
/*     */     //   #860	-> 317
/*     */     //   #862	-> 323
/*     */     //   #856	-> 324
/*     */     //   #863	-> 330
/*     */     //   #855	-> 331
/*     */     //   #855	-> 342
/*     */     //   #865	-> 344
/*     */     //   #866	-> 366
/*     */     //   #865	-> 368
/*     */     //   #866	-> 371
/*     */     //   #865	-> 373
/*     */     //   #866	-> 376
/*     */     //   #865	-> 378
/*     */     //   #866	-> 381
/*     */     //   #865	-> 383
/*     */     //   #867	-> 386
/*     */     //   #865	-> 388
/*     */     //   #867	-> 391
/*     */     //   #865	-> 393
/*     */     //   #867	-> 396
/*     */     //   #865	-> 398
/*     */     //   #867	-> 401
/*     */     //   #865	-> 403
/*     */     //   #842	-> 409
/*     */     //   #868	-> 412
/*     */     //   #869	-> 413
/*     */     //   #212	-> 414
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	4	9	$i$f$getRemoveIndex-jn0FJLE	I
/*     */     //   39	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$RemoveNode;
/*     */     //   60	4	9	$i$f$getCount-jn0FJLE	I
/*     */     //   57	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$RemoveNode;
/*     */     //   32	37	7	$i$a$-push-ChangeList$pushRemoveNode$1	I
/*     */     //   29	40	6	$this$pushRemoveNode_u24lambda_u2412	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   165	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   162	51	19	arg$iv	I
/*     */     //   141	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   138	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   276	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   273	51	21	arg$iv	I
/*     */     //   252	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   249	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   122	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   125	284	13	missingIntCount$iv	I
/*     */     //   233	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   236	173	14	missingObjectCount$iv	I
/*     */     //   344	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   113	300	11	$i$f$checkPrecondition	I
/*     */     //   110	303	10	value$iv$iv	Z
/*     */     //   16	398	5	$i$f$push	I
/*     */     //   13	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   13	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	415	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	415	1	removeFrom	I
/*     */     //   0	415	2	moveCount	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushMoveNode(int to, int from, int count) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore #4
/*     */     //   6: getstatic androidx/compose/runtime/changelist/Operation$MoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   9: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   12: astore #5
/*     */     //   14: iconst_0
/*     */     //   15: istore #6
/*     */     //   17: nop
/*     */     //   18: aload #4
/*     */     //   20: aload #5
/*     */     //   22: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   25: aload #4
/*     */     //   27: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   30: astore #7
/*     */     //   32: iconst_0
/*     */     //   33: istore #8
/*     */     //   35: aload #7
/*     */     //   37: getstatic androidx/compose/runtime/changelist/Operation$MoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   40: astore #9
/*     */     //   42: iconst_0
/*     */     //   43: istore #10
/*     */     //   45: iconst_1
/*     */     //   46: invokestatic constructor-impl : (I)I
/*     */     //   49: iload_1
/*     */     //   50: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   53: aload #7
/*     */     //   55: getstatic androidx/compose/runtime/changelist/Operation$MoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   58: astore #9
/*     */     //   60: iconst_0
/*     */     //   61: istore #10
/*     */     //   63: iconst_0
/*     */     //   64: invokestatic constructor-impl : (I)I
/*     */     //   67: iload_2
/*     */     //   68: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   71: aload #7
/*     */     //   73: getstatic androidx/compose/runtime/changelist/Operation$MoveNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   76: astore #9
/*     */     //   78: iconst_0
/*     */     //   79: istore #10
/*     */     //   81: iconst_2
/*     */     //   82: invokestatic constructor-impl : (I)I
/*     */     //   85: iload_3
/*     */     //   86: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   89: nop
/*     */     //   90: nop
/*     */     //   91: aload #4
/*     */     //   93: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   96: aload #4
/*     */     //   98: aload #5
/*     */     //   100: invokevirtual getInts : ()I
/*     */     //   103: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   106: if_icmpne -> 131
/*     */     //   109: aload #4
/*     */     //   111: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   114: aload #4
/*     */     //   116: aload #5
/*     */     //   118: invokevirtual getObjects : ()I
/*     */     //   121: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   124: if_icmpne -> 131
/*     */     //   127: iconst_1
/*     */     //   128: goto -> 132
/*     */     //   131: iconst_0
/*     */     //   132: istore #11
/*     */     //   134: nop
/*     */     //   135: iconst_0
/*     */     //   136: istore #12
/*     */     //   138: nop
/*     */     //   139: iload #11
/*     */     //   141: ifne -> 439
/*     */     //   144: iconst_0
/*     */     //   145: istore #13
/*     */     //   147: iconst_0
/*     */     //   148: istore #14
/*     */     //   150: new java/lang/StringBuilder
/*     */     //   153: dup
/*     */     //   154: invokespecial <init> : ()V
/*     */     //   157: astore #15
/*     */     //   159: aload #15
/*     */     //   161: astore #16
/*     */     //   163: iconst_0
/*     */     //   164: istore #17
/*     */     //   166: aload #5
/*     */     //   168: invokevirtual getInts : ()I
/*     */     //   171: istore #18
/*     */     //   173: iconst_0
/*     */     //   174: istore #19
/*     */     //   176: iload #19
/*     */     //   178: iload #18
/*     */     //   180: if_icmpge -> 245
/*     */     //   183: iload #19
/*     */     //   185: istore #20
/*     */     //   187: iconst_0
/*     */     //   188: istore #21
/*     */     //   190: iconst_1
/*     */     //   191: iload #20
/*     */     //   193: ishl
/*     */     //   194: aload #4
/*     */     //   196: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   199: iand
/*     */     //   200: ifeq -> 238
/*     */     //   203: iload #14
/*     */     //   205: ifle -> 216
/*     */     //   208: aload #16
/*     */     //   210: ldc ', '
/*     */     //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   215: pop
/*     */     //   216: aload #16
/*     */     //   218: aload #5
/*     */     //   220: iload #20
/*     */     //   222: invokestatic constructor-impl : (I)I
/*     */     //   225: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   231: pop
/*     */     //   232: iload #14
/*     */     //   234: iconst_1
/*     */     //   235: iadd
/*     */     //   236: istore #14
/*     */     //   238: nop
/*     */     //   239: iinc #19, 1
/*     */     //   242: goto -> 176
/*     */     //   245: nop
/*     */     //   246: aload #15
/*     */     //   248: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   251: dup
/*     */     //   252: ldc 'toString(...)'
/*     */     //   254: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   257: astore #23
/*     */     //   259: iconst_0
/*     */     //   260: istore #15
/*     */     //   262: new java/lang/StringBuilder
/*     */     //   265: dup
/*     */     //   266: invokespecial <init> : ()V
/*     */     //   269: astore #17
/*     */     //   271: aload #17
/*     */     //   273: astore #18
/*     */     //   275: iconst_0
/*     */     //   276: istore #19
/*     */     //   278: aload #5
/*     */     //   280: invokevirtual getObjects : ()I
/*     */     //   283: istore #20
/*     */     //   285: iconst_0
/*     */     //   286: istore #21
/*     */     //   288: iload #21
/*     */     //   290: iload #20
/*     */     //   292: if_icmpge -> 357
/*     */     //   295: iload #21
/*     */     //   297: istore #22
/*     */     //   299: iconst_0
/*     */     //   300: istore #24
/*     */     //   302: iconst_1
/*     */     //   303: iload #22
/*     */     //   305: ishl
/*     */     //   306: aload #4
/*     */     //   308: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   311: iand
/*     */     //   312: ifeq -> 350
/*     */     //   315: iload #14
/*     */     //   317: ifle -> 328
/*     */     //   320: aload #18
/*     */     //   322: ldc ', '
/*     */     //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   327: pop
/*     */     //   328: aload #18
/*     */     //   330: aload #5
/*     */     //   332: iload #22
/*     */     //   334: invokestatic constructor-impl : (I)I
/*     */     //   337: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   343: pop
/*     */     //   344: iload #15
/*     */     //   346: iconst_1
/*     */     //   347: iadd
/*     */     //   348: istore #15
/*     */     //   350: nop
/*     */     //   351: iinc #21, 1
/*     */     //   354: goto -> 288
/*     */     //   357: nop
/*     */     //   358: aload #17
/*     */     //   360: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   363: dup
/*     */     //   364: ldc 'toString(...)'
/*     */     //   366: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   369: astore #16
/*     */     //   371: new java/lang/StringBuilder
/*     */     //   374: dup
/*     */     //   375: invokespecial <init> : ()V
/*     */     //   378: ldc 'Error while pushing '
/*     */     //   380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   383: aload #5
/*     */     //   385: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   388: ldc '. Not all arguments were provided. Missing '
/*     */     //   390: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   393: iload #14
/*     */     //   395: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   398: ldc ' int arguments ('
/*     */     //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   403: aload #23
/*     */     //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   408: ldc ') and '
/*     */     //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   413: iload #15
/*     */     //   415: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   418: ldc ' object arguments ('
/*     */     //   420: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   423: aload #16
/*     */     //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   428: ldc ').'
/*     */     //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   433: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   436: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   439: nop
/*     */     //   440: nop
/*     */     //   441: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #215	-> 0
/*     */     //   #870	-> 17
/*     */     //   #873	-> 18
/*     */     //   #874	-> 25
/*     */     //   #216	-> 35
/*     */     //   #875	-> 45
/*     */     //   #216	-> 49
/*     */     //   #217	-> 53
/*     */     //   #876	-> 63
/*     */     //   #217	-> 67
/*     */     //   #218	-> 71
/*     */     //   #877	-> 81
/*     */     //   #218	-> 85
/*     */     //   #219	-> 89
/*     */     //   #874	-> 90
/*     */     //   #878	-> 91
/*     */     //   #879	-> 109
/*     */     //   #880	-> 134
/*     */     //   #881	-> 138
/*     */     //   #884	-> 139
/*     */     //   #885	-> 144
/*     */     //   #886	-> 147
/*     */     //   #887	-> 150
/*     */     //   #888	-> 166
/*     */     //   #889	-> 190
/*     */     //   #890	-> 203
/*     */     //   #891	-> 216
/*     */     //   #892	-> 232
/*     */     //   #894	-> 238
/*     */     //   #888	-> 239
/*     */     //   #895	-> 245
/*     */     //   #887	-> 246
/*     */     //   #887	-> 257
/*     */     //   #897	-> 259
/*     */     //   #898	-> 262
/*     */     //   #899	-> 278
/*     */     //   #900	-> 302
/*     */     //   #901	-> 315
/*     */     //   #902	-> 328
/*     */     //   #903	-> 344
/*     */     //   #905	-> 350
/*     */     //   #899	-> 351
/*     */     //   #906	-> 357
/*     */     //   #898	-> 358
/*     */     //   #898	-> 369
/*     */     //   #908	-> 371
/*     */     //   #909	-> 393
/*     */     //   #908	-> 395
/*     */     //   #909	-> 398
/*     */     //   #908	-> 400
/*     */     //   #909	-> 403
/*     */     //   #908	-> 405
/*     */     //   #909	-> 408
/*     */     //   #908	-> 410
/*     */     //   #910	-> 413
/*     */     //   #908	-> 415
/*     */     //   #910	-> 418
/*     */     //   #908	-> 420
/*     */     //   #910	-> 423
/*     */     //   #908	-> 425
/*     */     //   #910	-> 428
/*     */     //   #908	-> 430
/*     */     //   #885	-> 436
/*     */     //   #911	-> 439
/*     */     //   #912	-> 440
/*     */     //   #220	-> 441
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   45	4	10	$i$f$getTo-jn0FJLE	I
/*     */     //   42	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   63	4	10	$i$f$getFrom-jn0FJLE	I
/*     */     //   60	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   81	4	10	$i$f$getCount-jn0FJLE	I
/*     */     //   78	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$MoveNode;
/*     */     //   35	55	8	$i$a$-push-ChangeList$pushMoveNode$1	I
/*     */     //   32	58	7	$this$pushMoveNode_u24lambda_u2413	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   190	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   187	52	20	arg$iv	I
/*     */     //   166	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   163	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   302	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   299	52	22	arg$iv	I
/*     */     //   278	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   275	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   147	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   150	286	14	missingIntCount$iv	I
/*     */     //   259	177	23	missingInts$iv	Ljava/lang/String;
/*     */     //   262	174	15	missingObjectCount$iv	I
/*     */     //   371	65	16	missingObjects$iv	Ljava/lang/String;
/*     */     //   138	302	12	$i$f$checkPrecondition	I
/*     */     //   135	305	11	value$iv$iv	Z
/*     */     //   17	424	6	$i$f$push	I
/*     */     //   14	427	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   14	427	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	442	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	442	1	to	I
/*     */     //   0	442	2	from	I
/*     */     //   0	442	3	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushAdvanceSlotsBy(int distance) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_2
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$AdvanceSlotsBy.INSTANCE : Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: nop
/*     */     //   16: aload_2
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   21: aload_2
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #5
/*     */     //   27: iconst_0
/*     */     //   28: istore #6
/*     */     //   30: aload #5
/*     */     //   32: getstatic androidx/compose/runtime/changelist/Operation$AdvanceSlotsBy.INSTANCE : Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;
/*     */     //   35: astore #7
/*     */     //   37: iconst_0
/*     */     //   38: istore #8
/*     */     //   40: iconst_0
/*     */     //   41: invokestatic constructor-impl : (I)I
/*     */     //   44: iload_1
/*     */     //   45: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   48: nop
/*     */     //   49: nop
/*     */     //   50: aload_2
/*     */     //   51: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   54: aload_2
/*     */     //   55: aload_3
/*     */     //   56: invokevirtual getInts : ()I
/*     */     //   59: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   62: if_icmpne -> 84
/*     */     //   65: aload_2
/*     */     //   66: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   69: aload_2
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getObjects : ()I
/*     */     //   74: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   77: if_icmpne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: istore #9
/*     */     //   87: nop
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: nop
/*     */     //   92: iload #9
/*     */     //   94: ifne -> 385
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: istore #12
/*     */     //   103: new java/lang/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #13
/*     */     //   112: aload #13
/*     */     //   114: astore #14
/*     */     //   116: iconst_0
/*     */     //   117: istore #15
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: istore #16
/*     */     //   125: iconst_0
/*     */     //   126: istore #17
/*     */     //   128: iload #17
/*     */     //   130: iload #16
/*     */     //   132: if_icmpge -> 195
/*     */     //   135: iload #17
/*     */     //   137: istore #18
/*     */     //   139: iconst_0
/*     */     //   140: istore #19
/*     */     //   142: iconst_1
/*     */     //   143: iload #18
/*     */     //   145: ishl
/*     */     //   146: aload_2
/*     */     //   147: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   150: iand
/*     */     //   151: ifeq -> 188
/*     */     //   154: iload #12
/*     */     //   156: ifle -> 167
/*     */     //   159: aload #14
/*     */     //   161: ldc ', '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: pop
/*     */     //   167: aload #14
/*     */     //   169: aload_3
/*     */     //   170: iload #18
/*     */     //   172: invokestatic constructor-impl : (I)I
/*     */     //   175: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: pop
/*     */     //   182: iload #12
/*     */     //   184: iconst_1
/*     */     //   185: iadd
/*     */     //   186: istore #12
/*     */     //   188: nop
/*     */     //   189: iinc #17, 1
/*     */     //   192: goto -> 128
/*     */     //   195: nop
/*     */     //   196: aload #13
/*     */     //   198: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ldc 'toString(...)'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: astore #21
/*     */     //   209: iconst_0
/*     */     //   210: istore #13
/*     */     //   212: new java/lang/StringBuilder
/*     */     //   215: dup
/*     */     //   216: invokespecial <init> : ()V
/*     */     //   219: astore #15
/*     */     //   221: aload #15
/*     */     //   223: astore #16
/*     */     //   225: iconst_0
/*     */     //   226: istore #17
/*     */     //   228: aload_3
/*     */     //   229: invokevirtual getObjects : ()I
/*     */     //   232: istore #18
/*     */     //   234: iconst_0
/*     */     //   235: istore #19
/*     */     //   237: iload #19
/*     */     //   239: iload #18
/*     */     //   241: if_icmpge -> 304
/*     */     //   244: iload #19
/*     */     //   246: istore #20
/*     */     //   248: iconst_0
/*     */     //   249: istore #22
/*     */     //   251: iconst_1
/*     */     //   252: iload #20
/*     */     //   254: ishl
/*     */     //   255: aload_2
/*     */     //   256: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   259: iand
/*     */     //   260: ifeq -> 297
/*     */     //   263: iload #12
/*     */     //   265: ifle -> 276
/*     */     //   268: aload #16
/*     */     //   270: ldc ', '
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #16
/*     */     //   278: aload_3
/*     */     //   279: iload #20
/*     */     //   281: invokestatic constructor-impl : (I)I
/*     */     //   284: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   290: pop
/*     */     //   291: iload #13
/*     */     //   293: iconst_1
/*     */     //   294: iadd
/*     */     //   295: istore #13
/*     */     //   297: nop
/*     */     //   298: iinc #19, 1
/*     */     //   301: goto -> 237
/*     */     //   304: nop
/*     */     //   305: aload #15
/*     */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   310: dup
/*     */     //   311: ldc 'toString(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: astore #14
/*     */     //   318: new java/lang/StringBuilder
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: ldc 'Error while pushing '
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: aload_3
/*     */     //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   334: ldc '. Not all arguments were provided. Missing '
/*     */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   339: iload #12
/*     */     //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   344: ldc ' int arguments ('
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: aload #21
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   354: ldc ') and '
/*     */     //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   359: iload #13
/*     */     //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   364: ldc ' object arguments ('
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #14
/*     */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc ').'
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   382: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #223	-> 0
/*     */     //   #913	-> 15
/*     */     //   #916	-> 16
/*     */     //   #917	-> 21
/*     */     //   #224	-> 30
/*     */     //   #918	-> 40
/*     */     //   #224	-> 44
/*     */     //   #225	-> 48
/*     */     //   #917	-> 49
/*     */     //   #919	-> 50
/*     */     //   #920	-> 65
/*     */     //   #921	-> 87
/*     */     //   #922	-> 91
/*     */     //   #925	-> 92
/*     */     //   #926	-> 97
/*     */     //   #927	-> 100
/*     */     //   #928	-> 103
/*     */     //   #929	-> 119
/*     */     //   #930	-> 142
/*     */     //   #931	-> 154
/*     */     //   #932	-> 167
/*     */     //   #933	-> 182
/*     */     //   #935	-> 188
/*     */     //   #929	-> 189
/*     */     //   #936	-> 195
/*     */     //   #928	-> 196
/*     */     //   #928	-> 207
/*     */     //   #938	-> 209
/*     */     //   #939	-> 212
/*     */     //   #940	-> 228
/*     */     //   #941	-> 251
/*     */     //   #942	-> 263
/*     */     //   #943	-> 276
/*     */     //   #944	-> 291
/*     */     //   #946	-> 297
/*     */     //   #940	-> 298
/*     */     //   #947	-> 304
/*     */     //   #939	-> 305
/*     */     //   #939	-> 316
/*     */     //   #949	-> 318
/*     */     //   #950	-> 339
/*     */     //   #949	-> 341
/*     */     //   #950	-> 344
/*     */     //   #949	-> 346
/*     */     //   #950	-> 349
/*     */     //   #949	-> 351
/*     */     //   #950	-> 354
/*     */     //   #949	-> 356
/*     */     //   #951	-> 359
/*     */     //   #949	-> 361
/*     */     //   #951	-> 364
/*     */     //   #949	-> 366
/*     */     //   #951	-> 369
/*     */     //   #949	-> 371
/*     */     //   #951	-> 374
/*     */     //   #949	-> 376
/*     */     //   #926	-> 382
/*     */     //   #952	-> 385
/*     */     //   #953	-> 386
/*     */     //   #226	-> 387
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	4	8	$i$f$getDistance-jn0FJLE	I
/*     */     //   37	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;
/*     */     //   30	19	6	$i$a$-push-ChangeList$pushAdvanceSlotsBy$1	I
/*     */     //   27	22	5	$this$pushAdvanceSlotsBy_u24lambda_u2414	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   142	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   139	50	18	arg$iv	I
/*     */     //   119	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   116	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   251	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   248	50	20	arg$iv	I
/*     */     //   228	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   225	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   100	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   103	279	12	missingIntCount$iv	I
/*     */     //   209	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   212	170	13	missingObjectCount$iv	I
/*     */     //   318	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   91	295	10	$i$f$checkPrecondition	I
/*     */     //   88	298	9	value$iv$iv	Z
/*     */     //   15	372	4	$i$f$push	I
/*     */     //   12	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   12	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	388	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	388	1	distance	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushUps(int count) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   4: astore_2
/*     */     //   5: getstatic androidx/compose/runtime/changelist/Operation$Ups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Ups;
/*     */     //   8: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   11: astore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: nop
/*     */     //   16: aload_2
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   21: aload_2
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #5
/*     */     //   27: iconst_0
/*     */     //   28: istore #6
/*     */     //   30: aload #5
/*     */     //   32: getstatic androidx/compose/runtime/changelist/Operation$Ups.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Ups;
/*     */     //   35: astore #7
/*     */     //   37: iconst_0
/*     */     //   38: istore #8
/*     */     //   40: iconst_0
/*     */     //   41: invokestatic constructor-impl : (I)I
/*     */     //   44: iload_1
/*     */     //   45: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*     */     //   48: nop
/*     */     //   49: nop
/*     */     //   50: aload_2
/*     */     //   51: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   54: aload_2
/*     */     //   55: aload_3
/*     */     //   56: invokevirtual getInts : ()I
/*     */     //   59: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   62: if_icmpne -> 84
/*     */     //   65: aload_2
/*     */     //   66: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   69: aload_2
/*     */     //   70: aload_3
/*     */     //   71: invokevirtual getObjects : ()I
/*     */     //   74: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   77: if_icmpne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: istore #9
/*     */     //   87: nop
/*     */     //   88: iconst_0
/*     */     //   89: istore #10
/*     */     //   91: nop
/*     */     //   92: iload #9
/*     */     //   94: ifne -> 385
/*     */     //   97: iconst_0
/*     */     //   98: istore #11
/*     */     //   100: iconst_0
/*     */     //   101: istore #12
/*     */     //   103: new java/lang/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #13
/*     */     //   112: aload #13
/*     */     //   114: astore #14
/*     */     //   116: iconst_0
/*     */     //   117: istore #15
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual getInts : ()I
/*     */     //   123: istore #16
/*     */     //   125: iconst_0
/*     */     //   126: istore #17
/*     */     //   128: iload #17
/*     */     //   130: iload #16
/*     */     //   132: if_icmpge -> 195
/*     */     //   135: iload #17
/*     */     //   137: istore #18
/*     */     //   139: iconst_0
/*     */     //   140: istore #19
/*     */     //   142: iconst_1
/*     */     //   143: iload #18
/*     */     //   145: ishl
/*     */     //   146: aload_2
/*     */     //   147: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   150: iand
/*     */     //   151: ifeq -> 188
/*     */     //   154: iload #12
/*     */     //   156: ifle -> 167
/*     */     //   159: aload #14
/*     */     //   161: ldc ', '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: pop
/*     */     //   167: aload #14
/*     */     //   169: aload_3
/*     */     //   170: iload #18
/*     */     //   172: invokestatic constructor-impl : (I)I
/*     */     //   175: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: pop
/*     */     //   182: iload #12
/*     */     //   184: iconst_1
/*     */     //   185: iadd
/*     */     //   186: istore #12
/*     */     //   188: nop
/*     */     //   189: iinc #17, 1
/*     */     //   192: goto -> 128
/*     */     //   195: nop
/*     */     //   196: aload #13
/*     */     //   198: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ldc 'toString(...)'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: astore #21
/*     */     //   209: iconst_0
/*     */     //   210: istore #13
/*     */     //   212: new java/lang/StringBuilder
/*     */     //   215: dup
/*     */     //   216: invokespecial <init> : ()V
/*     */     //   219: astore #15
/*     */     //   221: aload #15
/*     */     //   223: astore #16
/*     */     //   225: iconst_0
/*     */     //   226: istore #17
/*     */     //   228: aload_3
/*     */     //   229: invokevirtual getObjects : ()I
/*     */     //   232: istore #18
/*     */     //   234: iconst_0
/*     */     //   235: istore #19
/*     */     //   237: iload #19
/*     */     //   239: iload #18
/*     */     //   241: if_icmpge -> 304
/*     */     //   244: iload #19
/*     */     //   246: istore #20
/*     */     //   248: iconst_0
/*     */     //   249: istore #22
/*     */     //   251: iconst_1
/*     */     //   252: iload #20
/*     */     //   254: ishl
/*     */     //   255: aload_2
/*     */     //   256: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   259: iand
/*     */     //   260: ifeq -> 297
/*     */     //   263: iload #12
/*     */     //   265: ifle -> 276
/*     */     //   268: aload #16
/*     */     //   270: ldc ', '
/*     */     //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   275: pop
/*     */     //   276: aload #16
/*     */     //   278: aload_3
/*     */     //   279: iload #20
/*     */     //   281: invokestatic constructor-impl : (I)I
/*     */     //   284: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   290: pop
/*     */     //   291: iload #13
/*     */     //   293: iconst_1
/*     */     //   294: iadd
/*     */     //   295: istore #13
/*     */     //   297: nop
/*     */     //   298: iinc #19, 1
/*     */     //   301: goto -> 237
/*     */     //   304: nop
/*     */     //   305: aload #15
/*     */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   310: dup
/*     */     //   311: ldc 'toString(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: astore #14
/*     */     //   318: new java/lang/StringBuilder
/*     */     //   321: dup
/*     */     //   322: invokespecial <init> : ()V
/*     */     //   325: ldc 'Error while pushing '
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: aload_3
/*     */     //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   334: ldc '. Not all arguments were provided. Missing '
/*     */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   339: iload #12
/*     */     //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   344: ldc ' int arguments ('
/*     */     //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   349: aload #21
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   354: ldc ') and '
/*     */     //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   359: iload #13
/*     */     //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   364: ldc ' object arguments ('
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #14
/*     */     //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc ').'
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   382: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #229	-> 0
/*     */     //   #954	-> 15
/*     */     //   #957	-> 16
/*     */     //   #958	-> 21
/*     */     //   #230	-> 30
/*     */     //   #959	-> 40
/*     */     //   #230	-> 44
/*     */     //   #231	-> 48
/*     */     //   #958	-> 49
/*     */     //   #960	-> 50
/*     */     //   #961	-> 65
/*     */     //   #962	-> 87
/*     */     //   #963	-> 91
/*     */     //   #966	-> 92
/*     */     //   #967	-> 97
/*     */     //   #968	-> 100
/*     */     //   #969	-> 103
/*     */     //   #970	-> 119
/*     */     //   #971	-> 142
/*     */     //   #972	-> 154
/*     */     //   #973	-> 167
/*     */     //   #974	-> 182
/*     */     //   #976	-> 188
/*     */     //   #970	-> 189
/*     */     //   #977	-> 195
/*     */     //   #969	-> 196
/*     */     //   #969	-> 207
/*     */     //   #979	-> 209
/*     */     //   #980	-> 212
/*     */     //   #981	-> 228
/*     */     //   #982	-> 251
/*     */     //   #983	-> 263
/*     */     //   #984	-> 276
/*     */     //   #985	-> 291
/*     */     //   #987	-> 297
/*     */     //   #981	-> 298
/*     */     //   #988	-> 304
/*     */     //   #980	-> 305
/*     */     //   #980	-> 316
/*     */     //   #990	-> 318
/*     */     //   #991	-> 339
/*     */     //   #990	-> 341
/*     */     //   #991	-> 344
/*     */     //   #990	-> 346
/*     */     //   #991	-> 349
/*     */     //   #990	-> 351
/*     */     //   #991	-> 354
/*     */     //   #990	-> 356
/*     */     //   #992	-> 359
/*     */     //   #990	-> 361
/*     */     //   #992	-> 364
/*     */     //   #990	-> 366
/*     */     //   #992	-> 369
/*     */     //   #990	-> 371
/*     */     //   #992	-> 374
/*     */     //   #990	-> 376
/*     */     //   #967	-> 382
/*     */     //   #993	-> 385
/*     */     //   #994	-> 386
/*     */     //   #232	-> 387
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	4	8	$i$f$getCount-jn0FJLE	I
/*     */     //   37	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$Ups;
/*     */     //   30	19	6	$i$a$-push-ChangeList$pushUps$1	I
/*     */     //   27	22	5	$this$pushUps_u24lambda_u2415	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   142	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   139	50	18	arg$iv	I
/*     */     //   119	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   116	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   251	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   248	50	20	arg$iv	I
/*     */     //   228	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   225	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   100	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   103	279	12	missingIntCount$iv	I
/*     */     //   209	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   212	170	13	missingObjectCount$iv	I
/*     */     //   318	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   91	295	10	$i$f$checkPrecondition	I
/*     */     //   88	298	9	value$iv$iv	Z
/*     */     //   15	372	4	$i$f$push	I
/*     */     //   12	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   12	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	388	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	388	1	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushDowns(@NotNull Object[] nodes) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'nodes'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: arraylength
/*     */     //   9: ifne -> 16
/*     */     //   12: iconst_1
/*     */     //   13: goto -> 17
/*     */     //   16: iconst_0
/*     */     //   17: ifne -> 24
/*     */     //   20: iconst_1
/*     */     //   21: goto -> 25
/*     */     //   24: iconst_0
/*     */     //   25: ifeq -> 415
/*     */     //   28: aload_0
/*     */     //   29: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   32: astore_2
/*     */     //   33: getstatic androidx/compose/runtime/changelist/Operation$Downs.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Downs;
/*     */     //   36: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   39: astore_3
/*     */     //   40: iconst_0
/*     */     //   41: istore #4
/*     */     //   43: nop
/*     */     //   44: aload_2
/*     */     //   45: aload_3
/*     */     //   46: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   49: aload_2
/*     */     //   50: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   53: astore #5
/*     */     //   55: iconst_0
/*     */     //   56: istore #6
/*     */     //   58: aload #5
/*     */     //   60: getstatic androidx/compose/runtime/changelist/Operation$Downs.INSTANCE : Landroidx/compose/runtime/changelist/Operation$Downs;
/*     */     //   63: astore #7
/*     */     //   65: iconst_0
/*     */     //   66: istore #8
/*     */     //   68: iconst_0
/*     */     //   69: invokestatic constructor-impl : (I)I
/*     */     //   72: aload_1
/*     */     //   73: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   76: nop
/*     */     //   77: nop
/*     */     //   78: aload_2
/*     */     //   79: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   82: aload_2
/*     */     //   83: aload_3
/*     */     //   84: invokevirtual getInts : ()I
/*     */     //   87: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   90: if_icmpne -> 112
/*     */     //   93: aload_2
/*     */     //   94: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   97: aload_2
/*     */     //   98: aload_3
/*     */     //   99: invokevirtual getObjects : ()I
/*     */     //   102: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   105: if_icmpne -> 112
/*     */     //   108: iconst_1
/*     */     //   109: goto -> 113
/*     */     //   112: iconst_0
/*     */     //   113: istore #9
/*     */     //   115: nop
/*     */     //   116: iconst_0
/*     */     //   117: istore #10
/*     */     //   119: nop
/*     */     //   120: iload #9
/*     */     //   122: ifne -> 413
/*     */     //   125: iconst_0
/*     */     //   126: istore #11
/*     */     //   128: iconst_0
/*     */     //   129: istore #12
/*     */     //   131: new java/lang/StringBuilder
/*     */     //   134: dup
/*     */     //   135: invokespecial <init> : ()V
/*     */     //   138: astore #13
/*     */     //   140: aload #13
/*     */     //   142: astore #14
/*     */     //   144: iconst_0
/*     */     //   145: istore #15
/*     */     //   147: aload_3
/*     */     //   148: invokevirtual getInts : ()I
/*     */     //   151: istore #16
/*     */     //   153: iconst_0
/*     */     //   154: istore #17
/*     */     //   156: iload #17
/*     */     //   158: iload #16
/*     */     //   160: if_icmpge -> 223
/*     */     //   163: iload #17
/*     */     //   165: istore #18
/*     */     //   167: iconst_0
/*     */     //   168: istore #19
/*     */     //   170: iconst_1
/*     */     //   171: iload #18
/*     */     //   173: ishl
/*     */     //   174: aload_2
/*     */     //   175: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   178: iand
/*     */     //   179: ifeq -> 216
/*     */     //   182: iload #12
/*     */     //   184: ifle -> 195
/*     */     //   187: aload #14
/*     */     //   189: ldc ', '
/*     */     //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   194: pop
/*     */     //   195: aload #14
/*     */     //   197: aload_3
/*     */     //   198: iload #18
/*     */     //   200: invokestatic constructor-impl : (I)I
/*     */     //   203: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   209: pop
/*     */     //   210: iload #12
/*     */     //   212: iconst_1
/*     */     //   213: iadd
/*     */     //   214: istore #12
/*     */     //   216: nop
/*     */     //   217: iinc #17, 1
/*     */     //   220: goto -> 156
/*     */     //   223: nop
/*     */     //   224: aload #13
/*     */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   229: dup
/*     */     //   230: ldc 'toString(...)'
/*     */     //   232: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   235: astore #21
/*     */     //   237: iconst_0
/*     */     //   238: istore #13
/*     */     //   240: new java/lang/StringBuilder
/*     */     //   243: dup
/*     */     //   244: invokespecial <init> : ()V
/*     */     //   247: astore #15
/*     */     //   249: aload #15
/*     */     //   251: astore #16
/*     */     //   253: iconst_0
/*     */     //   254: istore #17
/*     */     //   256: aload_3
/*     */     //   257: invokevirtual getObjects : ()I
/*     */     //   260: istore #18
/*     */     //   262: iconst_0
/*     */     //   263: istore #19
/*     */     //   265: iload #19
/*     */     //   267: iload #18
/*     */     //   269: if_icmpge -> 332
/*     */     //   272: iload #19
/*     */     //   274: istore #20
/*     */     //   276: iconst_0
/*     */     //   277: istore #22
/*     */     //   279: iconst_1
/*     */     //   280: iload #20
/*     */     //   282: ishl
/*     */     //   283: aload_2
/*     */     //   284: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   287: iand
/*     */     //   288: ifeq -> 325
/*     */     //   291: iload #12
/*     */     //   293: ifle -> 304
/*     */     //   296: aload #16
/*     */     //   298: ldc ', '
/*     */     //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   303: pop
/*     */     //   304: aload #16
/*     */     //   306: aload_3
/*     */     //   307: iload #20
/*     */     //   309: invokestatic constructor-impl : (I)I
/*     */     //   312: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   318: pop
/*     */     //   319: iload #13
/*     */     //   321: iconst_1
/*     */     //   322: iadd
/*     */     //   323: istore #13
/*     */     //   325: nop
/*     */     //   326: iinc #19, 1
/*     */     //   329: goto -> 265
/*     */     //   332: nop
/*     */     //   333: aload #15
/*     */     //   335: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   338: dup
/*     */     //   339: ldc 'toString(...)'
/*     */     //   341: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   344: astore #14
/*     */     //   346: new java/lang/StringBuilder
/*     */     //   349: dup
/*     */     //   350: invokespecial <init> : ()V
/*     */     //   353: ldc 'Error while pushing '
/*     */     //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   358: aload_3
/*     */     //   359: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   362: ldc '. Not all arguments were provided. Missing '
/*     */     //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   367: iload #12
/*     */     //   369: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   372: ldc ' int arguments ('
/*     */     //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   377: aload #21
/*     */     //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   382: ldc ') and '
/*     */     //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   387: iload #13
/*     */     //   389: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   392: ldc ' object arguments ('
/*     */     //   394: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   397: aload #14
/*     */     //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   402: ldc ').'
/*     */     //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   407: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   410: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   413: nop
/*     */     //   414: nop
/*     */     //   415: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #235	-> 7
/*     */     //   #235	-> 25
/*     */     //   #236	-> 28
/*     */     //   #995	-> 43
/*     */     //   #998	-> 44
/*     */     //   #999	-> 49
/*     */     //   #237	-> 58
/*     */     //   #1000	-> 68
/*     */     //   #237	-> 72
/*     */     //   #238	-> 76
/*     */     //   #999	-> 77
/*     */     //   #1001	-> 78
/*     */     //   #1002	-> 93
/*     */     //   #1003	-> 115
/*     */     //   #1004	-> 119
/*     */     //   #1007	-> 120
/*     */     //   #1008	-> 125
/*     */     //   #1009	-> 128
/*     */     //   #1010	-> 131
/*     */     //   #1011	-> 147
/*     */     //   #1012	-> 170
/*     */     //   #1013	-> 182
/*     */     //   #1014	-> 195
/*     */     //   #1015	-> 210
/*     */     //   #1017	-> 216
/*     */     //   #1011	-> 217
/*     */     //   #1018	-> 223
/*     */     //   #1010	-> 224
/*     */     //   #1010	-> 235
/*     */     //   #1020	-> 237
/*     */     //   #1021	-> 240
/*     */     //   #1022	-> 256
/*     */     //   #1023	-> 279
/*     */     //   #1024	-> 291
/*     */     //   #1025	-> 304
/*     */     //   #1026	-> 319
/*     */     //   #1028	-> 325
/*     */     //   #1022	-> 326
/*     */     //   #1029	-> 332
/*     */     //   #1021	-> 333
/*     */     //   #1021	-> 344
/*     */     //   #1031	-> 346
/*     */     //   #1032	-> 367
/*     */     //   #1031	-> 369
/*     */     //   #1032	-> 372
/*     */     //   #1031	-> 374
/*     */     //   #1032	-> 377
/*     */     //   #1031	-> 379
/*     */     //   #1032	-> 382
/*     */     //   #1031	-> 384
/*     */     //   #1033	-> 387
/*     */     //   #1031	-> 389
/*     */     //   #1033	-> 392
/*     */     //   #1031	-> 394
/*     */     //   #1033	-> 397
/*     */     //   #1031	-> 399
/*     */     //   #1033	-> 402
/*     */     //   #1031	-> 404
/*     */     //   #1008	-> 410
/*     */     //   #1034	-> 413
/*     */     //   #1035	-> 414
/*     */     //   #240	-> 415
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   68	4	8	$i$f$getNodes-HpuvwBQ	I
/*     */     //   65	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$Downs;
/*     */     //   58	19	6	$i$a$-push-ChangeList$pushDowns$1	I
/*     */     //   55	22	5	$this$pushDowns_u24lambda_u2416	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   170	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   167	50	18	arg$iv	I
/*     */     //   147	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   144	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   279	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   276	50	20	arg$iv	I
/*     */     //   256	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   253	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   128	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   131	279	12	missingIntCount$iv	I
/*     */     //   237	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   240	170	13	missingObjectCount$iv	I
/*     */     //   346	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   119	295	10	$i$f$checkPrecondition	I
/*     */     //   116	298	9	value$iv$iv	Z
/*     */     //   43	372	4	$i$f$push	I
/*     */     //   40	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   40	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	416	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	416	1	nodes	[Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushSideEffect(@NotNull Function0 effect) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'effect'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   11: astore_2
/*     */     //   12: getstatic androidx/compose/runtime/changelist/Operation$SideEffect.INSTANCE : Landroidx/compose/runtime/changelist/Operation$SideEffect;
/*     */     //   15: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: nop
/*     */     //   23: aload_2
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   28: aload_2
/*     */     //   29: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   32: astore #5
/*     */     //   34: iconst_0
/*     */     //   35: istore #6
/*     */     //   37: aload #5
/*     */     //   39: getstatic androidx/compose/runtime/changelist/Operation$SideEffect.INSTANCE : Landroidx/compose/runtime/changelist/Operation$SideEffect;
/*     */     //   42: astore #7
/*     */     //   44: iconst_0
/*     */     //   45: istore #8
/*     */     //   47: iconst_0
/*     */     //   48: invokestatic constructor-impl : (I)I
/*     */     //   51: aload_1
/*     */     //   52: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   55: nop
/*     */     //   56: nop
/*     */     //   57: aload_2
/*     */     //   58: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   61: aload_2
/*     */     //   62: aload_3
/*     */     //   63: invokevirtual getInts : ()I
/*     */     //   66: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   69: if_icmpne -> 91
/*     */     //   72: aload_2
/*     */     //   73: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   76: aload_2
/*     */     //   77: aload_3
/*     */     //   78: invokevirtual getObjects : ()I
/*     */     //   81: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   84: if_icmpne -> 91
/*     */     //   87: iconst_1
/*     */     //   88: goto -> 92
/*     */     //   91: iconst_0
/*     */     //   92: istore #9
/*     */     //   94: nop
/*     */     //   95: iconst_0
/*     */     //   96: istore #10
/*     */     //   98: nop
/*     */     //   99: iload #9
/*     */     //   101: ifne -> 392
/*     */     //   104: iconst_0
/*     */     //   105: istore #11
/*     */     //   107: iconst_0
/*     */     //   108: istore #12
/*     */     //   110: new java/lang/StringBuilder
/*     */     //   113: dup
/*     */     //   114: invokespecial <init> : ()V
/*     */     //   117: astore #13
/*     */     //   119: aload #13
/*     */     //   121: astore #14
/*     */     //   123: iconst_0
/*     */     //   124: istore #15
/*     */     //   126: aload_3
/*     */     //   127: invokevirtual getInts : ()I
/*     */     //   130: istore #16
/*     */     //   132: iconst_0
/*     */     //   133: istore #17
/*     */     //   135: iload #17
/*     */     //   137: iload #16
/*     */     //   139: if_icmpge -> 202
/*     */     //   142: iload #17
/*     */     //   144: istore #18
/*     */     //   146: iconst_0
/*     */     //   147: istore #19
/*     */     //   149: iconst_1
/*     */     //   150: iload #18
/*     */     //   152: ishl
/*     */     //   153: aload_2
/*     */     //   154: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   157: iand
/*     */     //   158: ifeq -> 195
/*     */     //   161: iload #12
/*     */     //   163: ifle -> 174
/*     */     //   166: aload #14
/*     */     //   168: ldc ', '
/*     */     //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   173: pop
/*     */     //   174: aload #14
/*     */     //   176: aload_3
/*     */     //   177: iload #18
/*     */     //   179: invokestatic constructor-impl : (I)I
/*     */     //   182: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   188: pop
/*     */     //   189: iload #12
/*     */     //   191: iconst_1
/*     */     //   192: iadd
/*     */     //   193: istore #12
/*     */     //   195: nop
/*     */     //   196: iinc #17, 1
/*     */     //   199: goto -> 135
/*     */     //   202: nop
/*     */     //   203: aload #13
/*     */     //   205: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   208: dup
/*     */     //   209: ldc 'toString(...)'
/*     */     //   211: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   214: astore #21
/*     */     //   216: iconst_0
/*     */     //   217: istore #13
/*     */     //   219: new java/lang/StringBuilder
/*     */     //   222: dup
/*     */     //   223: invokespecial <init> : ()V
/*     */     //   226: astore #15
/*     */     //   228: aload #15
/*     */     //   230: astore #16
/*     */     //   232: iconst_0
/*     */     //   233: istore #17
/*     */     //   235: aload_3
/*     */     //   236: invokevirtual getObjects : ()I
/*     */     //   239: istore #18
/*     */     //   241: iconst_0
/*     */     //   242: istore #19
/*     */     //   244: iload #19
/*     */     //   246: iload #18
/*     */     //   248: if_icmpge -> 311
/*     */     //   251: iload #19
/*     */     //   253: istore #20
/*     */     //   255: iconst_0
/*     */     //   256: istore #22
/*     */     //   258: iconst_1
/*     */     //   259: iload #20
/*     */     //   261: ishl
/*     */     //   262: aload_2
/*     */     //   263: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   266: iand
/*     */     //   267: ifeq -> 304
/*     */     //   270: iload #12
/*     */     //   272: ifle -> 283
/*     */     //   275: aload #16
/*     */     //   277: ldc ', '
/*     */     //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   282: pop
/*     */     //   283: aload #16
/*     */     //   285: aload_3
/*     */     //   286: iload #20
/*     */     //   288: invokestatic constructor-impl : (I)I
/*     */     //   291: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   297: pop
/*     */     //   298: iload #13
/*     */     //   300: iconst_1
/*     */     //   301: iadd
/*     */     //   302: istore #13
/*     */     //   304: nop
/*     */     //   305: iinc #19, 1
/*     */     //   308: goto -> 244
/*     */     //   311: nop
/*     */     //   312: aload #15
/*     */     //   314: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   317: dup
/*     */     //   318: ldc 'toString(...)'
/*     */     //   320: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   323: astore #14
/*     */     //   325: new java/lang/StringBuilder
/*     */     //   328: dup
/*     */     //   329: invokespecial <init> : ()V
/*     */     //   332: ldc 'Error while pushing '
/*     */     //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   337: aload_3
/*     */     //   338: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   341: ldc '. Not all arguments were provided. Missing '
/*     */     //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   346: iload #12
/*     */     //   348: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   351: ldc ' int arguments ('
/*     */     //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   356: aload #21
/*     */     //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   361: ldc ') and '
/*     */     //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   366: iload #13
/*     */     //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   371: ldc ' object arguments ('
/*     */     //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   376: aload #14
/*     */     //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   381: ldc ').'
/*     */     //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   386: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   389: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   392: nop
/*     */     //   393: nop
/*     */     //   394: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #243	-> 7
/*     */     //   #1036	-> 22
/*     */     //   #1039	-> 23
/*     */     //   #1040	-> 28
/*     */     //   #244	-> 37
/*     */     //   #1041	-> 47
/*     */     //   #244	-> 51
/*     */     //   #245	-> 55
/*     */     //   #1040	-> 56
/*     */     //   #1042	-> 57
/*     */     //   #1043	-> 72
/*     */     //   #1044	-> 94
/*     */     //   #1045	-> 98
/*     */     //   #1048	-> 99
/*     */     //   #1049	-> 104
/*     */     //   #1050	-> 107
/*     */     //   #1051	-> 110
/*     */     //   #1052	-> 126
/*     */     //   #1053	-> 149
/*     */     //   #1054	-> 161
/*     */     //   #1055	-> 174
/*     */     //   #1056	-> 189
/*     */     //   #1058	-> 195
/*     */     //   #1052	-> 196
/*     */     //   #1059	-> 202
/*     */     //   #1051	-> 203
/*     */     //   #1051	-> 214
/*     */     //   #1061	-> 216
/*     */     //   #1062	-> 219
/*     */     //   #1063	-> 235
/*     */     //   #1064	-> 258
/*     */     //   #1065	-> 270
/*     */     //   #1066	-> 283
/*     */     //   #1067	-> 298
/*     */     //   #1069	-> 304
/*     */     //   #1063	-> 305
/*     */     //   #1070	-> 311
/*     */     //   #1062	-> 312
/*     */     //   #1062	-> 323
/*     */     //   #1072	-> 325
/*     */     //   #1073	-> 346
/*     */     //   #1072	-> 348
/*     */     //   #1073	-> 351
/*     */     //   #1072	-> 353
/*     */     //   #1073	-> 356
/*     */     //   #1072	-> 358
/*     */     //   #1073	-> 361
/*     */     //   #1072	-> 363
/*     */     //   #1074	-> 366
/*     */     //   #1072	-> 368
/*     */     //   #1074	-> 371
/*     */     //   #1072	-> 373
/*     */     //   #1074	-> 376
/*     */     //   #1072	-> 378
/*     */     //   #1074	-> 381
/*     */     //   #1072	-> 383
/*     */     //   #1049	-> 389
/*     */     //   #1075	-> 392
/*     */     //   #1076	-> 393
/*     */     //   #246	-> 394
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	4	8	$i$f$getEffect-HpuvwBQ	I
/*     */     //   44	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$SideEffect;
/*     */     //   37	19	6	$i$a$-push-ChangeList$pushSideEffect$1	I
/*     */     //   34	22	5	$this$pushSideEffect_u24lambda_u2417	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   149	47	19	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   146	50	18	arg$iv	I
/*     */     //   126	77	15	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   123	80	14	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   258	47	22	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   255	50	20	arg$iv	I
/*     */     //   235	77	17	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   232	80	16	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   107	282	11	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   110	279	12	missingIntCount$iv	I
/*     */     //   216	173	21	missingInts$iv	Ljava/lang/String;
/*     */     //   219	170	13	missingObjectCount$iv	I
/*     */     //   325	64	14	missingObjects$iv	Ljava/lang/String;
/*     */     //   98	295	10	$i$f$checkPrecondition	I
/*     */     //   95	298	9	value$iv$iv	Z
/*     */     //   22	372	4	$i$f$push	I
/*     */     //   19	375	2	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   19	375	3	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	395	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	395	1	effect	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushDetermineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'effectiveNodeIndexOut'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'anchor'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_0
/*     */     //   14: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   17: astore_3
/*     */     //   18: getstatic androidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex.INSTANCE : Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;
/*     */     //   21: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   24: astore #4
/*     */     //   26: iconst_0
/*     */     //   27: istore #5
/*     */     //   29: nop
/*     */     //   30: aload_3
/*     */     //   31: aload #4
/*     */     //   33: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   36: aload_3
/*     */     //   37: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   40: astore #6
/*     */     //   42: iconst_0
/*     */     //   43: istore #7
/*     */     //   45: aload #6
/*     */     //   47: getstatic androidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex.INSTANCE : Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;
/*     */     //   50: astore #8
/*     */     //   52: iconst_0
/*     */     //   53: istore #9
/*     */     //   55: iconst_0
/*     */     //   56: invokestatic constructor-impl : (I)I
/*     */     //   59: aload_1
/*     */     //   60: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   63: aload #6
/*     */     //   65: getstatic androidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex.INSTANCE : Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;
/*     */     //   68: astore #8
/*     */     //   70: iconst_0
/*     */     //   71: istore #9
/*     */     //   73: iconst_1
/*     */     //   74: invokestatic constructor-impl : (I)I
/*     */     //   77: aload_2
/*     */     //   78: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   81: nop
/*     */     //   82: nop
/*     */     //   83: aload_3
/*     */     //   84: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   87: aload_3
/*     */     //   88: aload #4
/*     */     //   90: invokevirtual getInts : ()I
/*     */     //   93: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   96: if_icmpne -> 119
/*     */     //   99: aload_3
/*     */     //   100: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   103: aload_3
/*     */     //   104: aload #4
/*     */     //   106: invokevirtual getObjects : ()I
/*     */     //   109: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   112: if_icmpne -> 119
/*     */     //   115: iconst_1
/*     */     //   116: goto -> 120
/*     */     //   119: iconst_0
/*     */     //   120: istore #10
/*     */     //   122: nop
/*     */     //   123: iconst_0
/*     */     //   124: istore #11
/*     */     //   126: nop
/*     */     //   127: iload #10
/*     */     //   129: ifne -> 425
/*     */     //   132: iconst_0
/*     */     //   133: istore #12
/*     */     //   135: iconst_0
/*     */     //   136: istore #13
/*     */     //   138: new java/lang/StringBuilder
/*     */     //   141: dup
/*     */     //   142: invokespecial <init> : ()V
/*     */     //   145: astore #14
/*     */     //   147: aload #14
/*     */     //   149: astore #15
/*     */     //   151: iconst_0
/*     */     //   152: istore #16
/*     */     //   154: aload #4
/*     */     //   156: invokevirtual getInts : ()I
/*     */     //   159: istore #17
/*     */     //   161: iconst_0
/*     */     //   162: istore #18
/*     */     //   164: iload #18
/*     */     //   166: iload #17
/*     */     //   168: if_icmpge -> 232
/*     */     //   171: iload #18
/*     */     //   173: istore #19
/*     */     //   175: iconst_0
/*     */     //   176: istore #20
/*     */     //   178: iconst_1
/*     */     //   179: iload #19
/*     */     //   181: ishl
/*     */     //   182: aload_3
/*     */     //   183: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   186: iand
/*     */     //   187: ifeq -> 225
/*     */     //   190: iload #13
/*     */     //   192: ifle -> 203
/*     */     //   195: aload #15
/*     */     //   197: ldc ', '
/*     */     //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   202: pop
/*     */     //   203: aload #15
/*     */     //   205: aload #4
/*     */     //   207: iload #19
/*     */     //   209: invokestatic constructor-impl : (I)I
/*     */     //   212: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   218: pop
/*     */     //   219: iload #13
/*     */     //   221: iconst_1
/*     */     //   222: iadd
/*     */     //   223: istore #13
/*     */     //   225: nop
/*     */     //   226: iinc #18, 1
/*     */     //   229: goto -> 164
/*     */     //   232: nop
/*     */     //   233: aload #14
/*     */     //   235: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   238: dup
/*     */     //   239: ldc 'toString(...)'
/*     */     //   241: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   244: astore #22
/*     */     //   246: iconst_0
/*     */     //   247: istore #14
/*     */     //   249: new java/lang/StringBuilder
/*     */     //   252: dup
/*     */     //   253: invokespecial <init> : ()V
/*     */     //   256: astore #16
/*     */     //   258: aload #16
/*     */     //   260: astore #17
/*     */     //   262: iconst_0
/*     */     //   263: istore #18
/*     */     //   265: aload #4
/*     */     //   267: invokevirtual getObjects : ()I
/*     */     //   270: istore #19
/*     */     //   272: iconst_0
/*     */     //   273: istore #20
/*     */     //   275: iload #20
/*     */     //   277: iload #19
/*     */     //   279: if_icmpge -> 343
/*     */     //   282: iload #20
/*     */     //   284: istore #21
/*     */     //   286: iconst_0
/*     */     //   287: istore #23
/*     */     //   289: iconst_1
/*     */     //   290: iload #21
/*     */     //   292: ishl
/*     */     //   293: aload_3
/*     */     //   294: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   297: iand
/*     */     //   298: ifeq -> 336
/*     */     //   301: iload #13
/*     */     //   303: ifle -> 314
/*     */     //   306: aload #17
/*     */     //   308: ldc ', '
/*     */     //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   313: pop
/*     */     //   314: aload #17
/*     */     //   316: aload #4
/*     */     //   318: iload #21
/*     */     //   320: invokestatic constructor-impl : (I)I
/*     */     //   323: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   329: pop
/*     */     //   330: iload #14
/*     */     //   332: iconst_1
/*     */     //   333: iadd
/*     */     //   334: istore #14
/*     */     //   336: nop
/*     */     //   337: iinc #20, 1
/*     */     //   340: goto -> 275
/*     */     //   343: nop
/*     */     //   344: aload #16
/*     */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   349: dup
/*     */     //   350: ldc 'toString(...)'
/*     */     //   352: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   355: astore #15
/*     */     //   357: new java/lang/StringBuilder
/*     */     //   360: dup
/*     */     //   361: invokespecial <init> : ()V
/*     */     //   364: ldc 'Error while pushing '
/*     */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   369: aload #4
/*     */     //   371: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   374: ldc '. Not all arguments were provided. Missing '
/*     */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   379: iload #13
/*     */     //   381: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   384: ldc ' int arguments ('
/*     */     //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   389: aload #22
/*     */     //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   394: ldc ') and '
/*     */     //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   399: iload #14
/*     */     //   401: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   404: ldc ' object arguments ('
/*     */     //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   409: aload #15
/*     */     //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   414: ldc ').'
/*     */     //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   419: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   422: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   425: nop
/*     */     //   426: nop
/*     */     //   427: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #252	-> 13
/*     */     //   #1077	-> 29
/*     */     //   #1080	-> 30
/*     */     //   #1081	-> 36
/*     */     //   #253	-> 45
/*     */     //   #1082	-> 55
/*     */     //   #253	-> 59
/*     */     //   #254	-> 63
/*     */     //   #1083	-> 73
/*     */     //   #254	-> 77
/*     */     //   #255	-> 81
/*     */     //   #1081	-> 82
/*     */     //   #1084	-> 83
/*     */     //   #1085	-> 99
/*     */     //   #1086	-> 122
/*     */     //   #1087	-> 126
/*     */     //   #1090	-> 127
/*     */     //   #1091	-> 132
/*     */     //   #1092	-> 135
/*     */     //   #1093	-> 138
/*     */     //   #1094	-> 154
/*     */     //   #1095	-> 178
/*     */     //   #1096	-> 190
/*     */     //   #1097	-> 203
/*     */     //   #1098	-> 219
/*     */     //   #1100	-> 225
/*     */     //   #1094	-> 226
/*     */     //   #1101	-> 232
/*     */     //   #1093	-> 233
/*     */     //   #1093	-> 244
/*     */     //   #1103	-> 246
/*     */     //   #1104	-> 249
/*     */     //   #1105	-> 265
/*     */     //   #1106	-> 289
/*     */     //   #1107	-> 301
/*     */     //   #1108	-> 314
/*     */     //   #1109	-> 330
/*     */     //   #1111	-> 336
/*     */     //   #1105	-> 337
/*     */     //   #1112	-> 343
/*     */     //   #1104	-> 344
/*     */     //   #1104	-> 355
/*     */     //   #1114	-> 357
/*     */     //   #1115	-> 379
/*     */     //   #1114	-> 381
/*     */     //   #1115	-> 384
/*     */     //   #1114	-> 386
/*     */     //   #1115	-> 389
/*     */     //   #1114	-> 391
/*     */     //   #1115	-> 394
/*     */     //   #1114	-> 396
/*     */     //   #1116	-> 399
/*     */     //   #1114	-> 401
/*     */     //   #1116	-> 404
/*     */     //   #1114	-> 406
/*     */     //   #1116	-> 409
/*     */     //   #1114	-> 411
/*     */     //   #1116	-> 414
/*     */     //   #1114	-> 416
/*     */     //   #1091	-> 422
/*     */     //   #1117	-> 425
/*     */     //   #1118	-> 426
/*     */     //   #256	-> 427
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	4	9	$i$f$getEffectiveNodeIndexOut-HpuvwBQ	I
/*     */     //   52	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;
/*     */     //   73	4	9	$i$f$getAnchor-HpuvwBQ	I
/*     */     //   70	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;
/*     */     //   45	37	7	$i$a$-push-ChangeList$pushDetermineMovableContentNodeIndex$1	I
/*     */     //   42	40	6	$this$pushDetermineMovableContentNodeIndex_u24lambda_u2418	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   178	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   175	51	19	arg$iv	I
/*     */     //   154	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   151	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   289	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   286	51	21	arg$iv	I
/*     */     //   265	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   262	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   135	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   138	284	13	missingIntCount$iv	I
/*     */     //   246	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   249	173	14	missingObjectCount$iv	I
/*     */     //   357	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   126	300	11	$i$f$checkPrecondition	I
/*     */     //   123	303	10	value$iv$iv	Z
/*     */     //   29	398	5	$i$f$push	I
/*     */     //   26	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   26	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	428	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	428	1	effectiveNodeIndexOut	Landroidx/compose/runtime/internal/IntRef;
/*     */     //   0	428	2	anchor	Landroidx/compose/runtime/Anchor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushCopyNodesToNewAnchorLocation(@NotNull List nodes, @NotNull IntRef effectiveNodeIndex) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'nodes'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'effectiveNodeIndex'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_1
/*     */     //   15: checkcast java/util/Collection
/*     */     //   18: invokeinterface isEmpty : ()Z
/*     */     //   23: ifne -> 30
/*     */     //   26: iconst_1
/*     */     //   27: goto -> 31
/*     */     //   30: iconst_0
/*     */     //   31: ifeq -> 448
/*     */     //   34: aload_0
/*     */     //   35: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   38: astore_3
/*     */     //   39: getstatic androidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;
/*     */     //   42: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   45: astore #4
/*     */     //   47: iconst_0
/*     */     //   48: istore #5
/*     */     //   50: nop
/*     */     //   51: aload_3
/*     */     //   52: aload #4
/*     */     //   54: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   57: aload_3
/*     */     //   58: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   61: astore #6
/*     */     //   63: iconst_0
/*     */     //   64: istore #7
/*     */     //   66: aload #6
/*     */     //   68: getstatic androidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;
/*     */     //   71: astore #8
/*     */     //   73: iconst_0
/*     */     //   74: istore #9
/*     */     //   76: iconst_1
/*     */     //   77: invokestatic constructor-impl : (I)I
/*     */     //   80: aload_1
/*     */     //   81: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   84: aload #6
/*     */     //   86: getstatic androidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;
/*     */     //   89: astore #8
/*     */     //   91: iconst_0
/*     */     //   92: istore #9
/*     */     //   94: iconst_0
/*     */     //   95: invokestatic constructor-impl : (I)I
/*     */     //   98: aload_2
/*     */     //   99: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   102: nop
/*     */     //   103: nop
/*     */     //   104: aload_3
/*     */     //   105: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   108: aload_3
/*     */     //   109: aload #4
/*     */     //   111: invokevirtual getInts : ()I
/*     */     //   114: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   117: if_icmpne -> 140
/*     */     //   120: aload_3
/*     */     //   121: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   124: aload_3
/*     */     //   125: aload #4
/*     */     //   127: invokevirtual getObjects : ()I
/*     */     //   130: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   133: if_icmpne -> 140
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 141
/*     */     //   140: iconst_0
/*     */     //   141: istore #10
/*     */     //   143: nop
/*     */     //   144: iconst_0
/*     */     //   145: istore #11
/*     */     //   147: nop
/*     */     //   148: iload #10
/*     */     //   150: ifne -> 446
/*     */     //   153: iconst_0
/*     */     //   154: istore #12
/*     */     //   156: iconst_0
/*     */     //   157: istore #13
/*     */     //   159: new java/lang/StringBuilder
/*     */     //   162: dup
/*     */     //   163: invokespecial <init> : ()V
/*     */     //   166: astore #14
/*     */     //   168: aload #14
/*     */     //   170: astore #15
/*     */     //   172: iconst_0
/*     */     //   173: istore #16
/*     */     //   175: aload #4
/*     */     //   177: invokevirtual getInts : ()I
/*     */     //   180: istore #17
/*     */     //   182: iconst_0
/*     */     //   183: istore #18
/*     */     //   185: iload #18
/*     */     //   187: iload #17
/*     */     //   189: if_icmpge -> 253
/*     */     //   192: iload #18
/*     */     //   194: istore #19
/*     */     //   196: iconst_0
/*     */     //   197: istore #20
/*     */     //   199: iconst_1
/*     */     //   200: iload #19
/*     */     //   202: ishl
/*     */     //   203: aload_3
/*     */     //   204: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   207: iand
/*     */     //   208: ifeq -> 246
/*     */     //   211: iload #13
/*     */     //   213: ifle -> 224
/*     */     //   216: aload #15
/*     */     //   218: ldc ', '
/*     */     //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   223: pop
/*     */     //   224: aload #15
/*     */     //   226: aload #4
/*     */     //   228: iload #19
/*     */     //   230: invokestatic constructor-impl : (I)I
/*     */     //   233: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   239: pop
/*     */     //   240: iload #13
/*     */     //   242: iconst_1
/*     */     //   243: iadd
/*     */     //   244: istore #13
/*     */     //   246: nop
/*     */     //   247: iinc #18, 1
/*     */     //   250: goto -> 185
/*     */     //   253: nop
/*     */     //   254: aload #14
/*     */     //   256: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   259: dup
/*     */     //   260: ldc 'toString(...)'
/*     */     //   262: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   265: astore #22
/*     */     //   267: iconst_0
/*     */     //   268: istore #14
/*     */     //   270: new java/lang/StringBuilder
/*     */     //   273: dup
/*     */     //   274: invokespecial <init> : ()V
/*     */     //   277: astore #16
/*     */     //   279: aload #16
/*     */     //   281: astore #17
/*     */     //   283: iconst_0
/*     */     //   284: istore #18
/*     */     //   286: aload #4
/*     */     //   288: invokevirtual getObjects : ()I
/*     */     //   291: istore #19
/*     */     //   293: iconst_0
/*     */     //   294: istore #20
/*     */     //   296: iload #20
/*     */     //   298: iload #19
/*     */     //   300: if_icmpge -> 364
/*     */     //   303: iload #20
/*     */     //   305: istore #21
/*     */     //   307: iconst_0
/*     */     //   308: istore #23
/*     */     //   310: iconst_1
/*     */     //   311: iload #21
/*     */     //   313: ishl
/*     */     //   314: aload_3
/*     */     //   315: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   318: iand
/*     */     //   319: ifeq -> 357
/*     */     //   322: iload #13
/*     */     //   324: ifle -> 335
/*     */     //   327: aload #17
/*     */     //   329: ldc ', '
/*     */     //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   334: pop
/*     */     //   335: aload #17
/*     */     //   337: aload #4
/*     */     //   339: iload #21
/*     */     //   341: invokestatic constructor-impl : (I)I
/*     */     //   344: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   350: pop
/*     */     //   351: iload #14
/*     */     //   353: iconst_1
/*     */     //   354: iadd
/*     */     //   355: istore #14
/*     */     //   357: nop
/*     */     //   358: iinc #20, 1
/*     */     //   361: goto -> 296
/*     */     //   364: nop
/*     */     //   365: aload #16
/*     */     //   367: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   370: dup
/*     */     //   371: ldc 'toString(...)'
/*     */     //   373: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   376: astore #15
/*     */     //   378: new java/lang/StringBuilder
/*     */     //   381: dup
/*     */     //   382: invokespecial <init> : ()V
/*     */     //   385: ldc 'Error while pushing '
/*     */     //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   390: aload #4
/*     */     //   392: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   395: ldc '. Not all arguments were provided. Missing '
/*     */     //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   400: iload #13
/*     */     //   402: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   405: ldc ' int arguments ('
/*     */     //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   410: aload #22
/*     */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   415: ldc ') and '
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   420: iload #14
/*     */     //   422: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   425: ldc ' object arguments ('
/*     */     //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   430: aload #15
/*     */     //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   435: ldc ').'
/*     */     //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   440: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   443: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   446: nop
/*     */     //   447: nop
/*     */     //   448: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #262	-> 14
/*     */     //   #262	-> 31
/*     */     //   #263	-> 34
/*     */     //   #1119	-> 50
/*     */     //   #1122	-> 51
/*     */     //   #1123	-> 57
/*     */     //   #264	-> 66
/*     */     //   #1124	-> 76
/*     */     //   #264	-> 80
/*     */     //   #265	-> 84
/*     */     //   #1125	-> 94
/*     */     //   #265	-> 98
/*     */     //   #266	-> 102
/*     */     //   #1123	-> 103
/*     */     //   #1126	-> 104
/*     */     //   #1127	-> 120
/*     */     //   #1128	-> 143
/*     */     //   #1129	-> 147
/*     */     //   #1132	-> 148
/*     */     //   #1133	-> 153
/*     */     //   #1134	-> 156
/*     */     //   #1135	-> 159
/*     */     //   #1136	-> 175
/*     */     //   #1137	-> 199
/*     */     //   #1138	-> 211
/*     */     //   #1139	-> 224
/*     */     //   #1140	-> 240
/*     */     //   #1142	-> 246
/*     */     //   #1136	-> 247
/*     */     //   #1143	-> 253
/*     */     //   #1135	-> 254
/*     */     //   #1135	-> 265
/*     */     //   #1145	-> 267
/*     */     //   #1146	-> 270
/*     */     //   #1147	-> 286
/*     */     //   #1148	-> 310
/*     */     //   #1149	-> 322
/*     */     //   #1150	-> 335
/*     */     //   #1151	-> 351
/*     */     //   #1153	-> 357
/*     */     //   #1147	-> 358
/*     */     //   #1154	-> 364
/*     */     //   #1146	-> 365
/*     */     //   #1146	-> 376
/*     */     //   #1156	-> 378
/*     */     //   #1157	-> 400
/*     */     //   #1156	-> 402
/*     */     //   #1157	-> 405
/*     */     //   #1156	-> 407
/*     */     //   #1157	-> 410
/*     */     //   #1156	-> 412
/*     */     //   #1157	-> 415
/*     */     //   #1156	-> 417
/*     */     //   #1158	-> 420
/*     */     //   #1156	-> 422
/*     */     //   #1158	-> 425
/*     */     //   #1156	-> 427
/*     */     //   #1158	-> 430
/*     */     //   #1156	-> 432
/*     */     //   #1158	-> 435
/*     */     //   #1156	-> 437
/*     */     //   #1133	-> 443
/*     */     //   #1159	-> 446
/*     */     //   #1160	-> 447
/*     */     //   #268	-> 448
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   76	4	9	$i$f$getNodes-HpuvwBQ	I
/*     */     //   73	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;
/*     */     //   94	4	9	$i$f$getEffectiveNodeIndex-HpuvwBQ	I
/*     */     //   91	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;
/*     */     //   66	37	7	$i$a$-push-ChangeList$pushCopyNodesToNewAnchorLocation$1	I
/*     */     //   63	40	6	$this$pushCopyNodesToNewAnchorLocation_u24lambda_u2419	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   199	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   196	51	19	arg$iv	I
/*     */     //   175	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   172	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   310	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   307	51	21	arg$iv	I
/*     */     //   286	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   283	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   156	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   159	284	13	missingIntCount$iv	I
/*     */     //   267	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   270	173	14	missingObjectCount$iv	I
/*     */     //   378	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   147	300	11	$i$f$checkPrecondition	I
/*     */     //   144	303	10	value$iv$iv	Z
/*     */     //   50	398	5	$i$f$push	I
/*     */     //   47	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   47	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	449	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	449	1	nodes	Ljava/util/List;
/*     */     //   0	449	2	effectiveNodeIndex	Landroidx/compose/runtime/internal/IntRef;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushCopySlotTableToAnchorLocation(@Nullable MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'parentContext'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc_w 'from'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #4
/*     */     //   16: ldc_w 'to'
/*     */     //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   22: aload_0
/*     */     //   23: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   26: astore #5
/*     */     //   28: getstatic androidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   31: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   34: astore #6
/*     */     //   36: iconst_0
/*     */     //   37: istore #7
/*     */     //   39: nop
/*     */     //   40: aload #5
/*     */     //   42: aload #6
/*     */     //   44: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   47: aload #5
/*     */     //   49: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   52: astore #8
/*     */     //   54: iconst_0
/*     */     //   55: istore #9
/*     */     //   57: aload #8
/*     */     //   59: getstatic androidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   62: astore #10
/*     */     //   64: iconst_0
/*     */     //   65: istore #11
/*     */     //   67: iconst_0
/*     */     //   68: invokestatic constructor-impl : (I)I
/*     */     //   71: aload_1
/*     */     //   72: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   75: aload #8
/*     */     //   77: getstatic androidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   80: astore #10
/*     */     //   82: iconst_0
/*     */     //   83: istore #11
/*     */     //   85: iconst_1
/*     */     //   86: invokestatic constructor-impl : (I)I
/*     */     //   89: aload_2
/*     */     //   90: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   93: aload #8
/*     */     //   95: getstatic androidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   98: astore #10
/*     */     //   100: iconst_0
/*     */     //   101: istore #11
/*     */     //   103: iconst_3
/*     */     //   104: invokestatic constructor-impl : (I)I
/*     */     //   107: aload #4
/*     */     //   109: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   112: aload #8
/*     */     //   114: getstatic androidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation.INSTANCE : Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   117: astore #10
/*     */     //   119: iconst_0
/*     */     //   120: istore #11
/*     */     //   122: iconst_2
/*     */     //   123: invokestatic constructor-impl : (I)I
/*     */     //   126: aload_3
/*     */     //   127: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   130: nop
/*     */     //   131: nop
/*     */     //   132: aload #5
/*     */     //   134: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   137: aload #5
/*     */     //   139: aload #6
/*     */     //   141: invokevirtual getInts : ()I
/*     */     //   144: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   147: if_icmpne -> 172
/*     */     //   150: aload #5
/*     */     //   152: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   155: aload #5
/*     */     //   157: aload #6
/*     */     //   159: invokevirtual getObjects : ()I
/*     */     //   162: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   165: if_icmpne -> 172
/*     */     //   168: iconst_1
/*     */     //   169: goto -> 173
/*     */     //   172: iconst_0
/*     */     //   173: istore #12
/*     */     //   175: nop
/*     */     //   176: iconst_0
/*     */     //   177: istore #13
/*     */     //   179: nop
/*     */     //   180: iload #12
/*     */     //   182: ifne -> 480
/*     */     //   185: iconst_0
/*     */     //   186: istore #14
/*     */     //   188: iconst_0
/*     */     //   189: istore #15
/*     */     //   191: new java/lang/StringBuilder
/*     */     //   194: dup
/*     */     //   195: invokespecial <init> : ()V
/*     */     //   198: astore #16
/*     */     //   200: aload #16
/*     */     //   202: astore #17
/*     */     //   204: iconst_0
/*     */     //   205: istore #18
/*     */     //   207: aload #6
/*     */     //   209: invokevirtual getInts : ()I
/*     */     //   212: istore #19
/*     */     //   214: iconst_0
/*     */     //   215: istore #20
/*     */     //   217: iload #20
/*     */     //   219: iload #19
/*     */     //   221: if_icmpge -> 286
/*     */     //   224: iload #20
/*     */     //   226: istore #21
/*     */     //   228: iconst_0
/*     */     //   229: istore #22
/*     */     //   231: iconst_1
/*     */     //   232: iload #21
/*     */     //   234: ishl
/*     */     //   235: aload #5
/*     */     //   237: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   240: iand
/*     */     //   241: ifeq -> 279
/*     */     //   244: iload #15
/*     */     //   246: ifle -> 257
/*     */     //   249: aload #17
/*     */     //   251: ldc ', '
/*     */     //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   256: pop
/*     */     //   257: aload #17
/*     */     //   259: aload #6
/*     */     //   261: iload #21
/*     */     //   263: invokestatic constructor-impl : (I)I
/*     */     //   266: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   272: pop
/*     */     //   273: iload #15
/*     */     //   275: iconst_1
/*     */     //   276: iadd
/*     */     //   277: istore #15
/*     */     //   279: nop
/*     */     //   280: iinc #20, 1
/*     */     //   283: goto -> 217
/*     */     //   286: nop
/*     */     //   287: aload #16
/*     */     //   289: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   292: dup
/*     */     //   293: ldc 'toString(...)'
/*     */     //   295: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   298: astore #24
/*     */     //   300: iconst_0
/*     */     //   301: istore #16
/*     */     //   303: new java/lang/StringBuilder
/*     */     //   306: dup
/*     */     //   307: invokespecial <init> : ()V
/*     */     //   310: astore #18
/*     */     //   312: aload #18
/*     */     //   314: astore #19
/*     */     //   316: iconst_0
/*     */     //   317: istore #20
/*     */     //   319: aload #6
/*     */     //   321: invokevirtual getObjects : ()I
/*     */     //   324: istore #21
/*     */     //   326: iconst_0
/*     */     //   327: istore #22
/*     */     //   329: iload #22
/*     */     //   331: iload #21
/*     */     //   333: if_icmpge -> 398
/*     */     //   336: iload #22
/*     */     //   338: istore #23
/*     */     //   340: iconst_0
/*     */     //   341: istore #25
/*     */     //   343: iconst_1
/*     */     //   344: iload #23
/*     */     //   346: ishl
/*     */     //   347: aload #5
/*     */     //   349: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   352: iand
/*     */     //   353: ifeq -> 391
/*     */     //   356: iload #15
/*     */     //   358: ifle -> 369
/*     */     //   361: aload #19
/*     */     //   363: ldc ', '
/*     */     //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   368: pop
/*     */     //   369: aload #19
/*     */     //   371: aload #6
/*     */     //   373: iload #23
/*     */     //   375: invokestatic constructor-impl : (I)I
/*     */     //   378: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   384: pop
/*     */     //   385: iload #16
/*     */     //   387: iconst_1
/*     */     //   388: iadd
/*     */     //   389: istore #16
/*     */     //   391: nop
/*     */     //   392: iinc #22, 1
/*     */     //   395: goto -> 329
/*     */     //   398: nop
/*     */     //   399: aload #18
/*     */     //   401: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   404: dup
/*     */     //   405: ldc 'toString(...)'
/*     */     //   407: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   410: astore #17
/*     */     //   412: new java/lang/StringBuilder
/*     */     //   415: dup
/*     */     //   416: invokespecial <init> : ()V
/*     */     //   419: ldc 'Error while pushing '
/*     */     //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   424: aload #6
/*     */     //   426: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   429: ldc '. Not all arguments were provided. Missing '
/*     */     //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   434: iload #15
/*     */     //   436: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   439: ldc ' int arguments ('
/*     */     //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   444: aload #24
/*     */     //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   449: ldc ') and '
/*     */     //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   454: iload #16
/*     */     //   456: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   459: ldc ' object arguments ('
/*     */     //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   464: aload #17
/*     */     //   466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   469: ldc ').'
/*     */     //   471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   474: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   477: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   480: nop
/*     */     //   481: nop
/*     */     //   482: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #277	-> 22
/*     */     //   #1161	-> 39
/*     */     //   #1164	-> 40
/*     */     //   #1165	-> 47
/*     */     //   #278	-> 57
/*     */     //   #1166	-> 67
/*     */     //   #278	-> 71
/*     */     //   #279	-> 75
/*     */     //   #1167	-> 85
/*     */     //   #279	-> 89
/*     */     //   #280	-> 93
/*     */     //   #1168	-> 103
/*     */     //   #280	-> 107
/*     */     //   #281	-> 112
/*     */     //   #1169	-> 122
/*     */     //   #281	-> 126
/*     */     //   #282	-> 130
/*     */     //   #1165	-> 131
/*     */     //   #1170	-> 132
/*     */     //   #1171	-> 150
/*     */     //   #1172	-> 175
/*     */     //   #1173	-> 179
/*     */     //   #1176	-> 180
/*     */     //   #1177	-> 185
/*     */     //   #1178	-> 188
/*     */     //   #1179	-> 191
/*     */     //   #1180	-> 207
/*     */     //   #1181	-> 231
/*     */     //   #1182	-> 244
/*     */     //   #1183	-> 257
/*     */     //   #1184	-> 273
/*     */     //   #1186	-> 279
/*     */     //   #1180	-> 280
/*     */     //   #1187	-> 286
/*     */     //   #1179	-> 287
/*     */     //   #1179	-> 298
/*     */     //   #1189	-> 300
/*     */     //   #1190	-> 303
/*     */     //   #1191	-> 319
/*     */     //   #1192	-> 343
/*     */     //   #1193	-> 356
/*     */     //   #1194	-> 369
/*     */     //   #1195	-> 385
/*     */     //   #1197	-> 391
/*     */     //   #1191	-> 392
/*     */     //   #1198	-> 398
/*     */     //   #1190	-> 399
/*     */     //   #1190	-> 410
/*     */     //   #1200	-> 412
/*     */     //   #1201	-> 434
/*     */     //   #1200	-> 436
/*     */     //   #1201	-> 439
/*     */     //   #1200	-> 441
/*     */     //   #1201	-> 444
/*     */     //   #1200	-> 446
/*     */     //   #1201	-> 449
/*     */     //   #1200	-> 451
/*     */     //   #1202	-> 454
/*     */     //   #1200	-> 456
/*     */     //   #1202	-> 459
/*     */     //   #1200	-> 461
/*     */     //   #1202	-> 464
/*     */     //   #1200	-> 466
/*     */     //   #1202	-> 469
/*     */     //   #1200	-> 471
/*     */     //   #1177	-> 477
/*     */     //   #1203	-> 480
/*     */     //   #1204	-> 481
/*     */     //   #283	-> 482
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   67	4	11	$i$f$getResolvedState-HpuvwBQ	I
/*     */     //   64	7	10	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   85	4	11	$i$f$getParentCompositionContext-HpuvwBQ	I
/*     */     //   82	7	10	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   103	4	11	$i$f$getTo-HpuvwBQ	I
/*     */     //   100	7	10	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   122	4	11	$i$f$getFrom-HpuvwBQ	I
/*     */     //   119	7	10	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*     */     //   57	74	9	$i$a$-push-ChangeList$pushCopySlotTableToAnchorLocation$1	I
/*     */     //   54	77	8	$this$pushCopySlotTableToAnchorLocation_u24lambda_u2420	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   231	49	22	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   228	52	21	arg$iv	I
/*     */     //   207	80	18	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   204	83	17	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   343	49	25	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   340	52	23	arg$iv	I
/*     */     //   319	80	20	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   316	83	19	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   188	289	14	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   191	286	15	missingIntCount$iv	I
/*     */     //   300	177	24	missingInts$iv	Ljava/lang/String;
/*     */     //   303	174	16	missingObjectCount$iv	I
/*     */     //   412	65	17	missingObjects$iv	Ljava/lang/String;
/*     */     //   179	302	13	$i$f$checkPrecondition	I
/*     */     //   176	305	12	value$iv$iv	Z
/*     */     //   39	443	7	$i$f$push	I
/*     */     //   36	446	5	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   36	446	6	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	483	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	483	1	resolvedState	Landroidx/compose/runtime/MovableContentState;
/*     */     //   0	483	2	parentContext	Landroidx/compose/runtime/CompositionContext;
/*     */     //   0	483	3	from	Landroidx/compose/runtime/MovableContentStateReference;
/*     */     //   0	483	4	to	Landroidx/compose/runtime/MovableContentStateReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushReleaseMovableGroupAtCurrent(@NotNull ControlledComposition composition, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference reference) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'composition'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'parentContext'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w 'reference'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_0
/*     */     //   22: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: astore #4
/*     */     //   27: getstatic androidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   30: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   33: astore #5
/*     */     //   35: iconst_0
/*     */     //   36: istore #6
/*     */     //   38: nop
/*     */     //   39: aload #4
/*     */     //   41: aload #5
/*     */     //   43: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   46: aload #4
/*     */     //   48: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   51: astore #7
/*     */     //   53: iconst_0
/*     */     //   54: istore #8
/*     */     //   56: aload #7
/*     */     //   58: getstatic androidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   61: astore #9
/*     */     //   63: iconst_0
/*     */     //   64: istore #10
/*     */     //   66: iconst_0
/*     */     //   67: invokestatic constructor-impl : (I)I
/*     */     //   70: aload_1
/*     */     //   71: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   74: aload #7
/*     */     //   76: getstatic androidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   79: astore #9
/*     */     //   81: iconst_0
/*     */     //   82: istore #10
/*     */     //   84: iconst_1
/*     */     //   85: invokestatic constructor-impl : (I)I
/*     */     //   88: aload_2
/*     */     //   89: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   92: aload #7
/*     */     //   94: getstatic androidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   97: astore #9
/*     */     //   99: iconst_0
/*     */     //   100: istore #10
/*     */     //   102: iconst_2
/*     */     //   103: invokestatic constructor-impl : (I)I
/*     */     //   106: aload_3
/*     */     //   107: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   110: nop
/*     */     //   111: nop
/*     */     //   112: aload #4
/*     */     //   114: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   117: aload #4
/*     */     //   119: aload #5
/*     */     //   121: invokevirtual getInts : ()I
/*     */     //   124: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   127: if_icmpne -> 152
/*     */     //   130: aload #4
/*     */     //   132: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   135: aload #4
/*     */     //   137: aload #5
/*     */     //   139: invokevirtual getObjects : ()I
/*     */     //   142: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   145: if_icmpne -> 152
/*     */     //   148: iconst_1
/*     */     //   149: goto -> 153
/*     */     //   152: iconst_0
/*     */     //   153: istore #11
/*     */     //   155: nop
/*     */     //   156: iconst_0
/*     */     //   157: istore #12
/*     */     //   159: nop
/*     */     //   160: iload #11
/*     */     //   162: ifne -> 460
/*     */     //   165: iconst_0
/*     */     //   166: istore #13
/*     */     //   168: iconst_0
/*     */     //   169: istore #14
/*     */     //   171: new java/lang/StringBuilder
/*     */     //   174: dup
/*     */     //   175: invokespecial <init> : ()V
/*     */     //   178: astore #15
/*     */     //   180: aload #15
/*     */     //   182: astore #16
/*     */     //   184: iconst_0
/*     */     //   185: istore #17
/*     */     //   187: aload #5
/*     */     //   189: invokevirtual getInts : ()I
/*     */     //   192: istore #18
/*     */     //   194: iconst_0
/*     */     //   195: istore #19
/*     */     //   197: iload #19
/*     */     //   199: iload #18
/*     */     //   201: if_icmpge -> 266
/*     */     //   204: iload #19
/*     */     //   206: istore #20
/*     */     //   208: iconst_0
/*     */     //   209: istore #21
/*     */     //   211: iconst_1
/*     */     //   212: iload #20
/*     */     //   214: ishl
/*     */     //   215: aload #4
/*     */     //   217: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   220: iand
/*     */     //   221: ifeq -> 259
/*     */     //   224: iload #14
/*     */     //   226: ifle -> 237
/*     */     //   229: aload #16
/*     */     //   231: ldc ', '
/*     */     //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   236: pop
/*     */     //   237: aload #16
/*     */     //   239: aload #5
/*     */     //   241: iload #20
/*     */     //   243: invokestatic constructor-impl : (I)I
/*     */     //   246: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   252: pop
/*     */     //   253: iload #14
/*     */     //   255: iconst_1
/*     */     //   256: iadd
/*     */     //   257: istore #14
/*     */     //   259: nop
/*     */     //   260: iinc #19, 1
/*     */     //   263: goto -> 197
/*     */     //   266: nop
/*     */     //   267: aload #15
/*     */     //   269: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   272: dup
/*     */     //   273: ldc 'toString(...)'
/*     */     //   275: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   278: astore #23
/*     */     //   280: iconst_0
/*     */     //   281: istore #15
/*     */     //   283: new java/lang/StringBuilder
/*     */     //   286: dup
/*     */     //   287: invokespecial <init> : ()V
/*     */     //   290: astore #17
/*     */     //   292: aload #17
/*     */     //   294: astore #18
/*     */     //   296: iconst_0
/*     */     //   297: istore #19
/*     */     //   299: aload #5
/*     */     //   301: invokevirtual getObjects : ()I
/*     */     //   304: istore #20
/*     */     //   306: iconst_0
/*     */     //   307: istore #21
/*     */     //   309: iload #21
/*     */     //   311: iload #20
/*     */     //   313: if_icmpge -> 378
/*     */     //   316: iload #21
/*     */     //   318: istore #22
/*     */     //   320: iconst_0
/*     */     //   321: istore #24
/*     */     //   323: iconst_1
/*     */     //   324: iload #22
/*     */     //   326: ishl
/*     */     //   327: aload #4
/*     */     //   329: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   332: iand
/*     */     //   333: ifeq -> 371
/*     */     //   336: iload #14
/*     */     //   338: ifle -> 349
/*     */     //   341: aload #18
/*     */     //   343: ldc ', '
/*     */     //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   348: pop
/*     */     //   349: aload #18
/*     */     //   351: aload #5
/*     */     //   353: iload #22
/*     */     //   355: invokestatic constructor-impl : (I)I
/*     */     //   358: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   364: pop
/*     */     //   365: iload #15
/*     */     //   367: iconst_1
/*     */     //   368: iadd
/*     */     //   369: istore #15
/*     */     //   371: nop
/*     */     //   372: iinc #21, 1
/*     */     //   375: goto -> 309
/*     */     //   378: nop
/*     */     //   379: aload #17
/*     */     //   381: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   384: dup
/*     */     //   385: ldc 'toString(...)'
/*     */     //   387: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   390: astore #16
/*     */     //   392: new java/lang/StringBuilder
/*     */     //   395: dup
/*     */     //   396: invokespecial <init> : ()V
/*     */     //   399: ldc 'Error while pushing '
/*     */     //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   404: aload #5
/*     */     //   406: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   409: ldc '. Not all arguments were provided. Missing '
/*     */     //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   414: iload #14
/*     */     //   416: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   419: ldc ' int arguments ('
/*     */     //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   424: aload #23
/*     */     //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   429: ldc ') and '
/*     */     //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   434: iload #15
/*     */     //   436: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   439: ldc ' object arguments ('
/*     */     //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   444: aload #16
/*     */     //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   449: ldc ').'
/*     */     //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   454: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   457: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   460: nop
/*     */     //   461: nop
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #291	-> 21
/*     */     //   #1205	-> 38
/*     */     //   #1208	-> 39
/*     */     //   #1209	-> 46
/*     */     //   #292	-> 56
/*     */     //   #1210	-> 66
/*     */     //   #292	-> 70
/*     */     //   #293	-> 74
/*     */     //   #1211	-> 84
/*     */     //   #293	-> 88
/*     */     //   #294	-> 92
/*     */     //   #1212	-> 102
/*     */     //   #294	-> 106
/*     */     //   #295	-> 110
/*     */     //   #1209	-> 111
/*     */     //   #1213	-> 112
/*     */     //   #1214	-> 130
/*     */     //   #1215	-> 155
/*     */     //   #1216	-> 159
/*     */     //   #1219	-> 160
/*     */     //   #1220	-> 165
/*     */     //   #1221	-> 168
/*     */     //   #1222	-> 171
/*     */     //   #1223	-> 187
/*     */     //   #1224	-> 211
/*     */     //   #1225	-> 224
/*     */     //   #1226	-> 237
/*     */     //   #1227	-> 253
/*     */     //   #1229	-> 259
/*     */     //   #1223	-> 260
/*     */     //   #1230	-> 266
/*     */     //   #1222	-> 267
/*     */     //   #1222	-> 278
/*     */     //   #1232	-> 280
/*     */     //   #1233	-> 283
/*     */     //   #1234	-> 299
/*     */     //   #1235	-> 323
/*     */     //   #1236	-> 336
/*     */     //   #1237	-> 349
/*     */     //   #1238	-> 365
/*     */     //   #1240	-> 371
/*     */     //   #1234	-> 372
/*     */     //   #1241	-> 378
/*     */     //   #1233	-> 379
/*     */     //   #1233	-> 390
/*     */     //   #1243	-> 392
/*     */     //   #1244	-> 414
/*     */     //   #1243	-> 416
/*     */     //   #1244	-> 419
/*     */     //   #1243	-> 421
/*     */     //   #1244	-> 424
/*     */     //   #1243	-> 426
/*     */     //   #1244	-> 429
/*     */     //   #1243	-> 431
/*     */     //   #1245	-> 434
/*     */     //   #1243	-> 436
/*     */     //   #1245	-> 439
/*     */     //   #1243	-> 441
/*     */     //   #1245	-> 444
/*     */     //   #1243	-> 446
/*     */     //   #1245	-> 449
/*     */     //   #1243	-> 451
/*     */     //   #1220	-> 457
/*     */     //   #1246	-> 460
/*     */     //   #1247	-> 461
/*     */     //   #296	-> 462
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   66	4	10	$i$f$getComposition-HpuvwBQ	I
/*     */     //   63	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   84	4	10	$i$f$getParentCompositionContext-HpuvwBQ	I
/*     */     //   81	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   102	4	10	$i$f$getReference-HpuvwBQ	I
/*     */     //   99	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;
/*     */     //   56	55	8	$i$a$-push-ChangeList$pushReleaseMovableGroupAtCurrent$1	I
/*     */     //   53	58	7	$this$pushReleaseMovableGroupAtCurrent_u24lambda_u2421	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   211	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   208	52	20	arg$iv	I
/*     */     //   187	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   184	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   323	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   320	52	22	arg$iv	I
/*     */     //   299	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   296	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   168	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   171	286	14	missingIntCount$iv	I
/*     */     //   280	177	23	missingInts$iv	Ljava/lang/String;
/*     */     //   283	174	15	missingObjectCount$iv	I
/*     */     //   392	65	16	missingObjects$iv	Ljava/lang/String;
/*     */     //   159	302	12	$i$f$checkPrecondition	I
/*     */     //   156	305	11	value$iv$iv	Z
/*     */     //   38	424	6	$i$f$push	I
/*     */     //   35	427	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   35	427	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	463	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	463	1	composition	Landroidx/compose/runtime/ControlledComposition;
/*     */     //   0	463	2	parentContext	Landroidx/compose/runtime/CompositionContext;
/*     */     //   0	463	3	reference	Landroidx/compose/runtime/MovableContentStateReference;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushEndMovableContentPlacement() {
/* 299 */     this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void pushExecuteOperationsIn(@NotNull ChangeList changeList, @Nullable IntRef effectiveNodeIndex) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'changeList'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual isNotEmpty : ()Z
/*     */     //   11: ifeq -> 428
/*     */     //   14: aload_0
/*     */     //   15: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*     */     //   18: astore_3
/*     */     //   19: getstatic androidx/compose/runtime/changelist/Operation$ApplyChangeList.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;
/*     */     //   22: checkcast androidx/compose/runtime/changelist/Operation
/*     */     //   25: astore #4
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: nop
/*     */     //   31: aload_3
/*     */     //   32: aload #4
/*     */     //   34: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   37: aload_3
/*     */     //   38: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   41: astore #6
/*     */     //   43: iconst_0
/*     */     //   44: istore #7
/*     */     //   46: aload #6
/*     */     //   48: getstatic androidx/compose/runtime/changelist/Operation$ApplyChangeList.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;
/*     */     //   51: astore #8
/*     */     //   53: iconst_0
/*     */     //   54: istore #9
/*     */     //   56: iconst_0
/*     */     //   57: invokestatic constructor-impl : (I)I
/*     */     //   60: aload_1
/*     */     //   61: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   64: aload #6
/*     */     //   66: getstatic androidx/compose/runtime/changelist/Operation$ApplyChangeList.INSTANCE : Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;
/*     */     //   69: astore #8
/*     */     //   71: iconst_0
/*     */     //   72: istore #9
/*     */     //   74: iconst_1
/*     */     //   75: invokestatic constructor-impl : (I)I
/*     */     //   78: aload_2
/*     */     //   79: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*     */     //   82: nop
/*     */     //   83: nop
/*     */     //   84: aload_3
/*     */     //   85: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   88: aload_3
/*     */     //   89: aload #4
/*     */     //   91: invokevirtual getInts : ()I
/*     */     //   94: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   97: if_icmpne -> 120
/*     */     //   100: aload_3
/*     */     //   101: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   104: aload_3
/*     */     //   105: aload #4
/*     */     //   107: invokevirtual getObjects : ()I
/*     */     //   110: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   113: if_icmpne -> 120
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 121
/*     */     //   120: iconst_0
/*     */     //   121: istore #10
/*     */     //   123: nop
/*     */     //   124: iconst_0
/*     */     //   125: istore #11
/*     */     //   127: nop
/*     */     //   128: iload #10
/*     */     //   130: ifne -> 426
/*     */     //   133: iconst_0
/*     */     //   134: istore #12
/*     */     //   136: iconst_0
/*     */     //   137: istore #13
/*     */     //   139: new java/lang/StringBuilder
/*     */     //   142: dup
/*     */     //   143: invokespecial <init> : ()V
/*     */     //   146: astore #14
/*     */     //   148: aload #14
/*     */     //   150: astore #15
/*     */     //   152: iconst_0
/*     */     //   153: istore #16
/*     */     //   155: aload #4
/*     */     //   157: invokevirtual getInts : ()I
/*     */     //   160: istore #17
/*     */     //   162: iconst_0
/*     */     //   163: istore #18
/*     */     //   165: iload #18
/*     */     //   167: iload #17
/*     */     //   169: if_icmpge -> 233
/*     */     //   172: iload #18
/*     */     //   174: istore #19
/*     */     //   176: iconst_0
/*     */     //   177: istore #20
/*     */     //   179: iconst_1
/*     */     //   180: iload #19
/*     */     //   182: ishl
/*     */     //   183: aload_3
/*     */     //   184: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   187: iand
/*     */     //   188: ifeq -> 226
/*     */     //   191: iload #13
/*     */     //   193: ifle -> 204
/*     */     //   196: aload #15
/*     */     //   198: ldc ', '
/*     */     //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   203: pop
/*     */     //   204: aload #15
/*     */     //   206: aload #4
/*     */     //   208: iload #19
/*     */     //   210: invokestatic constructor-impl : (I)I
/*     */     //   213: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   219: pop
/*     */     //   220: iload #13
/*     */     //   222: iconst_1
/*     */     //   223: iadd
/*     */     //   224: istore #13
/*     */     //   226: nop
/*     */     //   227: iinc #18, 1
/*     */     //   230: goto -> 165
/*     */     //   233: nop
/*     */     //   234: aload #14
/*     */     //   236: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   239: dup
/*     */     //   240: ldc 'toString(...)'
/*     */     //   242: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   245: astore #22
/*     */     //   247: iconst_0
/*     */     //   248: istore #14
/*     */     //   250: new java/lang/StringBuilder
/*     */     //   253: dup
/*     */     //   254: invokespecial <init> : ()V
/*     */     //   257: astore #16
/*     */     //   259: aload #16
/*     */     //   261: astore #17
/*     */     //   263: iconst_0
/*     */     //   264: istore #18
/*     */     //   266: aload #4
/*     */     //   268: invokevirtual getObjects : ()I
/*     */     //   271: istore #19
/*     */     //   273: iconst_0
/*     */     //   274: istore #20
/*     */     //   276: iload #20
/*     */     //   278: iload #19
/*     */     //   280: if_icmpge -> 344
/*     */     //   283: iload #20
/*     */     //   285: istore #21
/*     */     //   287: iconst_0
/*     */     //   288: istore #23
/*     */     //   290: iconst_1
/*     */     //   291: iload #21
/*     */     //   293: ishl
/*     */     //   294: aload_3
/*     */     //   295: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   298: iand
/*     */     //   299: ifeq -> 337
/*     */     //   302: iload #13
/*     */     //   304: ifle -> 315
/*     */     //   307: aload #17
/*     */     //   309: ldc ', '
/*     */     //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   314: pop
/*     */     //   315: aload #17
/*     */     //   317: aload #4
/*     */     //   319: iload #21
/*     */     //   321: invokestatic constructor-impl : (I)I
/*     */     //   324: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   330: pop
/*     */     //   331: iload #14
/*     */     //   333: iconst_1
/*     */     //   334: iadd
/*     */     //   335: istore #14
/*     */     //   337: nop
/*     */     //   338: iinc #20, 1
/*     */     //   341: goto -> 276
/*     */     //   344: nop
/*     */     //   345: aload #16
/*     */     //   347: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   350: dup
/*     */     //   351: ldc 'toString(...)'
/*     */     //   353: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   356: astore #15
/*     */     //   358: new java/lang/StringBuilder
/*     */     //   361: dup
/*     */     //   362: invokespecial <init> : ()V
/*     */     //   365: ldc 'Error while pushing '
/*     */     //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   370: aload #4
/*     */     //   372: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   375: ldc '. Not all arguments were provided. Missing '
/*     */     //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   380: iload #13
/*     */     //   382: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   385: ldc ' int arguments ('
/*     */     //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   390: aload #22
/*     */     //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   395: ldc ') and '
/*     */     //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   400: iload #14
/*     */     //   402: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   405: ldc ' object arguments ('
/*     */     //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   410: aload #15
/*     */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   415: ldc ').'
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   420: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   423: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   426: nop
/*     */     //   427: nop
/*     */     //   428: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #306	-> 7
/*     */     //   #307	-> 14
/*     */     //   #1248	-> 30
/*     */     //   #1251	-> 31
/*     */     //   #1252	-> 37
/*     */     //   #308	-> 46
/*     */     //   #1253	-> 56
/*     */     //   #308	-> 60
/*     */     //   #309	-> 64
/*     */     //   #1254	-> 74
/*     */     //   #309	-> 78
/*     */     //   #310	-> 82
/*     */     //   #1252	-> 83
/*     */     //   #1255	-> 84
/*     */     //   #1256	-> 100
/*     */     //   #1257	-> 123
/*     */     //   #1258	-> 127
/*     */     //   #1261	-> 128
/*     */     //   #1262	-> 133
/*     */     //   #1263	-> 136
/*     */     //   #1264	-> 139
/*     */     //   #1265	-> 155
/*     */     //   #1266	-> 179
/*     */     //   #1267	-> 191
/*     */     //   #1268	-> 204
/*     */     //   #1269	-> 220
/*     */     //   #1271	-> 226
/*     */     //   #1265	-> 227
/*     */     //   #1272	-> 233
/*     */     //   #1264	-> 234
/*     */     //   #1264	-> 245
/*     */     //   #1274	-> 247
/*     */     //   #1275	-> 250
/*     */     //   #1276	-> 266
/*     */     //   #1277	-> 290
/*     */     //   #1278	-> 302
/*     */     //   #1279	-> 315
/*     */     //   #1280	-> 331
/*     */     //   #1282	-> 337
/*     */     //   #1276	-> 338
/*     */     //   #1283	-> 344
/*     */     //   #1275	-> 345
/*     */     //   #1275	-> 356
/*     */     //   #1285	-> 358
/*     */     //   #1286	-> 380
/*     */     //   #1285	-> 382
/*     */     //   #1286	-> 385
/*     */     //   #1285	-> 387
/*     */     //   #1286	-> 390
/*     */     //   #1285	-> 392
/*     */     //   #1286	-> 395
/*     */     //   #1285	-> 397
/*     */     //   #1287	-> 400
/*     */     //   #1285	-> 402
/*     */     //   #1287	-> 405
/*     */     //   #1285	-> 407
/*     */     //   #1287	-> 410
/*     */     //   #1285	-> 412
/*     */     //   #1287	-> 415
/*     */     //   #1285	-> 417
/*     */     //   #1262	-> 423
/*     */     //   #1288	-> 426
/*     */     //   #1289	-> 427
/*     */     //   #312	-> 428
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	4	9	$i$f$getChanges-HpuvwBQ	I
/*     */     //   53	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;
/*     */     //   74	4	9	$i$f$getEffectiveNodeIndex-HpuvwBQ	I
/*     */     //   71	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;
/*     */     //   46	37	7	$i$a$-push-ChangeList$pushExecuteOperationsIn$1	I
/*     */     //   43	40	6	$this$pushExecuteOperationsIn_u24lambda_u2422	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   179	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*     */     //   176	51	19	arg$iv	I
/*     */     //   155	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*     */     //   152	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*     */     //   290	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*     */     //   287	51	21	arg$iv	I
/*     */     //   266	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*     */     //   263	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*     */     //   136	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*     */     //   139	284	13	missingIntCount$iv	I
/*     */     //   247	176	22	missingInts$iv	Ljava/lang/String;
/*     */     //   250	173	14	missingObjectCount$iv	I
/*     */     //   358	65	15	missingObjects$iv	Ljava/lang/String;
/*     */     //   127	300	11	$i$f$checkPrecondition	I
/*     */     //   124	303	10	value$iv$iv	Z
/*     */     //   30	398	5	$i$f$push	I
/*     */     //   27	401	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   27	401	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	429	0	this	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	429	1	changeList	Landroidx/compose/runtime/changelist/ChangeList;
/*     */     //   0	429	2	effectiveNodeIndex	Landroidx/compose/runtime/internal/IntRef;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toDebugString(@NotNull String linePrefix) {
/* 315 */     Intrinsics.checkNotNullParameter(linePrefix, "linePrefix"); StringBuilder stringBuilder1 = new StringBuilder(), $this$toDebugString_u24lambda_u2423 = stringBuilder1; int $i$a$-buildString-ChangeList$toDebugString$1 = 0;
/* 316 */     $this$toDebugString_u24lambda_u2423.append("ChangeList instance containing ");
/* 317 */     $this$toDebugString_u24lambda_u2423.append(getSize());
/* 318 */     $this$toDebugString_u24lambda_u2423.append(" operations");
/* 319 */     if (($this$toDebugString_u24lambda_u2423.length() > 0)) {
/* 320 */       $this$toDebugString_u24lambda_u2423.append(":\n");
/* 321 */       $this$toDebugString_u24lambda_u2423.append(this.operations.toDebugString(linePrefix));
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\ChangeList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */