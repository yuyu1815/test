/*      */ package androidx.compose.runtime.changelist;
/*      */ 
/*      */ import androidx.compose.runtime.ActualJvm_jvmKt;
/*      */ import androidx.compose.runtime.Anchor;
/*      */ import androidx.compose.runtime.Applier;
/*      */ import androidx.compose.runtime.ComposeNodeLifecycleCallback;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.Composition;
/*      */ import androidx.compose.runtime.CompositionContext;
/*      */ import androidx.compose.runtime.ControlledComposition;
/*      */ import androidx.compose.runtime.MovableContentStateReference;
/*      */ import androidx.compose.runtime.RecomposeScopeImpl;
/*      */ import androidx.compose.runtime.RememberManager;
/*      */ import androidx.compose.runtime.RememberObserver;
/*      */ import androidx.compose.runtime.RememberObserverHolder;
/*      */ import androidx.compose.runtime.SlotTable;
/*      */ import androidx.compose.runtime.SlotWriter;
/*      */ import androidx.compose.runtime.internal.IntRef;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.JvmInline;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.Reflection;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.TestOnly;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Ò\001\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\001:$\037 !\"#$%&'()*+,-./0123456789:;<=>?@ABB\033\b\004\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005J\032\020\r\032\0020\t2\006\020\016\032\0020\017H\026ø\001\000¢\006\004\b\020\020\021J\036\020\022\032\0020\t2\n\020\016\032\006\022\002\b\0030\023H\026ø\001\000¢\006\004\b\024\020\021J\b\020\025\032\0020\tH\026J(\020\026\032\0020\027*\0020\0302\n\020\031\032\006\022\002\b\0030\0322\006\020\033\032\0020\0342\006\020\035\032\0020\036H&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t8F¢\006\006\032\004\b\n\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\007\001\"CDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcd\002\007\n\005\b¡\0360\001¨\006e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "ints", "", "objects", "(II)V", "getInts", "()I", "name", "", "getName", "()Ljava/lang/String;", "getObjects", "intParamName", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "toString", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "AdvanceSlotsBy", "AppendValue", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "TrimParentValues", "UpdateAnchoredValue", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime"})
/*      */ @StabilityInferred(parameters = 1)
/*      */ public abstract class Operation
/*      */ {
/*      */   private final int ints;
/*      */   private final int objects;
/*      */   public static final int $stable;
/*      */   
/*      */   private Operation(int ints, int objects) {
/*   50 */     this.ints = ints;
/*   51 */     this.objects = objects; } public final int getInts() { return this.ints; } public final int getObjects() { return this.objects; }
/*      */   
/*      */   @NotNull
/*      */   public final String getName() {
/*   55 */     if (Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() == null) Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();  return "";
/*      */   }
/*      */ 
/*      */   
/*      */   public abstract void execute(@NotNull OperationArgContainer paramOperationArgContainer, @NotNull Applier<?> paramApplier, @NotNull SlotWriter paramSlotWriter, @NotNull RememberManager paramRememberManager);
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public String intParamName-w8GmfQM(int parameter) {
/*   64 */     return "IntParameter(" + parameter + ')';
/*      */   }
/*      */   @NotNull
/*   67 */   public String objectParamName-31yXWZQ(int parameter) { return "ObjectParameter(" + parameter + ')'; }
/*      */   @NotNull
/*   69 */   public String toString() { return getName(); } @JvmInline
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\020\020\017\032\0020\020HÖ\001¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\023"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", "offset", "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime"})
/*      */   public static final class IntParameter { private final int offset;
/*   72 */     public final int getOffset() { return this.offset; } public static String toString-impl(int arg0) { return "IntParameter(offset=" + arg0 + ')'; } public String toString() { return toString-impl(this.offset); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } public int hashCode() { return hashCode-impl(this.offset); } public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof IntParameter)) return false;  int i = ((IntParameter)other).unbox-impl(); return !(arg0 != i); } public boolean equals(Object other) { return equals-impl(this.offset, other); } public static int constructor-impl(int offset) { return offset; }
/*      */     public static final boolean equals-impl0(int p1, int p2) { return (p1 == p2); } }
/*      */   @JvmInline @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\003\b@\030\000*\004\b\000\020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\032\020\t\032\0020\n2\b\020\013\032\004\030\0010\002HÖ\003¢\006\004\b\f\020\rJ\020\020\016\032\0020\004HÖ\001¢\006\004\b\017\020\006J\020\020\020\032\0020\021HÖ\001¢\006\004\b\022\020\023R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b\001\003¨\006\024"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "T", "", "offset", "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime"}) public static final class ObjectParameter<T> { private final int offset;
/*   75 */     public final int getOffset() { return this.offset; } public static String toString-impl(int arg0) { return "ObjectParameter(offset=" + arg0 + ')'; } public String toString() { return toString-impl(this.offset); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } public int hashCode() { return hashCode-impl(this.offset); } public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof ObjectParameter)) return false;  int i = ((ObjectParameter)other).unbox-impl(); return !(arg0 != i); } public boolean equals(Object other) { return equals-impl(this.offset, other); } public static <T> int constructor-impl(int offset) { return offset; }
/*      */     public static final boolean equals-impl0(int p1, int p2) { return (p1 == p2); } }
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\004H\026ø\001\000¢\006\004\b\n\020\013J(\020\f\032\0020\r*\0020\0162\n\020\017\032\006\022\002\b\0030\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,993:1\n79#1:994\n79#1:995\n1#2:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n82#1:994\n91#1:995\n*E\n"}) public static final class Ups extends Operation { @NotNull public static final Ups INSTANCE = new Ups(); public static final int $stable;
/*   78 */     private Ups() { super(1, 0, 2, null); } public final int getCount-jn0FJLE() {
/*   79 */       int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0);
/*      */     }
/*      */     @NotNull
/*   82 */     public String intParamName-w8GmfQM(int parameter) { Ups this_$iv = this; int $i$f$getCount-jn0FJLE = 0;
/*      */       
/*   84 */       return Operation.IntParameter.equals-impl0(parameter, 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  994 */           Operation.IntParameter.constructor-impl(0)) ? "count" : super.intParamName-w8GmfQM(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); Ups this_$iv; int i, $i$f$getCount-jn0FJLE;
/*  995 */       for (this_$iv = this, $i$f$getCount-jn0FJLE = 0, i = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)), $i$f$getCount-jn0FJLE = 0; $i$f$getCount-jn0FJLE < i; )
/*  996 */       { int it = $i$f$getCount-jn0FJLE; int $i$a$-repeat-Operation$Ups$execute$1 = 0; applier.up(); $i$f$getCount-jn0FJLE++; }  } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\021\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\t\032\0020\n2\n\020\013\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\f\020\rJ(\020\016\032\0020\017*\0020\0202\n\020\021\032\006\022\002\b\0030\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H\026R&\020\003\032\020\022\f\022\n\022\006\022\004\030\0010\0060\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\007\020\b\002\013\n\005\b¡\0360\001\n\002\b!¨\006\027"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Nodes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "", "getNodes-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,993:1\n96#1:994\n96#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n99#1:994\n110#1:995\n*E\n"}) public static final class Downs extends Operation { @NotNull public static final Downs INSTANCE = new Downs(); public static final int $stable; private Downs() { super(0, 1, 1, null); } public final int getNodes-HpuvwBQ() { int $i$f$getNodes-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } @NotNull public String objectParamName-31yXWZQ(int parameter) { Downs this_$iv = this; int $i$f$getNodes-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "nodes" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); Applier nodeApplier = applier; Downs this_$iv = this; int $i$f$getNodes-HpuvwBQ = 0; Object[] nodes = $this$execute.<Object[]>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); for (int index = 0; index < $i$f$getNodes-HpuvwBQ; index++) nodeApplier.down(nodes[index]);  } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\004H\026ø\001\000¢\006\004\b\n\020\013J(\020\f\032\0020\r*\0020\0162\n\020\017\032\006\022\002\b\0030\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Distance", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getDistance-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,993:1\n118#1:994\n118#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n121#1:994\n130#1:995\n*E\n"}) public static final class AdvanceSlotsBy extends Operation { @NotNull public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy(); public static final int $stable; private AdvanceSlotsBy() { super(1, 0, 2, null); } public final int getDistance-jn0FJLE() { int $i$f$getDistance-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } @NotNull public String intParamName-w8GmfQM(int parameter) { AdvanceSlotsBy this_$iv = this; int $i$f$getDistance-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "distance" : super.intParamName-w8GmfQM(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); AdvanceSlotsBy this_$iv = this; int $i$f$getDistance-jn0FJLE = 0; slots.advanceBy($this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\t\032\0020\n2\n\020\013\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\f\020\rJ(\020\016\032\0020\006*\0020\0172\n\020\020\032\006\022\002\b\0030\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026R$\020\003\032\016\022\n\022\b\022\004\022\0020\0060\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\007\020\b\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Effect", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getEffect-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,993:1\n137#1:994\n137#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n140#1:994\n149#1:995\n*E\n"}) public static final class SideEffect extends Operation { @NotNull public static final SideEffect INSTANCE = new SideEffect(); public static final int $stable; private SideEffect() { super(0, 1, 1, null); } public final int getEffect-HpuvwBQ() { int $i$f$getEffect-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } @NotNull public String objectParamName-31yXWZQ(int parameter) { SideEffect this_$iv = this; int $i$f$getEffect-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "effect" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); SideEffect this_$iv = this; int $i$f$getEffect-HpuvwBQ = 0; rememberManager.sideEffect($this$execute.<Function0>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\b\032\0020\t2\n\020\n\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\013\020\fJ(\020\r\032\0020\016*\0020\0172\n\020\020\032\006\022\002\b\0030\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,993:1\n154#1:994\n154#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n157#1:994\n166#1:995\n*E\n"}) public static final class Remember extends Operation { @NotNull public static final Remember INSTANCE = new Remember(); public static final int $stable; private Remember() { super(0, 1, 1, null); } public final int getValue-HpuvwBQ() { int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } @NotNull public String objectParamName-31yXWZQ(int parameter) { Remember this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "value" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); Remember this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; rememberManager.remembering($this$execute.<RememberObserver>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\016\020\017J(\020\020\032\0020\021*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R \020\b\032\n\022\006\022\004\030\0010\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Value", "", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,993:1\n171#1:994\n172#1:995\n171#1:996\n172#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n175#1:994\n176#1:995\n185#1:996\n186#1:997\n*E\n"}) public static final class AppendValue extends Operation { @NotNull public static final AppendValue INSTANCE = new AppendValue(); public static final int $stable; private AppendValue() { super(0, 2, 1, null); } public final int getAnchor-HpuvwBQ() { int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getValue-HpuvwBQ() { int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(1); } @NotNull public String objectParamName-31yXWZQ(int parameter) { int i = parameter; AppendValue this_$iv = this; int $i$f$getAnchor-HpuvwBQ = 0; this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "anchor" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "value" : super.objectParamName-31yXWZQ(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); AppendValue this_$iv = this; int $i$f$getAnchor-HpuvwBQ = 0; Anchor anchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); AppendValue appendValue1 = this; int $i$f$getValue-HpuvwBQ = 0;
/*  997 */       Object value = $this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); if (value instanceof RememberObserverHolder) rememberManager.remembering(((RememberObserverHolder)value).getWrapped());  slots.appendSlot(anchor, value); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\004H\026ø\001\000¢\006\004\b\n\020\013J(\020\f\032\0020\r*\0020\0162\n\020\017\032\006\022\002\b\0030\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,993:1\n195#1:994\n195#1:995\n1891#2,6:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n198#1:994\n207#1:995\n209#1:996,6\n*E\n"}) public static final class TrimParentValues extends Operation { @NotNull public static final TrimParentValues INSTANCE = new TrimParentValues(); public static final int $stable; private TrimParentValues() { super(1, 0, 2, null); } public final int getCount-jn0FJLE() { int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } @NotNull public String intParamName-w8GmfQM(int parameter) { TrimParentValues this_$iv = this; int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "count" : super.intParamName-w8GmfQM(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); TrimParentValues this_$iv = this; int $i$f$getCount-jn0FJLE = 0, count = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)); int slotsSize = slots.getSlotsSize(); SlotWriter slotWriter = slots; int groupIndex$iv = slots.getParent(), $i$f$forEachTailSlot = 0; int slotsStart$iv = slotWriter.slotsStartIndex$runtime(groupIndex$iv); int slotsEnd$iv = slotWriter.slotsEndIndex$runtime(groupIndex$iv);
/*  998 */       int slotIndex$iv = Math.max(slotsStart$iv, slotsEnd$iv - count); if (slotIndex$iv < slotsEnd$iv)
/*  999 */       { Object object1 = SlotWriter.access$getSlots$p(slotWriter)[SlotWriter.access$dataIndexToDataAddress(slotWriter, slotIndex$iv)]; int slotIndex = slotIndex$iv, $i$a$-forEachTailSlot-Operation$TrimParentValues$execute$1 = 0; Object object2 = object1; }  slots.trimTailSlots(count); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\013\032\0020\f2\006\020\r\032\0020\004H\026ø\001\000¢\006\004\b\016\020\017J\036\020\020\032\0020\f2\n\020\r\032\006\022\002\b\0030\bH\026ø\001\000¢\006\004\b\021\020\017J(\020\022\032\0020\023*\0020\0242\n\020\025\032\006\022\002\b\0030\0262\006\020\027\032\0020\0302\006\020\031\032\0020\032H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006R \020\007\032\n\022\006\022\004\030\0010\t0\b8Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\033"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "()I", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,993:1\n226#1:994\n225#1:995\n225#1:996\n226#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n229#1:994\n234#1:995\n243#1:996\n244#1:997\n*E\n"}) public static final class UpdateValue extends Operation { @NotNull public static final UpdateValue INSTANCE = new UpdateValue(); public static final int $stable; private UpdateValue() { super(1, 1, null); } public final int getValue-HpuvwBQ() { int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getGroupSlotIndex-jn0FJLE() { int $i$f$getGroupSlotIndex-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } @NotNull public String intParamName-w8GmfQM(int parameter) { UpdateValue this_$iv = this; int $i$f$getGroupSlotIndex-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "groupSlotIndex" : super.intParamName-w8GmfQM(parameter); } @NotNull public String objectParamName-31yXWZQ(int parameter) { UpdateValue this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "value" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); UpdateValue this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; Object value = $this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); UpdateValue updateValue1 = this; int $i$f$getGroupSlotIndex-jn0FJLE = 0, groupSlotIndex = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)); if (value instanceof RememberObserverHolder) rememberManager.remembering(((RememberObserverHolder)value).getWrapped());  Object previous = slots.set(groupSlotIndex, value); if (previous instanceof RememberObserverHolder) { int endRelativeOrder = slots.getSlotsSize() - slots.slotIndexOfGroupSlotIndex(slots.getCurrentGroup(), groupSlotIndex); rememberManager.forgetting(((RememberObserverHolder)previous).getWrapped(), endRelativeOrder, -1, -1); } else if (previous instanceof RecomposeScopeImpl) { ((RecomposeScopeImpl)previous).release(); }  } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\016\032\0020\0172\006\020\020\032\0020\tH\026ø\001\000¢\006\004\b\021\020\022J\036\020\023\032\0020\0172\n\020\020\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\024\020\022J(\020\025\032\0020\026*\0020\0272\n\020\030\032\006\022\002\b\0030\0312\006\020\032\032\0020\0332\006\020\034\032\0020\035H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\030\020\b\032\0020\t8Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007R \020\013\032\n\022\006\022\004\030\0010\f0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\r\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "Value", "", "getValue-HpuvwBQ", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,993:1\n266#1:994\n264#1:995\n265#1:996\n264#1:997\n265#1:998\n266#1:999\n4186#2,8:1000\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n269#1:994\n274#1:995\n275#1:996\n284#1:997\n285#1:998\n286#1:999\n295#1:1000,8\n*E\n"}) public static final class UpdateAnchoredValue extends Operation { @NotNull public static final UpdateAnchoredValue INSTANCE = new UpdateAnchoredValue(); public static final int $stable; private UpdateAnchoredValue() { super(1, 2, null); } public final int getValue-HpuvwBQ() { int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getAnchor-HpuvwBQ() { int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(1); } public final int getGroupSlotIndex-jn0FJLE() { int $i$f$getGroupSlotIndex-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } @NotNull public String intParamName-w8GmfQM(int parameter) { UpdateAnchoredValue this_$iv = INSTANCE; int $i$f$getGroupSlotIndex-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "groupSlotIndex" : super.intParamName-w8GmfQM(parameter); } @NotNull public String objectParamName-31yXWZQ(int parameter) { int i = parameter; UpdateAnchoredValue this_$iv = INSTANCE; int $i$f$getValue-HpuvwBQ = 0; this_$iv = INSTANCE; int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "value" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "anchor" : super.objectParamName-31yXWZQ(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); UpdateAnchoredValue this_$iv = INSTANCE; int $i$f$getValue-HpuvwBQ = 0; Object value = $this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); UpdateAnchoredValue updateAnchoredValue1 = INSTANCE; int $i$f$getAnchor-HpuvwBQ = 0; Anchor anchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); UpdateAnchoredValue updateAnchoredValue2 = INSTANCE; int $i$f$getGroupSlotIndex-jn0FJLE = 0, groupSlotIndex = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)); if (value instanceof RememberObserverHolder)
/* 1000 */         rememberManager.remembering(((RememberObserverHolder)value).getWrapped());  int groupIndex = slots.anchorIndex(anchor); Object previous = slots.set(groupIndex, groupSlotIndex, value); int endRelativeSlotOrder = slots.getSlotsSize() - slots.slotIndexOfGroupSlotIndex(groupIndex, groupSlotIndex); SlotWriter slotWriter = slots; Anchor anchor$iv = ((RememberObserverHolder)previous).getAfter(); int $i$f$withAfterAnchorInfo = 0; int priority$iv = -1;
/* 1001 */       int endRelativeAfter$iv = -1;
/* 1002 */       if (anchor$iv != null && anchor$iv.getValid()) {
/* 1003 */         priority$iv = slotWriter.anchorIndex(anchor$iv);
/* 1004 */         endRelativeAfter$iv = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime(priority$iv);
/*      */       } 
/* 1006 */       int i = endRelativeAfter$iv, priority = priority$iv, $i$a$-withAfterAnchorInfo-Operation$UpdateAnchoredValue$execute$1 = 0; rememberManager.forgetting(((RememberObserverHolder)previous).getWrapped(), endRelativeSlotOrder, priority, i); if (previous instanceof RecomposeScopeImpl) ((RecomposeScopeImpl)previous).release();  } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\b\032\0020\t2\n\020\n\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\013\020\fJ(\020\r\032\0020\016*\0020\0172\n\020\020\032\006\022\002\b\0030\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026R \020\003\032\n\022\006\022\004\030\0010\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Data", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getData-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,993:1\n312#1:994\n312#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n315#1:994\n324#1:995\n*E\n"}) public static final class UpdateAuxData extends Operation { @NotNull public static final UpdateAuxData INSTANCE = new UpdateAuxData(); public static final int $stable; private UpdateAuxData() { super(0, 1, 1, null); } public final int getData-HpuvwBQ() { int $i$f$getData-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } @NotNull public String objectParamName-31yXWZQ(int parameter) { UpdateAuxData this_$iv = this; int $i$f$getData-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "data" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); UpdateAuxData this_$iv = this; int $i$f$getData-HpuvwBQ = 0; slots.updateAux($this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) public static final class EnsureRootGroupStarted extends Operation { @NotNull public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted(); public static final int $stable; private EnsureRootGroupStarted() { super(0, 0, 3, null); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); slots.ensureStarted(0); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\b\032\0020\t2\n\020\n\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\013\020\fJ(\020\r\032\0020\016*\0020\0172\n\020\020\032\006\022\002\b\0030\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,993:1\n339#1:994\n339#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n342#1:994\n351#1:995\n*E\n"}) public static final class EnsureGroupStarted extends Operation { @NotNull public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted(); public static final int $stable; private EnsureGroupStarted() { super(0, 1, 1, null); } public final int getAnchor-HpuvwBQ() { int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } @NotNull public String objectParamName-31yXWZQ(int parameter) { EnsureGroupStarted this_$iv = this; int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "anchor" : super.objectParamName-31yXWZQ(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); EnsureGroupStarted this_$iv = this; int $i$f$getAnchor-HpuvwBQ = 0; slots.ensureStarted($this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) public static final class RemoveCurrentGroup extends Operation { @NotNull public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup(); public static final int $stable; private RemoveCurrentGroup() { super(0, 0, 3, null); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); ComposerKt.removeCurrentGroup(slots, rememberManager); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\004H\026ø\001\000¢\006\004\b\n\020\013J(\020\f\032\0020\r*\0020\0162\n\020\017\032\006\022\002\b\0030\0202\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Offset", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getOffset-jn0FJLE", "()I", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,993:1\n366#1:994\n366#1:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n369#1:994\n378#1:995\n*E\n"}) public static final class MoveCurrentGroup extends Operation { @NotNull public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup(); public static final int $stable; private MoveCurrentGroup() { super(1, 0, 2, null); } public final int getOffset-jn0FJLE() { int $i$f$getOffset-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } @NotNull public String intParamName-w8GmfQM(int parameter) { MoveCurrentGroup this_$iv = this; int $i$f$getOffset-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "offset" : super.intParamName-w8GmfQM(parameter); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); MoveCurrentGroup this_$iv = this; int $i$f$getOffset-jn0FJLE = 0; slots.moveGroup($this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) public static final class EndCurrentGroup extends Operation { @NotNull public static final EndCurrentGroup INSTANCE = new EndCurrentGroup(); public static final int $stable; private EndCurrentGroup() { super(0, 0, 3, null); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); slots.endGroup(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) public static final class SkipToEndOfCurrentGroup extends Operation { @NotNull public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup(); public static final int $stable; private SkipToEndOfCurrentGroup() { super(0, 0, 3, null); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); slots.skipToGroupEnd(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\005\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\f\032\0020\r2\n\020\016\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\017\020\020J(\020\021\032\0020\007*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R*\020\003\032\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\0070\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\b\020\tR\036\020\n\032\b\022\004\022\0020\0060\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\013\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Action", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "", "getAction-HpuvwBQ", "()I", "Composition", "getComposition-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,993:1\n403#1:994\n404#1:995\n403#1:996\n404#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n407#1:994\n408#1:995\n417#1:996\n418#1:997\n*E\n"}) public static final class EndCompositionScope extends Operation { @NotNull public static final EndCompositionScope INSTANCE = new EndCompositionScope(); public static final int $stable; private EndCompositionScope() { super(0, 2, 1, null); } public final int getAction-HpuvwBQ() { int $i$f$getAction-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getComposition-HpuvwBQ() { int $i$f$getComposition-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(1); } @NotNull public String objectParamName-31yXWZQ(int parameter) { int i = parameter; EndCompositionScope this_$iv = this; int $i$f$getAction-HpuvwBQ = 0; this_$iv = this; int $i$f$getComposition-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "anchor" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "composition" : super.objectParamName-31yXWZQ(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); EndCompositionScope this_$iv = this; int $i$f$getAction-HpuvwBQ = 0; Function1 action = $this$execute.<Function1>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); EndCompositionScope endCompositionScope1 = this; int $i$f$getComposition-HpuvwBQ = 0; Composition composition = $this$execute.<Composition>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); action.invoke(composition); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) public static final class UseCurrentNode extends Operation { @NotNull public static final UseCurrentNode INSTANCE = new UseCurrentNode(); public static final int $stable; private UseCurrentNode() { super(0, 0, 3, null); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); Intrinsics.checkNotNull(applier.getCurrent(), "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback"); ((ComposeNodeLifecycleCallback)applier.getCurrent()).onReuse(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\020\002\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\r\032\0020\0162\n\020\017\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\020\020\021J(\020\022\032\0020\007*\0020\0232\n\020\024\032\006\022\002\b\0030\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026R9\020\003\032#\022\037\022\035\022\006\022\004\030\0010\006\022\006\022\004\030\0010\006\022\004\022\0020\0070\005¢\006\002\b\b0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\t\020\nR \020\013\032\n\022\006\022\004\030\0010\0060\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\f\020\n\002\013\n\005\b¡\0360\001\n\002\b!¨\006\032"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Block", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "()I", "Value", "getValue-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,993:1\n435#1:994\n436#1:995\n435#1:996\n436#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n439#1:994\n440#1:995\n449#1:996\n450#1:997\n*E\n"}) public static final class UpdateNode extends Operation { @NotNull public static final UpdateNode INSTANCE = new UpdateNode(); public static final int $stable; private UpdateNode() { super(0, 2, 1, null); } public final int getValue-HpuvwBQ() { int $i$f$getValue-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getBlock-HpuvwBQ() { int $i$f$getBlock-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(1); } @NotNull public String objectParamName-31yXWZQ(int parameter) { int i = parameter; UpdateNode this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; this_$iv = this; int $i$f$getBlock-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "value" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "block" : super.objectParamName-31yXWZQ(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); UpdateNode this_$iv = this; int $i$f$getValue-HpuvwBQ = 0; Object value = $this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); UpdateNode updateNode1 = this; int $i$f$getBlock-HpuvwBQ = 0; Function2 block = $this$execute.<Function2>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); block.invoke(applier.getCurrent(), value); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\t\032\0020\n2\006\020\013\032\0020\004H\026ø\001\000¢\006\004\b\f\020\rJ(\020\016\032\0020\017*\0020\0202\n\020\021\032\006\022\002\b\0030\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006R\030\020\007\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\b\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\027"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "RemoveIndex", "getRemoveIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,993:1\n456#1:994\n457#1:995\n456#1:996\n457#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n460#1:994\n461#1:995\n471#1:996\n472#1:997\n*E\n"}) public static final class RemoveNode extends Operation { @NotNull public static final RemoveNode INSTANCE = new RemoveNode(); public static final int $stable; private RemoveNode() { super(2, 0, 2, null); } public final int getRemoveIndex-jn0FJLE() { int $i$f$getRemoveIndex-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } public final int getCount-jn0FJLE() { int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(1); } @NotNull public String intParamName-w8GmfQM(int parameter) { int i = parameter; RemoveNode this_$iv = this; int $i$f$getRemoveIndex-jn0FJLE = 0; this_$iv = this; int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(i, Operation.IntParameter.constructor-impl(0)) ? "removeIndex" : (Operation.IntParameter.equals-impl0(i, Operation.IntParameter.constructor-impl(1)) ? "count" : super.intParamName-w8GmfQM(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); RemoveNode this_$iv = this; int $i$f$getRemoveIndex-jn0FJLE = 0; this_$iv = this; int $i$f$getCount-jn0FJLE = 0; applier.remove($this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)), $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(1))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\013\032\0020\f2\006\020\r\032\0020\004H\026ø\001\000¢\006\004\b\016\020\017J(\020\020\032\0020\021*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R\030\020\003\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\005\020\006R\030\020\007\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\b\020\006R\030\020\t\032\0020\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "From", "getFrom-jn0FJLE", "To", "getTo-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,993:1\n478#1:994\n479#1:995\n480#1:996\n478#1:997\n479#1:998\n480#1:999\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n483#1:994\n484#1:995\n485#1:996\n495#1:997\n496#1:998\n497#1:999\n*E\n"}) public static final class MoveNode extends Operation { @NotNull public static final MoveNode INSTANCE = new MoveNode(); public static final int $stable; private MoveNode() { super(3, 0, 2, null); } public final int getFrom-jn0FJLE() { int $i$f$getFrom-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(0); } public final int getTo-jn0FJLE() { int $i$f$getTo-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(1); } public final int getCount-jn0FJLE() { int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.constructor-impl(2); } @NotNull public String intParamName-w8GmfQM(int parameter) { int i = parameter; MoveNode this_$iv = this; int $i$f$getFrom-jn0FJLE = 0; this_$iv = this; int $i$f$getTo-jn0FJLE = 0; this_$iv = this; int $i$f$getCount-jn0FJLE = 0; return Operation.IntParameter.equals-impl0(i, Operation.IntParameter.constructor-impl(0)) ? "from" : (Operation.IntParameter.equals-impl0(i, Operation.IntParameter.constructor-impl(1)) ? "to" : (Operation.IntParameter.equals-impl0(i, Operation.IntParameter.constructor-impl(2)) ? "count" : super.intParamName-w8GmfQM(parameter))); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); MoveNode this_$iv = this; int $i$f$getFrom-jn0FJLE = 0; this_$iv = this; int $i$f$getTo-jn0FJLE = 0; this_$iv = this; int $i$f$getCount-jn0FJLE = 0; applier.move($this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0)), $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(1)), $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(2))); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\016\020\017J(\020\020\032\0020\021*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\036\020\b\032\b\022\004\022\0020\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,993:1\n503#1:994\n504#1:995\n504#1:996\n503#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n507#1:994\n508#1:995\n517#1:996\n518#1:997\n*E\n"}) public static final class InsertSlots extends Operation { @NotNull public static final InsertSlots INSTANCE = new InsertSlots(); public static final int $stable; private InsertSlots() { super(0, 2, 1, null); } public final int getAnchor-HpuvwBQ() { int $i$f$getAnchor-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(0); } public final int getFromSlotTable-HpuvwBQ() { int $i$f$getFromSlotTable-HpuvwBQ = 0; return Operation.ObjectParameter.constructor-impl(1); } @NotNull public String objectParamName-31yXWZQ(int parameter) { int i = parameter; InsertSlots this_$iv = this; int $i$f$getAnchor-HpuvwBQ = 0; this_$iv = this; int $i$f$getFromSlotTable-HpuvwBQ = 0; return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "anchor" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "from" : super.objectParamName-31yXWZQ(parameter)); } public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); InsertSlots this_$iv = this; int $i$f$getFromSlotTable-HpuvwBQ = 0; SlotTable insertTable = $this$execute.<SlotTable>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); InsertSlots insertSlots1 = this; int $i$f$getAnchor-HpuvwBQ = 0; Anchor anchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); slots.beginInsert(); slots.moveFrom(insertTable, anchor.toIndexFor(insertTable), false); slots.endInsert(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\016\032\0020\0172\n\020\020\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\021\020\022J(\020\023\032\0020\024*\0020\0252\n\020\026\032\006\022\002\b\0030\0272\006\020\030\032\0020\0312\006\020\032\032\0020\033H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\036\020\b\032\b\022\004\022\0020\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007R\036\020\013\032\b\022\004\022\0020\f0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\r\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\034"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Fixups", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"}) @StabilityInferred(parameters = 1) @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,993:1\n531#1:994\n532#1:995\n533#1:996\n532#1:997\n531#1:998\n533#1:999\n177#2,5:1000\n183#2,3:1006\n1#3:1005\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n536#1:994\n537#1:995\n538#1:996\n547#1:997\n548#1:998\n549#1:999\n551#1:1000,5\n551#1:1006,3\n551#1:1005\n*E\n"}) public static final class InsertSlotsWithFixups extends Operation { public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter($this$execute, "<this>"); Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); InsertSlotsWithFixups this_$iv = this; int $i$f$getFromSlotTable-HpuvwBQ = 0; SlotTable insertTable = $this$execute.<SlotTable>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)); InsertSlotsWithFixups insertSlotsWithFixups1 = this; int $i$f$getAnchor-HpuvwBQ = 0; Anchor anchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)); InsertSlotsWithFixups insertSlotsWithFixups2 = this; int $i$f$getFixups-HpuvwBQ = 0; FixupList fixups = $this$execute.<FixupList>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(2)); SlotTable slotTable1 = insertTable; int $i$f$write = 0; SlotWriter writer$iv = slotTable1.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0; boolean normalClose$iv = false; try { SlotWriter writer = writer$iv; int $i$a$-write-Operation$InsertSlotsWithFixups$execute$1 = 0; fixups.executeAndFlushAllPendingFixups(applier, writer, rememberManager); Unit unit = Unit.INSTANCE; Object it$iv = unit; int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; unit = unit; writer$iv.close(normalClose$iv); } finally { writer$iv.close(normalClose$iv); }
/*      */       
/*      */       slots.moveFrom(insertTable, anchor.toIndexFor(insertTable), false);
/*      */       slots.endInsert(); }
/*      */ 
/*      */     
/*      */     @NotNull
/*      */     public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();
/*      */     public static final int $stable;
/*      */     
/*      */     private InsertSlotsWithFixups() {
/*      */       super(0, 3, 1, null);
/*      */     }
/*      */     
/*      */     public final int getAnchor-HpuvwBQ() {
/*      */       int $i$f$getAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getFromSlotTable-HpuvwBQ() {
/*      */       int $i$f$getFromSlotTable-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     public final int getFixups-HpuvwBQ() {
/*      */       int $i$f$getFixups-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(2);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       InsertSlotsWithFixups this_$iv = this;
/*      */       int $i$f$getAnchor-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getFromSlotTable-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getFixups-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "anchor" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "from" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(2)) ? "fixups" : super.objectParamName-31yXWZQ(parameter)));
/*      */     } }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\017\032\0020\0202\006\020\021\032\0020\rH\026ø\001\000¢\006\004\b\022\020\023J\036\020\024\032\0020\0202\n\020\021\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\025\020\023J(\020\026\032\0020\027*\0020\0302\n\020\031\032\006\022\002\b\0030\0322\006\020\033\032\0020\0342\006\020\035\032\0020\036H\026R&\020\003\032\020\022\f\022\n\022\006\022\004\030\0010\0060\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\007\020\bR\036\020\t\032\b\022\004\022\0020\n0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\013\020\bR\030\020\f\032\0020\r8Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\016\020\b\002\013\n\005\b¡\0360\001\n\002\b!¨\006\037"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Factory", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "GroupAnchor", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,993:1\n566#1:994\n565#1:995\n567#1:996\n565#1:997\n567#1:998\n566#1:999\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n570#1:994\n575#1:995\n576#1:996\n585#1:997\n586#1:998\n587#1:999\n*E\n"})
/*      */   public static final class InsertNodeFixup extends Operation {
/*      */     @NotNull
/*      */     public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();
/*      */     public static final int $stable;
/*      */     
/*      */     private InsertNodeFixup() {
/*      */       super(1, 2, null);
/*      */     }
/*      */     
/*      */     public final int getFactory-HpuvwBQ() {
/*      */       int $i$f$getFactory-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getInsertIndex-jn0FJLE() {
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0;
/*      */       return Operation.IntParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getGroupAnchor-HpuvwBQ() {
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String intParamName-w8GmfQM(int parameter) {
/*      */       InsertNodeFixup this_$iv = this;
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0;
/*      */       return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "insertIndex" : super.intParamName-w8GmfQM(parameter);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       InsertNodeFixup this_$iv = this;
/*      */       int $i$f$getFactory-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "factory" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "groupAnchor" : super.objectParamName-31yXWZQ(parameter));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       InsertNodeFixup this_$iv = this;
/*      */       int $i$f$getFactory-HpuvwBQ = 0;
/*      */       Object node = ((Function0)$this$execute.<Function0>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))).invoke();
/*      */       InsertNodeFixup insertNodeFixup1 = this;
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       Anchor groupAnchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1));
/*      */       InsertNodeFixup insertNodeFixup2 = this;
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0, insertIndex = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0));
/*      */       Applier nodeApplier = applier;
/*      */       slots.updateNode(groupAnchor, node);
/*      */       nodeApplier.insertTopDown(insertIndex, node);
/*      */       nodeApplier.down(node);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\013\032\0020\f2\006\020\r\032\0020\tH\026ø\001\000¢\006\004\b\016\020\017J\036\020\020\032\0020\f2\n\020\r\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\021\020\017J(\020\022\032\0020\023*\0020\0242\n\020\025\032\006\022\002\b\0030\0262\006\020\027\032\0020\0302\006\020\031\032\0020\032H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\030\020\b\032\0020\t8Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\033"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupAnchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "()I", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", "parameter", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,993:1\n597#1:994\n598#1:995\n598#1:996\n597#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n601#1:994\n606#1:995\n615#1:996\n616#1:997\n*E\n"})
/*      */   public static final class PostInsertNodeFixup extends Operation {
/*      */     @NotNull
/*      */     public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();
/*      */     public static final int $stable;
/*      */     
/*      */     private PostInsertNodeFixup() {
/*      */       super(1, 1, null);
/*      */     }
/*      */     
/*      */     public final int getInsertIndex-jn0FJLE() {
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0;
/*      */       return Operation.IntParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getGroupAnchor-HpuvwBQ() {
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String intParamName-w8GmfQM(int parameter) {
/*      */       PostInsertNodeFixup this_$iv = this;
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0;
/*      */       return Operation.IntParameter.equals-impl0(parameter, Operation.IntParameter.constructor-impl(0)) ? "insertIndex" : super.intParamName-w8GmfQM(parameter);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       PostInsertNodeFixup this_$iv = this;
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(parameter, Operation.ObjectParameter.constructor-impl(0)) ? "groupAnchor" : super.objectParamName-31yXWZQ(parameter);
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       PostInsertNodeFixup this_$iv = this;
/*      */       int $i$f$getGroupAnchor-HpuvwBQ = 0;
/*      */       Anchor groupAnchor = $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0));
/*      */       PostInsertNodeFixup postInsertNodeFixup1 = this;
/*      */       int $i$f$getInsertIndex-jn0FJLE = 0, insertIndex = $this$execute.getInt-w8GmfQM(Operation.IntParameter.constructor-impl(0));
/*      */       applier.up();
/*      */       Applier nodeApplier = applier;
/*      */       Object nodeToInsert = slots.node(groupAnchor);
/*      */       nodeApplier.insertBottomUp(insertIndex, nodeToInsert);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   public static final class DeactivateCurrentGroup extends Operation {
/*      */     @NotNull
/*      */     public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();
/*      */     public static final int $stable;
/*      */     
/*      */     private DeactivateCurrentGroup() {
/*      */       super(0, 0, 3, null);
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       ComposerKt.deactivateCurrentGroup(slots, rememberManager);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   public static final class ResetSlots extends Operation {
/*      */     @NotNull
/*      */     public static final ResetSlots INSTANCE = new ResetSlots();
/*      */     public static final int $stable;
/*      */     
/*      */     private ResetSlots() {
/*      */       super(0, 0, 3, null);
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       slots.reset();
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\016\020\017J(\020\020\032\0020\021*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\036\020\b\032\b\022\004\022\0020\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,993:1\n648#1:994\n649#1:995\n648#1:996\n649#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n652#1:994\n653#1:995\n663#1:996\n667#1:997\n*E\n"})
/*      */   public static final class DetermineMovableContentNodeIndex extends Operation {
/*      */     @NotNull
/*      */     public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();
/*      */     public static final int $stable;
/*      */     
/*      */     private DetermineMovableContentNodeIndex() {
/*      */       super(0, 2, 1, null);
/*      */     }
/*      */     
/*      */     public final int getEffectiveNodeIndexOut-HpuvwBQ() {
/*      */       int $i$f$getEffectiveNodeIndexOut-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getAnchor-HpuvwBQ() {
/*      */       int $i$f$getAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       DetermineMovableContentNodeIndex this_$iv = this;
/*      */       int $i$f$getEffectiveNodeIndexOut-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getAnchor-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "effectiveNodeIndexOut" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "anchor" : super.objectParamName-31yXWZQ(parameter));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       DetermineMovableContentNodeIndex this_$iv = this;
/*      */       int $i$f$getEffectiveNodeIndexOut-HpuvwBQ = 0;
/*      */       IntRef effectiveNodeIndexOut = $this$execute.<IntRef>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0));
/*      */       this_$iv = this;
/*      */       int $i$f$getAnchor-HpuvwBQ = 0;
/*      */       effectiveNodeIndexOut.setElement(OperationKt.access$positionToInsert(slots, $this$execute.<Anchor>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)), applier));
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\f\032\0020\r2\n\020\016\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\017\020\020J(\020\021\032\0020\022*\0020\0232\n\020\024\032\006\022\002\b\0030\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R&\020\b\032\020\022\f\022\n\022\006\022\004\030\0010\n0\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\013\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\032"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "EffectiveNodeIndex", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "Nodes", "", "", "getNodes-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,993:1\n676#1:994\n677#1:995\n676#1:996\n677#1:997\n64#2,6:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n680#1:994\n681#1:995\n690#1:996\n691#1:997\n693#1:998,6\n*E\n"})
/*      */   public static final class CopyNodesToNewAnchorLocation extends Operation {
/*      */     @NotNull
/*      */     public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();
/*      */     public static final int $stable;
/*      */     
/*      */     private CopyNodesToNewAnchorLocation() {
/*      */       super(0, 2, 1, null);
/*      */     }
/*      */     
/*      */     public final int getEffectiveNodeIndex-HpuvwBQ() {
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getNodes-HpuvwBQ() {
/*      */       int $i$f$getNodes-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       CopyNodesToNewAnchorLocation this_$iv = this;
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getNodes-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "effectiveNodeIndex" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "nodes" : super.objectParamName-31yXWZQ(parameter));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       CopyNodesToNewAnchorLocation this_$iv = this;
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0, effectiveNodeIndex = ((IntRef)$this$execute.<IntRef>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))).getElement();
/*      */       CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation1 = this;
/*      */       int $i$f$getNodes-HpuvwBQ = 0;
/*      */       List nodesToInsert = $this$execute.<List>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1));
/*      */       List $this$fastForEachIndexed$iv = nodesToInsert;
/*      */       int $i$f$fastForEachIndexed = 0;
/*      */       int index$iv = 0, i = $this$fastForEachIndexed$iv.size();
/*      */       if (index$iv < i) {
/*      */         Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/*      */         Object object1 = item$iv;
/*      */         int j = index$iv, $i$a$-fastForEachIndexed-Operation$CopyNodesToNewAnchorLocation$execute$1 = 0;
/*      */         applier.insertBottomUp(effectiveNodeIndex + j, object1);
/*      */         applier.insertTopDown(effectiveNodeIndex + j, object1);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\020\032\0020\0212\n\020\022\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\023\020\024J(\020\025\032\0020\026*\0020\0272\n\020\030\032\006\022\002\b\0030\0312\006\020\032\032\0020\0332\006\020\034\032\0020\035H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\036\020\b\032\b\022\004\022\0020\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007R \020\013\032\n\022\006\022\004\030\0010\f0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\r\020\007R\036\020\016\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\017\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "From", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ResolvedState", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "To", "getTo-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,993:1\n703#1:994\n704#1:995\n705#1:996\n706#1:997\n705#1:998\n706#1:999\n704#1:1000\n703#1:1001\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n709#1:994\n710#1:995\n711#1:996\n712#1:997\n721#1:998\n722#1:999\n724#1:1000\n726#1:1001\n*E\n"})
/*      */   public static final class CopySlotTableToAnchorLocation extends Operation {
/*      */     @NotNull
/*      */     public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();
/*      */     public static final int $stable;
/*      */     
/*      */     private CopySlotTableToAnchorLocation() {
/*      */       super(0, 4, 1, null);
/*      */     }
/*      */     
/*      */     public final int getResolvedState-HpuvwBQ() {
/*      */       int $i$f$getResolvedState-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getParentCompositionContext-HpuvwBQ() {
/*      */       int $i$f$getParentCompositionContext-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     public final int getFrom-HpuvwBQ() {
/*      */       int $i$f$getFrom-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(2);
/*      */     }
/*      */     
/*      */     public final int getTo-HpuvwBQ() {
/*      */       int $i$f$getTo-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(3);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       CopySlotTableToAnchorLocation this_$iv = this;
/*      */       int $i$f$getResolvedState-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getParentCompositionContext-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getFrom-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getTo-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "resolvedState" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "resolvedCompositionContext" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(2)) ? "from" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(3)) ? "to" : super.objectParamName-31yXWZQ(parameter))));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc '<this>'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_2
/*      */       //   7: ldc 'applier'
/*      */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   12: aload_3
/*      */       //   13: ldc 'slots'
/*      */       //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   18: aload #4
/*      */       //   20: ldc 'rememberManager'
/*      */       //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   25: aload_1
/*      */       //   26: aload_0
/*      */       //   27: astore #6
/*      */       //   29: iconst_0
/*      */       //   30: istore #7
/*      */       //   32: iconst_2
/*      */       //   33: invokestatic constructor-impl : (I)I
/*      */       //   36: invokeinterface getObject-31yXWZQ : (I)Ljava/lang/Object;
/*      */       //   41: checkcast androidx/compose/runtime/MovableContentStateReference
/*      */       //   44: astore #5
/*      */       //   46: aload_1
/*      */       //   47: aload_0
/*      */       //   48: astore #7
/*      */       //   50: iconst_0
/*      */       //   51: istore #8
/*      */       //   53: iconst_3
/*      */       //   54: invokestatic constructor-impl : (I)I
/*      */       //   57: invokeinterface getObject-31yXWZQ : (I)Ljava/lang/Object;
/*      */       //   62: checkcast androidx/compose/runtime/MovableContentStateReference
/*      */       //   65: astore #6
/*      */       //   67: aload_1
/*      */       //   68: aload_0
/*      */       //   69: astore #8
/*      */       //   71: iconst_0
/*      */       //   72: istore #9
/*      */       //   74: iconst_1
/*      */       //   75: invokestatic constructor-impl : (I)I
/*      */       //   78: invokeinterface getObject-31yXWZQ : (I)Ljava/lang/Object;
/*      */       //   83: checkcast androidx/compose/runtime/CompositionContext
/*      */       //   86: astore #7
/*      */       //   88: aload_1
/*      */       //   89: aload_0
/*      */       //   90: astore #10
/*      */       //   92: iconst_0
/*      */       //   93: istore #11
/*      */       //   95: iconst_0
/*      */       //   96: invokestatic constructor-impl : (I)I
/*      */       //   99: invokeinterface getObject-31yXWZQ : (I)Ljava/lang/Object;
/*      */       //   104: checkcast androidx/compose/runtime/MovableContentState
/*      */       //   107: dup
/*      */       //   108: ifnonnull -> 138
/*      */       //   111: pop
/*      */       //   112: aload #7
/*      */       //   114: aload #5
/*      */       //   116: invokevirtual movableContentStateResolve$runtime : (Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;
/*      */       //   119: dup
/*      */       //   120: ifnonnull -> 138
/*      */       //   123: pop
/*      */       //   124: ldc 'Could not resolve state for movable content'
/*      */       //   126: invokestatic composeRuntimeError : (Ljava/lang/String;)Ljava/lang/Void;
/*      */       //   129: pop
/*      */       //   130: new kotlin/KotlinNothingValueException
/*      */       //   133: dup
/*      */       //   134: invokespecial <init> : ()V
/*      */       //   137: athrow
/*      */       //   138: astore #8
/*      */       //   140: aload_3
/*      */       //   141: iconst_1
/*      */       //   142: aload #8
/*      */       //   144: invokevirtual getSlotTable$runtime : ()Landroidx/compose/runtime/SlotTable;
/*      */       //   147: iconst_2
/*      */       //   148: invokevirtual moveIntoGroupFrom : (ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;
/*      */       //   151: astore #9
/*      */       //   153: getstatic androidx/compose/runtime/RecomposeScopeImpl.Companion : Landroidx/compose/runtime/RecomposeScopeImpl$Companion;
/*      */       //   156: aload_3
/*      */       //   157: aload #9
/*      */       //   159: aload #6
/*      */       //   161: invokevirtual getComposition$runtime : ()Landroidx/compose/runtime/ControlledComposition;
/*      */       //   164: dup
/*      */       //   165: ldc 'null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner'
/*      */       //   167: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   170: checkcast androidx/compose/runtime/RecomposeScopeOwner
/*      */       //   173: invokevirtual adoptAnchoredScopes$runtime : (Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V
/*      */       //   176: return
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #721	-> 25
/*      */       //   #998	-> 32
/*      */       //   #721	-> 36
/*      */       //   #722	-> 46
/*      */       //   #999	-> 53
/*      */       //   #722	-> 57
/*      */       //   #724	-> 67
/*      */       //   #1000	-> 74
/*      */       //   #724	-> 78
/*      */       //   #723	-> 86
/*      */       //   #726	-> 88
/*      */       //   #1001	-> 95
/*      */       //   #726	-> 99
/*      */       //   #727	-> 111
/*      */       //   #726	-> 119
/*      */       //   #728	-> 124
/*      */       //   #726	-> 138
/*      */       //   #735	-> 140
/*      */       //   #739	-> 153
/*      */       //   #740	-> 156
/*      */       //   #741	-> 157
/*      */       //   #742	-> 159
/*      */       //   #739	-> 173
/*      */       //   #744	-> 176
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   32	4	7	$i$f$getFrom-HpuvwBQ	I
/*      */       //   29	7	6	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*      */       //   53	4	8	$i$f$getTo-HpuvwBQ	I
/*      */       //   50	7	7	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*      */       //   74	4	9	$i$f$getParentCompositionContext-HpuvwBQ	I
/*      */       //   71	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*      */       //   95	4	11	$i$f$getResolvedState-HpuvwBQ	I
/*      */       //   92	7	10	this_$iv	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*      */       //   46	131	5	from	Landroidx/compose/runtime/MovableContentStateReference;
/*      */       //   67	110	6	to	Landroidx/compose/runtime/MovableContentStateReference;
/*      */       //   88	89	7	parentCompositionContext	Landroidx/compose/runtime/CompositionContext;
/*      */       //   140	37	8	resolvedState	Landroidx/compose/runtime/MovableContentState;
/*      */       //   153	24	9	anchors	Ljava/util/List;
/*      */       //   0	177	0	this	Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
/*      */       //   0	177	1	$this$execute	Landroidx/compose/runtime/changelist/OperationArgContainer;
/*      */       //   0	177	2	applier	Landroidx/compose/runtime/Applier;
/*      */       //   0	177	3	slots	Landroidx/compose/runtime/SlotWriter;
/*      */       //   0	177	4	rememberManager	Landroidx/compose/runtime/RememberManager;
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\004*\0020\0052\n\020\006\032\006\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   public static final class EndMovableContentPlacement extends Operation {
/*      */     @NotNull
/*      */     public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();
/*      */     public static final int $stable;
/*      */     
/*      */     private EndMovableContentPlacement() {
/*      */       super(0, 0, 3, null);
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       OperationKt.access$positionToParentOf(slots, applier, 0);
/*      */       slots.endGroup();
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\016\032\0020\0172\n\020\020\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\021\020\022J(\020\023\032\0020\024*\0020\0252\n\020\026\032\006\022\002\b\0030\0272\006\020\030\032\0020\0312\006\020\032\032\0020\033H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R\036\020\b\032\b\022\004\022\0020\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007R\036\020\013\032\b\022\004\022\0020\f0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\r\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\034"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Composition", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "Reference", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,993:1\n764#1:994\n765#1:995\n766#1:996\n764#1:997\n765#1:998\n766#1:999\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n769#1:994\n770#1:995\n771#1:996\n781#1:997\n782#1:998\n783#1:999\n*E\n"})
/*      */   public static final class ReleaseMovableGroupAtCurrent extends Operation {
/*      */     @NotNull
/*      */     public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();
/*      */     public static final int $stable;
/*      */     
/*      */     private ReleaseMovableGroupAtCurrent() {
/*      */       super(0, 3, 1, null);
/*      */     }
/*      */     
/*      */     public final int getComposition-HpuvwBQ() {
/*      */       int $i$f$getComposition-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getParentCompositionContext-HpuvwBQ() {
/*      */       int $i$f$getParentCompositionContext-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     public final int getReference-HpuvwBQ() {
/*      */       int $i$f$getReference-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(2);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       ReleaseMovableGroupAtCurrent this_$iv = this;
/*      */       int $i$f$getComposition-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getParentCompositionContext-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getReference-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "composition" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "parentCompositionContext" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(2)) ? "reference" : super.objectParamName-31yXWZQ(parameter)));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       ReleaseMovableGroupAtCurrent this_$iv = this;
/*      */       int $i$f$getComposition-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getParentCompositionContext-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getReference-HpuvwBQ = 0;
/*      */       OperationKt.access$releaseMovableGroupAtCurrent($this$execute.<ControlledComposition>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0)), $this$execute.<CompositionContext>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)), $this$execute.<MovableContentStateReference>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(2)), slots);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\013\032\0020\f2\n\020\r\032\006\022\002\b\0030\004H\026ø\001\000¢\006\004\b\016\020\017J(\020\020\032\0020\021*\0020\0222\n\020\023\032\006\022\002\b\0030\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\026R\036\020\003\032\b\022\004\022\0020\0050\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\006\020\007R \020\b\032\n\022\006\022\004\030\0010\t0\0048Æ\002ø\001\000ø\001\001¢\006\006\032\004\b\n\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Changes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "EffectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "objectParamName", "", "parameter", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime"})
/*      */   @StabilityInferred(parameters = 1)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,993:1\n790#1:994\n791#1:995\n791#1:996\n790#1:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n794#1:994\n795#1:995\n804#1:996\n806#1:997\n*E\n"})
/*      */   public static final class ApplyChangeList extends Operation {
/*      */     @NotNull
/*      */     public static final ApplyChangeList INSTANCE = new ApplyChangeList();
/*      */     public static final int $stable;
/*      */     
/*      */     private ApplyChangeList() {
/*      */       super(0, 2, 1, null);
/*      */     }
/*      */     
/*      */     public final int getChanges-HpuvwBQ() {
/*      */       int $i$f$getChanges-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(0);
/*      */     }
/*      */     
/*      */     public final int getEffectiveNodeIndex-HpuvwBQ() {
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.constructor-impl(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String objectParamName-31yXWZQ(int parameter) {
/*      */       int i = parameter;
/*      */       ApplyChangeList this_$iv = this;
/*      */       int $i$f$getChanges-HpuvwBQ = 0;
/*      */       this_$iv = this;
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0;
/*      */       return Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(0)) ? "changes" : (Operation.ObjectParameter.equals-impl0(i, Operation.ObjectParameter.constructor-impl(1)) ? "effectiveNodeIndex" : super.objectParamName-31yXWZQ(parameter));
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       ApplyChangeList applyChangeList1 = this;
/*      */       int $i$f$getEffectiveNodeIndex-HpuvwBQ = 0;
/*      */       (IntRef)$this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1));
/*      */       int effectiveNodeIndex = ((IntRef)$this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1)) != null) ? ((IntRef)$this$execute.getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(1))).getElement() : 0;
/*      */       ApplyChangeList this_$iv = this;
/*      */       int $i$f$getChanges-HpuvwBQ = 0;
/*      */       if (effectiveNodeIndex > 0);
/*      */       ((ChangeList)$this$execute.<ChangeList>getObject-31yXWZQ(Operation.ObjectParameter.constructor-impl(0))).executeAndFlushAllPendingChanges(applier, slots, rememberManager);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001BA\b\007\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022$\b\002\020\005\032\036\022\b\022\006\022\002\b\0030\007\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\n0\006¢\006\002\020\013J\b\020\027\032\0020\030H\026J(\020\031\032\0020\n*\0020\0322\n\020\033\032\006\022\002\b\0030\0072\006\020\034\032\0020\b2\006\020\035\032\0020\tH\026R-\020\005\032\036\022\b\022\006\022\002\b\0030\007\022\004\022\0020\b\022\004\022\0020\t\022\004\022\0020\n0\006¢\006\b\n\000\032\004\b\f\020\rR\027\020\016\032\b\022\004\022\0020\0200\017¢\006\b\n\000\032\004\b\021\020\022R\037\020\023\032\020\022\f\022\n\022\006\022\004\030\0010\0250\0240\017¢\006\b\n\000\032\004\b\026\020\022¨\006\036"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "ints", "", "objects", "block", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "(IILkotlin/jvm/functions/Function3;)V", "getBlock", "()Lkotlin/jvm/functions/Function3;", "intParams", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getIntParams", "()Ljava/util/List;", "objParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getObjParams", "toString", "", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "slots", "rememberManager", "runtime"})
/*      */   @StabilityInferred(parameters = 0)
/*      */   @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,993:1\n1#2:994\n*E\n"})
/*      */   public static final class TestOperation extends Operation {
/*      */     @NotNull
/*      */     private final Function3<Applier<?>, SlotWriter, RememberManager, Unit> block;
/*      */     @NotNull
/*      */     private final List<Operation.IntParameter> intParams;
/*      */     @NotNull
/*      */     private final List<Operation.ObjectParameter<Object>> objParams;
/*      */     public static final int $stable = 8;
/*      */     
/*      */     @NotNull
/*      */     public final Function3<Applier<?>, SlotWriter, RememberManager, Unit> getBlock() {
/*      */       return this.block;
/*      */     }
/*      */     
/*      */     @TestOnly
/*      */     public TestOperation(int ints, int objects, @NotNull Function3<Applier<?>, SlotWriter, RememberManager, Unit> block) {
/*      */       super(ints, objects, null);
/*      */       this.block = block;
/*      */       ArrayList<Operation.IntParameter> arrayList;
/*      */       byte b;
/*      */       TestOperation testOperation;
/*      */       for (testOperation = this, arrayList = new ArrayList(ints), b = 0; b < ints; ) {
/*      */         byte b1 = b, b2 = b1;
/*      */         ArrayList<Operation.IntParameter> arrayList1 = arrayList;
/*      */         int $i$a$-List-Operation$TestOperation$intParams$1 = 0;
/*      */         arrayList1.add(Operation.IntParameter.box-impl(Operation.IntParameter.constructor-impl(b2)));
/*      */         b++;
/*      */       } 
/*      */       testOperation.intParams = arrayList;
/*      */       for (testOperation = this, arrayList = new ArrayList<>(objects), b = 0; b < objects; ) {
/*      */         byte b1 = b;
/*      */         int index = b1;
/*      */         ArrayList<Operation.IntParameter> arrayList1 = arrayList;
/*      */         int $i$a$-List-Operation$TestOperation$objParams$1 = 0;
/*      */         arrayList1.add(Operation.ObjectParameter.box-impl(Operation.ObjectParameter.constructor-impl(index)));
/*      */         b++;
/*      */       } 
/*      */       testOperation.objParams = (List)arrayList;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final List<Operation.IntParameter> getIntParams() {
/*      */       return this.intParams;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final List<Operation.ObjectParameter<Object>> getObjParams() {
/*      */       return this.objParams;
/*      */     }
/*      */     
/*      */     public void execute(@NotNull OperationArgContainer $this$execute, @NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*      */       Intrinsics.checkNotNullParameter($this$execute, "<this>");
/*      */       Intrinsics.checkNotNullParameter(applier, "applier");
/*      */       Intrinsics.checkNotNullParameter(slots, "slots");
/*      */       Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
/*      */       this.block.invoke(applier, slots, rememberManager);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String toString() {
/*      */       return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + ActualJvm_jvmKt.identityHashCode(this);
/*      */     }
/*      */     
/*      */     @TestOnly
/*      */     public TestOperation() {
/*      */       this(0, 0, (Function3)null, 7, (DefaultConstructorMarker)null);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\Operation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */