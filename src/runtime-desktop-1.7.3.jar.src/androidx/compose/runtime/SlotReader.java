/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\b\n\002\030\002\n\002\b\023\n\002\020\025\n\002\b\026\n\002\020\021\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\005\n\002\020!\n\002\030\002\n\002\b\016\n\002\020\016\n\002\b\003\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020H\032\0020C2\b\b\002\020I\032\0020\nJ\006\020J\032\0020KJ\006\020L\032\0020KJ\016\020M\032\0020\0062\006\020I\032\0020\nJ\006\020N\032\0020KJ\006\020O\032\0020KJ\f\020P\032\b\022\004\022\0020R0QJ\020\020S\032\004\030\0010\0012\006\020I\032\0020\nJ\020\020\025\032\004\030\0010\0012\006\020I\032\0020\nJ\016\020\030\032\0020\n2\006\020I\032\0020\nJ\020\020T\032\004\030\0010\0012\006\020I\032\0020\nJ\030\020T\032\004\030\0010\0012\006\020U\032\0020\n2\006\020I\032\0020\nJ\016\020\032\032\0020\n2\006\020H\032\0020CJ\016\020\032\032\0020\n2\006\020I\032\0020\nJ\020\020\036\032\004\030\0010\0012\006\020I\032\0020\nJ\016\020 \032\0020\n2\006\020I\032\0020\nJ\016\020V\032\0020\0062\006\020I\032\0020\nJ\016\020+\032\0020\0062\006\020I\032\0020\nJ\016\0200\032\0020\0062\006\020I\032\0020\nJ\b\020W\032\004\030\0010\001J\020\020X\032\004\030\0010\0012\006\020I\032\0020\nJ\016\0201\032\0020\n2\006\020I\032\0020\nJ\016\0203\032\0020\n2\006\020I\032\0020\nJ\016\020Y\032\0020\n2\006\020I\032\0020\nJ\016\020Z\032\0020K2\006\020I\032\0020\nJ\016\020[\032\0020K2\006\020I\032\0020\nJ\006\020\\\032\0020\nJ\006\020]\032\0020KJ\006\020^\032\0020KJ\006\020_\032\0020KJ\b\020`\032\0020aH\026J\026\020b\032\004\030\0010\001*\0020'2\006\020I\032\0020\nH\002J\026\020X\032\004\030\0010\001*\0020'2\006\020I\032\0020\nH\002J\026\020c\032\004\030\0010\001*\0020'2\006\020I\032\0020\nH\002R\036\020\007\032\0020\0062\006\020\005\032\0020\006@BX\016¢\006\b\n\000\032\004\b\b\020\tR\036\020\013\032\0020\n2\006\020\005\032\0020\n@BX\016¢\006\b\n\000\032\004\b\f\020\rR\036\020\016\032\0020\n2\006\020\005\032\0020\n@BX\016¢\006\b\n\000\032\004\b\017\020\rR\016\020\020\032\0020\nX\016¢\006\002\n\000R\016\020\021\032\0020\nX\016¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000R\016\020\024\032\0020\nX\016¢\006\002\n\000R\023\020\025\032\004\030\0010\0018F¢\006\006\032\004\b\026\020\027R\021\020\030\032\0020\n8F¢\006\006\032\004\b\031\020\rR\021\020\032\032\0020\n8F¢\006\006\032\004\b\033\020\rR\023\020\034\032\004\030\0010\0018F¢\006\006\032\004\b\035\020\027R\023\020\036\032\004\030\0010\0018F¢\006\006\032\004\b\037\020\027R\021\020 \032\0020\n8F¢\006\006\032\004\b!\020\rR\021\020\"\032\0020\n8F¢\006\006\032\004\b#\020\rR\021\020$\032\0020\n8F¢\006\006\032\004\b%\020\rR\016\020&\032\0020'X\004¢\006\002\n\000R\016\020(\032\0020\nX\004¢\006\002\n\000R\036\020)\032\0020\0062\006\020\005\032\0020\006@BX\016¢\006\b\n\000\032\004\b*\020\tR\021\020+\032\0020\0068F¢\006\006\032\004\b,\020\tR\021\020-\032\0020\0068F¢\006\006\032\004\b.\020\tR\021\020/\032\0020\0068F¢\006\006\032\004\b/\020\tR\021\0200\032\0020\0068F¢\006\006\032\004\b0\020\tR\021\0201\032\0020\n8F¢\006\006\032\004\b2\020\rR\036\0203\032\0020\n2\006\020\005\032\0020\n@BX\016¢\006\b\n\000\032\004\b4\020\rR\021\0205\032\0020\n8F¢\006\006\032\004\b6\020\rR\021\0207\032\0020\n8F¢\006\006\032\004\b8\020\rR\021\0209\032\0020\n8F¢\006\006\032\004\b:\020\rR\021\020;\032\0020\n8F¢\006\006\032\004\b<\020\rR\030\020=\032\n\022\006\022\004\030\0010\0010>X\004¢\006\004\n\002\020?R\016\020@\032\0020\nX\004¢\006\002\n\000R.\020A\032\"\022\004\022\0020C\022\004\022\0020D\030\0010Bj\020\022\004\022\0020C\022\004\022\0020D\030\001`EX\016¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\bF\020G¨\006d"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "hadNext", "getHadNext", "hasObjectKey", "getHasObjectKey", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "remainingSlots", "getRemainingSlots", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "anchor", "index", "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "group", "hasMark", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,4179:1\n33#2,7:4180\n33#2,7:4187\n33#2,7:4194\n33#2,7:4201\n4553#3,7:4208\n4553#3,7:4215\n4553#3,7:4222\n4553#3,7:4229\n4553#3,7:4236\n4046#4,6:4243\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1081#1:4180,7\n1152#1:4187,7\n1172#1:4194,7\n1199#1:4201,7\n1208#1:4208,7\n1218#1:4215,7\n1228#1:4222,7\n1247#1:4229,7\n1261#1:4236,7\n1314#1:4243,6\n*E\n"})
/*      */ public final class SlotReader
/*      */ {
/*      */   @NotNull
/*      */   private final SlotTable table;
/*      */   @NotNull
/*      */   private final int[] groups;
/*      */   private final int groupsSize;
/*      */   @NotNull
/*      */   private final Object[] slots;
/*      */   private final int slotsSize;
/*      */   @Nullable
/*      */   private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
/*      */   private boolean closed;
/*      */   private int currentGroup;
/*      */   private int currentEnd;
/*      */   private int parent;
/*      */   @NotNull
/*      */   private final IntStack currentSlotStack;
/*      */   private int emptyCount;
/*      */   private int currentSlot;
/*      */   private int currentSlotEnd;
/*      */   private boolean hadNext;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   public SlotReader(@NotNull SlotTable table) {
/*  851 */     this.table = table;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  857 */     this.groups = this.table.getGroups();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  862 */     this.groupsSize = this.table.getGroupsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  867 */     this.slots = this.table.getSlots();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  872 */     this.slotsSize = this.table.getSlotsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  895 */     this.currentEnd = this.groupsSize;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  901 */     this.parent = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  907 */     this.currentSlotStack = new IntStack();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final SlotTable getTable$runtime() {
/*      */     return this.table;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean getClosed() {
/*      */     return this.closed;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getSize() {
/*  928 */     return this.groupsSize;
/*      */   }
/*      */   public final int getCurrentGroup() { return this.currentGroup; } public final int getCurrentEnd() { return this.currentEnd; } public final int getParent() {
/*      */     return this.parent;
/*      */   } public final int getSlot() {
/*  933 */     return this.currentSlot - SlotTableKt.access$slotAnchor(this.groups, this.parent);
/*      */   }
/*      */ 
/*      */   
/*      */   public final int parent(int index) {
/*  938 */     return SlotTableKt.access$parentAnchor(this.groups, index);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNode() {
/*  943 */     return SlotTableKt.access$isNode(this.groups, this.currentGroup);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isNode(int index) {
/*  948 */     return SlotTableKt.access$isNode(this.groups, index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getNodeCount() {
/*  954 */     return SlotTableKt.access$nodeCount(this.groups, this.currentGroup);
/*      */   }
/*      */ 
/*      */   
/*      */   public final int nodeCount(int index) {
/*  959 */     return SlotTableKt.access$nodeCount(this.groups, index);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object node(int index) {
/*  964 */     return SlotTableKt.access$isNode(this.groups, index) ? node(this.groups, index) : null;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean isGroupEnd() {
/*  969 */     return (getInEmpty() || this.currentGroup == this.currentEnd);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean getInEmpty() {
/*  974 */     return (this.emptyCount > 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getGroupSize() {
/*  979 */     return SlotTableKt.access$groupSize(this.groups, this.currentGroup);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int groupSize(int index) {
/*  985 */     return SlotTableKt.access$groupSize(this.groups, index);
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getGroupEnd() {
/*  990 */     return this.currentEnd;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int groupEnd(int index) {
/*  995 */     return index + SlotTableKt.access$groupSize(this.groups, index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getGroupKey() {
/* 1001 */     return (this.currentGroup < this.currentEnd) ? 
/* 1002 */       SlotTableKt.access$key(this.groups, this.currentGroup) : 
/* 1003 */       0;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int groupKey(int index) {
/* 1008 */     return SlotTableKt.access$key(this.groups, index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getGroupSlotIndex() {
/* 1014 */     return this.currentSlot - SlotTableKt.access$slotAnchor(this.groups, this.parent);
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean hasObjectKey(int index) {
/* 1019 */     return SlotTableKt.access$hasObjectKey(this.groups, index);
/*      */   } public final boolean getHasObjectKey() {
/* 1021 */     return (this.currentGroup < this.currentEnd && SlotTableKt.access$hasObjectKey(this.groups, this.currentGroup));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object getGroupObjectKey() {
/* 1028 */     return (this.currentGroup < this.currentEnd) ? objectKey(this.groups, this.currentGroup) : null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object groupObjectKey(int index) {
/* 1033 */     return objectKey(this.groups, index);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object getGroupAux() {
/* 1038 */     return (this.currentGroup < this.currentEnd) ? aux(this.groups, this.currentGroup) : Integer.valueOf(0);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object groupAux(int index) {
/* 1043 */     return aux(this.groups, index);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object getGroupNode() {
/* 1048 */     return (this.currentGroup < this.currentEnd) ? node(this.groups, this.currentGroup) : null;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int groupKey(@NotNull Anchor anchor) {
/* 1053 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); return anchor.getValid() ? SlotTableKt.access$key(this.groups, this.table.anchorIndex(anchor)) : 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean hasMark(int index) {
/* 1058 */     return SlotTableKt.access$hasMark(this.groups, index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean containsMark(int index) {
/* 1064 */     return SlotTableKt.access$containsMark(this.groups, index);
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getParentNodes() {
/* 1069 */     return (this.parent >= 0) ? SlotTableKt.access$nodeCount(this.groups, this.parent) : 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getRemainingSlots() {
/* 1074 */     return this.currentSlotEnd - this.currentSlot;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int parentOf(int index) {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: iflt -> 16
/*      */     //   4: iload_1
/*      */     //   5: aload_0
/*      */     //   6: getfield groupsSize : I
/*      */     //   9: if_icmpge -> 16
/*      */     //   12: iconst_1
/*      */     //   13: goto -> 17
/*      */     //   16: iconst_0
/*      */     //   17: istore_2
/*      */     //   18: iconst_0
/*      */     //   19: istore_3
/*      */     //   20: nop
/*      */     //   21: iload_2
/*      */     //   22: ifne -> 50
/*      */     //   25: iconst_0
/*      */     //   26: istore #4
/*      */     //   28: new java/lang/StringBuilder
/*      */     //   31: dup
/*      */     //   32: invokespecial <init> : ()V
/*      */     //   35: ldc 'Invalid group index '
/*      */     //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   40: iload_1
/*      */     //   41: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   44: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   47: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   50: nop
/*      */     //   51: aload_0
/*      */     //   52: getfield groups : [I
/*      */     //   55: iload_1
/*      */     //   56: invokestatic access$parentAnchor : ([II)I
/*      */     //   59: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1081	-> 0
/*      */     //   #4180	-> 20
/*      */     //   #4183	-> 21
/*      */     //   #4184	-> 25
/*      */     //   #1081	-> 28
/*      */     //   #4184	-> 47
/*      */     //   #4186	-> 50
/*      */     //   #1082	-> 51
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   28	19	4	$i$a$-requirePrecondition-SlotReader$parentOf$1	I
/*      */     //   20	31	3	$i$f$requirePrecondition	I
/*      */     //   18	33	2	value$iv	Z
/*      */     //   0	60	0	this	Landroidx/compose/runtime/SlotReader;
/*      */     //   0	60	1	index	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getGroupSlotCount() {
/* 1090 */     int current = this.currentGroup;
/* 1091 */     int start = SlotTableKt.access$slotAnchor(this.groups, current);
/* 1092 */     int next = current + 1;
/* 1093 */     int end = (next < this.groupsSize) ? SlotTableKt.access$dataAnchor(this.groups, next) : this.slotsSize;
/* 1094 */     return end - start;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object get(int index) {
/* 1100 */     int slotIndex = this.currentSlot + index, $i$a$-let-SlotReader$get$1 = 0;
/* 1101 */     return (slotIndex < this.currentSlotEnd) ? this.slots[slotIndex] : Composer.Companion.getEmpty();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object groupGet(int index) {
/* 1107 */     return groupGet(this.currentGroup, index);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object groupGet(int group, int index) {
/* 1113 */     int start = SlotTableKt.access$slotAnchor(this.groups, group);
/* 1114 */     int next = group + 1;
/* 1115 */     int end = (next < this.groupsSize) ? SlotTableKt.access$dataAnchor(this.groups, next) : this.slotsSize;
/* 1116 */     int address = start + index;
/* 1117 */     return (address < end) ? this.slots[address] : Composer.Companion.getEmpty();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object next() {
/* 1126 */     if (this.emptyCount > 0 || this.currentSlot >= this.currentSlotEnd) {
/* 1127 */       this.hadNext = false;
/* 1128 */       return Composer.Companion.getEmpty();
/*      */     } 
/* 1130 */     this.hadNext = true;
/* 1131 */     int i = this.currentSlot; this.currentSlot = i + 1; return this.slots[i];
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean getHadNext() {
/* 1137 */     return this.hadNext;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void beginEmpty() {
/* 1145 */     int i = this.emptyCount; this.emptyCount = i + 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void endEmpty() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifle -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_1
/*      */     //   13: iconst_0
/*      */     //   14: istore_2
/*      */     //   15: nop
/*      */     //   16: iload_1
/*      */     //   17: ifne -> 27
/*      */     //   20: iconst_0
/*      */     //   21: istore_3
/*      */     //   22: ldc 'Unbalanced begin/end empty'
/*      */     //   24: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   27: nop
/*      */     //   28: aload_0
/*      */     //   29: getfield emptyCount : I
/*      */     //   32: istore_1
/*      */     //   33: aload_0
/*      */     //   34: iload_1
/*      */     //   35: iconst_m1
/*      */     //   36: iadd
/*      */     //   37: putfield emptyCount : I
/*      */     //   40: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1152	-> 0
/*      */     //   #4187	-> 15
/*      */     //   #4190	-> 16
/*      */     //   #4191	-> 20
/*      */     //   #1152	-> 22
/*      */     //   #4191	-> 24
/*      */     //   #4193	-> 27
/*      */     //   #1153	-> 28
/*      */     //   #1154	-> 40
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	2	3	$i$a$-requirePrecondition-SlotReader$endEmpty$1	I
/*      */     //   15	13	2	$i$f$requirePrecondition	I
/*      */     //   13	15	1	value$iv	Z
/*      */     //   0	41	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void close() {
/* 1161 */     this.closed = true;
/* 1162 */     this.table.close$runtime(this, this.sourceInformationMap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifgt -> 198
/*      */     //   7: aload_0
/*      */     //   8: getfield parent : I
/*      */     //   11: istore_1
/*      */     //   12: aload_0
/*      */     //   13: getfield currentGroup : I
/*      */     //   16: istore_2
/*      */     //   17: aload_0
/*      */     //   18: getfield groups : [I
/*      */     //   21: iload_2
/*      */     //   22: invokestatic access$parentAnchor : ([II)I
/*      */     //   25: iload_1
/*      */     //   26: if_icmpne -> 33
/*      */     //   29: iconst_1
/*      */     //   30: goto -> 34
/*      */     //   33: iconst_0
/*      */     //   34: istore_3
/*      */     //   35: iconst_0
/*      */     //   36: istore #4
/*      */     //   38: nop
/*      */     //   39: iload_3
/*      */     //   40: ifne -> 52
/*      */     //   43: iconst_0
/*      */     //   44: istore #5
/*      */     //   46: ldc_w 'Invalid slot table detected'
/*      */     //   49: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   52: nop
/*      */     //   53: aload_0
/*      */     //   54: getfield sourceInformationMap : Ljava/util/HashMap;
/*      */     //   57: dup
/*      */     //   58: ifnull -> 87
/*      */     //   61: aload_0
/*      */     //   62: iload_1
/*      */     //   63: invokevirtual anchor : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   66: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   69: checkcast androidx/compose/runtime/GroupSourceInformation
/*      */     //   72: dup
/*      */     //   73: ifnull -> 87
/*      */     //   76: aload_0
/*      */     //   77: getfield table : Landroidx/compose/runtime/SlotTable;
/*      */     //   80: iload_2
/*      */     //   81: invokevirtual reportGroup : (Landroidx/compose/runtime/SlotTable;I)V
/*      */     //   84: goto -> 88
/*      */     //   87: pop
/*      */     //   88: aload_0
/*      */     //   89: getfield currentSlotStack : Landroidx/compose/runtime/IntStack;
/*      */     //   92: astore_3
/*      */     //   93: aload_0
/*      */     //   94: getfield currentSlot : I
/*      */     //   97: istore #4
/*      */     //   99: aload_0
/*      */     //   100: getfield currentSlotEnd : I
/*      */     //   103: istore #5
/*      */     //   105: iload #4
/*      */     //   107: ifne -> 123
/*      */     //   110: iload #5
/*      */     //   112: ifne -> 123
/*      */     //   115: aload_3
/*      */     //   116: iconst_m1
/*      */     //   117: invokevirtual push : (I)V
/*      */     //   120: goto -> 129
/*      */     //   123: aload_3
/*      */     //   124: iload #4
/*      */     //   126: invokevirtual push : (I)V
/*      */     //   129: aload_0
/*      */     //   130: iload_2
/*      */     //   131: putfield parent : I
/*      */     //   134: aload_0
/*      */     //   135: iload_2
/*      */     //   136: aload_0
/*      */     //   137: getfield groups : [I
/*      */     //   140: iload_2
/*      */     //   141: invokestatic access$groupSize : ([II)I
/*      */     //   144: iadd
/*      */     //   145: putfield currentEnd : I
/*      */     //   148: aload_0
/*      */     //   149: iload_2
/*      */     //   150: iconst_1
/*      */     //   151: iadd
/*      */     //   152: putfield currentGroup : I
/*      */     //   155: aload_0
/*      */     //   156: aload_0
/*      */     //   157: getfield groups : [I
/*      */     //   160: iload_2
/*      */     //   161: invokestatic access$slotAnchor : ([II)I
/*      */     //   164: putfield currentSlot : I
/*      */     //   167: aload_0
/*      */     //   168: iload_2
/*      */     //   169: aload_0
/*      */     //   170: getfield groupsSize : I
/*      */     //   173: iconst_1
/*      */     //   174: isub
/*      */     //   175: if_icmplt -> 185
/*      */     //   178: aload_0
/*      */     //   179: getfield slotsSize : I
/*      */     //   182: goto -> 195
/*      */     //   185: aload_0
/*      */     //   186: getfield groups : [I
/*      */     //   189: iload_2
/*      */     //   190: iconst_1
/*      */     //   191: iadd
/*      */     //   192: invokestatic access$dataAnchor : ([II)I
/*      */     //   195: putfield currentSlotEnd : I
/*      */     //   198: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1169	-> 0
/*      */     //   #1170	-> 7
/*      */     //   #1171	-> 12
/*      */     //   #1172	-> 17
/*      */     //   #4194	-> 38
/*      */     //   #4197	-> 39
/*      */     //   #4198	-> 43
/*      */     //   #1173	-> 46
/*      */     //   #4198	-> 49
/*      */     //   #4200	-> 52
/*      */     //   #1175	-> 53
/*      */     //   #1176	-> 88
/*      */     //   #1177	-> 93
/*      */     //   #1178	-> 99
/*      */     //   #1179	-> 105
/*      */     //   #1180	-> 115
/*      */     //   #1182	-> 123
/*      */     //   #1184	-> 129
/*      */     //   #1185	-> 134
/*      */     //   #1186	-> 148
/*      */     //   #1187	-> 155
/*      */     //   #1188	-> 167
/*      */     //   #1189	-> 178
/*      */     //   #1190	-> 185
/*      */     //   #1188	-> 195
/*      */     //   #1192	-> 198
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   46	3	5	$i$a$-requirePrecondition-SlotReader$startGroup$1	I
/*      */     //   38	15	4	$i$f$requirePrecondition	I
/*      */     //   35	18	3	value$iv	Z
/*      */     //   12	186	1	parent	I
/*      */     //   17	181	2	currentGroup	I
/*      */     //   93	105	3	currentSlotStack	Landroidx/compose/runtime/IntStack;
/*      */     //   99	99	4	currentSlot	I
/*      */     //   105	93	5	currentEndSlot	I
/*      */     //   0	199	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startNode() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifgt -> 39
/*      */     //   7: aload_0
/*      */     //   8: getfield groups : [I
/*      */     //   11: aload_0
/*      */     //   12: getfield currentGroup : I
/*      */     //   15: invokestatic access$isNode : ([II)Z
/*      */     //   18: istore_1
/*      */     //   19: iconst_0
/*      */     //   20: istore_2
/*      */     //   21: nop
/*      */     //   22: iload_1
/*      */     //   23: ifne -> 34
/*      */     //   26: iconst_0
/*      */     //   27: istore_3
/*      */     //   28: ldc_w 'Expected a node group'
/*      */     //   31: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   34: nop
/*      */     //   35: aload_0
/*      */     //   36: invokevirtual startGroup : ()V
/*      */     //   39: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1198	-> 0
/*      */     //   #1199	-> 7
/*      */     //   #4201	-> 21
/*      */     //   #4204	-> 22
/*      */     //   #4205	-> 26
/*      */     //   #1199	-> 28
/*      */     //   #4205	-> 31
/*      */     //   #4207	-> 34
/*      */     //   #1200	-> 35
/*      */     //   #1202	-> 39
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   28	3	3	$i$a$-requirePrecondition-SlotReader$startNode$1	I
/*      */     //   21	14	2	$i$f$requirePrecondition	I
/*      */     //   19	16	1	value$iv	Z
/*      */     //   0	40	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int skipGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_1
/*      */     //   13: iconst_0
/*      */     //   14: istore_2
/*      */     //   15: nop
/*      */     //   16: iload_1
/*      */     //   17: ifne -> 28
/*      */     //   20: iconst_0
/*      */     //   21: istore_3
/*      */     //   22: ldc_w 'Cannot skip while in an empty region'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: getfield groups : [I
/*      */     //   33: aload_0
/*      */     //   34: getfield currentGroup : I
/*      */     //   37: invokestatic access$isNode : ([II)Z
/*      */     //   40: ifeq -> 47
/*      */     //   43: iconst_1
/*      */     //   44: goto -> 58
/*      */     //   47: aload_0
/*      */     //   48: getfield groups : [I
/*      */     //   51: aload_0
/*      */     //   52: getfield currentGroup : I
/*      */     //   55: invokestatic access$nodeCount : ([II)I
/*      */     //   58: istore_1
/*      */     //   59: aload_0
/*      */     //   60: aload_0
/*      */     //   61: getfield currentGroup : I
/*      */     //   64: aload_0
/*      */     //   65: getfield groups : [I
/*      */     //   68: aload_0
/*      */     //   69: getfield currentGroup : I
/*      */     //   72: invokestatic access$groupSize : ([II)I
/*      */     //   75: iadd
/*      */     //   76: putfield currentGroup : I
/*      */     //   79: iload_1
/*      */     //   80: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1208	-> 0
/*      */     //   #4208	-> 15
/*      */     //   #4211	-> 16
/*      */     //   #4212	-> 20
/*      */     //   #1208	-> 22
/*      */     //   #4212	-> 25
/*      */     //   #4214	-> 28
/*      */     //   #1209	-> 29
/*      */     //   #1210	-> 59
/*      */     //   #1211	-> 79
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-SlotReader$skipGroup$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   59	22	1	count	I
/*      */     //   0	81	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void skipToGroupEnd() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_1
/*      */     //   13: iconst_0
/*      */     //   14: istore_2
/*      */     //   15: nop
/*      */     //   16: iload_1
/*      */     //   17: ifne -> 28
/*      */     //   20: iconst_0
/*      */     //   21: istore_3
/*      */     //   22: ldc_w 'Cannot skip the enclosing group while in an empty region'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: aload_0
/*      */     //   31: getfield currentEnd : I
/*      */     //   34: putfield currentGroup : I
/*      */     //   37: aload_0
/*      */     //   38: iconst_0
/*      */     //   39: putfield currentSlot : I
/*      */     //   42: aload_0
/*      */     //   43: iconst_0
/*      */     //   44: putfield currentSlotEnd : I
/*      */     //   47: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1218	-> 0
/*      */     //   #4215	-> 15
/*      */     //   #4218	-> 16
/*      */     //   #4219	-> 20
/*      */     //   #1218	-> 22
/*      */     //   #4219	-> 25
/*      */     //   #4221	-> 28
/*      */     //   #1219	-> 29
/*      */     //   #1220	-> 37
/*      */     //   #1221	-> 42
/*      */     //   #1222	-> 47
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-SlotReader$skipToGroupEnd$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   0	48	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void reposition(int index) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_2
/*      */     //   13: iconst_0
/*      */     //   14: istore_3
/*      */     //   15: nop
/*      */     //   16: iload_2
/*      */     //   17: ifne -> 29
/*      */     //   20: iconst_0
/*      */     //   21: istore #4
/*      */     //   23: ldc_w 'Cannot reposition while in an empty region'
/*      */     //   26: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: aload_0
/*      */     //   31: iload_1
/*      */     //   32: putfield currentGroup : I
/*      */     //   35: iload_1
/*      */     //   36: aload_0
/*      */     //   37: getfield groupsSize : I
/*      */     //   40: if_icmpge -> 54
/*      */     //   43: aload_0
/*      */     //   44: getfield groups : [I
/*      */     //   47: iload_1
/*      */     //   48: invokestatic access$parentAnchor : ([II)I
/*      */     //   51: goto -> 55
/*      */     //   54: iconst_m1
/*      */     //   55: istore_2
/*      */     //   56: aload_0
/*      */     //   57: iload_2
/*      */     //   58: putfield parent : I
/*      */     //   61: iload_2
/*      */     //   62: ifge -> 76
/*      */     //   65: aload_0
/*      */     //   66: aload_0
/*      */     //   67: getfield groupsSize : I
/*      */     //   70: putfield currentEnd : I
/*      */     //   73: goto -> 90
/*      */     //   76: aload_0
/*      */     //   77: iload_2
/*      */     //   78: aload_0
/*      */     //   79: getfield groups : [I
/*      */     //   82: iload_2
/*      */     //   83: invokestatic access$groupSize : ([II)I
/*      */     //   86: iadd
/*      */     //   87: putfield currentEnd : I
/*      */     //   90: aload_0
/*      */     //   91: iconst_0
/*      */     //   92: putfield currentSlot : I
/*      */     //   95: aload_0
/*      */     //   96: iconst_0
/*      */     //   97: putfield currentSlotEnd : I
/*      */     //   100: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1228	-> 0
/*      */     //   #4222	-> 15
/*      */     //   #4225	-> 16
/*      */     //   #4226	-> 20
/*      */     //   #1228	-> 23
/*      */     //   #4226	-> 26
/*      */     //   #4228	-> 29
/*      */     //   #1229	-> 30
/*      */     //   #1230	-> 35
/*      */     //   #1231	-> 56
/*      */     //   #1232	-> 61
/*      */     //   #1233	-> 65
/*      */     //   #1235	-> 76
/*      */     //   #1236	-> 90
/*      */     //   #1237	-> 95
/*      */     //   #1238	-> 100
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-runtimeCheck-SlotReader$reposition$1	I
/*      */     //   15	15	3	$i$f$runtimeCheck	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   56	45	2	parent	I
/*      */     //   0	101	0	this	Landroidx/compose/runtime/SlotReader;
/*      */     //   0	101	1	index	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void restoreParent(int index) {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: aload_0
/*      */     //   2: getfield groups : [I
/*      */     //   5: iload_1
/*      */     //   6: invokestatic access$groupSize : ([II)I
/*      */     //   9: iadd
/*      */     //   10: istore_2
/*      */     //   11: aload_0
/*      */     //   12: getfield currentGroup : I
/*      */     //   15: istore_3
/*      */     //   16: iload_3
/*      */     //   17: iload_1
/*      */     //   18: if_icmplt -> 30
/*      */     //   21: iload_3
/*      */     //   22: iload_2
/*      */     //   23: if_icmpgt -> 30
/*      */     //   26: iconst_1
/*      */     //   27: goto -> 31
/*      */     //   30: iconst_0
/*      */     //   31: istore #4
/*      */     //   33: iconst_0
/*      */     //   34: istore #5
/*      */     //   36: nop
/*      */     //   37: iload #4
/*      */     //   39: ifne -> 78
/*      */     //   42: iconst_0
/*      */     //   43: istore #6
/*      */     //   45: new java/lang/StringBuilder
/*      */     //   48: dup
/*      */     //   49: invokespecial <init> : ()V
/*      */     //   52: ldc_w 'Index '
/*      */     //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   58: iload_1
/*      */     //   59: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   62: ldc_w ' is not a parent of '
/*      */     //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   68: iload_3
/*      */     //   69: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   75: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   78: nop
/*      */     //   79: aload_0
/*      */     //   80: iload_1
/*      */     //   81: putfield parent : I
/*      */     //   84: aload_0
/*      */     //   85: iload_2
/*      */     //   86: putfield currentEnd : I
/*      */     //   89: aload_0
/*      */     //   90: iconst_0
/*      */     //   91: putfield currentSlot : I
/*      */     //   94: aload_0
/*      */     //   95: iconst_0
/*      */     //   96: putfield currentSlotEnd : I
/*      */     //   99: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1244	-> 0
/*      */     //   #1245	-> 11
/*      */     //   #1247	-> 16
/*      */     //   #4229	-> 36
/*      */     //   #4232	-> 37
/*      */     //   #4233	-> 42
/*      */     //   #1248	-> 45
/*      */     //   #4233	-> 75
/*      */     //   #4235	-> 78
/*      */     //   #1250	-> 79
/*      */     //   #1251	-> 84
/*      */     //   #1252	-> 89
/*      */     //   #1253	-> 94
/*      */     //   #1254	-> 99
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   45	30	6	$i$a$-runtimeCheck-SlotReader$restoreParent$1	I
/*      */     //   36	43	5	$i$f$runtimeCheck	I
/*      */     //   33	46	4	value$iv	Z
/*      */     //   11	89	2	newCurrentEnd	I
/*      */     //   16	84	3	current	I
/*      */     //   0	100	0	this	Landroidx/compose/runtime/SlotReader;
/*      */     //   0	100	1	index	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void endGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield emptyCount : I
/*      */     //   4: ifne -> 145
/*      */     //   7: aload_0
/*      */     //   8: getfield currentGroup : I
/*      */     //   11: aload_0
/*      */     //   12: getfield currentEnd : I
/*      */     //   15: if_icmpne -> 22
/*      */     //   18: iconst_1
/*      */     //   19: goto -> 23
/*      */     //   22: iconst_0
/*      */     //   23: istore_1
/*      */     //   24: iconst_0
/*      */     //   25: istore_2
/*      */     //   26: nop
/*      */     //   27: iload_1
/*      */     //   28: ifne -> 39
/*      */     //   31: iconst_0
/*      */     //   32: istore_3
/*      */     //   33: ldc_w 'endGroup() not called at the end of a group'
/*      */     //   36: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   39: nop
/*      */     //   40: aload_0
/*      */     //   41: getfield groups : [I
/*      */     //   44: aload_0
/*      */     //   45: getfield parent : I
/*      */     //   48: invokestatic access$parentAnchor : ([II)I
/*      */     //   51: istore_1
/*      */     //   52: aload_0
/*      */     //   53: iload_1
/*      */     //   54: putfield parent : I
/*      */     //   57: aload_0
/*      */     //   58: iload_1
/*      */     //   59: ifge -> 69
/*      */     //   62: aload_0
/*      */     //   63: getfield groupsSize : I
/*      */     //   66: goto -> 79
/*      */     //   69: iload_1
/*      */     //   70: aload_0
/*      */     //   71: getfield groups : [I
/*      */     //   74: iload_1
/*      */     //   75: invokestatic access$groupSize : ([II)I
/*      */     //   78: iadd
/*      */     //   79: putfield currentEnd : I
/*      */     //   82: aload_0
/*      */     //   83: getfield currentSlotStack : Landroidx/compose/runtime/IntStack;
/*      */     //   86: astore_2
/*      */     //   87: aload_2
/*      */     //   88: invokevirtual pop : ()I
/*      */     //   91: istore_3
/*      */     //   92: iload_3
/*      */     //   93: ifge -> 109
/*      */     //   96: aload_0
/*      */     //   97: iconst_0
/*      */     //   98: putfield currentSlot : I
/*      */     //   101: aload_0
/*      */     //   102: iconst_0
/*      */     //   103: putfield currentSlotEnd : I
/*      */     //   106: goto -> 145
/*      */     //   109: aload_0
/*      */     //   110: iload_3
/*      */     //   111: putfield currentSlot : I
/*      */     //   114: aload_0
/*      */     //   115: iload_1
/*      */     //   116: aload_0
/*      */     //   117: getfield groupsSize : I
/*      */     //   120: iconst_1
/*      */     //   121: isub
/*      */     //   122: if_icmplt -> 132
/*      */     //   125: aload_0
/*      */     //   126: getfield slotsSize : I
/*      */     //   129: goto -> 142
/*      */     //   132: aload_0
/*      */     //   133: getfield groups : [I
/*      */     //   136: iload_1
/*      */     //   137: iconst_1
/*      */     //   138: iadd
/*      */     //   139: invokestatic access$dataAnchor : ([II)I
/*      */     //   142: putfield currentSlotEnd : I
/*      */     //   145: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1260	-> 0
/*      */     //   #1261	-> 7
/*      */     //   #4236	-> 26
/*      */     //   #4239	-> 27
/*      */     //   #4240	-> 31
/*      */     //   #1262	-> 33
/*      */     //   #4240	-> 36
/*      */     //   #4242	-> 39
/*      */     //   #1264	-> 40
/*      */     //   #1265	-> 52
/*      */     //   #1266	-> 57
/*      */     //   #1267	-> 62
/*      */     //   #1269	-> 69
/*      */     //   #1266	-> 79
/*      */     //   #1270	-> 82
/*      */     //   #1271	-> 87
/*      */     //   #1272	-> 92
/*      */     //   #1273	-> 96
/*      */     //   #1274	-> 101
/*      */     //   #1276	-> 109
/*      */     //   #1277	-> 114
/*      */     //   #1278	-> 125
/*      */     //   #1279	-> 132
/*      */     //   #1277	-> 142
/*      */     //   #1282	-> 145
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   33	3	3	$i$a$-runtimeCheck-SlotReader$endGroup$1	I
/*      */     //   26	14	2	$i$f$runtimeCheck	I
/*      */     //   24	16	1	value$iv	Z
/*      */     //   52	93	1	parent	I
/*      */     //   87	58	2	currentSlotStack	Landroidx/compose/runtime/IntStack;
/*      */     //   92	53	3	newCurrentSlot	I
/*      */     //   0	146	0	this	Landroidx/compose/runtime/SlotReader;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<KeyInfo> extractKeys() {
/* 1289 */     List<KeyInfo> result = new ArrayList();
/* 1290 */     if (this.emptyCount > 0) return result; 
/* 1291 */     int index = 0;
/* 1292 */     int childIndex = this.currentGroup;
/* 1293 */     while (childIndex < this.currentEnd) {
/* 1294 */       result.add(
/* 1295 */           new KeyInfo(
/* 1296 */             SlotTableKt.access$key(this.groups, childIndex), 
/* 1297 */             objectKey(this.groups, childIndex), 
/* 1298 */             childIndex, 
/* 1299 */             SlotTableKt.access$isNode(this.groups, childIndex) ? 1 : SlotTableKt.access$nodeCount(this.groups, childIndex), 
/* 1300 */             index++));
/*      */ 
/*      */       
/* 1303 */       childIndex += SlotTableKt.access$groupSize(this.groups, childIndex);
/*      */     } 
/* 1305 */     return result;
/*      */   } @NotNull
/*      */   public String toString() {
/* 1308 */     return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + 
/* 1309 */       this.parent + ", end=" + this.currentEnd + ')';
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Anchor anchor(int index) {
/* 1314 */     ArrayList<Anchor> arrayList = this.table.getAnchors$runtime(); int effectiveSize$iv = this.groupsSize, $i$f$getOrAdd = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4243 */     int location$iv = SlotTableKt.access$search(arrayList, index, effectiveSize$iv);
/* 4244 */     if (location$iv < 0) {
/* 4245 */       int $i$a$-getOrAdd-SlotReader$anchor$1 = 0; Anchor anchor$iv = new Anchor(index);
/* 4246 */       arrayList.add(-(location$iv + 1), anchor$iv);
/*      */     } 
/* 4248 */     Intrinsics.checkNotNullExpressionValue(arrayList.get(location$iv), "get(...)"); return arrayList.get(location$iv);
/*      */   }
/*      */   
/*      */   private final Object node(int[] $this$node, int index) {
/*      */     return SlotTableKt.access$isNode($this$node, index) ? this.slots[SlotTableKt.access$nodeIndex($this$node, index)] : Composer.Companion.getEmpty();
/*      */   }
/*      */   
/*      */   private final Object aux(int[] $this$aux, int index) {
/*      */     return SlotTableKt.access$hasAux($this$aux, index) ? this.slots[SlotTableKt.access$auxIndex($this$aux, index)] : Composer.Companion.getEmpty();
/*      */   }
/*      */   
/*      */   private final Object objectKey(int[] $this$objectKey, int index) {
/*      */     return SlotTableKt.access$hasObjectKey($this$objectKey, index) ? this.slots[SlotTableKt.access$objectKeyIndex($this$objectKey, index)] : null;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SlotReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */