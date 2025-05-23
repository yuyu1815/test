/*      */ package androidx.compose.runtime.snapshots;
/*      */ 
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.functions.Function1;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001BI\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\024\020\006\032\020\022\004\022\0020\b\022\004\022\0020\t\030\0010\007\022\024\020\n\032\020\022\004\022\0020\b\022\004\022\0020\t\030\0010\007\022\006\020\013\032\0020\001¢\006\002\020\fJ\b\020\025\032\0020\026H\026J\b\020\027\032\0020\tH\002J\b\020\030\032\0020\tH\026R\016\020\r\032\0020\016X\016¢\006\002\n\000R\021\020\013\032\0020\001¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024¨\006\031"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivated", "", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "root", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "deactivate", "dispose", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2432:1\n1844#2:2433\n26#3:2434\n1#4:2435\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1535#1:2433\n1535#1:2434\n*E\n"})
/*      */ public final class NestedMutableSnapshot
/*      */   extends MutableSnapshot
/*      */ {
/*      */   @NotNull
/*      */   private final MutableSnapshot parent;
/*      */   private boolean deactivated;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   @NotNull
/*      */   public final MutableSnapshot getParent() {
/* 1505 */     return this.parent;
/* 1506 */   } public NestedMutableSnapshot(int id, @NotNull SnapshotIdSet invalid, @Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver, @NotNull MutableSnapshot parent) { super(id, invalid, readObserver, writeObserver);
/*      */     
/*      */     this.parent = parent;
/* 1509 */     this.parent.nestedActivated$runtime(this); } @NotNull
/*      */   public Snapshot getRoot() {
/* 1511 */     return this.parent.getRoot();
/*      */   }
/*      */   public void dispose() {
/* 1514 */     if (!getDisposed$runtime()) {
/* 1515 */       super.dispose();
/* 1516 */       deactivate();
/*      */     } 
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
/*      */ 
/*      */ 
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
/*      */   public SnapshotApplyResult apply() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   4: invokevirtual getApplied$runtime : ()Z
/*      */     //   7: ifne -> 20
/*      */     //   10: aload_0
/*      */     //   11: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   14: invokevirtual getDisposed$runtime : ()Z
/*      */     //   17: ifeq -> 35
/*      */     //   20: new androidx/compose/runtime/snapshots/SnapshotApplyResult$Failure
/*      */     //   23: dup
/*      */     //   24: aload_0
/*      */     //   25: checkcast androidx/compose/runtime/snapshots/Snapshot
/*      */     //   28: invokespecial <init> : (Landroidx/compose/runtime/snapshots/Snapshot;)V
/*      */     //   31: checkcast androidx/compose/runtime/snapshots/SnapshotApplyResult
/*      */     //   34: areturn
/*      */     //   35: aload_0
/*      */     //   36: invokevirtual getModified$runtime : ()Landroidx/collection/MutableScatterSet;
/*      */     //   39: astore_1
/*      */     //   40: aload_0
/*      */     //   41: invokevirtual getId : ()I
/*      */     //   44: istore_2
/*      */     //   45: aload_1
/*      */     //   46: ifnull -> 70
/*      */     //   49: aload_0
/*      */     //   50: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   53: aload_0
/*      */     //   54: checkcast androidx/compose/runtime/snapshots/MutableSnapshot
/*      */     //   57: aload_0
/*      */     //   58: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   61: invokevirtual getInvalid$runtime : ()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   64: invokestatic access$optimisticMerges : (Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;
/*      */     //   67: goto -> 71
/*      */     //   70: aconst_null
/*      */     //   71: astore_3
/*      */     //   72: iconst_0
/*      */     //   73: istore #4
/*      */     //   75: invokestatic getLock : ()Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   78: astore #5
/*      */     //   80: iconst_0
/*      */     //   81: istore #6
/*      */     //   83: aload #5
/*      */     //   85: astore #7
/*      */     //   87: aload #7
/*      */     //   89: monitorenter
/*      */     //   90: nop
/*      */     //   91: iconst_0
/*      */     //   92: istore #8
/*      */     //   94: aload_0
/*      */     //   95: checkcast androidx/compose/runtime/snapshots/Snapshot
/*      */     //   98: invokestatic access$validateOpen : (Landroidx/compose/runtime/snapshots/Snapshot;)V
/*      */     //   101: aload_1
/*      */     //   102: ifnull -> 112
/*      */     //   105: aload_1
/*      */     //   106: invokevirtual getSize : ()I
/*      */     //   109: ifne -> 119
/*      */     //   112: aload_0
/*      */     //   113: invokevirtual closeAndReleasePinning$runtime : ()V
/*      */     //   116: goto -> 226
/*      */     //   119: aload_0
/*      */     //   120: aload_0
/*      */     //   121: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   124: invokevirtual getId : ()I
/*      */     //   127: aload_3
/*      */     //   128: aload_0
/*      */     //   129: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   132: invokevirtual getInvalid$runtime : ()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   135: invokevirtual innerApplyLocked$runtime : (ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
/*      */     //   138: astore #9
/*      */     //   140: aload #9
/*      */     //   142: getstatic androidx/compose/runtime/snapshots/SnapshotApplyResult$Success.INSTANCE : Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;
/*      */     //   145: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   148: ifne -> 161
/*      */     //   151: aload #9
/*      */     //   153: astore #14
/*      */     //   155: aload #7
/*      */     //   157: monitorexit
/*      */     //   158: aload #14
/*      */     //   160: areturn
/*      */     //   161: aload_0
/*      */     //   162: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   165: invokevirtual getModified$runtime : ()Landroidx/collection/MutableScatterSet;
/*      */     //   168: dup
/*      */     //   169: ifnull -> 197
/*      */     //   172: astore #10
/*      */     //   174: aload #10
/*      */     //   176: astore #11
/*      */     //   178: iconst_0
/*      */     //   179: istore #12
/*      */     //   181: aload #11
/*      */     //   183: aload_1
/*      */     //   184: checkcast androidx/collection/ScatterSet
/*      */     //   187: invokevirtual addAll : (Landroidx/collection/ScatterSet;)Z
/*      */     //   190: pop
/*      */     //   191: aload #10
/*      */     //   193: dup
/*      */     //   194: ifnonnull -> 225
/*      */     //   197: pop
/*      */     //   198: aload_1
/*      */     //   199: astore #10
/*      */     //   201: aload #10
/*      */     //   203: astore #11
/*      */     //   205: iconst_0
/*      */     //   206: istore #12
/*      */     //   208: aload_0
/*      */     //   209: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   212: aload #11
/*      */     //   214: invokevirtual setModified : (Landroidx/collection/MutableScatterSet;)V
/*      */     //   217: aload_0
/*      */     //   218: aconst_null
/*      */     //   219: invokevirtual setModified : (Landroidx/collection/MutableScatterSet;)V
/*      */     //   222: nop
/*      */     //   223: aload #10
/*      */     //   225: pop
/*      */     //   226: aload_0
/*      */     //   227: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   230: invokevirtual getId : ()I
/*      */     //   233: iload_2
/*      */     //   234: if_icmpge -> 244
/*      */     //   237: aload_0
/*      */     //   238: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   241: invokevirtual advance$runtime : ()V
/*      */     //   244: aload_0
/*      */     //   245: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   248: aload_0
/*      */     //   249: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   252: invokevirtual getInvalid$runtime : ()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   255: iload_2
/*      */     //   256: invokevirtual clear : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   259: aload_0
/*      */     //   260: invokevirtual getPreviousIds$runtime : ()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   263: invokevirtual andNot : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   266: invokevirtual setInvalid$runtime : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V
/*      */     //   269: aload_0
/*      */     //   270: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   273: iload_2
/*      */     //   274: invokevirtual recordPrevious$runtime : (I)V
/*      */     //   277: aload_0
/*      */     //   278: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   281: aload_0
/*      */     //   282: invokevirtual takeoverPinnedSnapshot$runtime : ()I
/*      */     //   285: invokevirtual recordPreviousPinnedSnapshot$runtime : (I)V
/*      */     //   288: aload_0
/*      */     //   289: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   292: aload_0
/*      */     //   293: invokevirtual getPreviousIds$runtime : ()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*      */     //   296: invokevirtual recordPreviousList$runtime : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V
/*      */     //   299: aload_0
/*      */     //   300: getfield parent : Landroidx/compose/runtime/snapshots/MutableSnapshot;
/*      */     //   303: aload_0
/*      */     //   304: invokevirtual getPreviousPinnedSnapshots$runtime : ()[I
/*      */     //   307: invokevirtual recordPreviousPinnedSnapshots$runtime : ([I)V
/*      */     //   310: nop
/*      */     //   311: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   314: astore #13
/*      */     //   316: aload #7
/*      */     //   318: monitorexit
/*      */     //   319: goto -> 330
/*      */     //   322: astore #13
/*      */     //   324: aload #7
/*      */     //   326: monitorexit
/*      */     //   327: aload #13
/*      */     //   329: athrow
/*      */     //   330: nop
/*      */     //   331: nop
/*      */     //   332: aload_0
/*      */     //   333: iconst_1
/*      */     //   334: invokevirtual setApplied$runtime : (Z)V
/*      */     //   337: aload_0
/*      */     //   338: invokespecial deactivate : ()V
/*      */     //   341: getstatic androidx/compose/runtime/snapshots/SnapshotApplyResult$Success.INSTANCE : Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;
/*      */     //   344: checkcast androidx/compose/runtime/snapshots/SnapshotApplyResult
/*      */     //   347: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1521	-> 0
/*      */     //   #1530	-> 35
/*      */     //   #1531	-> 40
/*      */     //   #1532	-> 45
/*      */     //   #1533	-> 49
/*      */     //   #1534	-> 70
/*      */     //   #1532	-> 71
/*      */     //   #1535	-> 72
/*      */     //   #2433	-> 75
/*      */     //   #2434	-> 83
/*      */     //   #1536	-> 94
/*      */     //   #1537	-> 101
/*      */     //   #1538	-> 112
/*      */     //   #1540	-> 119
/*      */     //   #1541	-> 140
/*      */     //   #1543	-> 161
/*      */     //   #2435	-> 178
/*      */     //   #1543	-> 181
/*      */     //   #1543	-> 191
/*      */     //   #1543	-> 193
/*      */     //   #1544	-> 198
/*      */     //   #1546	-> 208
/*      */     //   #1547	-> 217
/*      */     //   #1548	-> 222
/*      */     //   #1544	-> 223
/*      */     //   #1552	-> 226
/*      */     //   #1553	-> 237
/*      */     //   #1557	-> 244
/*      */     //   #1560	-> 269
/*      */     //   #1561	-> 277
/*      */     //   #1562	-> 288
/*      */     //   #1563	-> 299
/*      */     //   #1564	-> 310
/*      */     //   #2434	-> 314
/*      */     //   #2434	-> 330
/*      */     //   #2433	-> 331
/*      */     //   #1566	-> 332
/*      */     //   #1567	-> 337
/*      */     //   #1568	-> 341
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   181	10	12	$i$a$-apply-NestedMutableSnapshot$apply$1$1	I
/*      */     //   178	13	11	$this$apply_u24lambda_u242_u24lambda_u240	Landroidx/collection/MutableScatterSet;
/*      */     //   208	15	12	$i$a$-also-NestedMutableSnapshot$apply$1$2	I
/*      */     //   205	18	11	it	Landroidx/collection/MutableScatterSet;
/*      */     //   140	13	9	result	Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
/*      */     //   94	59	8	$i$a$-sync-NestedMutableSnapshot$apply$1	I
/*      */     //   83	70	6	$i$f$synchronized	I
/*      */     //   80	73	5	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   75	78	4	$i$f$sync	I
/*      */     //   161	171	4	$i$f$sync	I
/*      */     //   161	170	6	$i$f$synchronized	I
/*      */     //   161	170	5	lock$iv$iv	Landroidx/compose/runtime/SynchronizedObject;
/*      */     //   161	150	8	$i$a$-sync-NestedMutableSnapshot$apply$1	I
/*      */     //   161	65	9	result	Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
/*      */     //   40	308	1	modified	Landroidx/collection/MutableScatterSet;
/*      */     //   45	303	2	id	I
/*      */     //   72	276	3	optimisticMerges	Ljava/util/Map;
/*      */     //   0	348	0	this	Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   90	155	322	finally
/*      */     //   161	316	322	finally
/*      */     //   322	324	322	finally
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final void deactivate() {
/* 1572 */     if (!this.deactivated) {
/* 1573 */       this.deactivated = true;
/* 1574 */       this.parent.nestedDeactivated$runtime(this);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\NestedMutableSnapshot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */