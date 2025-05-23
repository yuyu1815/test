/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.collection.MutableIntObjectMap;
/*      */ import androidx.collection.MutableIntSet;
/*      */ import androidx.collection.MutableObjectList;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.markers.KMappedMarker;
/*      */ import kotlin.ranges.RangesKt;
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
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000¨\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\020\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\025\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\034\n\002\030\002\n\002\030\002\n\002\b\f\n\002\020(\n\002\b\002\n\002\020\016\n\002\b\007\n\002\020 \n\002\bK\n\002\030\002\n\002\030\002\n\002\b\005\b\000\030\000 Ë\0012\0020\001:\002Ë\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020C\032\0020D2\006\020E\032\0020\rJ\020\020F\032\0020\0072\b\b\002\020G\032\0020\rJ\016\020H\032\0020\r2\006\020F\032\0020\007J\030\020I\032\0020D2\006\020F\032\0020\0072\b\020J\032\004\030\0010\001J\006\020K\032\0020DJ\006\020L\032\0020DJ\020\020M\032\0020\0212\006\020N\032\0020\rH\002J\b\020O\032\0020DH\002J\016\020P\032\0020D2\006\020Q\032\0020\021J\020\020R\032\0020\0212\006\020N\032\0020\rH\002J\020\020S\032\0020\0212\006\020N\032\0020\rH\002J \020T\032\0020\r2\006\020F\032\0020\r2\006\020U\032\0020\r2\006\020\f\032\0020\rH\002J\020\020V\032\0020\r2\006\020G\032\0020\rH\002J\020\020W\032\0020\r2\006\020V\032\0020\rH\002J(\020X\032\0020\r2\006\020G\032\0020\r2\006\020Y\032\0020\r2\006\020U\032\0020\r2\006\020\f\032\0020\rH\002J\006\020Z\032\0020\rJ\006\020[\032\0020DJ\016\020\\\032\0020D2\006\020F\032\0020\007J\016\020\\\032\0020D2\006\020G\032\0020\rJ \020]\032\0020D2\006\020.\032\0020\r2\006\020Z\032\0020\r2\006\020^\032\0020\rH\002JN\020_\032\0020D2\006\020N\032\0020\r28\020`\0324\022\023\022\0210\r¢\006\f\bb\022\b\bc\022\004\b\b(G\022\025\022\023\030\0010\001¢\006\f\bb\022\b\bc\022\004\b\b(d\022\004\022\0020D0aH\bø\001\000JN\020e\032\0020D2\006\020N\032\0020\r28\020`\0324\022\023\022\0210\r¢\006\f\bb\022\b\bc\022\004\b\b(G\022\025\022\023\030\0010\001¢\006\f\bb\022\b\bc\022\004\b\b(d\022\004\022\0020D0aH\bø\001\000J8\020f\032\0020D2\006\020g\032\0020\r2\006\020h\032\0020\r2\032\020`\032\026\022\004\022\0020\r\022\006\022\004\030\0010\001\022\004\022\0020D0aH\bø\001\000J\020\020i\032\004\030\0010\0012\006\020G\032\0020\rJ\020\020j\032\0020\r2\006\020G\032\0020\rH\002J\016\020k\032\0020\r2\006\020G\032\0020\rJ\020\020l\032\004\030\0010\0012\006\020G\032\0020\rJ\016\020m\032\0020\r2\006\020G\032\0020\rJ\016\020n\032\n\022\006\022\004\030\0010\0010oJ\034\020p\032\004\030\0010>2\006\020.\032\0020\r2\b\020q\032\004\030\0010rH\002J\016\020s\032\0020\0212\006\020G\032\0020\rJ\026\020t\032\0020\0212\006\020G\032\0020\r2\006\020N\032\0020\rJ\016\020u\032\0020\0212\006\020G\032\0020\rJ\020\020v\032\0020D2\b\020J\032\004\030\0010\001J\020\020w\032\0020D2\006\0202\032\0020\rH\002J\030\020x\032\0020D2\006\0202\032\0020\r2\006\020N\032\0020\rH\002J\016\020+\032\0020\0212\006\020G\032\0020\rJ\016\020y\032\b\022\004\022\0020\r0zH\002J\020\020{\032\0020D2\b\b\002\020N\032\0020\rJ \020|\032\0020D2\006\020}\032\0020\r2\006\020~\032\0020\r2\006\0202\032\0020\rH\002J'\020\032\b\022\004\022\0020\0070z2\006\020\002\032\0020\0032\006\020G\032\0020\r2\t\b\002\020\001\032\0020\021J\020\020\001\032\0020D2\007\020\001\032\0020\rJ\021\020\001\032\0020D2\006\020G\032\0020\rH\002J&\020\001\032\b\022\004\022\0020\0070z2\007\020\001\032\0020\r2\006\020\002\032\0020\0032\006\020G\032\0020\rJ\031\020\001\032\0020D2\006\020G\032\0020\r2\006\020N\032\0020\rH\002J'\020\001\032\b\022\004\022\0020\0070z2\006\020F\032\0020\0072\007\020\001\032\0020\r2\007\020\001\032\0020\000J\021\020\001\032\004\030\0010\0012\006\020F\032\0020\007J\021\020\001\032\004\030\0010\0012\006\020G\032\0020\rJ\016\020,\032\0020\r2\006\020G\032\0020\rJ\016\020.\032\0020\r2\006\020F\032\0020\007J\016\020.\032\0020\r2\006\020G\032\0020\rJ\021\020\001\032\0020\r2\006\020G\032\0020\rH\002J\031\020\001\032\0020\r2\006\020G\032\0020\r2\006\020Y\032\0020\rH\002J\025\020\001\032\004\030\0010\0012\b\020J\032\004\030\0010\001H\002J\t\020\001\032\0020DH\002J\017\020\001\032\0020D2\006\020q\032\0020rJ\007\020\001\032\0020DJ\030\020\001\032\0020D2\007\020\001\032\0020\r2\006\020J\032\0020rJA\020\001\032\0020\0212\006\020Y\032\0020\r2\006\0202\032\0020\r2&\020<\032\"\022\004\022\0020\007\022\004\022\0020>\030\0010=j\020\022\004\022\0020\007\022\004\022\0020>\030\001`?H\002J\007\020\001\032\0020\021J\033\020\001\032\0020\0212\007\020\001\032\0020\r2\007\020\001\032\0020\rH\002J#\020\001\032\0020D2\007\020\001\032\0020\r2\007\020\001\032\0020\r2\006\020N\032\0020\rH\002J\007\020\001\032\0020DJ\t\020\001\032\0020\rH\002J\t\020\001\032\0020DH\002J\017\020\001\032\0020D2\006\020F\032\0020\007J\021\020\001\032\0020D2\b\020J\032\004\030\0010\001J\033\020\001\032\004\030\0010\0012\006\020G\032\0020\r2\b\020J\032\004\030\0010\001J#\020\001\032\004\030\0010\0012\006\020N\032\0020\r2\006\020G\032\0020\r2\b\020J\032\004\030\0010\001J\t\020\001\032\004\030\0010\001J\007\020\001\032\0020\rJ\007\020\001\032\0020DJ\031\020\001\032\004\030\0010\0012\006\020F\032\0020\0072\006\020G\032\0020\rJ\031\020\001\032\004\030\0010\0012\006\020g\032\0020\r2\006\020G\032\0020\rJ\027\020 \001\032\0020\r2\006\020N\032\0020\r2\006\020G\032\0020\rJ\027\020¡\001\032\0020\r2\006\020g\032\0020\rH\000¢\006\003\b¢\001J\027\020£\001\032\0020\r2\006\020g\032\0020\rH\000¢\006\003\b¤\001J\027\020¥\001\032\0020\r2\006\020g\032\0020\rH\000¢\006\003\b¦\001J\023\020§\001\032\004\030\0010>2\006\020N\032\0020\rH\002J\033\020¨\001\032\0020D2\007\020\001\032\0020\r2\t\020©\001\032\004\030\0010\001J&\020¨\001\032\0020D2\007\020\001\032\0020\r2\t\020ª\001\032\004\030\0010\0012\t\020©\001\032\004\030\0010\001J\007\020«\001\032\0020DJ\020\020«\001\032\0020D2\007\020\001\032\0020\rJ\033\020«\001\032\0020D2\007\020\001\032\0020\r2\t\020¬\001\032\004\030\0010\001J0\020«\001\032\0020D2\007\020\001\032\0020\r2\t\020ª\001\032\004\030\0010\0012\006\020+\032\0020\0212\t\020©\001\032\004\030\0010\001H\002J\033\020­\001\032\0020D2\007\020\001\032\0020\r2\t\020ª\001\032\004\030\0010\001J&\020­\001\032\0020D2\007\020\001\032\0020\r2\t\020ª\001\032\004\030\0010\0012\t\020\001\032\004\030\0010\001J\007\020®\001\032\0020rJ\t\020¯\001\032\0020rH\026J\017\020°\001\032\0020D2\006\020h\032\0020\rJ\031\020±\001\032\004\030\0010\0072\006\020N\032\0020\rH\000¢\006\003\b²\001J\023\020³\001\032\004\030\0010\0012\b\020J\032\004\030\0010\001J\033\020´\001\032\0020D2\007\020µ\001\032\0020\r2\007\020¶\001\032\0020\rH\002J\021\020·\001\032\0020D2\b\020J\032\004\030\0010\001J\021\020¸\001\032\0020D2\006\020N\032\0020\rH\002J\032\020¹\001\032\0020D2\006\020N\032\0020\r2\007\020\001\032\00201H\002J\031\020º\001\032\0020D2\006\020F\032\0020\0072\b\020J\032\004\030\0010\001J\021\020º\001\032\0020D2\b\020J\032\004\030\0010\001J\033\020»\001\032\0020D2\006\020G\032\0020\r2\b\020J\032\004\030\0010\001H\002J\021\020¼\001\032\0020D2\b\020J\032\004\030\0010\001J\007\020½\001\032\0020DJ\017\020¾\001\032\0020DH\000¢\006\003\b¿\001J\017\020À\001\032\0020DH\000¢\006\003\bÁ\001J\026\020Â\001\032\0020\r*\0020(2\007\020Ã\001\032\0020\rH\002J\025\020V\032\0020\r*\0020(2\007\020Ã\001\032\0020\rH\002J\023\020Ä\001\032\b\022\004\022\0020\r0z*\0020(H\002J\033\020Å\001\032\0020D*\b0Æ\001j\003`Ç\0012\006\020G\032\0020\rH\002J\026\020È\001\032\0020\r*\0020(2\007\020Ã\001\032\0020\rH\002J\024\020.\032\0020\r*\0020(2\006\020G\032\0020\rH\002J\026\020É\001\032\0020\r*\0020(2\007\020Ã\001\032\0020\rH\002J\036\020Ê\001\032\0020D*\0020(2\007\020Ã\001\032\0020\r2\006\020V\032\0020\rH\002R\036\020\005\032\022\022\004\022\0020\0070\006j\b\022\004\022\0020\007`\bX\016¢\006\002\n\000R\026\020\t\032\n\022\004\022\0020\013\030\0010\nX\016¢\006\002\n\000R\024\020\f\032\0020\r8BX\004¢\006\006\032\004\b\016\020\017R\036\020\022\032\0020\0212\006\020\020\032\0020\021@BX\016¢\006\b\n\000\032\004\b\023\020\024R\021\020\025\032\0020\0218F¢\006\006\032\004\b\026\020\024R\021\020\027\032\0020\0218F¢\006\006\032\004\b\030\020\024R\036\020\031\032\0020\r2\006\020\020\032\0020\r@BX\016¢\006\b\n\000\032\004\b\032\020\017R\036\020\033\032\0020\r2\006\020\020\032\0020\r@BX\016¢\006\b\n\000\032\004\b\034\020\017R\024\020\035\032\0020\r8BX\004¢\006\006\032\004\b\036\020\017R\016\020\037\032\0020\rX\016¢\006\002\n\000R\016\020 \032\0020\rX\016¢\006\002\n\000R\036\020!\032\022\022\f\022\n\022\006\022\004\030\0010\0010\"\030\0010\nX\016¢\006\002\n\000R\016\020#\032\0020$X\004¢\006\002\n\000R\016\020%\032\0020\rX\016¢\006\002\n\000R\016\020&\032\0020\rX\016¢\006\002\n\000R\016\020'\032\0020(X\016¢\006\002\n\000R\016\020)\032\0020\rX\016¢\006\002\n\000R\021\020*\032\0020\0218F¢\006\006\032\004\b*\020\024R\021\020+\032\0020\0218F¢\006\006\032\004\b+\020\024R\016\020,\032\0020\rX\016¢\006\002\n\000R\016\020-\032\0020$X\004¢\006\002\n\000R\036\020.\032\0020\r2\006\020\020\032\0020\r@BX\016¢\006\b\n\000\032\004\b/\020\017R\020\0200\032\004\030\00101X\016¢\006\002\n\000R\024\0202\032\0020\r8@X\004¢\006\006\032\004\b3\020\017R\030\0204\032\n\022\006\022\004\030\0010\00105X\016¢\006\004\n\002\0206R\016\0207\032\0020\rX\016¢\006\002\n\000R\016\0208\032\0020\rX\016¢\006\002\n\000R\016\0209\032\0020\rX\016¢\006\002\n\000R\021\020:\032\0020\r8F¢\006\006\032\004\b;\020\017R.\020<\032\"\022\004\022\0020\007\022\004\022\0020>\030\0010=j\020\022\004\022\0020\007\022\004\022\0020>\030\001`?X\016¢\006\002\n\000R\016\020@\032\0020$X\004¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\bA\020B\002\007\n\005\b20\001¨\006Ì\001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "collectingCalledInformation", "getCollectingCalledInformation", "collectingSourceInformation", "getCollectingSourceInformation", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentGroupSlotIndex", "getCurrentGroupSlotIndex", "currentSlot", "currentSlotEnd", "deferredSlotWrites", "Landroidx/collection/MutableObjectList;", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", "index", "anchorIndex", "appendSlot", "value", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clearSlotGap", "close", "normalClose", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forAllData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "forEachData", "forEachTailSlot", "groupIndex", "count", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "insertGroups", "insertSlots", "keys", "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", "offset", "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "rawUpdate", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", "key", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "slotIndexOfGroupSlotIndex", "slotsEndAllIndex", "slotsEndAllIndex$runtime", "slotsEndIndex", "slotsEndIndex$runtime", "slotsStartIndex", "slotsStartIndex$runtime", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toDebugString", "toString", "trimTailSlots", "tryAnchor", "tryAnchor$runtime", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "updateToTableMaps", "verifyDataAnchors", "verifyDataAnchors$runtime", "verifyParentAnchors", "verifyParentAnchors$runtime", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "Companion", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n+ 8 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 9 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 10 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4179:1\n4553#2,7:4180\n4553#2,7:4190\n4553#2,7:4197\n4553#2,7:4204\n4553#2,7:4211\n4553#2,7:4232\n4553#2,7:4239\n4553#2,7:4246\n4553#2,7:4260\n4553#2,7:4274\n4553#2,7:4281\n4553#2,7:4294\n4553#2,7:4301\n4553#2,7:4308\n4553#2,7:4315\n4553#2,7:4322\n4553#2,7:4329\n4553#2,7:4336\n4553#2,7:4343\n4553#2,7:4374\n4553#2,7:4381\n4553#2,7:4388\n1#3:4187\n1#3:4189\n1#3:4355\n1#3:4364\n728#4:4188\n50#5,7:4218\n50#5,7:4253\n50#5,7:4267\n50#5,7:4401\n50#5,7:4408\n50#5,7:4415\n50#5,7:4422\n50#5,7:4429\n50#5,7:4436\n372#6,7:4225\n305#7,6:4288\n177#8,5:4350\n183#8,3:4356\n177#8,5:4359\n183#8,3:4365\n4046#9,6:4368\n33#10,6:4395\n82#10,3:4443\n33#10,4:4446\n85#10,2:4450\n38#10:4452\n87#10:4453\n231#10,3:4454\n64#10,4:4457\n234#10,2:4461\n69#10:4463\n236#10:4464\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1639#1:4180,7\n1675#1:4190,7\n1711#1:4197,7\n1724#1:4204,7\n1727#1:4211,7\n1816#1:4232,7\n1837#1:4239,7\n1923#1:4246,7\n1928#1:4260,7\n1968#1:4274,7\n1979#1:4281,7\n2143#1:4294,7\n2207#1:4301,7\n2212#1:4308,7\n2244#1:4315,7\n2316#1:4322,7\n2317#1:4329,7\n2330#1:4336,7\n2425#1:4343,7\n2990#1:4374,7\n3002#1:4381,7\n3212#1:4388,7\n1658#1:4189\n2734#1:4355\n2775#1:4364\n1658#1:4188\n1737#1:4218,7\n1924#1:4253,7\n1966#1:4267,7\n3404#1:4401,7\n3408#1:4408,7\n3412#1:4415,7\n3428#1:4422,7\n3436#1:4429,7\n3440#1:4436,7\n1779#1:4225,7\n2129#1:4288,6\n2734#1:4350,5\n2734#1:4356,3\n2775#1:4359,5\n2775#1:4365,3\n2795#1:4368,6\n3313#1:4395,6\n3484#1:4443,3\n3484#1:4446,4\n3484#1:4450,2\n3484#1:4452\n3484#1:4453\n3487#1:4454,3\n3487#1:4457,4\n3487#1:4461,2\n3487#1:4463\n3487#1:4464\n*E\n"})
/*      */ public final class SlotWriter
/*      */ {
/*      */   @NotNull
/*      */   public static final Companion Companion = new Companion(null);
/*      */   @NotNull
/*      */   private final SlotTable table;
/*      */   @NotNull
/*      */   private int[] groups;
/*      */   @NotNull
/*      */   private Object[] slots;
/*      */   @NotNull
/*      */   private ArrayList<Anchor> anchors;
/*      */   @Nullable
/*      */   private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
/*      */   @Nullable
/*      */   private MutableIntObjectMap<MutableIntSet> calledByMap;
/*      */   private int groupGapStart;
/*      */   private int groupGapLen;
/*      */   private int currentSlot;
/*      */   private int currentSlotEnd;
/*      */   private int slotsGapStart;
/*      */   private int slotsGapLen;
/*      */   private int slotsGapOwner;
/*      */   private int insertCount;
/*      */   private int nodeCount;
/*      */   @NotNull
/*      */   private final IntStack startStack;
/*      */   @NotNull
/*      */   private final IntStack endStack;
/*      */   @NotNull
/*      */   private final IntStack nodeCountStack;
/*      */   @Nullable
/*      */   private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
/*      */   private int currentGroup;
/*      */   private int currentGroupEnd;
/*      */   private int parent;
/*      */   private boolean closed;
/*      */   @Nullable
/*      */   private PrioritySet pendingRecalculateMarks;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   public SlotWriter(@NotNull SlotTable table) {
/* 1368 */     this.table = table;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1376 */     this.groups = this.table.getGroups();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1384 */     this.slots = this.table.getSlots();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1389 */     this.anchors = this.table.getAnchors$runtime();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1394 */     this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1399 */     this.calledByMap = this.table.getCalledByMap$runtime();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1404 */     this.groupGapStart = this.table.getGroupsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1409 */     this.groupGapLen = this.groups.length / 5 - this.table.getGroupsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1424 */     this.slotsGapStart = this.table.getSlotsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1429 */     this.slotsGapLen = this.slots.length - this.table.getSlotsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1434 */     this.slotsGapOwner = this.table.getGroupsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1454 */     this.startStack = new IntStack();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1462 */     this.endStack = new IntStack();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1467 */     this.nodeCountStack = new IntStack();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1482 */     this.currentGroupEnd = this.table.getGroupsSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1588 */     this.parent = -1; } @NotNull public final SlotTable getTable$runtime() { return this.table; } public final int getCurrentGroup() { return this.currentGroup; } public final int getCurrentGroupEnd() { return this.currentGroupEnd; } public final boolean isGroupEnd() { return (this.currentGroup == this.currentGroupEnd); } public final int getSlotsSize() { return this.slots.length - this.slotsGapLen; } public final boolean isNode() { return (this.currentGroup < this.currentGroupEnd && SlotTableKt.access$isNode(this.groups, groupIndexToAddress(this.currentGroup))); } public final boolean getCollectingSourceInformation() { return (this.sourceInformationMap != null); } public final boolean getCollectingCalledInformation() { return (this.calledByMap != null); } public final boolean isNode(int index) { return SlotTableKt.access$isNode(this.groups, groupIndexToAddress(index)); } public final int nodeCount(int index) { return SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress(index)); } public final int groupKey(int index) { return SlotTableKt.access$key(this.groups, groupIndexToAddress(index)); } @Nullable public final Object groupObjectKey(int index) { int address = groupIndexToAddress(index); return SlotTableKt.access$hasObjectKey(this.groups, address) ? this.slots[SlotTableKt.access$objectKeyIndex(this.groups, address)] : null; } public final int groupSize(int index) { return SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(index)); } @Nullable public final Object groupAux(int index) { int address = groupIndexToAddress(index); return SlotTableKt.access$hasAux(this.groups, address) ? this.slots[auxIndex(this.groups, address)] : Composer.Companion.getEmpty(); } public final boolean indexInParent(int index) { return ((index > this.parent && index < this.currentGroupEnd) || (this.parent == 0 && index == 0)); } public final boolean indexInCurrentGroup(int index) { return indexInGroup(index, this.currentGroup); } public final boolean indexInGroup(int index, int group) { int openIndex = this.startStack.indexOf(group); int end = (group == this.parent) ? this.currentGroupEnd : ((group > this.startStack.peekOr(0)) ? (group + groupSize(group)) : ((openIndex < 0) ? (group + groupSize(group)) : (getCapacity() - this.groupGapLen - this.endStack.peek(openIndex)))); return (index > group && index < end); } @Nullable public final Object node(int index) { int address = groupIndexToAddress(index); return SlotTableKt.access$isNode(this.groups, address) ? this.slots[dataIndexToDataAddress(nodeIndex(this.groups, address))] : null; } @Nullable public final Object node(@NotNull Anchor anchor) { Intrinsics.checkNotNullParameter(anchor, "anchor"); return node(anchor.toIndexFor(this)); } public final int getParent() { return this.parent; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int parent(int index) {
/* 1594 */     return parent(this.groups, index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int parent(@NotNull Anchor anchor) {
/* 1600 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); return anchor.getValid() ? parent(this.groups, anchorIndex(anchor)) : -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public final boolean getClosed() {
/* 1605 */     return this.closed;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void close(boolean normalClose) {
/* 1612 */     this.closed = true;
/*      */     
/* 1614 */     if (normalClose && this.startStack.isEmpty()) {
/*      */       
/* 1616 */       moveGroupGapTo(getSize$runtime());
/* 1617 */       moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
/* 1618 */       clearSlotGap();
/* 1619 */       recalculateMarks();
/*      */     } 
/* 1621 */     this.table.close$runtime(
/* 1622 */         this, 
/* 1623 */         this.groups, 
/* 1624 */         this.groupGapStart, 
/* 1625 */         this.slots, 
/* 1626 */         this.slotsGapStart, 
/* 1627 */         this.anchors, 
/* 1628 */         this.sourceInformationMap, 
/* 1629 */         this.calledByMap);
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
/*      */   public final void reset() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
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
/*      */     //   22: ldc_w 'Cannot reset when inserting'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: invokespecial recalculateMarks : ()V
/*      */     //   33: aload_0
/*      */     //   34: iconst_0
/*      */     //   35: putfield currentGroup : I
/*      */     //   38: aload_0
/*      */     //   39: aload_0
/*      */     //   40: invokespecial getCapacity : ()I
/*      */     //   43: aload_0
/*      */     //   44: getfield groupGapLen : I
/*      */     //   47: isub
/*      */     //   48: putfield currentGroupEnd : I
/*      */     //   51: aload_0
/*      */     //   52: iconst_0
/*      */     //   53: putfield currentSlot : I
/*      */     //   56: aload_0
/*      */     //   57: iconst_0
/*      */     //   58: putfield currentSlotEnd : I
/*      */     //   61: aload_0
/*      */     //   62: iconst_0
/*      */     //   63: putfield nodeCount : I
/*      */     //   66: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1639	-> 0
/*      */     //   #4180	-> 15
/*      */     //   #4183	-> 16
/*      */     //   #4184	-> 20
/*      */     //   #1639	-> 22
/*      */     //   #4184	-> 25
/*      */     //   #4186	-> 28
/*      */     //   #1640	-> 29
/*      */     //   #1641	-> 33
/*      */     //   #1642	-> 38
/*      */     //   #1643	-> 51
/*      */     //   #1644	-> 56
/*      */     //   #1645	-> 61
/*      */     //   #1646	-> 66
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-SlotWriter$reset$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   0	67	0	this	Landroidx/compose/runtime/SlotWriter;
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
/*      */   @Nullable
/*      */   public final Object update(@Nullable Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
/*      */     //   4: ifle -> 122
/*      */     //   7: aload_0
/*      */     //   8: getfield currentSlot : I
/*      */     //   11: aload_0
/*      */     //   12: getfield slotsGapStart : I
/*      */     //   15: if_icmpeq -> 122
/*      */     //   18: aload_0
/*      */     //   19: getfield deferredSlotWrites : Landroidx/collection/MutableIntObjectMap;
/*      */     //   22: dup
/*      */     //   23: ifnonnull -> 37
/*      */     //   26: pop
/*      */     //   27: new androidx/collection/MutableIntObjectMap
/*      */     //   30: dup
/*      */     //   31: iconst_0
/*      */     //   32: iconst_1
/*      */     //   33: aconst_null
/*      */     //   34: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   37: astore_3
/*      */     //   38: aload_3
/*      */     //   39: astore #4
/*      */     //   41: iconst_0
/*      */     //   42: istore #5
/*      */     //   44: aload_0
/*      */     //   45: aload #4
/*      */     //   47: putfield deferredSlotWrites : Landroidx/collection/MutableIntObjectMap;
/*      */     //   50: aload_3
/*      */     //   51: astore_3
/*      */     //   52: aload_0
/*      */     //   53: getfield parent : I
/*      */     //   56: istore #4
/*      */     //   58: iconst_0
/*      */     //   59: istore #5
/*      */     //   61: aload_3
/*      */     //   62: iload #4
/*      */     //   64: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   67: dup
/*      */     //   68: ifnonnull -> 104
/*      */     //   71: pop
/*      */     //   72: iconst_0
/*      */     //   73: istore #6
/*      */     //   75: new androidx/collection/MutableObjectList
/*      */     //   78: dup
/*      */     //   79: iconst_0
/*      */     //   80: iconst_1
/*      */     //   81: aconst_null
/*      */     //   82: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   85: astore #7
/*      */     //   87: aload #7
/*      */     //   89: astore #8
/*      */     //   91: iconst_0
/*      */     //   92: istore #9
/*      */     //   94: aload_3
/*      */     //   95: iload #4
/*      */     //   97: aload #8
/*      */     //   99: invokevirtual set : (ILjava/lang/Object;)V
/*      */     //   102: aload #7
/*      */     //   104: nop
/*      */     //   105: checkcast androidx/collection/MutableObjectList
/*      */     //   108: astore_2
/*      */     //   109: aload_2
/*      */     //   110: aload_1
/*      */     //   111: invokevirtual add : (Ljava/lang/Object;)Z
/*      */     //   114: pop
/*      */     //   115: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   118: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   121: areturn
/*      */     //   122: aload_0
/*      */     //   123: aload_1
/*      */     //   124: invokespecial rawUpdate : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   127: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1653	-> 0
/*      */     //   #1656	-> 18
/*      */     //   #1657	-> 38
/*      */     //   #4187	-> 41
/*      */     //   #1657	-> 44
/*      */     //   #1657	-> 50
/*      */     //   #1658	-> 52
/*      */     //   #4188	-> 61
/*      */     //   #1658	-> 75
/*      */     //   #4188	-> 85
/*      */     //   #4189	-> 91
/*      */     //   #4188	-> 94
/*      */     //   #4188	-> 102
/*      */     //   #4188	-> 104
/*      */     //   #1658	-> 105
/*      */     //   #1655	-> 108
/*      */     //   #1659	-> 109
/*      */     //   #1660	-> 115
/*      */     //   #1662	-> 122
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   44	6	5	$i$a$-also-SlotWriter$update$deferred$1	I
/*      */     //   41	9	4	it	Landroidx/collection/MutableIntObjectMap;
/*      */     //   75	10	6	$i$a$-getOrPut-SlotWriter$update$deferred$2	I
/*      */     //   94	8	9	$i$a$-also-MutableIntObjectMap$getOrPut$1$iv	I
/*      */     //   91	11	8	it$iv	Ljava/lang/Object;
/*      */     //   61	44	5	$i$f$getOrPut	I
/*      */     //   58	47	3	this_$iv	Landroidx/collection/MutableIntObjectMap;
/*      */     //   58	47	4	key$iv	I
/*      */     //   109	13	2	deferred	Landroidx/collection/MutableObjectList;
/*      */     //   0	128	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	128	1	value	Ljava/lang/Object;
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
/*      */   private final Object rawUpdate(Object value) {
/* 1666 */     Object result = skip();
/* 1667 */     set(value);
/* 1668 */     return result;
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
/*      */   public final void appendSlot(@NotNull Anchor anchor, @Nullable Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'anchor'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_0
/*      */     //   7: getfield insertCount : I
/*      */     //   10: ifne -> 17
/*      */     //   13: iconst_1
/*      */     //   14: goto -> 18
/*      */     //   17: iconst_0
/*      */     //   18: istore_3
/*      */     //   19: iconst_0
/*      */     //   20: istore #4
/*      */     //   22: nop
/*      */     //   23: iload_3
/*      */     //   24: ifne -> 36
/*      */     //   27: iconst_0
/*      */     //   28: istore #5
/*      */     //   30: ldc_w 'Can only append a slot if not current inserting'
/*      */     //   33: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   36: nop
/*      */     //   37: aload_0
/*      */     //   38: getfield currentSlot : I
/*      */     //   41: istore_3
/*      */     //   42: aload_0
/*      */     //   43: getfield currentSlotEnd : I
/*      */     //   46: istore #4
/*      */     //   48: aload_0
/*      */     //   49: aload_1
/*      */     //   50: invokevirtual anchorIndex : (Landroidx/compose/runtime/Anchor;)I
/*      */     //   53: istore #5
/*      */     //   55: aload_0
/*      */     //   56: aload_0
/*      */     //   57: getfield groups : [I
/*      */     //   60: aload_0
/*      */     //   61: iload #5
/*      */     //   63: iconst_1
/*      */     //   64: iadd
/*      */     //   65: invokespecial groupIndexToAddress : (I)I
/*      */     //   68: invokespecial dataIndex : ([II)I
/*      */     //   71: istore #6
/*      */     //   73: aload_0
/*      */     //   74: iload #6
/*      */     //   76: putfield currentSlot : I
/*      */     //   79: aload_0
/*      */     //   80: iload #6
/*      */     //   82: putfield currentSlotEnd : I
/*      */     //   85: aload_0
/*      */     //   86: iconst_1
/*      */     //   87: iload #5
/*      */     //   89: invokespecial insertSlots : (II)V
/*      */     //   92: iload_3
/*      */     //   93: iload #6
/*      */     //   95: if_icmplt -> 104
/*      */     //   98: iinc #3, 1
/*      */     //   101: iinc #4, 1
/*      */     //   104: aload_0
/*      */     //   105: getfield slots : [Ljava/lang/Object;
/*      */     //   108: iload #6
/*      */     //   110: aload_2
/*      */     //   111: aastore
/*      */     //   112: aload_0
/*      */     //   113: iload_3
/*      */     //   114: putfield currentSlot : I
/*      */     //   117: aload_0
/*      */     //   118: iload #4
/*      */     //   120: putfield currentSlotEnd : I
/*      */     //   123: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1675	-> 6
/*      */     //   #4190	-> 22
/*      */     //   #4193	-> 23
/*      */     //   #4194	-> 27
/*      */     //   #1676	-> 30
/*      */     //   #4194	-> 33
/*      */     //   #4196	-> 36
/*      */     //   #1678	-> 37
/*      */     //   #1679	-> 42
/*      */     //   #1680	-> 48
/*      */     //   #1681	-> 55
/*      */     //   #1682	-> 73
/*      */     //   #1683	-> 79
/*      */     //   #1684	-> 85
/*      */     //   #1685	-> 92
/*      */     //   #1686	-> 98
/*      */     //   #1687	-> 101
/*      */     //   #1689	-> 104
/*      */     //   #1690	-> 112
/*      */     //   #1691	-> 117
/*      */     //   #1692	-> 123
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   30	3	5	$i$a$-runtimeCheck-SlotWriter$appendSlot$1	I
/*      */     //   22	15	4	$i$f$runtimeCheck	I
/*      */     //   19	18	3	value$iv	Z
/*      */     //   42	82	3	previousCurrentSlot	I
/*      */     //   48	76	4	previousCurrentSlotEnd	I
/*      */     //   55	69	5	anchorIndex	I
/*      */     //   73	51	6	slotIndex	I
/*      */     //   0	124	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	124	1	anchor	Landroidx/compose/runtime/Anchor;
/*      */     //   0	124	2	value	Ljava/lang/Object;
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
/*      */   public final void trimTailSlots(int count) {
/* 1695 */     ComposerKt.runtimeCheck((count > 0));
/* 1696 */     int parent = this.parent;
/* 1697 */     int groupSlotStart = slotIndex(this.groups, groupIndexToAddress(parent));
/* 1698 */     int groupSlotEnd = dataIndex(this.groups, groupIndexToAddress(parent + 1));
/* 1699 */     int removeStart = groupSlotEnd - count;
/* 1700 */     ComposerKt.runtimeCheck((removeStart >= groupSlotStart));
/* 1701 */     removeSlots(removeStart, count, parent);
/* 1702 */     int currentSlot = this.currentSlot;
/* 1703 */     if (currentSlot >= groupSlotStart) this.currentSlot = currentSlot - count;
/*      */   
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
/*      */   public final void updateAux(@Nullable Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield currentGroup : I
/*      */     //   5: invokespecial groupIndexToAddress : (I)I
/*      */     //   8: istore_2
/*      */     //   9: aload_0
/*      */     //   10: getfield groups : [I
/*      */     //   13: iload_2
/*      */     //   14: invokestatic access$hasAux : ([II)Z
/*      */     //   17: istore_3
/*      */     //   18: iconst_0
/*      */     //   19: istore #4
/*      */     //   21: nop
/*      */     //   22: iload_3
/*      */     //   23: ifne -> 35
/*      */     //   26: iconst_0
/*      */     //   27: istore #5
/*      */     //   29: ldc_w 'Updating the data of a group that was not created with a data slot'
/*      */     //   32: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   35: nop
/*      */     //   36: aload_0
/*      */     //   37: getfield slots : [Ljava/lang/Object;
/*      */     //   40: aload_0
/*      */     //   41: aload_0
/*      */     //   42: aload_0
/*      */     //   43: getfield groups : [I
/*      */     //   46: iload_2
/*      */     //   47: invokespecial auxIndex : ([II)I
/*      */     //   50: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   53: aload_1
/*      */     //   54: aastore
/*      */     //   55: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1710	-> 0
/*      */     //   #1711	-> 9
/*      */     //   #4197	-> 21
/*      */     //   #4200	-> 22
/*      */     //   #4201	-> 26
/*      */     //   #1712	-> 29
/*      */     //   #4201	-> 32
/*      */     //   #4203	-> 35
/*      */     //   #1714	-> 36
/*      */     //   #1715	-> 55
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   29	3	5	$i$a$-runtimeCheck-SlotWriter$updateAux$1	I
/*      */     //   21	15	4	$i$f$runtimeCheck	I
/*      */     //   18	18	3	value$iv	Z
/*      */     //   9	47	2	address	I
/*      */     //   0	56	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	56	1	value	Ljava/lang/Object;
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
/*      */   public final void insertAux(@Nullable Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
/*      */     //   4: iflt -> 11
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
/*      */     //   23: ldc_w 'Cannot insert auxiliary data when not inserting'
/*      */     //   26: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: aload_0
/*      */     //   31: getfield parent : I
/*      */     //   34: istore_2
/*      */     //   35: aload_0
/*      */     //   36: iload_2
/*      */     //   37: invokespecial groupIndexToAddress : (I)I
/*      */     //   40: istore_3
/*      */     //   41: aload_0
/*      */     //   42: getfield groups : [I
/*      */     //   45: iload_3
/*      */     //   46: invokestatic access$hasAux : ([II)Z
/*      */     //   49: ifne -> 56
/*      */     //   52: iconst_1
/*      */     //   53: goto -> 57
/*      */     //   56: iconst_0
/*      */     //   57: istore #4
/*      */     //   59: iconst_0
/*      */     //   60: istore #5
/*      */     //   62: nop
/*      */     //   63: iload #4
/*      */     //   65: ifne -> 77
/*      */     //   68: iconst_0
/*      */     //   69: istore #6
/*      */     //   71: ldc_w 'Group already has auxiliary data'
/*      */     //   74: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   77: nop
/*      */     //   78: aload_0
/*      */     //   79: iconst_1
/*      */     //   80: iload_2
/*      */     //   81: invokespecial insertSlots : (II)V
/*      */     //   84: aload_0
/*      */     //   85: aload_0
/*      */     //   86: getfield groups : [I
/*      */     //   89: iload_3
/*      */     //   90: invokespecial auxIndex : ([II)I
/*      */     //   93: istore #4
/*      */     //   95: aload_0
/*      */     //   96: iload #4
/*      */     //   98: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   101: istore #5
/*      */     //   103: aload_0
/*      */     //   104: getfield currentSlot : I
/*      */     //   107: iload #4
/*      */     //   109: if_icmple -> 193
/*      */     //   112: aload_0
/*      */     //   113: getfield currentSlot : I
/*      */     //   116: iload #4
/*      */     //   118: isub
/*      */     //   119: istore #6
/*      */     //   121: iload #6
/*      */     //   123: iconst_3
/*      */     //   124: if_icmpge -> 131
/*      */     //   127: iconst_1
/*      */     //   128: goto -> 132
/*      */     //   131: iconst_0
/*      */     //   132: istore #7
/*      */     //   134: iconst_0
/*      */     //   135: istore #8
/*      */     //   137: nop
/*      */     //   138: iload #7
/*      */     //   140: ifne -> 152
/*      */     //   143: iconst_0
/*      */     //   144: istore #9
/*      */     //   146: ldc_w 'Moving more than two slot not supported'
/*      */     //   149: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   152: nop
/*      */     //   153: iload #6
/*      */     //   155: iconst_1
/*      */     //   156: if_icmple -> 177
/*      */     //   159: aload_0
/*      */     //   160: getfield slots : [Ljava/lang/Object;
/*      */     //   163: iload #5
/*      */     //   165: iconst_2
/*      */     //   166: iadd
/*      */     //   167: aload_0
/*      */     //   168: getfield slots : [Ljava/lang/Object;
/*      */     //   171: iload #5
/*      */     //   173: iconst_1
/*      */     //   174: iadd
/*      */     //   175: aaload
/*      */     //   176: aastore
/*      */     //   177: aload_0
/*      */     //   178: getfield slots : [Ljava/lang/Object;
/*      */     //   181: iload #5
/*      */     //   183: iconst_1
/*      */     //   184: iadd
/*      */     //   185: aload_0
/*      */     //   186: getfield slots : [Ljava/lang/Object;
/*      */     //   189: iload #5
/*      */     //   191: aaload
/*      */     //   192: aastore
/*      */     //   193: aload_0
/*      */     //   194: getfield groups : [I
/*      */     //   197: iload_3
/*      */     //   198: invokestatic access$addAux : ([II)V
/*      */     //   201: aload_0
/*      */     //   202: getfield slots : [Ljava/lang/Object;
/*      */     //   205: iload #5
/*      */     //   207: aload_1
/*      */     //   208: aastore
/*      */     //   209: aload_0
/*      */     //   210: getfield currentSlot : I
/*      */     //   213: istore #6
/*      */     //   215: aload_0
/*      */     //   216: iload #6
/*      */     //   218: iconst_1
/*      */     //   219: iadd
/*      */     //   220: putfield currentSlot : I
/*      */     //   223: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1724	-> 0
/*      */     //   #4204	-> 15
/*      */     //   #4207	-> 16
/*      */     //   #4208	-> 20
/*      */     //   #1724	-> 23
/*      */     //   #4208	-> 26
/*      */     //   #4210	-> 29
/*      */     //   #1725	-> 30
/*      */     //   #1726	-> 35
/*      */     //   #1727	-> 41
/*      */     //   #4211	-> 62
/*      */     //   #4214	-> 63
/*      */     //   #4215	-> 68
/*      */     //   #1727	-> 71
/*      */     //   #4215	-> 74
/*      */     //   #4217	-> 77
/*      */     //   #1728	-> 78
/*      */     //   #1729	-> 84
/*      */     //   #1730	-> 95
/*      */     //   #1731	-> 103
/*      */     //   #1736	-> 112
/*      */     //   #1737	-> 121
/*      */     //   #4218	-> 137
/*      */     //   #4221	-> 138
/*      */     //   #4222	-> 143
/*      */     //   #1737	-> 146
/*      */     //   #4222	-> 149
/*      */     //   #4224	-> 152
/*      */     //   #1738	-> 153
/*      */     //   #1739	-> 159
/*      */     //   #1741	-> 177
/*      */     //   #1743	-> 193
/*      */     //   #1744	-> 201
/*      */     //   #1745	-> 209
/*      */     //   #1746	-> 223
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-runtimeCheck-SlotWriter$insertAux$1	I
/*      */     //   15	15	3	$i$f$runtimeCheck	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   71	3	6	$i$a$-runtimeCheck-SlotWriter$insertAux$2	I
/*      */     //   62	16	5	$i$f$runtimeCheck	I
/*      */     //   59	19	4	value$iv	Z
/*      */     //   146	3	9	$i$a$-checkPrecondition-SlotWriter$insertAux$3	I
/*      */     //   137	16	8	$i$f$checkPrecondition	I
/*      */     //   134	19	7	value$iv	Z
/*      */     //   121	72	6	slotsToMove	I
/*      */     //   35	189	2	parent	I
/*      */     //   41	183	3	parentGroupAddress	I
/*      */     //   95	129	4	auxIndex	I
/*      */     //   103	121	5	auxAddress	I
/*      */     //   0	224	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	224	1	value	Ljava/lang/Object;
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
/*      */   public final void updateToTableMaps() {
/* 1749 */     this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
/* 1750 */     this.calledByMap = this.table.getCalledByMap$runtime();
/*      */   }
/*      */   
/*      */   public final void recordGroupSourceInformation(@NotNull String sourceInformation) {
/* 1754 */     Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation"); if (this.insertCount > 0) {
/* 1755 */       groupSourceInformationFor(this.parent, sourceInformation);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void recordGrouplessCallSourceInformationStart(int key, @NotNull String value) {
/* 1760 */     Intrinsics.checkNotNullParameter(value, "value"); if (this.insertCount > 0) {
/* 1761 */       if (this.calledByMap != null) { SlotTableKt.access$add(this.calledByMap, key, groupKey(this.parent)); } else {  }
/* 1762 */        if (groupSourceInformationFor(this.parent, null) != null) { groupSourceInformationFor(this.parent, null).startGrouplessCall(
/* 1763 */             key, value, getCurrentGroupSlotIndex()); }
/*      */       else
/*      */       { groupSourceInformationFor(this.parent, null); }
/*      */     
/*      */     } 
/*      */   } public final void recordGrouplessCallSourceInformationEnd() {
/* 1769 */     if (this.insertCount > 0) {
/* 1770 */       if (groupSourceInformationFor(this.parent, null) != null) { groupSourceInformationFor(this.parent, null).endGrouplessCall(
/* 1771 */             getCurrentGroupSlotIndex()); }
/*      */       else
/*      */       { groupSourceInformationFor(this.parent, null); }
/*      */     
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
/*      */   private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield sourceInformationMap : Ljava/util/HashMap;
/*      */     //   4: dup
/*      */     //   5: ifnull -> 128
/*      */     //   8: checkcast java/util/Map
/*      */     //   11: astore_3
/*      */     //   12: aload_0
/*      */     //   13: iload_1
/*      */     //   14: invokevirtual anchor : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   17: astore #4
/*      */     //   19: iconst_0
/*      */     //   20: istore #5
/*      */     //   22: aload_3
/*      */     //   23: aload #4
/*      */     //   25: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   30: astore #6
/*      */     //   32: aload #6
/*      */     //   34: ifnonnull -> 119
/*      */     //   37: iconst_0
/*      */     //   38: istore #7
/*      */     //   40: new androidx/compose/runtime/GroupSourceInformation
/*      */     //   43: dup
/*      */     //   44: iconst_0
/*      */     //   45: aload_2
/*      */     //   46: iconst_0
/*      */     //   47: invokespecial <init> : (ILjava/lang/String;I)V
/*      */     //   50: astore #8
/*      */     //   52: aload_2
/*      */     //   53: ifnonnull -> 99
/*      */     //   56: iload_1
/*      */     //   57: iconst_1
/*      */     //   58: iadd
/*      */     //   59: istore #9
/*      */     //   61: aload_0
/*      */     //   62: getfield currentGroup : I
/*      */     //   65: istore #10
/*      */     //   67: iload #9
/*      */     //   69: iload #10
/*      */     //   71: if_icmpge -> 99
/*      */     //   74: aload #8
/*      */     //   76: aload_0
/*      */     //   77: iload #9
/*      */     //   79: invokevirtual reportGroup : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */     //   82: iload #9
/*      */     //   84: aload_0
/*      */     //   85: getfield groups : [I
/*      */     //   88: iload #9
/*      */     //   90: invokestatic access$groupSize : ([II)I
/*      */     //   93: iadd
/*      */     //   94: istore #9
/*      */     //   96: goto -> 67
/*      */     //   99: aload #8
/*      */     //   101: astore #11
/*      */     //   103: aload_3
/*      */     //   104: aload #4
/*      */     //   106: aload #11
/*      */     //   108: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   113: pop
/*      */     //   114: aload #11
/*      */     //   116: goto -> 121
/*      */     //   119: aload #6
/*      */     //   121: nop
/*      */     //   122: checkcast androidx/compose/runtime/GroupSourceInformation
/*      */     //   125: goto -> 130
/*      */     //   128: pop
/*      */     //   129: aconst_null
/*      */     //   130: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1779	-> 0
/*      */     //   #4225	-> 22
/*      */     //   #4226	-> 32
/*      */     //   #4227	-> 37
/*      */     //   #1780	-> 40
/*      */     //   #1785	-> 52
/*      */     //   #1786	-> 56
/*      */     //   #1787	-> 61
/*      */     //   #1788	-> 67
/*      */     //   #1789	-> 74
/*      */     //   #1790	-> 82
/*      */     //   #1794	-> 99
/*      */     //   #4227	-> 101
/*      */     //   #4228	-> 103
/*      */     //   #4229	-> 114
/*      */     //   #4231	-> 119
/*      */     //   #4226	-> 121
/*      */     //   #1779	-> 128
/*      */     //   #1795	-> 130
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   61	38	9	child	I
/*      */     //   67	32	10	end	I
/*      */     //   40	61	7	$i$a$-getOrPut-SlotWriter$groupSourceInformationFor$1	I
/*      */     //   52	49	8	result	Landroidx/compose/runtime/GroupSourceInformation;
/*      */     //   103	13	11	answer$iv	Ljava/lang/Object;
/*      */     //   22	100	5	$i$f$getOrPut	I
/*      */     //   32	90	6	value$iv	Ljava/lang/Object;
/*      */     //   19	103	3	$this$getOrPut$iv	Ljava/util/Map;
/*      */     //   19	103	4	key$iv	Ljava/lang/Object;
/*      */     //   0	131	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	131	1	parent	I
/*      */     //   0	131	2	sourceInformation	Ljava/lang/String;
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
/*      */   public final void updateNode(@Nullable Object value) {
/* 1800 */     updateNodeOfGroup(this.currentGroup, value);
/*      */   }
/*      */ 
/*      */   
/*      */   public final void updateNode(@NotNull Anchor anchor, @Nullable Object value) {
/* 1805 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); updateNodeOfGroup(anchor.toIndexFor(this), value);
/*      */   }
/*      */ 
/*      */   
/*      */   public final void updateParentNode(@Nullable Object value) {
/* 1810 */     updateNodeOfGroup(this.parent, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void set(@Nullable Object value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield currentSlot : I
/*      */     //   4: aload_0
/*      */     //   5: getfield currentSlotEnd : I
/*      */     //   8: if_icmpgt -> 15
/*      */     //   11: iconst_1
/*      */     //   12: goto -> 16
/*      */     //   15: iconst_0
/*      */     //   16: istore_2
/*      */     //   17: iconst_0
/*      */     //   18: istore_3
/*      */     //   19: nop
/*      */     //   20: iload_2
/*      */     //   21: ifne -> 33
/*      */     //   24: iconst_0
/*      */     //   25: istore #4
/*      */     //   27: ldc_w 'Writing to an invalid slot'
/*      */     //   30: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   33: nop
/*      */     //   34: aload_0
/*      */     //   35: getfield slots : [Ljava/lang/Object;
/*      */     //   38: aload_0
/*      */     //   39: aload_0
/*      */     //   40: getfield currentSlot : I
/*      */     //   43: iconst_1
/*      */     //   44: isub
/*      */     //   45: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   48: aload_1
/*      */     //   49: aastore
/*      */     //   50: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1816	-> 0
/*      */     //   #4232	-> 19
/*      */     //   #4235	-> 20
/*      */     //   #4236	-> 24
/*      */     //   #1817	-> 27
/*      */     //   #4236	-> 30
/*      */     //   #4238	-> 33
/*      */     //   #1819	-> 34
/*      */     //   #1820	-> 50
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   27	3	4	$i$a$-runtimeCheck-SlotWriter$set$1	I
/*      */     //   19	15	3	$i$f$runtimeCheck	I
/*      */     //   17	17	2	value$iv	Z
/*      */     //   0	51	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	51	1	value	Ljava/lang/Object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object set(int index, @Nullable Object value) {
/* 1826 */     return set(this.currentGroup, index, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int slotIndexOfGroupSlotIndex(int group, int index) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iload_1
/*      */     //   2: invokespecial groupIndexToAddress : (I)I
/*      */     //   5: istore_3
/*      */     //   6: aload_0
/*      */     //   7: aload_0
/*      */     //   8: getfield groups : [I
/*      */     //   11: iload_3
/*      */     //   12: invokespecial slotIndex : ([II)I
/*      */     //   15: istore #4
/*      */     //   17: aload_0
/*      */     //   18: aload_0
/*      */     //   19: getfield groups : [I
/*      */     //   22: aload_0
/*      */     //   23: iload_1
/*      */     //   24: iconst_1
/*      */     //   25: iadd
/*      */     //   26: invokespecial groupIndexToAddress : (I)I
/*      */     //   29: invokespecial dataIndex : ([II)I
/*      */     //   32: istore #5
/*      */     //   34: iload #4
/*      */     //   36: iload_2
/*      */     //   37: iadd
/*      */     //   38: istore #6
/*      */     //   40: iload #6
/*      */     //   42: iload #4
/*      */     //   44: if_icmplt -> 58
/*      */     //   47: iload #6
/*      */     //   49: iload #5
/*      */     //   51: if_icmpge -> 58
/*      */     //   54: iconst_1
/*      */     //   55: goto -> 59
/*      */     //   58: iconst_0
/*      */     //   59: istore #7
/*      */     //   61: iconst_0
/*      */     //   62: istore #8
/*      */     //   64: nop
/*      */     //   65: iload #7
/*      */     //   67: ifne -> 106
/*      */     //   70: iconst_0
/*      */     //   71: istore #9
/*      */     //   73: new java/lang/StringBuilder
/*      */     //   76: dup
/*      */     //   77: invokespecial <init> : ()V
/*      */     //   80: ldc_w 'Write to an invalid slot index '
/*      */     //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   86: iload_2
/*      */     //   87: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   90: ldc_w ' for group '
/*      */     //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   96: iload_1
/*      */     //   97: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   103: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   106: nop
/*      */     //   107: iload #6
/*      */     //   109: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1832	-> 0
/*      */     //   #1833	-> 6
/*      */     //   #1834	-> 17
/*      */     //   #1835	-> 34
/*      */     //   #1837	-> 40
/*      */     //   #4239	-> 64
/*      */     //   #4242	-> 65
/*      */     //   #4243	-> 70
/*      */     //   #1838	-> 73
/*      */     //   #4243	-> 103
/*      */     //   #4245	-> 106
/*      */     //   #1840	-> 107
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   73	30	9	$i$a$-runtimeCheck-SlotWriter$slotIndexOfGroupSlotIndex$1	I
/*      */     //   64	43	8	$i$f$runtimeCheck	I
/*      */     //   61	46	7	value$iv	Z
/*      */     //   6	104	3	address	I
/*      */     //   17	93	4	slotsStart	I
/*      */     //   34	76	5	slotsEnd	I
/*      */     //   40	70	6	slotsIndex	I
/*      */     //   0	110	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	110	1	group	I
/*      */     //   0	110	2	index	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object set(int group, int index, @Nullable Object value) {
/* 1847 */     int slotsIndex = slotIndexOfGroupSlotIndex(group, index);
/* 1848 */     int slotAddress = dataIndexToDataAddress(slotsIndex);
/* 1849 */     Object result = this.slots[slotAddress];
/* 1850 */     this.slots[slotAddress] = value;
/* 1851 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object skip() {
/* 1859 */     if (this.insertCount > 0) {
/* 1860 */       insertSlots(1, this.parent);
/*      */     }
/* 1862 */     int i = this.currentSlot; this.currentSlot = i + 1; return this.slots[dataIndexToDataAddress(i)];
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object slot(@NotNull Anchor anchor, int index) {
/* 1869 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); return slot(anchorIndex(anchor), index);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Object slot(int groupIndex, int index) {
/* 1876 */     int address = groupIndexToAddress(groupIndex);
/* 1877 */     int slotsStart = slotIndex(this.groups, address);
/* 1878 */     int slotsEnd = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
/* 1879 */     int slotsIndex = slotsStart + index;
/* 1880 */     if (!((slotsStart <= slotsIndex) ? ((slotsIndex < slotsEnd) ? 1 : 0) : 0)) {
/* 1881 */       return Composer.Companion.getEmpty();
/*      */     }
/* 1883 */     int slotAddress = dataIndexToDataAddress(slotsIndex);
/* 1884 */     return this.slots[slotAddress];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void forEachTailSlot(int groupIndex, int count, @NotNull Function2 block) {
/* 1891 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachTailSlot = 0, slotsStart = slotsStartIndex$runtime(groupIndex);
/* 1892 */     int slotsEnd = slotsEndIndex$runtime(groupIndex);
/* 1893 */     for (int slotIndex = Math.max(slotsStart, slotsEnd - count); slotIndex < slotsEnd; slotIndex++) {
/* 1894 */       block.invoke(Integer.valueOf(slotIndex), this.slots[dataIndexToDataAddress(slotIndex)]);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int slotsStartIndex$runtime(int groupIndex) {
/* 1903 */     return slotIndex(this.groups, groupIndexToAddress(groupIndex));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int slotsEndIndex$runtime(int groupIndex) {
/* 1910 */     return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
/*      */   }
/*      */   public final int slotsEndAllIndex$runtime(int groupIndex) {
/* 1913 */     return dataIndex(this.groups, groupIndexToAddress(groupIndex + groupSize(groupIndex)));
/*      */   }
/*      */   private final int getCurrentGroupSlotIndex() {
/* 1916 */     (MutableObjectList)this.deferredSlotWrites.get(this.parent); return this.currentSlot - slotsStartIndex$runtime(this.parent) + ((this.deferredSlotWrites != null && (MutableObjectList)this.deferredSlotWrites.get(this.parent) != null) ? ((MutableObjectList)this.deferredSlotWrites.get(this.parent)).getSize() : 0);
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
/*      */   public final void advanceBy(int amount) {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: iflt -> 8
/*      */     //   4: iconst_1
/*      */     //   5: goto -> 9
/*      */     //   8: iconst_0
/*      */     //   9: istore_2
/*      */     //   10: iconst_0
/*      */     //   11: istore_3
/*      */     //   12: nop
/*      */     //   13: iload_2
/*      */     //   14: ifne -> 26
/*      */     //   17: iconst_0
/*      */     //   18: istore #4
/*      */     //   20: ldc_w 'Cannot seek backwards'
/*      */     //   23: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   26: nop
/*      */     //   27: aload_0
/*      */     //   28: getfield insertCount : I
/*      */     //   31: ifgt -> 38
/*      */     //   34: iconst_1
/*      */     //   35: goto -> 39
/*      */     //   38: iconst_0
/*      */     //   39: istore_2
/*      */     //   40: iconst_0
/*      */     //   41: istore_3
/*      */     //   42: nop
/*      */     //   43: iload_2
/*      */     //   44: ifne -> 56
/*      */     //   47: iconst_0
/*      */     //   48: istore #4
/*      */     //   50: ldc_w 'Cannot call seek() while inserting'
/*      */     //   53: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   56: nop
/*      */     //   57: iload_1
/*      */     //   58: ifne -> 62
/*      */     //   61: return
/*      */     //   62: aload_0
/*      */     //   63: getfield currentGroup : I
/*      */     //   66: iload_1
/*      */     //   67: iadd
/*      */     //   68: istore_2
/*      */     //   69: iload_2
/*      */     //   70: aload_0
/*      */     //   71: getfield parent : I
/*      */     //   74: if_icmplt -> 89
/*      */     //   77: iload_2
/*      */     //   78: aload_0
/*      */     //   79: getfield currentGroupEnd : I
/*      */     //   82: if_icmpgt -> 89
/*      */     //   85: iconst_1
/*      */     //   86: goto -> 90
/*      */     //   89: iconst_0
/*      */     //   90: istore_3
/*      */     //   91: iconst_0
/*      */     //   92: istore #4
/*      */     //   94: nop
/*      */     //   95: iload_3
/*      */     //   96: ifne -> 145
/*      */     //   99: iconst_0
/*      */     //   100: istore #5
/*      */     //   102: new java/lang/StringBuilder
/*      */     //   105: dup
/*      */     //   106: invokespecial <init> : ()V
/*      */     //   109: ldc_w 'Cannot seek outside the current group ('
/*      */     //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   115: aload_0
/*      */     //   116: getfield parent : I
/*      */     //   119: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   122: bipush #45
/*      */     //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*      */     //   127: aload_0
/*      */     //   128: getfield currentGroupEnd : I
/*      */     //   131: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   134: bipush #41
/*      */     //   136: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*      */     //   139: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   142: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   145: nop
/*      */     //   146: aload_0
/*      */     //   147: iload_2
/*      */     //   148: putfield currentGroup : I
/*      */     //   151: aload_0
/*      */     //   152: aload_0
/*      */     //   153: getfield groups : [I
/*      */     //   156: aload_0
/*      */     //   157: iload_2
/*      */     //   158: invokespecial groupIndexToAddress : (I)I
/*      */     //   161: invokespecial dataIndex : ([II)I
/*      */     //   164: istore_3
/*      */     //   165: aload_0
/*      */     //   166: iload_3
/*      */     //   167: putfield currentSlot : I
/*      */     //   170: aload_0
/*      */     //   171: iload_3
/*      */     //   172: putfield currentSlotEnd : I
/*      */     //   175: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1923	-> 0
/*      */     //   #4246	-> 12
/*      */     //   #4249	-> 13
/*      */     //   #4250	-> 17
/*      */     //   #1923	-> 20
/*      */     //   #4250	-> 23
/*      */     //   #4252	-> 26
/*      */     //   #1924	-> 27
/*      */     //   #4253	-> 42
/*      */     //   #4256	-> 43
/*      */     //   #4257	-> 47
/*      */     //   #1924	-> 50
/*      */     //   #4257	-> 53
/*      */     //   #4259	-> 56
/*      */     //   #1925	-> 57
/*      */     //   #1926	-> 62
/*      */     //   #1928	-> 69
/*      */     //   #4260	-> 94
/*      */     //   #4263	-> 95
/*      */     //   #4264	-> 99
/*      */     //   #1929	-> 102
/*      */     //   #4264	-> 142
/*      */     //   #4266	-> 145
/*      */     //   #1931	-> 146
/*      */     //   #1932	-> 151
/*      */     //   #1933	-> 165
/*      */     //   #1934	-> 170
/*      */     //   #1935	-> 175
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   20	3	4	$i$a$-runtimeCheck-SlotWriter$advanceBy$1	I
/*      */     //   12	15	3	$i$f$runtimeCheck	I
/*      */     //   10	17	2	value$iv	Z
/*      */     //   50	3	4	$i$a$-checkPrecondition-SlotWriter$advanceBy$2	I
/*      */     //   42	15	3	$i$f$checkPrecondition	I
/*      */     //   40	17	2	value$iv	Z
/*      */     //   102	40	5	$i$a$-runtimeCheck-SlotWriter$advanceBy$3	I
/*      */     //   94	52	4	$i$f$runtimeCheck	I
/*      */     //   91	55	3	value$iv	Z
/*      */     //   69	107	2	index	I
/*      */     //   165	11	3	newSlot	I
/*      */     //   0	176	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	176	1	amount	I
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
/*      */   public final void seek(@NotNull Anchor anchor) {
/* 1941 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); advanceBy(anchor.toIndexFor(this) - this.currentGroup);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void skipToGroupEnd() {
/* 1947 */     int newGroup = this.currentGroupEnd;
/* 1948 */     this.currentGroup = newGroup;
/* 1949 */     this.currentSlot = dataIndex(this.groups, groupIndexToAddress(newGroup));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void beginInsert() {
/* 1957 */     int i = this.insertCount; this.insertCount = i + 1; if (i == 0) {
/* 1958 */       saveCurrentGroupEnd();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void endInsert() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
/*      */     //   4: ifle -> 11
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
/*      */     //   22: ldc_w 'Unbalanced begin/end insert'
/*      */     //   25: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: aload_0
/*      */     //   31: getfield insertCount : I
/*      */     //   34: iconst_m1
/*      */     //   35: iadd
/*      */     //   36: putfield insertCount : I
/*      */     //   39: aload_0
/*      */     //   40: getfield insertCount : I
/*      */     //   43: ifne -> 90
/*      */     //   46: aload_0
/*      */     //   47: getfield nodeCountStack : Landroidx/compose/runtime/IntStack;
/*      */     //   50: invokevirtual getSize : ()I
/*      */     //   53: aload_0
/*      */     //   54: getfield startStack : Landroidx/compose/runtime/IntStack;
/*      */     //   57: invokevirtual getSize : ()I
/*      */     //   60: if_icmpne -> 67
/*      */     //   63: iconst_1
/*      */     //   64: goto -> 68
/*      */     //   67: iconst_0
/*      */     //   68: istore_1
/*      */     //   69: iconst_0
/*      */     //   70: istore_2
/*      */     //   71: nop
/*      */     //   72: iload_1
/*      */     //   73: ifne -> 84
/*      */     //   76: iconst_0
/*      */     //   77: istore_3
/*      */     //   78: ldc_w 'startGroup/endGroup mismatch while inserting'
/*      */     //   81: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   84: nop
/*      */     //   85: aload_0
/*      */     //   86: invokespecial restoreCurrentGroupEnd : ()I
/*      */     //   89: pop
/*      */     //   90: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1966	-> 0
/*      */     //   #4267	-> 15
/*      */     //   #4270	-> 16
/*      */     //   #4271	-> 20
/*      */     //   #1966	-> 22
/*      */     //   #4271	-> 25
/*      */     //   #4273	-> 28
/*      */     //   #1967	-> 29
/*      */     //   #1968	-> 46
/*      */     //   #4274	-> 71
/*      */     //   #4277	-> 72
/*      */     //   #4278	-> 76
/*      */     //   #1969	-> 78
/*      */     //   #4278	-> 81
/*      */     //   #4280	-> 84
/*      */     //   #1971	-> 85
/*      */     //   #1973	-> 90
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-checkPrecondition-SlotWriter$endInsert$1	I
/*      */     //   15	14	2	$i$f$checkPrecondition	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   78	3	3	$i$a$-runtimeCheck-SlotWriter$endInsert$2	I
/*      */     //   71	14	2	$i$f$runtimeCheck	I
/*      */     //   69	16	1	value$iv	Z
/*      */     //   0	91	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
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
/*      */     //   22: ldc_w 'Key must be supplied when inserting'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: iconst_0
/*      */     //   31: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   34: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   37: iconst_0
/*      */     //   38: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   41: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   44: invokespecial startGroup : (ILjava/lang/Object;ZLjava/lang/Object;)V
/*      */     //   47: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1979	-> 0
/*      */     //   #4281	-> 15
/*      */     //   #4284	-> 16
/*      */     //   #4285	-> 20
/*      */     //   #1979	-> 22
/*      */     //   #4285	-> 25
/*      */     //   #4287	-> 28
/*      */     //   #1980	-> 29
/*      */     //   #1981	-> 47
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-SlotWriter$startGroup$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   0	48	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startGroup(int key) {
/* 1986 */     startGroup(key, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
/*      */   }
/*      */ 
/*      */   
/*      */   public final void startGroup(int key, @Nullable Object dataKey) {
/* 1991 */     startGroup(
/* 1992 */         key, 
/* 1993 */         dataKey, 
/* 1994 */         false, 
/* 1995 */         Composer.Companion.getEmpty());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startNode(int key, @Nullable Object objectKey) {
/* 2002 */     startGroup(key, objectKey, true, Composer.Companion.getEmpty());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startNode(int key, @Nullable Object objectKey, @Nullable Object node) {
/* 2008 */     startGroup(key, objectKey, true, node);
/*      */   }
/*      */ 
/*      */   
/*      */   public final void startData(int key, @Nullable Object objectKey, @Nullable Object aux) {
/* 2013 */     startGroup(
/* 2014 */         key, 
/* 2015 */         objectKey, 
/* 2016 */         false, 
/* 2017 */         aux);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void startData(int key, @Nullable Object aux) {
/* 2023 */     startGroup(key, Composer.Companion.getEmpty(), false, aux);
/*      */   }
/*      */   private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
/* 2026 */     int previousParent = this.parent;
/* 2027 */     boolean inserting = (this.insertCount > 0);
/* 2028 */     this.nodeCountStack.push(this.nodeCount);
/*      */ 
/*      */     
/* 2031 */     int current = this.currentGroup;
/* 2032 */     int newCurrentSlot = dataIndex(this.groups, groupIndexToAddress(current));
/* 2033 */     insertGroups(1);
/* 2034 */     this.currentSlot = newCurrentSlot;
/* 2035 */     this.currentSlotEnd = newCurrentSlot;
/* 2036 */     int currentAddress = groupIndexToAddress(current);
/* 2037 */     boolean hasObjectKey = (objectKey != Composer.Companion.getEmpty());
/* 2038 */     boolean hasAux = (!isNode && aux != Composer.Companion.getEmpty());
/*      */ 
/*      */     
/* 2041 */     int i = this.slotsGapLen;
/* 2042 */     int j = this.slotsGapStart;
/* 2043 */     int k = this.slots.length;
/* 2044 */     j = dataIndexToDataAnchor(newCurrentSlot, j, i, k); SlotWriter slotWriter = this; int $i$a$-let-SlotWriter$startGroup$dataAnchor$1 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2055 */     int slotsSize = this.slots.length - this.slotsGapLen;
/* 2056 */     int m = (j >= 0 && this.slotsGapOwner < current) ? -(slotsSize - j + 1) : 
/* 2057 */       j;
/*      */     int dataAnchor = m;
/* 2059 */     SlotTableKt.access$initGroup(this.groups, 
/* 2060 */         currentAddress, 
/* 2061 */         key, 
/* 2062 */         isNode, 
/* 2063 */         hasObjectKey, 
/* 2064 */         hasAux, 
/* 2065 */         this.parent, 
/* 2066 */         dataAnchor);
/*      */ 
/*      */     
/* 2069 */     int dataSlotsNeeded = (isNode ? 1 : 0) + (
/* 2070 */       hasObjectKey ? 1 : 0) + (
/* 2071 */       hasAux ? 1 : 0);
/* 2072 */     if (dataSlotsNeeded > 0) {
/* 2073 */       insertSlots(dataSlotsNeeded, current);
/* 2074 */       Object[] slots = this.slots;
/* 2075 */       int currentSlot = this.currentSlot;
/* 2076 */       if (isNode) slots[currentSlot++] = aux; 
/* 2077 */       if (hasObjectKey) slots[currentSlot++] = objectKey; 
/* 2078 */       if (hasAux) slots[currentSlot++] = aux; 
/* 2079 */       this.currentSlot = currentSlot;
/*      */     } 
/* 2081 */     this.nodeCount = 0;
/* 2082 */     int newCurrent = current + 1;
/* 2083 */     this.parent = current;
/* 2084 */     this.currentGroup = newCurrent;
/* 2085 */     if (previousParent >= 0) {
/* 2086 */       if (sourceInformationOf(previousParent) != null) { sourceInformationOf(previousParent).reportGroup(this, current); } else { sourceInformationOf(previousParent); }
/*      */     
/*      */     }
/*      */     
/* 2090 */     this.startStack.push(previousParent);
/* 2091 */     saveCurrentGroupEnd();
/* 2092 */     int currentGroup = this.currentGroup;
/* 2093 */     int currentGroupAddress = groupIndexToAddress(currentGroup);
/* 2094 */     if (!Intrinsics.areEqual(aux, Composer.Companion.getEmpty()))
/* 2095 */       if (isNode) {
/* 2096 */         updateNode(aux);
/*      */       } else {
/* 2098 */         updateAux(aux);
/*      */       }  
/* 2100 */     this.currentSlot = slotIndex(this.groups, currentGroupAddress);
/* 2101 */     this.currentSlotEnd = dataIndex(this.groups, 
/* 2102 */         groupIndexToAddress(this.currentGroup + 1));
/*      */     
/* 2104 */     this.nodeCount = SlotTableKt.access$nodeCount(this.groups, currentGroupAddress);
/*      */     
/* 2106 */     this.parent = currentGroup;
/* 2107 */     this.currentGroup = currentGroup + 1;
/* 2108 */     slotWriter.currentGroupEnd = inserting ? newCurrent : (currentGroup + SlotTableKt.access$groupSize(this.groups, currentGroupAddress));
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int endGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
/*      */     //   4: ifle -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_1
/*      */     //   13: aload_0
/*      */     //   14: getfield currentGroup : I
/*      */     //   17: istore_2
/*      */     //   18: aload_0
/*      */     //   19: getfield currentGroupEnd : I
/*      */     //   22: istore_3
/*      */     //   23: aload_0
/*      */     //   24: getfield parent : I
/*      */     //   27: istore #4
/*      */     //   29: aload_0
/*      */     //   30: iload #4
/*      */     //   32: invokespecial groupIndexToAddress : (I)I
/*      */     //   35: istore #5
/*      */     //   37: aload_0
/*      */     //   38: getfield nodeCount : I
/*      */     //   41: istore #6
/*      */     //   43: iload_2
/*      */     //   44: iload #4
/*      */     //   46: isub
/*      */     //   47: istore #7
/*      */     //   49: aload_0
/*      */     //   50: getfield groups : [I
/*      */     //   53: iload #5
/*      */     //   55: invokestatic access$isNode : ([II)Z
/*      */     //   58: istore #8
/*      */     //   60: iload_1
/*      */     //   61: ifeq -> 290
/*      */     //   64: aload_0
/*      */     //   65: getfield deferredSlotWrites : Landroidx/collection/MutableIntObjectMap;
/*      */     //   68: astore #9
/*      */     //   70: aload #9
/*      */     //   72: dup
/*      */     //   73: ifnull -> 167
/*      */     //   76: iload #4
/*      */     //   78: invokevirtual get : (I)Ljava/lang/Object;
/*      */     //   81: checkcast androidx/collection/MutableObjectList
/*      */     //   84: dup
/*      */     //   85: ifnull -> 167
/*      */     //   88: astore #12
/*      */     //   90: iconst_0
/*      */     //   91: istore #13
/*      */     //   93: aload #12
/*      */     //   95: checkcast androidx/collection/ObjectList
/*      */     //   98: astore #14
/*      */     //   100: iconst_0
/*      */     //   101: istore #15
/*      */     //   103: nop
/*      */     //   104: aload #14
/*      */     //   106: getfield content : [Ljava/lang/Object;
/*      */     //   109: astore #16
/*      */     //   111: iconst_0
/*      */     //   112: istore #17
/*      */     //   114: aload #14
/*      */     //   116: getfield _size : I
/*      */     //   119: istore #18
/*      */     //   121: iload #17
/*      */     //   123: iload #18
/*      */     //   125: if_icmpge -> 152
/*      */     //   128: aload #16
/*      */     //   130: iload #17
/*      */     //   132: aaload
/*      */     //   133: astore #19
/*      */     //   135: iconst_0
/*      */     //   136: istore #20
/*      */     //   138: aload_0
/*      */     //   139: aload #19
/*      */     //   141: invokespecial rawUpdate : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   144: pop
/*      */     //   145: nop
/*      */     //   146: iinc #17, 1
/*      */     //   149: goto -> 121
/*      */     //   152: nop
/*      */     //   153: aload #9
/*      */     //   155: iload #4
/*      */     //   157: invokevirtual remove : (I)Ljava/lang/Object;
/*      */     //   160: checkcast androidx/collection/MutableObjectList
/*      */     //   163: pop
/*      */     //   164: goto -> 169
/*      */     //   167: pop
/*      */     //   168: nop
/*      */     //   169: aload_0
/*      */     //   170: getfield groups : [I
/*      */     //   173: iload #5
/*      */     //   175: iload #7
/*      */     //   177: invokestatic access$updateGroupSize : ([III)V
/*      */     //   180: aload_0
/*      */     //   181: getfield groups : [I
/*      */     //   184: iload #5
/*      */     //   186: iload #6
/*      */     //   188: invokestatic access$updateNodeCount : ([III)V
/*      */     //   191: aload_0
/*      */     //   192: aload_0
/*      */     //   193: getfield nodeCountStack : Landroidx/compose/runtime/IntStack;
/*      */     //   196: invokevirtual pop : ()I
/*      */     //   199: iload #8
/*      */     //   201: ifeq -> 208
/*      */     //   204: iconst_1
/*      */     //   205: goto -> 210
/*      */     //   208: iload #6
/*      */     //   210: iadd
/*      */     //   211: putfield nodeCount : I
/*      */     //   214: aload_0
/*      */     //   215: aload_0
/*      */     //   216: aload_0
/*      */     //   217: getfield groups : [I
/*      */     //   220: iload #4
/*      */     //   222: invokespecial parent : ([II)I
/*      */     //   225: putfield parent : I
/*      */     //   228: aload_0
/*      */     //   229: getfield parent : I
/*      */     //   232: ifge -> 242
/*      */     //   235: aload_0
/*      */     //   236: invokevirtual getSize$runtime : ()I
/*      */     //   239: goto -> 252
/*      */     //   242: aload_0
/*      */     //   243: aload_0
/*      */     //   244: getfield parent : I
/*      */     //   247: iconst_1
/*      */     //   248: iadd
/*      */     //   249: invokespecial groupIndexToAddress : (I)I
/*      */     //   252: istore #10
/*      */     //   254: iload #10
/*      */     //   256: ifge -> 263
/*      */     //   259: iconst_0
/*      */     //   260: goto -> 273
/*      */     //   263: aload_0
/*      */     //   264: aload_0
/*      */     //   265: getfield groups : [I
/*      */     //   268: iload #10
/*      */     //   270: invokespecial dataIndex : ([II)I
/*      */     //   273: istore #11
/*      */     //   275: aload_0
/*      */     //   276: iload #11
/*      */     //   278: putfield currentSlot : I
/*      */     //   281: aload_0
/*      */     //   282: iload #11
/*      */     //   284: putfield currentSlotEnd : I
/*      */     //   287: goto -> 605
/*      */     //   290: iload_2
/*      */     //   291: iload_3
/*      */     //   292: if_icmpne -> 299
/*      */     //   295: iconst_1
/*      */     //   296: goto -> 300
/*      */     //   299: iconst_0
/*      */     //   300: istore #9
/*      */     //   302: iconst_0
/*      */     //   303: istore #10
/*      */     //   305: nop
/*      */     //   306: iload #9
/*      */     //   308: ifne -> 320
/*      */     //   311: iconst_0
/*      */     //   312: istore #11
/*      */     //   314: ldc_w 'Expected to be at the end of a group'
/*      */     //   317: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   320: nop
/*      */     //   321: aload_0
/*      */     //   322: getfield groups : [I
/*      */     //   325: iload #5
/*      */     //   327: invokestatic access$groupSize : ([II)I
/*      */     //   330: istore #9
/*      */     //   332: aload_0
/*      */     //   333: getfield groups : [I
/*      */     //   336: iload #5
/*      */     //   338: invokestatic access$nodeCount : ([II)I
/*      */     //   341: istore #10
/*      */     //   343: aload_0
/*      */     //   344: getfield groups : [I
/*      */     //   347: iload #5
/*      */     //   349: iload #7
/*      */     //   351: invokestatic access$updateGroupSize : ([III)V
/*      */     //   354: aload_0
/*      */     //   355: getfield groups : [I
/*      */     //   358: iload #5
/*      */     //   360: iload #6
/*      */     //   362: invokestatic access$updateNodeCount : ([III)V
/*      */     //   365: aload_0
/*      */     //   366: getfield startStack : Landroidx/compose/runtime/IntStack;
/*      */     //   369: invokevirtual pop : ()I
/*      */     //   372: istore #11
/*      */     //   374: aload_0
/*      */     //   375: invokespecial restoreCurrentGroupEnd : ()I
/*      */     //   378: pop
/*      */     //   379: aload_0
/*      */     //   380: iload #11
/*      */     //   382: putfield parent : I
/*      */     //   385: aload_0
/*      */     //   386: aload_0
/*      */     //   387: getfield groups : [I
/*      */     //   390: iload #4
/*      */     //   392: invokespecial parent : ([II)I
/*      */     //   395: istore #12
/*      */     //   397: aload_0
/*      */     //   398: aload_0
/*      */     //   399: getfield nodeCountStack : Landroidx/compose/runtime/IntStack;
/*      */     //   402: invokevirtual pop : ()I
/*      */     //   405: putfield nodeCount : I
/*      */     //   408: iload #12
/*      */     //   410: iload #11
/*      */     //   412: if_icmpne -> 441
/*      */     //   415: aload_0
/*      */     //   416: aload_0
/*      */     //   417: getfield nodeCount : I
/*      */     //   420: iload #8
/*      */     //   422: ifeq -> 429
/*      */     //   425: iconst_0
/*      */     //   426: goto -> 434
/*      */     //   429: iload #6
/*      */     //   431: iload #10
/*      */     //   433: isub
/*      */     //   434: iadd
/*      */     //   435: putfield nodeCount : I
/*      */     //   438: goto -> 605
/*      */     //   441: iload #7
/*      */     //   443: iload #9
/*      */     //   445: isub
/*      */     //   446: istore #13
/*      */     //   448: iload #8
/*      */     //   450: ifeq -> 457
/*      */     //   453: iconst_0
/*      */     //   454: goto -> 462
/*      */     //   457: iload #6
/*      */     //   459: iload #10
/*      */     //   461: isub
/*      */     //   462: istore #14
/*      */     //   464: iload #13
/*      */     //   466: ifne -> 474
/*      */     //   469: iload #14
/*      */     //   471: ifeq -> 594
/*      */     //   474: iload #12
/*      */     //   476: istore #15
/*      */     //   478: iload #15
/*      */     //   480: ifeq -> 594
/*      */     //   483: iload #15
/*      */     //   485: iload #11
/*      */     //   487: if_icmpeq -> 594
/*      */     //   490: iload #14
/*      */     //   492: ifne -> 500
/*      */     //   495: iload #13
/*      */     //   497: ifeq -> 594
/*      */     //   500: aload_0
/*      */     //   501: iload #15
/*      */     //   503: invokespecial groupIndexToAddress : (I)I
/*      */     //   506: istore #16
/*      */     //   508: iload #13
/*      */     //   510: ifeq -> 538
/*      */     //   513: aload_0
/*      */     //   514: getfield groups : [I
/*      */     //   517: iload #16
/*      */     //   519: invokestatic access$groupSize : ([II)I
/*      */     //   522: iload #13
/*      */     //   524: iadd
/*      */     //   525: istore #17
/*      */     //   527: aload_0
/*      */     //   528: getfield groups : [I
/*      */     //   531: iload #16
/*      */     //   533: iload #17
/*      */     //   535: invokestatic access$updateGroupSize : ([III)V
/*      */     //   538: iload #14
/*      */     //   540: ifeq -> 564
/*      */     //   543: aload_0
/*      */     //   544: getfield groups : [I
/*      */     //   547: iload #16
/*      */     //   549: aload_0
/*      */     //   550: getfield groups : [I
/*      */     //   553: iload #16
/*      */     //   555: invokestatic access$nodeCount : ([II)I
/*      */     //   558: iload #14
/*      */     //   560: iadd
/*      */     //   561: invokestatic access$updateNodeCount : ([III)V
/*      */     //   564: aload_0
/*      */     //   565: getfield groups : [I
/*      */     //   568: iload #16
/*      */     //   570: invokestatic access$isNode : ([II)Z
/*      */     //   573: ifeq -> 579
/*      */     //   576: iconst_0
/*      */     //   577: istore #14
/*      */     //   579: aload_0
/*      */     //   580: aload_0
/*      */     //   581: getfield groups : [I
/*      */     //   584: iload #15
/*      */     //   586: invokespecial parent : ([II)I
/*      */     //   589: istore #15
/*      */     //   591: goto -> 478
/*      */     //   594: aload_0
/*      */     //   595: aload_0
/*      */     //   596: getfield nodeCount : I
/*      */     //   599: iload #14
/*      */     //   601: iadd
/*      */     //   602: putfield nodeCount : I
/*      */     //   605: iload #6
/*      */     //   607: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2116	-> 0
/*      */     //   #2117	-> 13
/*      */     //   #2118	-> 18
/*      */     //   #2120	-> 23
/*      */     //   #2121	-> 29
/*      */     //   #2122	-> 37
/*      */     //   #2123	-> 43
/*      */     //   #2124	-> 49
/*      */     //   #2125	-> 60
/*      */     //   #2127	-> 64
/*      */     //   #2128	-> 70
/*      */     //   #2129	-> 93
/*      */     //   #4288	-> 103
/*      */     //   #4289	-> 104
/*      */     //   #4290	-> 111
/*      */     //   #4291	-> 128
/*      */     //   #2129	-> 138
/*      */     //   #4291	-> 145
/*      */     //   #4290	-> 146
/*      */     //   #4293	-> 152
/*      */     //   #2130	-> 153
/*      */     //   #2128	-> 164
/*      */     //   #2128	-> 167
/*      */     //   #2134	-> 169
/*      */     //   #2135	-> 180
/*      */     //   #2136	-> 191
/*      */     //   #2137	-> 214
/*      */     //   #2138	-> 228
/*      */     //   #2139	-> 254
/*      */     //   #2140	-> 275
/*      */     //   #2141	-> 281
/*      */     //   #2143	-> 290
/*      */     //   #4294	-> 305
/*      */     //   #4297	-> 306
/*      */     //   #4298	-> 311
/*      */     //   #2144	-> 314
/*      */     //   #4298	-> 317
/*      */     //   #4300	-> 320
/*      */     //   #2147	-> 321
/*      */     //   #2148	-> 332
/*      */     //   #2149	-> 343
/*      */     //   #2150	-> 354
/*      */     //   #2151	-> 365
/*      */     //   #2152	-> 374
/*      */     //   #2153	-> 379
/*      */     //   #2154	-> 385
/*      */     //   #2155	-> 397
/*      */     //   #2156	-> 408
/*      */     //   #2158	-> 415
/*      */     //   #2166	-> 441
/*      */     //   #2167	-> 448
/*      */     //   #2168	-> 464
/*      */     //   #2169	-> 474
/*      */     //   #2171	-> 478
/*      */     //   #2172	-> 483
/*      */     //   #2173	-> 490
/*      */     //   #2175	-> 500
/*      */     //   #2176	-> 508
/*      */     //   #2177	-> 513
/*      */     //   #2178	-> 527
/*      */     //   #2180	-> 538
/*      */     //   #2181	-> 543
/*      */     //   #2182	-> 547
/*      */     //   #2183	-> 549
/*      */     //   #2181	-> 561
/*      */     //   #2186	-> 564
/*      */     //   #2187	-> 579
/*      */     //   #2190	-> 594
/*      */     //   #2193	-> 605
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   138	7	20	$i$a$-forEach-SlotWriter$endGroup$1$1	I
/*      */     //   135	10	19	value	Ljava/lang/Object;
/*      */     //   114	38	17	i$iv	I
/*      */     //   103	50	15	$i$f$forEach	I
/*      */     //   111	42	16	content$iv	[Ljava/lang/Object;
/*      */     //   100	53	14	this_$iv	Landroidx/collection/ObjectList;
/*      */     //   93	71	13	$i$a$-let-SlotWriter$endGroup$1	I
/*      */     //   90	74	12	it	Landroidx/collection/MutableObjectList;
/*      */     //   70	217	9	deferredSlotWrites	Landroidx/collection/MutableIntObjectMap;
/*      */     //   254	33	10	nextAddress	I
/*      */     //   275	12	11	newCurrentSlot	I
/*      */     //   314	3	11	$i$a$-runtimeCheck-SlotWriter$endGroup$2	I
/*      */     //   305	16	10	$i$f$runtimeCheck	I
/*      */     //   302	19	9	value$iv	Z
/*      */     //   527	11	17	newSize	I
/*      */     //   508	83	16	currentAddress	I
/*      */     //   478	116	15	current	I
/*      */     //   448	157	13	groupSizeDelta	I
/*      */     //   464	141	14	nodesDelta	I
/*      */     //   332	273	9	oldGroupSize	I
/*      */     //   343	262	10	oldNodes	I
/*      */     //   374	231	11	newParent	I
/*      */     //   397	208	12	groupParent	I
/*      */     //   13	595	1	inserting	Z
/*      */     //   18	590	2	currentGroup	I
/*      */     //   23	585	3	currentGroupEnd	I
/*      */     //   29	579	4	groupIndex	I
/*      */     //   37	571	5	groupAddress	I
/*      */     //   43	565	6	newNodes	I
/*      */     //   49	559	7	newGroupSize	I
/*      */     //   60	548	8	isNode	Z
/*      */     //   0	608	0	this	Landroidx/compose/runtime/SlotWriter;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void ensureStarted(int index) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
/*      */     //   4: ifgt -> 11
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
/*      */     //   23: ldc_w 'Cannot call ensureStarted() while inserting'
/*      */     //   26: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: aload_0
/*      */     //   31: getfield parent : I
/*      */     //   34: istore_2
/*      */     //   35: iload_2
/*      */     //   36: iload_1
/*      */     //   37: if_icmpeq -> 147
/*      */     //   40: iload_1
/*      */     //   41: iload_2
/*      */     //   42: if_icmplt -> 57
/*      */     //   45: iload_1
/*      */     //   46: aload_0
/*      */     //   47: getfield currentGroupEnd : I
/*      */     //   50: if_icmpge -> 57
/*      */     //   53: iconst_1
/*      */     //   54: goto -> 58
/*      */     //   57: iconst_0
/*      */     //   58: istore_3
/*      */     //   59: iconst_0
/*      */     //   60: istore #4
/*      */     //   62: nop
/*      */     //   63: iload_3
/*      */     //   64: ifne -> 103
/*      */     //   67: iconst_0
/*      */     //   68: istore #5
/*      */     //   70: new java/lang/StringBuilder
/*      */     //   73: dup
/*      */     //   74: invokespecial <init> : ()V
/*      */     //   77: ldc_w 'Started group at '
/*      */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   83: iload_1
/*      */     //   84: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   87: ldc_w ' must be a subgroup of the group at '
/*      */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   93: iload_2
/*      */     //   94: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   97: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   100: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   103: nop
/*      */     //   104: aload_0
/*      */     //   105: getfield currentGroup : I
/*      */     //   108: istore_3
/*      */     //   109: aload_0
/*      */     //   110: getfield currentSlot : I
/*      */     //   113: istore #4
/*      */     //   115: aload_0
/*      */     //   116: getfield currentSlotEnd : I
/*      */     //   119: istore #5
/*      */     //   121: aload_0
/*      */     //   122: iload_1
/*      */     //   123: putfield currentGroup : I
/*      */     //   126: aload_0
/*      */     //   127: invokevirtual startGroup : ()V
/*      */     //   130: aload_0
/*      */     //   131: iload_3
/*      */     //   132: putfield currentGroup : I
/*      */     //   135: aload_0
/*      */     //   136: iload #4
/*      */     //   138: putfield currentSlot : I
/*      */     //   141: aload_0
/*      */     //   142: iload #5
/*      */     //   144: putfield currentSlotEnd : I
/*      */     //   147: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2207	-> 0
/*      */     //   #4301	-> 15
/*      */     //   #4304	-> 16
/*      */     //   #4305	-> 20
/*      */     //   #2207	-> 23
/*      */     //   #4305	-> 26
/*      */     //   #4307	-> 29
/*      */     //   #2208	-> 30
/*      */     //   #2209	-> 35
/*      */     //   #2212	-> 40
/*      */     //   #4308	-> 62
/*      */     //   #4311	-> 63
/*      */     //   #4312	-> 67
/*      */     //   #2213	-> 70
/*      */     //   #4312	-> 100
/*      */     //   #4314	-> 103
/*      */     //   #2216	-> 104
/*      */     //   #2217	-> 109
/*      */     //   #2218	-> 115
/*      */     //   #2219	-> 121
/*      */     //   #2220	-> 126
/*      */     //   #2221	-> 130
/*      */     //   #2222	-> 135
/*      */     //   #2223	-> 141
/*      */     //   #2225	-> 147
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-runtimeCheck-SlotWriter$ensureStarted$1	I
/*      */     //   15	15	3	$i$f$runtimeCheck	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   70	30	5	$i$a$-runtimeCheck-SlotWriter$ensureStarted$2	I
/*      */     //   62	42	4	$i$f$runtimeCheck	I
/*      */     //   59	45	3	value$iv	Z
/*      */     //   109	38	3	oldCurrent	I
/*      */     //   115	32	4	oldCurrentSlot	I
/*      */     //   121	26	5	oldCurrentSlotEnd	I
/*      */     //   35	113	2	parent	I
/*      */     //   0	148	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	148	1	index	I
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void ensureStarted(@NotNull Anchor anchor) {
/* 2227 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); ensureStarted(anchor.toIndexFor(this));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int skipGroup() {
/* 2233 */     int groupAddress = groupIndexToAddress(this.currentGroup);
/* 2234 */     int newGroup = this.currentGroup + SlotTableKt.access$groupSize(this.groups, groupAddress);
/* 2235 */     this.currentGroup = newGroup;
/* 2236 */     this.currentSlot = dataIndex(this.groups, groupIndexToAddress(newGroup));
/* 2237 */     return SlotTableKt.access$isNode(this.groups, groupAddress) ? 1 : SlotTableKt.access$nodeCount(this.groups, groupAddress);
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
/*      */   public final boolean removeGroup() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
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
/*      */     //   22: ldc_w 'Cannot remove group while inserting'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: getfield currentGroup : I
/*      */     //   33: istore_1
/*      */     //   34: aload_0
/*      */     //   35: getfield currentSlot : I
/*      */     //   38: istore_2
/*      */     //   39: aload_0
/*      */     //   40: aload_0
/*      */     //   41: getfield groups : [I
/*      */     //   44: aload_0
/*      */     //   45: iload_1
/*      */     //   46: invokespecial groupIndexToAddress : (I)I
/*      */     //   49: invokespecial dataIndex : ([II)I
/*      */     //   52: istore_3
/*      */     //   53: aload_0
/*      */     //   54: invokevirtual skipGroup : ()I
/*      */     //   57: istore #4
/*      */     //   59: aload_0
/*      */     //   60: aload_0
/*      */     //   61: getfield parent : I
/*      */     //   64: invokespecial sourceInformationOf : (I)Landroidx/compose/runtime/GroupSourceInformation;
/*      */     //   67: dup
/*      */     //   68: ifnull -> 106
/*      */     //   71: astore #6
/*      */     //   73: iconst_0
/*      */     //   74: istore #7
/*      */     //   76: aload_0
/*      */     //   77: iload_1
/*      */     //   78: invokevirtual tryAnchor$runtime : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   81: dup
/*      */     //   82: ifnull -> 101
/*      */     //   85: astore #8
/*      */     //   87: iconst_0
/*      */     //   88: istore #9
/*      */     //   90: aload #6
/*      */     //   92: aload #8
/*      */     //   94: invokevirtual removeAnchor : (Landroidx/compose/runtime/Anchor;)Z
/*      */     //   97: pop
/*      */     //   98: goto -> 103
/*      */     //   101: pop
/*      */     //   102: nop
/*      */     //   103: goto -> 108
/*      */     //   106: pop
/*      */     //   107: nop
/*      */     //   108: aload_0
/*      */     //   109: getfield pendingRecalculateMarks : Landroidx/compose/runtime/PrioritySet;
/*      */     //   112: dup
/*      */     //   113: ifnull -> 151
/*      */     //   116: astore #6
/*      */     //   118: iconst_0
/*      */     //   119: istore #7
/*      */     //   121: aload #6
/*      */     //   123: invokevirtual isNotEmpty : ()Z
/*      */     //   126: ifeq -> 147
/*      */     //   129: aload #6
/*      */     //   131: invokevirtual peek : ()I
/*      */     //   134: iload_1
/*      */     //   135: if_icmplt -> 147
/*      */     //   138: aload #6
/*      */     //   140: invokevirtual takeMax : ()I
/*      */     //   143: pop
/*      */     //   144: goto -> 121
/*      */     //   147: nop
/*      */     //   148: goto -> 153
/*      */     //   151: pop
/*      */     //   152: nop
/*      */     //   153: aload_0
/*      */     //   154: iload_1
/*      */     //   155: aload_0
/*      */     //   156: getfield currentGroup : I
/*      */     //   159: iload_1
/*      */     //   160: isub
/*      */     //   161: invokespecial removeGroups : (II)Z
/*      */     //   164: istore #5
/*      */     //   166: aload_0
/*      */     //   167: iload_3
/*      */     //   168: aload_0
/*      */     //   169: getfield currentSlot : I
/*      */     //   172: iload_3
/*      */     //   173: isub
/*      */     //   174: iload_1
/*      */     //   175: iconst_1
/*      */     //   176: isub
/*      */     //   177: invokespecial removeSlots : (III)V
/*      */     //   180: aload_0
/*      */     //   181: iload_1
/*      */     //   182: putfield currentGroup : I
/*      */     //   185: aload_0
/*      */     //   186: iload_2
/*      */     //   187: putfield currentSlot : I
/*      */     //   190: aload_0
/*      */     //   191: aload_0
/*      */     //   192: getfield nodeCount : I
/*      */     //   195: iload #4
/*      */     //   197: isub
/*      */     //   198: putfield nodeCount : I
/*      */     //   201: iload #5
/*      */     //   203: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2244	-> 0
/*      */     //   #4315	-> 15
/*      */     //   #4318	-> 16
/*      */     //   #4319	-> 20
/*      */     //   #2244	-> 22
/*      */     //   #4319	-> 25
/*      */     //   #4321	-> 28
/*      */     //   #2245	-> 29
/*      */     //   #2246	-> 34
/*      */     //   #2247	-> 39
/*      */     //   #2248	-> 53
/*      */     //   #2251	-> 59
/*      */     //   #2252	-> 76
/*      */     //   #2253	-> 90
/*      */     //   #2252	-> 98
/*      */     //   #2252	-> 101
/*      */     //   #2251	-> 103
/*      */     //   #2251	-> 106
/*      */     //   #2259	-> 108
/*      */     //   #2260	-> 121
/*      */     //   #2261	-> 138
/*      */     //   #2263	-> 147
/*      */     //   #2259	-> 148
/*      */     //   #2259	-> 151
/*      */     //   #2265	-> 153
/*      */     //   #2266	-> 166
/*      */     //   #2267	-> 180
/*      */     //   #2268	-> 185
/*      */     //   #2269	-> 190
/*      */     //   #2270	-> 201
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-SlotWriter$removeGroup$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   90	7	9	$i$a$-let-SlotWriter$removeGroup$2$1	I
/*      */     //   87	10	8	anchor	Landroidx/compose/runtime/Anchor;
/*      */     //   76	27	7	$i$a$-let-SlotWriter$removeGroup$2	I
/*      */     //   73	30	6	sourceInformation	Landroidx/compose/runtime/GroupSourceInformation;
/*      */     //   121	27	7	$i$a$-let-SlotWriter$removeGroup$3	I
/*      */     //   118	30	6	it	Landroidx/compose/runtime/PrioritySet;
/*      */     //   34	170	1	oldGroup	I
/*      */     //   39	165	2	oldSlot	I
/*      */     //   53	151	3	dataStart	I
/*      */     //   59	145	4	count	I
/*      */     //   166	38	5	anchorsRemoved	Z
/*      */     //   0	204	0	this	Landroidx/compose/runtime/SlotWriter;
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
/*      */   @NotNull
/*      */   public final Iterator<Object> groupSlots()
/*      */   {
/* 2277 */     int start = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
/* 2278 */     int end = dataIndex(this.groups, 
/* 2279 */         groupIndexToAddress(this.currentGroup + groupSize(this.currentGroup)));
/*      */     
/* 2281 */     return new SlotWriter$groupSlots$1(end, this); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\020(\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\n\022\006\022\004\030\0010\0020\001J\t\020\t\032\0020\nH\002J\013\020\013\032\004\030\0010\002H\002R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\b¨\006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime"})
/* 2282 */   public static final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker { private int current; SlotWriter$groupSlots$1(int $end, SlotWriter $receiver) { this.current = $start; } public final int getCurrent() { return this.current; } public final void setCurrent(int <set-?>) { this.current = <set-?>; }
/* 2283 */     public boolean hasNext() { return (this.current < this.$end); } @Nullable
/*      */     public Object next() {
/* 2285 */       int i = this.current; this.current = i + 1; return hasNext() ? SlotWriter.this.slots[SlotWriter.this.dataIndexToDataAddress(i)] : null;
/*      */     } public void remove() {
/*      */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*      */     } }
/*      */   public final void forEachData(int group, @NotNull Function2 block) {
/* 2290 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachData = 0, address = groupIndexToAddress(group);
/* 2291 */     int slotsStart = slotIndex(this.groups, address);
/* 2292 */     int slotsEnd = dataIndex(this.groups, groupIndexToAddress(group + 1));
/*      */     
/* 2294 */     for (int slot = slotsStart; slot < slotsEnd; slot++) {
/* 2295 */       block.invoke(Integer.valueOf(slot - slotsStart), this.slots[dataIndexToDataAddress(slot)]);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void forAllData(int group, @NotNull Function2 block) {
/* 2300 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forAllData = 0, address = groupIndexToAddress(group);
/* 2301 */     int start = dataIndex(this.groups, address);
/* 2302 */     int end = dataIndex(this.groups, 
/* 2303 */         groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
/*      */     
/* 2305 */     for (int slot = start; slot < end; slot++) {
/* 2306 */       block.invoke(Integer.valueOf(slot), this.slots[dataIndexToDataAddress(slot)]);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void moveGroup(int offset) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield insertCount : I
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
/*      */     //   23: ldc_w 'Cannot move a group while inserting'
/*      */     //   26: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: iload_1
/*      */     //   31: iflt -> 38
/*      */     //   34: iconst_1
/*      */     //   35: goto -> 39
/*      */     //   38: iconst_0
/*      */     //   39: istore_2
/*      */     //   40: iconst_0
/*      */     //   41: istore_3
/*      */     //   42: nop
/*      */     //   43: iload_2
/*      */     //   44: ifne -> 56
/*      */     //   47: iconst_0
/*      */     //   48: istore #4
/*      */     //   50: ldc_w 'Parameter offset is out of bounds'
/*      */     //   53: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   56: nop
/*      */     //   57: iload_1
/*      */     //   58: ifne -> 62
/*      */     //   61: return
/*      */     //   62: aload_0
/*      */     //   63: getfield currentGroup : I
/*      */     //   66: istore_2
/*      */     //   67: aload_0
/*      */     //   68: getfield parent : I
/*      */     //   71: istore_3
/*      */     //   72: aload_0
/*      */     //   73: getfield currentGroupEnd : I
/*      */     //   76: istore #4
/*      */     //   78: iload_1
/*      */     //   79: istore #5
/*      */     //   81: iload_2
/*      */     //   82: istore #6
/*      */     //   84: iload #5
/*      */     //   86: ifle -> 146
/*      */     //   89: iload #6
/*      */     //   91: aload_0
/*      */     //   92: getfield groups : [I
/*      */     //   95: aload_0
/*      */     //   96: iload #6
/*      */     //   98: invokespecial groupIndexToAddress : (I)I
/*      */     //   101: invokestatic access$groupSize : ([II)I
/*      */     //   104: iadd
/*      */     //   105: istore #6
/*      */     //   107: iload #6
/*      */     //   109: iload #4
/*      */     //   111: if_icmpgt -> 118
/*      */     //   114: iconst_1
/*      */     //   115: goto -> 119
/*      */     //   118: iconst_0
/*      */     //   119: istore #7
/*      */     //   121: iconst_0
/*      */     //   122: istore #8
/*      */     //   124: nop
/*      */     //   125: iload #7
/*      */     //   127: ifne -> 139
/*      */     //   130: iconst_0
/*      */     //   131: istore #9
/*      */     //   133: ldc_w 'Parameter offset is out of bounds'
/*      */     //   136: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   139: nop
/*      */     //   140: iinc #5, -1
/*      */     //   143: goto -> 84
/*      */     //   146: aload_0
/*      */     //   147: getfield groups : [I
/*      */     //   150: aload_0
/*      */     //   151: iload #6
/*      */     //   153: invokespecial groupIndexToAddress : (I)I
/*      */     //   156: invokestatic access$groupSize : ([II)I
/*      */     //   159: istore #7
/*      */     //   161: aload_0
/*      */     //   162: aload_0
/*      */     //   163: getfield groups : [I
/*      */     //   166: aload_0
/*      */     //   167: aload_0
/*      */     //   168: getfield currentGroup : I
/*      */     //   171: invokespecial groupIndexToAddress : (I)I
/*      */     //   174: invokespecial dataIndex : ([II)I
/*      */     //   177: istore #8
/*      */     //   179: aload_0
/*      */     //   180: aload_0
/*      */     //   181: getfield groups : [I
/*      */     //   184: aload_0
/*      */     //   185: iload #6
/*      */     //   187: invokespecial groupIndexToAddress : (I)I
/*      */     //   190: invokespecial dataIndex : ([II)I
/*      */     //   193: istore #9
/*      */     //   195: aload_0
/*      */     //   196: aload_0
/*      */     //   197: getfield groups : [I
/*      */     //   200: aload_0
/*      */     //   201: iload #6
/*      */     //   203: iload #7
/*      */     //   205: iadd
/*      */     //   206: invokespecial groupIndexToAddress : (I)I
/*      */     //   209: invokespecial dataIndex : ([II)I
/*      */     //   212: istore #10
/*      */     //   214: iload #10
/*      */     //   216: iload #9
/*      */     //   218: isub
/*      */     //   219: istore #11
/*      */     //   221: aload_0
/*      */     //   222: iload #11
/*      */     //   224: aload_0
/*      */     //   225: getfield currentGroup : I
/*      */     //   228: iconst_1
/*      */     //   229: isub
/*      */     //   230: iconst_0
/*      */     //   231: invokestatic max : (II)I
/*      */     //   234: invokespecial insertSlots : (II)V
/*      */     //   237: aload_0
/*      */     //   238: iload #7
/*      */     //   240: invokespecial insertGroups : (I)V
/*      */     //   243: aload_0
/*      */     //   244: getfield groups : [I
/*      */     //   247: astore #12
/*      */     //   249: aload_0
/*      */     //   250: iload #6
/*      */     //   252: iload #7
/*      */     //   254: iadd
/*      */     //   255: invokespecial groupIndexToAddress : (I)I
/*      */     //   258: istore #13
/*      */     //   260: iload #13
/*      */     //   262: iconst_5
/*      */     //   263: imul
/*      */     //   264: istore #14
/*      */     //   266: aload_0
/*      */     //   267: iload_2
/*      */     //   268: invokespecial groupIndexToAddress : (I)I
/*      */     //   271: istore #15
/*      */     //   273: aload #12
/*      */     //   275: aload #12
/*      */     //   277: iload #15
/*      */     //   279: iconst_5
/*      */     //   280: imul
/*      */     //   281: iload #14
/*      */     //   283: iload #14
/*      */     //   285: iload #7
/*      */     //   287: iconst_5
/*      */     //   288: imul
/*      */     //   289: iadd
/*      */     //   290: invokestatic copyInto : ([I[IIII)[I
/*      */     //   293: pop
/*      */     //   294: iload #11
/*      */     //   296: ifle -> 333
/*      */     //   299: aload_0
/*      */     //   300: getfield slots : [Ljava/lang/Object;
/*      */     //   303: astore #16
/*      */     //   305: aload #16
/*      */     //   307: aload #16
/*      */     //   309: iload #8
/*      */     //   311: aload_0
/*      */     //   312: iload #9
/*      */     //   314: iload #11
/*      */     //   316: iadd
/*      */     //   317: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   320: aload_0
/*      */     //   321: iload #10
/*      */     //   323: iload #11
/*      */     //   325: iadd
/*      */     //   326: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   329: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */     //   332: pop
/*      */     //   333: iload #9
/*      */     //   335: iload #11
/*      */     //   337: iadd
/*      */     //   338: iload #8
/*      */     //   340: isub
/*      */     //   341: istore #16
/*      */     //   343: aload_0
/*      */     //   344: getfield slotsGapStart : I
/*      */     //   347: istore #17
/*      */     //   349: aload_0
/*      */     //   350: getfield slotsGapLen : I
/*      */     //   353: istore #18
/*      */     //   355: aload_0
/*      */     //   356: getfield slots : [Ljava/lang/Object;
/*      */     //   359: arraylength
/*      */     //   360: istore #19
/*      */     //   362: aload_0
/*      */     //   363: getfield slotsGapOwner : I
/*      */     //   366: istore #20
/*      */     //   368: iload_2
/*      */     //   369: istore #21
/*      */     //   371: iload_2
/*      */     //   372: iload #7
/*      */     //   374: iadd
/*      */     //   375: istore #22
/*      */     //   377: iload #21
/*      */     //   379: iload #22
/*      */     //   381: if_icmpge -> 450
/*      */     //   384: aload_0
/*      */     //   385: iload #21
/*      */     //   387: invokespecial groupIndexToAddress : (I)I
/*      */     //   390: istore #23
/*      */     //   392: aload_0
/*      */     //   393: aload #12
/*      */     //   395: iload #23
/*      */     //   397: invokespecial dataIndex : ([II)I
/*      */     //   400: istore #24
/*      */     //   402: iload #24
/*      */     //   404: iload #16
/*      */     //   406: isub
/*      */     //   407: istore #25
/*      */     //   409: aload_0
/*      */     //   410: iload #25
/*      */     //   412: iload #20
/*      */     //   414: iload #23
/*      */     //   416: if_icmpge -> 423
/*      */     //   419: iconst_0
/*      */     //   420: goto -> 425
/*      */     //   423: iload #17
/*      */     //   425: iload #18
/*      */     //   427: iload #19
/*      */     //   429: invokespecial dataIndexToDataAnchor : (IIII)I
/*      */     //   432: istore #26
/*      */     //   434: aload_0
/*      */     //   435: aload #12
/*      */     //   437: iload #23
/*      */     //   439: iload #26
/*      */     //   441: invokespecial updateDataIndex : ([III)V
/*      */     //   444: iinc #21, 1
/*      */     //   447: goto -> 377
/*      */     //   450: aload_0
/*      */     //   451: iload #6
/*      */     //   453: iload #7
/*      */     //   455: iadd
/*      */     //   456: iload_2
/*      */     //   457: iload #7
/*      */     //   459: invokespecial moveAnchors : (III)V
/*      */     //   462: aload_0
/*      */     //   463: iload #6
/*      */     //   465: iload #7
/*      */     //   467: iadd
/*      */     //   468: iload #7
/*      */     //   470: invokespecial removeGroups : (II)Z
/*      */     //   473: istore #21
/*      */     //   475: iload #21
/*      */     //   477: ifne -> 484
/*      */     //   480: iconst_1
/*      */     //   481: goto -> 485
/*      */     //   484: iconst_0
/*      */     //   485: istore #22
/*      */     //   487: iconst_0
/*      */     //   488: istore #23
/*      */     //   490: nop
/*      */     //   491: iload #22
/*      */     //   493: ifne -> 505
/*      */     //   496: iconst_0
/*      */     //   497: istore #24
/*      */     //   499: ldc_w 'Unexpectedly removed anchors'
/*      */     //   502: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   505: nop
/*      */     //   506: aload_0
/*      */     //   507: iload_3
/*      */     //   508: aload_0
/*      */     //   509: getfield currentGroupEnd : I
/*      */     //   512: iload_2
/*      */     //   513: invokespecial fixParentAnchorsFor : (III)V
/*      */     //   516: iload #11
/*      */     //   518: ifle -> 539
/*      */     //   521: aload_0
/*      */     //   522: iload #9
/*      */     //   524: iload #11
/*      */     //   526: iadd
/*      */     //   527: iload #11
/*      */     //   529: iload #6
/*      */     //   531: iload #7
/*      */     //   533: iadd
/*      */     //   534: iconst_1
/*      */     //   535: isub
/*      */     //   536: invokespecial removeSlots : (III)V
/*      */     //   539: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2316	-> 0
/*      */     //   #4322	-> 15
/*      */     //   #4325	-> 16
/*      */     //   #4326	-> 20
/*      */     //   #2316	-> 23
/*      */     //   #4326	-> 26
/*      */     //   #4328	-> 29
/*      */     //   #2317	-> 30
/*      */     //   #4329	-> 42
/*      */     //   #4332	-> 43
/*      */     //   #4333	-> 47
/*      */     //   #2317	-> 50
/*      */     //   #4333	-> 53
/*      */     //   #4335	-> 56
/*      */     //   #2318	-> 57
/*      */     //   #2319	-> 62
/*      */     //   #2320	-> 67
/*      */     //   #2321	-> 72
/*      */     //   #2324	-> 78
/*      */     //   #2325	-> 81
/*      */     //   #2326	-> 84
/*      */     //   #2327	-> 89
/*      */     //   #2328	-> 95
/*      */     //   #2327	-> 101
/*      */     //   #2330	-> 107
/*      */     //   #4336	-> 124
/*      */     //   #4339	-> 125
/*      */     //   #4340	-> 130
/*      */     //   #2330	-> 133
/*      */     //   #4340	-> 136
/*      */     //   #4342	-> 139
/*      */     //   #2331	-> 140
/*      */     //   #2334	-> 146
/*      */     //   #2335	-> 150
/*      */     //   #2334	-> 156
/*      */     //   #2337	-> 161
/*      */     //   #2338	-> 179
/*      */     //   #2339	-> 195
/*      */     //   #2340	-> 200
/*      */     //   #2341	-> 201
/*      */     //   #2340	-> 206
/*      */     //   #2339	-> 209
/*      */     //   #2344	-> 214
/*      */     //   #2373	-> 221
/*      */     //   #2373	-> 234
/*      */     //   #2376	-> 237
/*      */     //   #2379	-> 243
/*      */     //   #2380	-> 249
/*      */     //   #2381	-> 260
/*      */     //   #2382	-> 266
/*      */     //   #2383	-> 273
/*      */     //   #2384	-> 275
/*      */     //   #2385	-> 277
/*      */     //   #2386	-> 281
/*      */     //   #2387	-> 283
/*      */     //   #2383	-> 290
/*      */     //   #2391	-> 294
/*      */     //   #2392	-> 299
/*      */     //   #2393	-> 305
/*      */     //   #2394	-> 307
/*      */     //   #2395	-> 309
/*      */     //   #2396	-> 311
/*      */     //   #2397	-> 320
/*      */     //   #2393	-> 329
/*      */     //   #2402	-> 333
/*      */     //   #2403	-> 343
/*      */     //   #2404	-> 349
/*      */     //   #2405	-> 355
/*      */     //   #2406	-> 362
/*      */     //   #2407	-> 368
/*      */     //   #2408	-> 384
/*      */     //   #2409	-> 392
/*      */     //   #2410	-> 402
/*      */     //   #2411	-> 409
/*      */     //   #2412	-> 410
/*      */     //   #2413	-> 412
/*      */     //   #2414	-> 425
/*      */     //   #2415	-> 427
/*      */     //   #2411	-> 429
/*      */     //   #2417	-> 434
/*      */     //   #2407	-> 444
/*      */     //   #2421	-> 450
/*      */     //   #2424	-> 462
/*      */     //   #2425	-> 475
/*      */     //   #4343	-> 490
/*      */     //   #4346	-> 491
/*      */     //   #4347	-> 496
/*      */     //   #2425	-> 499
/*      */     //   #4347	-> 502
/*      */     //   #4349	-> 505
/*      */     //   #2428	-> 506
/*      */     //   #2431	-> 516
/*      */     //   #2432	-> 521
/*      */     //   #2434	-> 539
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-runtimeCheck-SlotWriter$moveGroup$1	I
/*      */     //   15	15	3	$i$f$runtimeCheck	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   50	3	4	$i$a$-runtimeCheck-SlotWriter$moveGroup$2	I
/*      */     //   42	15	3	$i$f$runtimeCheck	I
/*      */     //   40	17	2	value$iv	Z
/*      */     //   133	3	9	$i$a$-runtimeCheck-SlotWriter$moveGroup$3	I
/*      */     //   124	16	8	$i$f$runtimeCheck	I
/*      */     //   121	19	7	value$iv	Z
/*      */     //   305	28	16	slots	[Ljava/lang/Object;
/*      */     //   392	52	23	groupAddress	I
/*      */     //   402	42	24	oldIndex	I
/*      */     //   409	35	25	newIndex	I
/*      */     //   434	10	26	newAnchor	I
/*      */     //   371	79	21	group	I
/*      */     //   499	3	24	$i$a$-runtimeCheck-SlotWriter$moveGroup$4	I
/*      */     //   490	16	23	$i$f$runtimeCheck	I
/*      */     //   487	19	22	value$iv	Z
/*      */     //   67	473	2	current	I
/*      */     //   72	468	3	parent	I
/*      */     //   78	462	4	parentEnd	I
/*      */     //   81	459	5	count	I
/*      */     //   84	456	6	groupToMove	I
/*      */     //   161	379	7	moveLen	I
/*      */     //   179	361	8	destinationSlot	I
/*      */     //   195	345	9	dataStart	I
/*      */     //   214	326	10	dataEnd	I
/*      */     //   221	319	11	moveDataLen	I
/*      */     //   249	291	12	groups	[I
/*      */     //   260	280	13	moveLocationAddress	I
/*      */     //   266	274	14	moveLocationOffset	I
/*      */     //   273	267	15	currentAddress	I
/*      */     //   343	197	16	dataMoveDistance	I
/*      */     //   349	191	17	slotsGapStart	I
/*      */     //   355	185	18	slotsGapLen	I
/*      */     //   362	178	19	slotsCapacity	I
/*      */     //   368	172	20	slotsGapOwner	I
/*      */     //   475	65	21	anchorsRemoved	Z
/*      */     //   0	540	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	540	1	offset	I
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J@\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0072\006\020\013\032\0020\f2\006\020\r\032\0020\f2\b\b\002\020\016\032\0020\fH\002¨\006\017"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime"})
/*      */   @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4179:1\n1#2:4180\n33#3,6:4181\n4553#4,7:4187\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2555#1:4181,6\n2611#1:4187,7\n*E\n"})
/*      */   public static final class Companion
/*      */   {
/*      */     private Companion() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: iload_2
/*      */       //   2: invokevirtual groupSize : (I)I
/*      */       //   5: istore #7
/*      */       //   7: iload_2
/*      */       //   8: iload #7
/*      */       //   10: iadd
/*      */       //   11: istore #8
/*      */       //   13: aload_1
/*      */       //   14: iload_2
/*      */       //   15: invokestatic access$dataIndex : (Landroidx/compose/runtime/SlotWriter;I)I
/*      */       //   18: istore #9
/*      */       //   20: aload_1
/*      */       //   21: iload #8
/*      */       //   23: invokestatic access$dataIndex : (Landroidx/compose/runtime/SlotWriter;I)I
/*      */       //   26: istore #10
/*      */       //   28: iload #10
/*      */       //   30: iload #9
/*      */       //   32: isub
/*      */       //   33: istore #11
/*      */       //   35: aload_1
/*      */       //   36: iload_2
/*      */       //   37: invokestatic access$containsAnyGroupMarks : (Landroidx/compose/runtime/SlotWriter;I)Z
/*      */       //   40: istore #12
/*      */       //   42: aload_3
/*      */       //   43: iload #7
/*      */       //   45: invokestatic access$insertGroups : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   48: aload_3
/*      */       //   49: iload #11
/*      */       //   51: aload_3
/*      */       //   52: invokevirtual getCurrentGroup : ()I
/*      */       //   55: invokestatic access$insertSlots : (Landroidx/compose/runtime/SlotWriter;II)V
/*      */       //   58: aload_1
/*      */       //   59: invokestatic access$getGroupGapStart$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   62: iload #8
/*      */       //   64: if_icmpge -> 73
/*      */       //   67: aload_1
/*      */       //   68: iload #8
/*      */       //   70: invokestatic access$moveGroupGapTo : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   73: aload_1
/*      */       //   74: invokestatic access$getSlotsGapStart$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   77: iload #10
/*      */       //   79: if_icmpge -> 90
/*      */       //   82: aload_1
/*      */       //   83: iload #10
/*      */       //   85: iload #8
/*      */       //   87: invokestatic access$moveSlotGapTo : (Landroidx/compose/runtime/SlotWriter;II)V
/*      */       //   90: aload_3
/*      */       //   91: invokestatic access$getGroups$p : (Landroidx/compose/runtime/SlotWriter;)[I
/*      */       //   94: astore #13
/*      */       //   96: aload_3
/*      */       //   97: invokevirtual getCurrentGroup : ()I
/*      */       //   100: istore #14
/*      */       //   102: aload_1
/*      */       //   103: invokestatic access$getGroups$p : (Landroidx/compose/runtime/SlotWriter;)[I
/*      */       //   106: aload #13
/*      */       //   108: iload #14
/*      */       //   110: iconst_5
/*      */       //   111: imul
/*      */       //   112: iload_2
/*      */       //   113: iconst_5
/*      */       //   114: imul
/*      */       //   115: iload #8
/*      */       //   117: iconst_5
/*      */       //   118: imul
/*      */       //   119: invokestatic copyInto : ([I[IIII)[I
/*      */       //   122: pop
/*      */       //   123: aload_3
/*      */       //   124: invokestatic access$getSlots$p : (Landroidx/compose/runtime/SlotWriter;)[Ljava/lang/Object;
/*      */       //   127: astore #15
/*      */       //   129: aload_3
/*      */       //   130: invokestatic access$getCurrentSlot$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   133: istore #16
/*      */       //   135: aload_1
/*      */       //   136: invokestatic access$getSlots$p : (Landroidx/compose/runtime/SlotWriter;)[Ljava/lang/Object;
/*      */       //   139: aload #15
/*      */       //   141: iload #16
/*      */       //   143: iload #9
/*      */       //   145: iload #10
/*      */       //   147: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */       //   150: pop
/*      */       //   151: aload_3
/*      */       //   152: invokevirtual getParent : ()I
/*      */       //   155: istore #17
/*      */       //   157: aload #13
/*      */       //   159: iload #14
/*      */       //   161: iload #17
/*      */       //   163: invokestatic access$updateParentAnchor : ([III)V
/*      */       //   166: iload #14
/*      */       //   168: iload_2
/*      */       //   169: isub
/*      */       //   170: istore #18
/*      */       //   172: iload #14
/*      */       //   174: iload #7
/*      */       //   176: iadd
/*      */       //   177: istore #19
/*      */       //   179: iload #16
/*      */       //   181: aload_3
/*      */       //   182: astore #21
/*      */       //   184: istore #37
/*      */       //   186: iconst_0
/*      */       //   187: istore #22
/*      */       //   189: aload #21
/*      */       //   191: aload #13
/*      */       //   193: iload #14
/*      */       //   195: invokestatic access$dataIndex : (Landroidx/compose/runtime/SlotWriter;[II)I
/*      */       //   198: istore #38
/*      */       //   200: iload #37
/*      */       //   202: iload #38
/*      */       //   204: nop
/*      */       //   205: isub
/*      */       //   206: istore #20
/*      */       //   208: iconst_0
/*      */       //   209: istore #21
/*      */       //   211: aload_3
/*      */       //   212: invokestatic access$getSlotsGapOwner$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   215: istore #21
/*      */       //   217: aload_3
/*      */       //   218: invokestatic access$getSlotsGapLen$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   221: istore #22
/*      */       //   223: aload #15
/*      */       //   225: arraylength
/*      */       //   226: istore #23
/*      */       //   228: iload #14
/*      */       //   230: istore #24
/*      */       //   232: iload #24
/*      */       //   234: iload #19
/*      */       //   236: if_icmpge -> 356
/*      */       //   239: iload #24
/*      */       //   241: iload #14
/*      */       //   243: if_icmpeq -> 267
/*      */       //   246: aload #13
/*      */       //   248: iload #24
/*      */       //   250: invokestatic access$parentAnchor : ([II)I
/*      */       //   253: istore #25
/*      */       //   255: aload #13
/*      */       //   257: iload #24
/*      */       //   259: iload #25
/*      */       //   261: iload #18
/*      */       //   263: iadd
/*      */       //   264: invokestatic access$updateParentAnchor : ([III)V
/*      */       //   267: aload_3
/*      */       //   268: astore #26
/*      */       //   270: iconst_0
/*      */       //   271: istore #27
/*      */       //   273: aload #26
/*      */       //   275: aload #13
/*      */       //   277: iload #24
/*      */       //   279: invokestatic access$dataIndex : (Landroidx/compose/runtime/SlotWriter;[II)I
/*      */       //   282: iload #20
/*      */       //   284: iadd
/*      */       //   285: nop
/*      */       //   286: istore #25
/*      */       //   288: aload_3
/*      */       //   289: astore #27
/*      */       //   291: iconst_0
/*      */       //   292: istore #28
/*      */       //   294: aload #27
/*      */       //   296: iload #25
/*      */       //   298: iload #21
/*      */       //   300: iload #24
/*      */       //   302: if_icmpge -> 309
/*      */       //   305: iconst_0
/*      */       //   306: goto -> 314
/*      */       //   309: aload #27
/*      */       //   311: invokestatic access$getSlotsGapStart$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   314: iload #22
/*      */       //   316: iload #23
/*      */       //   318: invokestatic access$dataIndexToDataAnchor : (Landroidx/compose/runtime/SlotWriter;IIII)I
/*      */       //   321: nop
/*      */       //   322: istore #26
/*      */       //   324: aload #13
/*      */       //   326: iload #24
/*      */       //   328: iload #26
/*      */       //   330: invokestatic access$updateDataAnchor : ([III)V
/*      */       //   333: iload #24
/*      */       //   335: iload #21
/*      */       //   337: if_icmpne -> 350
/*      */       //   340: iload #21
/*      */       //   342: istore #27
/*      */       //   344: iload #27
/*      */       //   346: iconst_1
/*      */       //   347: iadd
/*      */       //   348: istore #21
/*      */       //   350: iinc #24, 1
/*      */       //   353: goto -> 232
/*      */       //   356: aload_3
/*      */       //   357: iload #21
/*      */       //   359: invokestatic access$setSlotsGapOwner$p : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   362: aload_1
/*      */       //   363: invokestatic access$getAnchors$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;
/*      */       //   366: iload_2
/*      */       //   367: aload_1
/*      */       //   368: invokevirtual getSize$runtime : ()I
/*      */       //   371: invokestatic access$locationOf : (Ljava/util/ArrayList;II)I
/*      */       //   374: istore #24
/*      */       //   376: aload_1
/*      */       //   377: invokestatic access$getAnchors$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;
/*      */       //   380: iload #8
/*      */       //   382: aload_1
/*      */       //   383: invokevirtual getSize$runtime : ()I
/*      */       //   386: invokestatic access$locationOf : (Ljava/util/ArrayList;II)I
/*      */       //   389: istore #25
/*      */       //   391: iload #24
/*      */       //   393: iload #25
/*      */       //   395: if_icmpge -> 534
/*      */       //   398: aload_1
/*      */       //   399: invokestatic access$getAnchors$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;
/*      */       //   402: astore #27
/*      */       //   404: new java/util/ArrayList
/*      */       //   407: dup
/*      */       //   408: iload #25
/*      */       //   410: iload #24
/*      */       //   412: isub
/*      */       //   413: invokespecial <init> : (I)V
/*      */       //   416: astore #28
/*      */       //   418: iload #14
/*      */       //   420: iload_2
/*      */       //   421: isub
/*      */       //   422: istore #29
/*      */       //   424: iload #24
/*      */       //   426: istore #30
/*      */       //   428: iload #30
/*      */       //   430: iload #25
/*      */       //   432: if_icmpge -> 480
/*      */       //   435: aload #27
/*      */       //   437: iload #30
/*      */       //   439: invokevirtual get : (I)Ljava/lang/Object;
/*      */       //   442: dup
/*      */       //   443: ldc 'get(...)'
/*      */       //   445: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   448: checkcast androidx/compose/runtime/Anchor
/*      */       //   451: astore #31
/*      */       //   453: aload #31
/*      */       //   455: aload #31
/*      */       //   457: invokevirtual getLocation$runtime : ()I
/*      */       //   460: iload #29
/*      */       //   462: iadd
/*      */       //   463: invokevirtual setLocation$runtime : (I)V
/*      */       //   466: aload #28
/*      */       //   468: aload #31
/*      */       //   470: invokevirtual add : (Ljava/lang/Object;)Z
/*      */       //   473: pop
/*      */       //   474: iinc #30, 1
/*      */       //   477: goto -> 428
/*      */       //   480: aload_3
/*      */       //   481: invokestatic access$getAnchors$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;
/*      */       //   484: aload_3
/*      */       //   485: invokevirtual getCurrentGroup : ()I
/*      */       //   488: aload_3
/*      */       //   489: invokevirtual getSize$runtime : ()I
/*      */       //   492: invokestatic access$locationOf : (Ljava/util/ArrayList;II)I
/*      */       //   495: istore #30
/*      */       //   497: aload_3
/*      */       //   498: invokestatic access$getAnchors$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;
/*      */       //   501: iload #30
/*      */       //   503: aload #28
/*      */       //   505: checkcast java/util/Collection
/*      */       //   508: invokevirtual addAll : (ILjava/util/Collection;)Z
/*      */       //   511: pop
/*      */       //   512: aload #27
/*      */       //   514: iload #24
/*      */       //   516: iload #25
/*      */       //   518: invokevirtual subList : (II)Ljava/util/List;
/*      */       //   521: invokeinterface clear : ()V
/*      */       //   526: aload #28
/*      */       //   528: checkcast java/util/List
/*      */       //   531: goto -> 537
/*      */       //   534: invokestatic emptyList : ()Ljava/util/List;
/*      */       //   537: astore #26
/*      */       //   539: aload #26
/*      */       //   541: checkcast java/util/Collection
/*      */       //   544: invokeinterface isEmpty : ()Z
/*      */       //   549: ifne -> 556
/*      */       //   552: iconst_1
/*      */       //   553: goto -> 557
/*      */       //   556: iconst_0
/*      */       //   557: ifeq -> 679
/*      */       //   560: aload_1
/*      */       //   561: invokestatic access$getSourceInformationMap$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/HashMap;
/*      */       //   564: astore #27
/*      */       //   566: aload_3
/*      */       //   567: invokestatic access$getSourceInformationMap$p : (Landroidx/compose/runtime/SlotWriter;)Ljava/util/HashMap;
/*      */       //   570: astore #28
/*      */       //   572: aload #27
/*      */       //   574: ifnull -> 679
/*      */       //   577: aload #28
/*      */       //   579: ifnull -> 679
/*      */       //   582: aload #26
/*      */       //   584: astore #29
/*      */       //   586: iconst_0
/*      */       //   587: istore #30
/*      */       //   589: nop
/*      */       //   590: iconst_0
/*      */       //   591: istore #31
/*      */       //   593: aload #29
/*      */       //   595: invokeinterface size : ()I
/*      */       //   600: istore #32
/*      */       //   602: iload #31
/*      */       //   604: iload #32
/*      */       //   606: if_icmpge -> 678
/*      */       //   609: aload #29
/*      */       //   611: iload #31
/*      */       //   613: invokeinterface get : (I)Ljava/lang/Object;
/*      */       //   618: astore #33
/*      */       //   620: aload #33
/*      */       //   622: checkcast androidx/compose/runtime/Anchor
/*      */       //   625: astore #34
/*      */       //   627: iconst_0
/*      */       //   628: istore #35
/*      */       //   630: aload #27
/*      */       //   632: aload #34
/*      */       //   634: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   637: checkcast androidx/compose/runtime/GroupSourceInformation
/*      */       //   640: astore #36
/*      */       //   642: aload #36
/*      */       //   644: ifnull -> 670
/*      */       //   647: aload #27
/*      */       //   649: aload #34
/*      */       //   651: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   654: pop
/*      */       //   655: aload #28
/*      */       //   657: checkcast java/util/Map
/*      */       //   660: aload #34
/*      */       //   662: aload #36
/*      */       //   664: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   669: pop
/*      */       //   670: nop
/*      */       //   671: nop
/*      */       //   672: iinc #31, 1
/*      */       //   675: goto -> 602
/*      */       //   678: nop
/*      */       //   679: aload_3
/*      */       //   680: invokevirtual getParent : ()I
/*      */       //   683: istore #27
/*      */       //   685: aload_3
/*      */       //   686: iload #17
/*      */       //   688: invokestatic access$sourceInformationOf : (Landroidx/compose/runtime/SlotWriter;I)Landroidx/compose/runtime/GroupSourceInformation;
/*      */       //   691: dup
/*      */       //   692: ifnull -> 757
/*      */       //   695: astore #30
/*      */       //   697: iconst_0
/*      */       //   698: istore #31
/*      */       //   700: iconst_m1
/*      */       //   701: istore #32
/*      */       //   703: iload #27
/*      */       //   705: iconst_1
/*      */       //   706: iadd
/*      */       //   707: istore #33
/*      */       //   709: aload_3
/*      */       //   710: invokevirtual getCurrentGroup : ()I
/*      */       //   713: istore #34
/*      */       //   715: iload #33
/*      */       //   717: iload #34
/*      */       //   719: if_icmpge -> 743
/*      */       //   722: iload #33
/*      */       //   724: istore #32
/*      */       //   726: iload #33
/*      */       //   728: aload_3
/*      */       //   729: invokestatic access$getGroups$p : (Landroidx/compose/runtime/SlotWriter;)[I
/*      */       //   732: iload #33
/*      */       //   734: invokestatic access$groupSize : ([II)I
/*      */       //   737: iadd
/*      */       //   738: istore #33
/*      */       //   740: goto -> 715
/*      */       //   743: aload #30
/*      */       //   745: aload_3
/*      */       //   746: iload #32
/*      */       //   748: iload #34
/*      */       //   750: invokevirtual addGroupAfter : (Landroidx/compose/runtime/SlotWriter;II)V
/*      */       //   753: nop
/*      */       //   754: goto -> 759
/*      */       //   757: pop
/*      */       //   758: nop
/*      */       //   759: aload_1
/*      */       //   760: iload_2
/*      */       //   761: invokevirtual parent : (I)I
/*      */       //   764: istore #28
/*      */       //   766: iload #6
/*      */       //   768: ifne -> 775
/*      */       //   771: iconst_0
/*      */       //   772: goto -> 882
/*      */       //   775: iload #4
/*      */       //   777: ifeq -> 860
/*      */       //   780: iload #28
/*      */       //   782: iflt -> 789
/*      */       //   785: iconst_1
/*      */       //   786: goto -> 790
/*      */       //   789: iconst_0
/*      */       //   790: istore #30
/*      */       //   792: iload #30
/*      */       //   794: ifeq -> 816
/*      */       //   797: aload_1
/*      */       //   798: invokevirtual startGroup : ()V
/*      */       //   801: aload_1
/*      */       //   802: iload #28
/*      */       //   804: aload_1
/*      */       //   805: invokevirtual getCurrentGroup : ()I
/*      */       //   808: isub
/*      */       //   809: invokevirtual advanceBy : (I)V
/*      */       //   812: aload_1
/*      */       //   813: invokevirtual startGroup : ()V
/*      */       //   816: aload_1
/*      */       //   817: iload_2
/*      */       //   818: aload_1
/*      */       //   819: invokevirtual getCurrentGroup : ()I
/*      */       //   822: isub
/*      */       //   823: invokevirtual advanceBy : (I)V
/*      */       //   826: aload_1
/*      */       //   827: invokevirtual removeGroup : ()Z
/*      */       //   830: istore #31
/*      */       //   832: iload #30
/*      */       //   834: ifeq -> 855
/*      */       //   837: aload_1
/*      */       //   838: invokevirtual skipToGroupEnd : ()V
/*      */       //   841: aload_1
/*      */       //   842: invokevirtual endGroup : ()I
/*      */       //   845: pop
/*      */       //   846: aload_1
/*      */       //   847: invokevirtual skipToGroupEnd : ()V
/*      */       //   850: aload_1
/*      */       //   851: invokevirtual endGroup : ()I
/*      */       //   854: pop
/*      */       //   855: iload #31
/*      */       //   857: goto -> 882
/*      */       //   860: aload_1
/*      */       //   861: iload_2
/*      */       //   862: iload #7
/*      */       //   864: invokestatic access$removeGroups : (Landroidx/compose/runtime/SlotWriter;II)Z
/*      */       //   867: istore #30
/*      */       //   869: aload_1
/*      */       //   870: iload #9
/*      */       //   872: iload #11
/*      */       //   874: iload_2
/*      */       //   875: iconst_1
/*      */       //   876: isub
/*      */       //   877: invokestatic access$removeSlots : (Landroidx/compose/runtime/SlotWriter;III)V
/*      */       //   880: iload #30
/*      */       //   882: istore #29
/*      */       //   884: iload #29
/*      */       //   886: ifne -> 893
/*      */       //   889: iconst_1
/*      */       //   890: goto -> 894
/*      */       //   893: iconst_0
/*      */       //   894: istore #30
/*      */       //   896: iconst_0
/*      */       //   897: istore #31
/*      */       //   899: nop
/*      */       //   900: iload #30
/*      */       //   902: ifne -> 913
/*      */       //   905: iconst_0
/*      */       //   906: istore #32
/*      */       //   908: ldc 'Unexpectedly removed anchors'
/*      */       //   910: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */       //   913: nop
/*      */       //   914: aload_3
/*      */       //   915: aload_3
/*      */       //   916: invokestatic access$getNodeCount$p : (Landroidx/compose/runtime/SlotWriter;)I
/*      */       //   919: aload #13
/*      */       //   921: iload #14
/*      */       //   923: invokestatic access$isNode : ([II)Z
/*      */       //   926: ifeq -> 933
/*      */       //   929: iconst_1
/*      */       //   930: goto -> 940
/*      */       //   933: aload #13
/*      */       //   935: iload #14
/*      */       //   937: invokestatic access$nodeCount : ([II)I
/*      */       //   940: iadd
/*      */       //   941: invokestatic access$setNodeCount$p : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   944: iload #5
/*      */       //   946: ifeq -> 967
/*      */       //   949: aload_3
/*      */       //   950: iload #14
/*      */       //   952: iload #7
/*      */       //   954: iadd
/*      */       //   955: invokestatic access$setCurrentGroup$p : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   958: aload_3
/*      */       //   959: iload #16
/*      */       //   961: iload #11
/*      */       //   963: iadd
/*      */       //   964: invokestatic access$setCurrentSlot$p : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   967: iload #12
/*      */       //   969: ifeq -> 978
/*      */       //   972: aload_3
/*      */       //   973: iload #17
/*      */       //   975: invokestatic access$updateContainsMark : (Landroidx/compose/runtime/SlotWriter;I)V
/*      */       //   978: aload #26
/*      */       //   980: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #2445	-> 0
/*      */       //   #2446	-> 7
/*      */       //   #2447	-> 13
/*      */       //   #2448	-> 20
/*      */       //   #2449	-> 28
/*      */       //   #2450	-> 35
/*      */       //   #2453	-> 42
/*      */       //   #2454	-> 48
/*      */       //   #2458	-> 58
/*      */       //   #2459	-> 67
/*      */       //   #2461	-> 73
/*      */       //   #2462	-> 82
/*      */       //   #2466	-> 90
/*      */       //   #2467	-> 96
/*      */       //   #2468	-> 102
/*      */       //   #2469	-> 106
/*      */       //   #2470	-> 108
/*      */       //   #2471	-> 112
/*      */       //   #2472	-> 115
/*      */       //   #2468	-> 119
/*      */       //   #2474	-> 123
/*      */       //   #2475	-> 129
/*      */       //   #2476	-> 135
/*      */       //   #2477	-> 139
/*      */       //   #2478	-> 141
/*      */       //   #2479	-> 143
/*      */       //   #2480	-> 145
/*      */       //   #2476	-> 147
/*      */       //   #2485	-> 151
/*      */       //   #2486	-> 157
/*      */       //   #2487	-> 166
/*      */       //   #2488	-> 172
/*      */       //   #2489	-> 179
/*      */       //   #4180	-> 184
/*      */       //   #2489	-> 189
/*      */       //   #2489	-> 204
/*      */       //   #2489	-> 205
/*      */       //   #2490	-> 208
/*      */       //   #2491	-> 217
/*      */       //   #2492	-> 223
/*      */       //   #2493	-> 228
/*      */       //   #2495	-> 239
/*      */       //   #2496	-> 246
/*      */       //   #2497	-> 255
/*      */       //   #2500	-> 267
/*      */       //   #2501	-> 273
/*      */       //   #2500	-> 285
/*      */       //   #2500	-> 286
/*      */       //   #2503	-> 288
/*      */       //   #2504	-> 294
/*      */       //   #2505	-> 296
/*      */       //   #2508	-> 298
/*      */       //   #2509	-> 314
/*      */       //   #2510	-> 316
/*      */       //   #2504	-> 318
/*      */       //   #2503	-> 321
/*      */       //   #2503	-> 322
/*      */       //   #2515	-> 324
/*      */       //   #2518	-> 333
/*      */       //   #2493	-> 350
/*      */       //   #2520	-> 356
/*      */       //   #2523	-> 362
/*      */       //   #2524	-> 376
/*      */       //   #2525	-> 391
/*      */       //   #2526	-> 398
/*      */       //   #2527	-> 404
/*      */       //   #2530	-> 418
/*      */       //   #2531	-> 424
/*      */       //   #2532	-> 435
/*      */       //   #2533	-> 453
/*      */       //   #2534	-> 466
/*      */       //   #2531	-> 474
/*      */       //   #2538	-> 480
/*      */       //   #2539	-> 484
/*      */       //   #2540	-> 488
/*      */       //   #2538	-> 492
/*      */       //   #2542	-> 497
/*      */       //   #2545	-> 512
/*      */       //   #2547	-> 526
/*      */       //   #2548	-> 534
/*      */       //   #2525	-> 537
/*      */       //   #2551	-> 539
/*      */       //   #2551	-> 557
/*      */       //   #2552	-> 560
/*      */       //   #2553	-> 566
/*      */       //   #2554	-> 572
/*      */       //   #2555	-> 582
/*      */       //   #4181	-> 589
/*      */       //   #4182	-> 590
/*      */       //   #4183	-> 609
/*      */       //   #4184	-> 620
/*      */       //   #2556	-> 630
/*      */       //   #2557	-> 642
/*      */       //   #2558	-> 647
/*      */       //   #2559	-> 655
/*      */       //   #2561	-> 670
/*      */       //   #4184	-> 671
/*      */       //   #4182	-> 672
/*      */       //   #4186	-> 678
/*      */       //   #2566	-> 679
/*      */       //   #2567	-> 685
/*      */       //   #2568	-> 700
/*      */       //   #2569	-> 703
/*      */       //   #2570	-> 709
/*      */       //   #2571	-> 715
/*      */       //   #2572	-> 722
/*      */       //   #2573	-> 726
/*      */       //   #2575	-> 743
/*      */       //   #2576	-> 753
/*      */       //   #2567	-> 754
/*      */       //   #2567	-> 757
/*      */       //   #2577	-> 759
/*      */       //   #2578	-> 766
/*      */       //   #2581	-> 771
/*      */       //   #2582	-> 775
/*      */       //   #2586	-> 780
/*      */       //   #2587	-> 792
/*      */       //   #2590	-> 797
/*      */       //   #2591	-> 801
/*      */       //   #2592	-> 812
/*      */       //   #2594	-> 816
/*      */       //   #2595	-> 826
/*      */       //   #2596	-> 832
/*      */       //   #2597	-> 837
/*      */       //   #2598	-> 841
/*      */       //   #2599	-> 846
/*      */       //   #2600	-> 850
/*      */       //   #2602	-> 855
/*      */       //   #2605	-> 860
/*      */       //   #2606	-> 869
/*      */       //   #2607	-> 880
/*      */       //   #2578	-> 882
/*      */       //   #2611	-> 884
/*      */       //   #4187	-> 899
/*      */       //   #4190	-> 900
/*      */       //   #4191	-> 905
/*      */       //   #2611	-> 908
/*      */       //   #4191	-> 910
/*      */       //   #4193	-> 913
/*      */       //   #2614	-> 914
/*      */       //   #2615	-> 935
/*      */       //   #2614	-> 937
/*      */       //   #2619	-> 944
/*      */       //   #2620	-> 949
/*      */       //   #2621	-> 958
/*      */       //   #2625	-> 967
/*      */       //   #2626	-> 972
/*      */       //   #2629	-> 978
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   189	9	22	$i$a$-with-SlotWriter$Companion$moveGroup$dataIndexDelta$1	I
/*      */       //   186	12	21	$this$moveGroup_u24lambda_u240	Landroidx/compose/runtime/SlotWriter;
/*      */       //   255	12	25	previousParent	I
/*      */       //   273	12	27	$i$a$-with-SlotWriter$Companion$moveGroup$newDataIndex$1	I
/*      */       //   270	15	26	$this$moveGroup_u24lambda_u241	Landroidx/compose/runtime/SlotWriter;
/*      */       //   294	27	28	$i$a$-with-SlotWriter$Companion$moveGroup$newDataAnchor$1	I
/*      */       //   291	30	27	$this$moveGroup_u24lambda_u242	Landroidx/compose/runtime/SlotWriter;
/*      */       //   288	62	25	newDataIndex	I
/*      */       //   324	26	26	newDataAnchor	I
/*      */       //   232	124	24	groupAddress	I
/*      */       //   453	21	31	sourceAnchor	Landroidx/compose/runtime/Anchor;
/*      */       //   428	52	30	anchorIndex	I
/*      */       //   404	124	27	sourceAnchors	Ljava/util/ArrayList;
/*      */       //   418	110	28	anchors	Ljava/util/ArrayList;
/*      */       //   424	104	29	anchorDelta	I
/*      */       //   497	31	30	insertLocation	I
/*      */       //   630	41	35	$i$a$-fastForEach-SlotWriter$Companion$moveGroup$1	I
/*      */       //   642	29	36	information	Landroidx/compose/runtime/GroupSourceInformation;
/*      */       //   627	44	34	anchor	Landroidx/compose/runtime/Anchor;
/*      */       //   620	52	33	item$iv	Ljava/lang/Object;
/*      */       //   593	85	31	index$iv	I
/*      */       //   589	90	30	$i$f$fastForEach	I
/*      */       //   586	93	29	$this$fastForEach$iv	Ljava/util/List;
/*      */       //   566	113	27	sourceSourceInformationMap	Ljava/util/HashMap;
/*      */       //   572	107	28	destinationSourceInformation	Ljava/util/HashMap;
/*      */       //   700	54	31	$i$a$-let-SlotWriter$Companion$moveGroup$2	I
/*      */       //   703	51	32	predecessor	I
/*      */       //   709	45	33	child	I
/*      */       //   715	39	34	endGroup	I
/*      */       //   697	57	30	it	Landroidx/compose/runtime/GroupSourceInformation;
/*      */       //   792	65	30	needsStartGroups	Z
/*      */       //   832	25	31	anchorsRemoved	Z
/*      */       //   869	13	30	anchorsRemoved	Z
/*      */       //   908	2	32	$i$a$-runtimeCheck-SlotWriter$Companion$moveGroup$3	I
/*      */       //   899	15	31	$i$f$runtimeCheck	I
/*      */       //   896	18	30	value$iv	Z
/*      */       //   7	974	7	groupsToMove	I
/*      */       //   13	968	8	sourceGroupsEnd	I
/*      */       //   20	961	9	sourceSlotsStart	I
/*      */       //   28	953	10	sourceSlotsEnd	I
/*      */       //   35	946	11	slotsToMove	I
/*      */       //   42	939	12	hasMarks	Z
/*      */       //   96	885	13	groups	[I
/*      */       //   102	879	14	currentGroup	I
/*      */       //   129	852	15	slots	[Ljava/lang/Object;
/*      */       //   135	846	16	currentSlot	I
/*      */       //   157	824	17	parent	I
/*      */       //   172	809	18	parentDelta	I
/*      */       //   179	802	19	moveEnd	I
/*      */       //   208	773	20	dataIndexDelta	I
/*      */       //   211	770	21	slotsGapOwner	I
/*      */       //   223	758	22	slotsGapLen	I
/*      */       //   228	753	23	slotsCapacity	I
/*      */       //   376	605	24	startAnchors	I
/*      */       //   391	590	25	endAnchors	I
/*      */       //   539	442	26	anchors	Ljava/util/List;
/*      */       //   685	296	27	toWriterParent	I
/*      */       //   766	215	28	parentGroup	I
/*      */       //   884	97	29	anchorsRemoved	Z
/*      */       //   0	981	0	this	Landroidx/compose/runtime/SlotWriter$Companion;
/*      */       //   0	981	1	fromWriter	Landroidx/compose/runtime/SlotWriter;
/*      */       //   0	981	2	fromIndex	I
/*      */       //   0	981	3	toWriter	Landroidx/compose/runtime/SlotWriter;
/*      */       //   0	981	4	updateFromCursor	Z
/*      */       //   0	981	5	updateToCursor	Z
/*      */       //   0	981	6	removeSourceGroup	Z
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public final List<Anchor> moveTo(@NotNull Anchor anchor, int offset, @NotNull SlotWriter writer) {
/* 2641 */     Intrinsics.checkNotNullParameter(anchor, "anchor"); Intrinsics.checkNotNullParameter(writer, "writer"); ComposerKt.runtimeCheck((writer.insertCount > 0));
/* 2642 */     ComposerKt.runtimeCheck((this.insertCount == 0));
/* 2643 */     ComposerKt.runtimeCheck(anchor.getValid());
/* 2644 */     int location = anchorIndex(anchor) + offset;
/* 2645 */     int currentGroup = this.currentGroup;
/* 2646 */     ComposerKt.runtimeCheck((currentGroup <= location) ? ((location < this.currentGroupEnd)) : false);
/* 2647 */     int parent = parent(location);
/* 2648 */     int size = groupSize(location);
/* 2649 */     int nodes = isNode(location) ? 1 : nodeCount(location);
/* 2650 */     List<Anchor> result = Companion.moveGroup$default(Companion, 
/* 2651 */         this, 
/* 2652 */         location, 
/* 2653 */         writer, 
/* 2654 */         false, 
/* 2655 */         false, false, 32, null);
/*      */ 
/*      */     
/* 2658 */     updateContainsMark(parent);
/*      */ 
/*      */     
/* 2661 */     int current = parent;
/* 2662 */     boolean updatingNodes = (nodes > 0);
/* 2663 */     while (current >= currentGroup) {
/* 2664 */       int currentAddress = groupIndexToAddress(current);
/* 2665 */       SlotTableKt.access$updateGroupSize(this.groups, currentAddress, SlotTableKt.access$groupSize(this.groups, currentAddress) - size);
/* 2666 */       if (updatingNodes)
/* 2667 */         if (SlotTableKt.access$isNode(this.groups, currentAddress)) {
/* 2668 */           updatingNodes = false;
/*      */         } else {
/* 2670 */           SlotTableKt.access$updateNodeCount(this.groups, currentAddress, SlotTableKt.access$nodeCount(this.groups, currentAddress) - nodes);
/*      */         }  
/* 2672 */       current = parent(current);
/*      */     } 
/* 2674 */     if (updatingNodes) {
/* 2675 */       ComposerKt.runtimeCheck((this.nodeCount >= nodes));
/* 2676 */       this.nodeCount -= nodes;
/*      */     } 
/*      */     
/* 2679 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<Anchor> moveFrom(@NotNull SlotTable table, int index, boolean removeSourceGroup) {
/*      */     List<Anchor> list;
/* 2691 */     Intrinsics.checkNotNullParameter(table, "table"); ComposerKt.runtimeCheck((this.insertCount > 0));
/*      */ 
/*      */     
/* 2694 */     if (index == 0 && this.currentGroup == 0 && 
/* 2695 */       this.table.getGroupsSize() == 0 && 
/* 2696 */       SlotTableKt.access$groupSize(table.getGroups(), index) == table.getGroupsSize()) {
/*      */ 
/*      */ 
/*      */       
/* 2700 */       int[] myGroups = this.groups;
/* 2701 */       Object[] mySlots = this.slots;
/* 2702 */       ArrayList<Anchor> myAnchors = this.anchors;
/* 2703 */       HashMap<Anchor, GroupSourceInformation> mySourceInformation = this.sourceInformationMap;
/* 2704 */       MutableIntObjectMap<MutableIntSet> myCallInformation = this.calledByMap;
/* 2705 */       int[] groups = table.getGroups();
/* 2706 */       int groupsSize = table.getGroupsSize();
/* 2707 */       Object[] slots = table.getSlots();
/* 2708 */       int slotsSize = table.getSlotsSize();
/* 2709 */       HashMap<Anchor, GroupSourceInformation> sourceInformation = table.getSourceInformationMap$runtime();
/* 2710 */       MutableIntObjectMap<MutableIntSet> callInformation = table.getCalledByMap$runtime();
/* 2711 */       this.groups = groups;
/* 2712 */       this.slots = slots;
/* 2713 */       this.anchors = table.getAnchors$runtime();
/* 2714 */       this.groupGapStart = groupsSize;
/* 2715 */       this.groupGapLen = groups.length / 5 - groupsSize;
/* 2716 */       this.slotsGapStart = slotsSize;
/* 2717 */       this.slotsGapLen = slots.length - slotsSize;
/* 2718 */       this.slotsGapOwner = groupsSize;
/* 2719 */       this.sourceInformationMap = sourceInformation;
/* 2720 */       this.calledByMap = callInformation;
/*      */       
/* 2722 */       table.setTo$runtime(
/* 2723 */           myGroups, 
/* 2724 */           0, 
/* 2725 */           mySlots, 
/* 2726 */           0, 
/* 2727 */           myAnchors, 
/* 2728 */           mySourceInformation, 
/* 2729 */           myCallInformation);
/*      */       
/* 2731 */       return this.anchors;
/*      */     } 
/*      */     
/* 2734 */     SlotTable this_$iv = table; int $i$f$write = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4351 */     SlotWriter writer$iv = this_$iv.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0;
/* 4352 */     boolean normalClose$iv = false;
/*      */     
/* 4354 */     try { SlotWriter tableWriter = writer$iv; int $i$a$-write-SlotWriter$moveFrom$1 = 0; Object<Anchor> it$iv = (Object<Anchor>)(list = Companion.moveGroup(tableWriter, index, this, true, true, removeSourceGroup));
/* 4355 */       int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; list = list; }
/* 4356 */     finally { writer$iv.close(normalClose$iv); }  return list;
/*      */   } public final void bashCurrentGroup() { SlotTableKt.access$updateGroupKey(this.groups, this.currentGroup, -3); } @NotNull public final List<Anchor> moveIntoGroupFrom(int offset, @NotNull SlotTable table, int index) { List<Anchor> list1; Intrinsics.checkNotNullParameter(table, "table"); ComposerKt.runtimeCheck((this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)); int previousCurrentGroup = this.currentGroup; int previousCurrentSlot = this.currentSlot; int previousCurrentSlotEnd = this.currentSlotEnd; advanceBy(offset); startGroup(); beginInsert();
/*      */     SlotTable this_$iv = table;
/*      */     int $i$f$write = 0;
/* 4360 */     SlotWriter writer$iv = this_$iv.openWriter(); int $i$a$-let-SlotTable$write$1$iv = 0;
/* 4361 */     boolean normalClose$iv = false;
/*      */     
/* 4363 */     try { SlotWriter tableWriter = writer$iv; int $i$a$-write-SlotWriter$moveIntoGroupFrom$anchors$1 = 0; Object<Anchor> it$iv = (Object<Anchor>)(list1 = Companion.moveGroup$default(Companion, tableWriter, index, this, false, true, false, 32, null));
/* 4364 */       int $i$a$-also-SlotTable$write$1$1$iv = 0; normalClose$iv = true; list1 = list1; }
/* 4365 */     finally { writer$iv.close(normalClose$iv); }  List<Anchor> anchors = list1; endInsert(); endGroup(); this.currentGroup = previousCurrentGroup; this.currentSlot = previousCurrentSlot; this.currentSlotEnd = previousCurrentSlotEnd; return anchors; }
/*      */   public final void markGroup(int group) { int groupAddress = groupIndexToAddress(group); if (!SlotTableKt.access$hasMark(this.groups, groupAddress)) { SlotTableKt.access$updateMark(this.groups, groupAddress, true); if (!SlotTableKt.access$containsMark(this.groups, groupAddress)) updateContainsMark(parent(group));  }  }
/*      */   private final boolean containsGroupMark(int group) { return (group >= 0 && SlotTableKt.access$containsMark(this.groups, groupIndexToAddress(group))); }
/* 4368 */   private final boolean containsAnyGroupMarks(int group) { return (group >= 0 && SlotTableKt.access$containsAnyMark(this.groups, groupIndexToAddress(group))); } private final void recalculateMarks() { PrioritySet set = this.pendingRecalculateMarks; int $i$a$-let-SlotWriter$recalculateMarks$1 = 0; while (set.isNotEmpty()) updateContainsMarkNow(set.takeMax(), set);  } private final void updateContainsMark(int group) { if (group >= 0) { if (this.pendingRecalculateMarks == null) { PrioritySet prioritySet1 = new PrioritySet(null, 1, null), it = prioritySet1; int $i$a$-also-SlotWriter$updateContainsMark$1 = 0; this.pendingRecalculateMarks = it; }  prioritySet1.add(group); }  } private final void updateContainsMarkNow(int group, PrioritySet set) { int groupAddress = groupIndexToAddress(group); boolean containsAnyMarks = childContainsAnyMarks(group); boolean markChanges = (SlotTableKt.access$containsMark(this.groups, groupAddress) != containsAnyMarks); if (markChanges) { SlotTableKt.access$updateContainsMark(this.groups, groupAddress, containsAnyMarks); int parent = parent(group); if (parent >= 0) set.add(parent);  }  } private final boolean childContainsAnyMarks(int group) { int child = group + 1; int end = group + groupSize(group); while (child < end) { if (SlotTableKt.access$containsAnyMark(this.groups, groupIndexToAddress(child))) return true;  child += groupSize(child); }  return false; } public final int anchorIndex(@NotNull Anchor anchor) { Intrinsics.checkNotNullParameter(anchor, "anchor"); int it = anchor.getLocation$runtime(); int $i$a$-let-SlotWriter$anchorIndex$1 = 0; return (it < 0) ? (getSize$runtime() + it) : it; } @NotNull public String toString() { return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')'; } private final void saveCurrentGroupEnd() { this.endStack.push(getCapacity() - this.groupGapLen - this.currentGroupEnd); } private final int restoreCurrentGroupEnd() { int newGroupEnd = getCapacity() - this.groupGapLen - this.endStack.pop(); this.currentGroupEnd = newGroupEnd; return newGroupEnd; } private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) { int parentAnchor = parentIndexToAnchor(parent, this.groupGapStart); int child = firstChild; while (child < endGroup) { SlotTableKt.access$updateParentAnchor(this.groups, groupIndexToAddress(child), parentAnchor); int childEnd = child + SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(child)); fixParentAnchorsFor(child, childEnd, child + 1); child = childEnd; }  } @NotNull public final Anchor anchor(int index) { ArrayList<Anchor> arrayList = this.anchors; int effectiveSize$iv = getSize$runtime(), $i$f$getOrAdd = 0; int location$iv = SlotTableKt.access$search(arrayList, index, effectiveSize$iv);
/* 4369 */     if (location$iv < 0) {
/* 4370 */       int $i$a$-getOrAdd-SlotWriter$anchor$1 = 0;
/*      */     }
/*      */     
/* 4373 */     Intrinsics.checkNotNullExpressionValue(arrayList.get(location$iv), "get(...)"); return arrayList.get(location$iv); }
/*      */   private final void moveGroupGapTo(int index) { int gapLen = this.groupGapLen; int gapStart = this.groupGapStart; if (gapStart != index) { if (!this.anchors.isEmpty()) updateAnchors(gapStart, index);  if (gapLen > 0) { int[] groups = this.groups; int groupPhysicalAddress = index * 5; int groupPhysicalGapLen = gapLen * 5; int groupPhysicalGapStart = gapStart * 5; if (index < gapStart) { ArraysKt.copyInto(groups, groups, groupPhysicalAddress + groupPhysicalGapLen, groupPhysicalAddress, groupPhysicalGapStart); } else { ArraysKt.copyInto(groups, groups, groupPhysicalGapStart, groupPhysicalGapStart + groupPhysicalGapLen, groupPhysicalAddress + groupPhysicalGapLen); }  }  int groupAddress = (index < gapStart) ? (index + gapLen) : gapStart; int capacity = getCapacity(); ComposerKt.runtimeCheck((groupAddress < capacity)); while (groupAddress < capacity) { int oldAnchor = SlotTableKt.access$parentAnchor(this.groups, groupAddress); int oldIndex = parentAnchorToIndex(oldAnchor); int newAnchor = parentIndexToAnchor(oldIndex, index); if (newAnchor != oldAnchor) SlotTableKt.access$updateParentAnchor(this.groups, groupAddress, newAnchor);  groupAddress++; if (groupAddress == index) groupAddress += gapLen;  }  }  this.groupGapStart = index; }
/*      */   private final void moveSlotGapTo(int index, int group) { int gapLen = this.slotsGapLen; int gapStart = this.slotsGapStart; int slotsGapOwner = this.slotsGapOwner; if (gapStart != index) { Object[] slots = this.slots; if (index < gapStart) { ArraysKt.copyInto(slots, slots, index + gapLen, index, gapStart); } else { ArraysKt.copyInto(slots, slots, gapStart, gapStart + gapLen, index + gapLen); }  }  int newSlotsGapOwner = Math.min(group + 1, getSize$runtime()); if (slotsGapOwner != newSlotsGapOwner) { int groupGapStart, slotsSize = this.slots.length - gapLen; if (newSlotsGapOwner < slotsGapOwner) { int updateAddress = groupIndexToAddress(newSlotsGapOwner); int stopUpdateAddress = groupIndexToAddress(slotsGapOwner); groupGapStart = this.groupGapStart; while (true) { while (true) { SlotTableKt.access$updateDataAnchor(this.groups, updateAddress, -(slotsSize - SYNTHETIC_LOCAL_VARIABLE_11 + 1)); break; }  updateAddress++; if (updateAddress == groupGapStart) updateAddress += this.groupGapLen;  }  } else { int updateAddress = groupIndexToAddress(slotsGapOwner); int stopUpdateAddress = groupIndexToAddress(newSlotsGapOwner); while (true) { while (true) { SlotTableKt.access$updateDataAnchor(this.groups, updateAddress, slotsSize + groupGapStart + 1); break; }  updateAddress++; if (updateAddress == this.groupGapStart) updateAddress += this.groupGapLen;  }  }  this.slotsGapOwner = newSlotsGapOwner; }  this.slotsGapStart = index; }
/*      */   private final void clearSlotGap() { int slotsGapStart = this.slotsGapStart; int slotsGapEnd = slotsGapStart + this.slotsGapLen; ArraysKt.fill(this.slots, null, slotsGapStart, slotsGapEnd); }
/*      */   private final void insertGroups(int size) { if (size > 0) { int currentGroup = this.currentGroup; moveGroupGapTo(currentGroup); int gapStart = this.groupGapStart; int gapLen = this.groupGapLen; int oldCapacity = this.groups.length / 5; int oldSize = oldCapacity - gapLen; if (gapLen < size) { int[] groups = this.groups; int newCapacity = Math.max(Math.max(oldCapacity * 2, oldSize + size), 32); int[] newGroups = new int[newCapacity * 5]; int newGapLen = newCapacity - oldSize; int oldGapEndAddress = gapStart + gapLen; int newGapEndAddress = gapStart + newGapLen; ArraysKt.copyInto(groups, newGroups, 0, 0, gapStart * 5); ArraysKt.copyInto(groups, newGroups, newGapEndAddress * 5, oldGapEndAddress * 5, oldCapacity * 5); this.groups = newGroups; gapLen = newGapLen; }  int currentEnd = this.currentGroupEnd; if (currentEnd >= gapStart) this.currentGroupEnd = currentEnd + size;  this.groupGapStart = gapStart + size; this.groupGapLen = gapLen - size; int index = (oldSize > 0) ? dataIndex(currentGroup + size) : 0; int anchor = dataIndexToDataAnchor(index, (this.slotsGapOwner < gapStart) ? 0 : this.slotsGapStart, this.slotsGapLen, this.slots.length); for (int groupAddress = gapStart, i = gapStart + size; groupAddress < i; groupAddress++)
/*      */         SlotTableKt.access$updateDataAnchor(this.groups, groupAddress, anchor);  int slotsGapOwner = this.slotsGapOwner; if (slotsGapOwner >= gapStart)
/*      */         this.slotsGapOwner = slotsGapOwner + size;  }  }
/*      */   private final void insertSlots(int size, int group) { if (size > 0) { moveSlotGapTo(this.currentSlot, group); int gapStart = this.slotsGapStart; int gapLen = this.slotsGapLen; if (gapLen < size) { Object[] slots = this.slots; int oldCapacity = slots.length; int oldSize = oldCapacity - gapLen; int newCapacity = Math.max(Math.max(oldCapacity * 2, oldSize + size), 32); Object[] arrayOfObject1; for (byte b = 0; b < newCapacity; ) { byte b1 = b; arrayOfObject1[b1] = null; b++; }  Object[] newData = arrayOfObject1; int newGapLen = newCapacity - oldSize; int oldGapEndAddress = gapStart + gapLen; int newGapEndAddress = gapStart + newGapLen; ArraysKt.copyInto(slots, newData, 0, 0, gapStart); ArraysKt.copyInto(slots, newData, newGapEndAddress, oldGapEndAddress, oldCapacity); this.slots = newData; gapLen = newGapLen; }  int currentDataEnd = this.currentSlotEnd; if (currentDataEnd >= gapStart)
/*      */         this.currentSlotEnd = currentDataEnd + size;  this.slotsGapStart = gapStart + size; this.slotsGapLen = gapLen - size; }  }
/*      */   private final boolean removeGroups(int start, int len) { boolean anchorsRemoved = false; ArrayList<Anchor> anchors = this.anchors; moveGroupGapTo(start); if (!anchors.isEmpty())
/*      */       anchorsRemoved = removeAnchors(start, len, this.sourceInformationMap);  this.groupGapStart = start; int previousGapLen = this.groupGapLen; int newGapLen = previousGapLen + len; this.groupGapLen = newGapLen; int slotsGapOwner = this.slotsGapOwner; if (slotsGapOwner > start)
/*      */       this.slotsGapOwner = Math.max(start, slotsGapOwner - len);  if (this.currentGroupEnd >= this.groupGapStart)
/*      */       this.currentGroupEnd -= len;  int parent = this.parent; if (containsGroupMark(parent))
/*      */       updateContainsMark(parent);  return (len > 0) ? anchorsRemoved : false; }
/*      */   private final GroupSourceInformation sourceInformationOf(int group) { HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap; int $i$a$-let-SlotWriter$sourceInformationOf$1 = 0; Anchor anchor = tryAnchor$runtime(group); int $i$a$-let-SlotWriter$sourceInformationOf$1$1 = 0; tryAnchor$runtime(group); return (this.sourceInformationMap != null) ? ((tryAnchor$runtime(group) != null) ? map.get(anchor) : null) : null; }
/*      */   @Nullable public final Anchor tryAnchor$runtime(int group) { return ((0 <= group) ? ((group < getSize$runtime())) : false) ? SlotTableKt.access$find(this.anchors, group, getSize$runtime()) : null; }
/*      */   private final void removeSlots(int start, int len, int group) { if (len > 0) { int gapLen = this.slotsGapLen; int removeEnd = start + len; moveSlotGapTo(removeEnd, group); this.slotsGapStart = start; this.slotsGapLen = gapLen + len; ArraysKt.fill(this.slots, null, start, start + len); int currentDataEnd = this.currentSlotEnd; if (currentDataEnd >= start)
/*      */         this.currentSlotEnd = currentDataEnd - len;  }  }
/*      */   private final void updateNodeOfGroup(int index, Object value) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iload_1
/*      */     //   2: invokespecial groupIndexToAddress : (I)I
/*      */     //   5: istore_3
/*      */     //   6: iload_3
/*      */     //   7: aload_0
/*      */     //   8: getfield groups : [I
/*      */     //   11: arraylength
/*      */     //   12: if_icmpge -> 30
/*      */     //   15: aload_0
/*      */     //   16: getfield groups : [I
/*      */     //   19: iload_3
/*      */     //   20: invokestatic access$isNode : ([II)Z
/*      */     //   23: ifeq -> 30
/*      */     //   26: iconst_1
/*      */     //   27: goto -> 31
/*      */     //   30: iconst_0
/*      */     //   31: istore #4
/*      */     //   33: iconst_0
/*      */     //   34: istore #5
/*      */     //   36: nop
/*      */     //   37: iload #4
/*      */     //   39: ifne -> 74
/*      */     //   42: iconst_0
/*      */     //   43: istore #6
/*      */     //   45: new java/lang/StringBuilder
/*      */     //   48: dup
/*      */     //   49: invokespecial <init> : ()V
/*      */     //   52: ldc_w 'Updating the node of a group at '
/*      */     //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   58: iload_1
/*      */     //   59: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   62: ldc_w ' that was not created with as a node group'
/*      */     //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   68: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   71: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   74: nop
/*      */     //   75: aload_0
/*      */     //   76: getfield slots : [Ljava/lang/Object;
/*      */     //   79: aload_0
/*      */     //   80: aload_0
/*      */     //   81: aload_0
/*      */     //   82: getfield groups : [I
/*      */     //   85: iload_3
/*      */     //   86: invokespecial nodeIndex : ([II)I
/*      */     //   89: invokespecial dataIndexToDataAddress : (I)I
/*      */     //   92: aload_2
/*      */     //   93: aastore
/*      */     //   94: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3211	-> 0
/*      */     //   #3212	-> 6
/*      */     //   #4388	-> 36
/*      */     //   #4391	-> 37
/*      */     //   #4392	-> 42
/*      */     //   #3213	-> 45
/*      */     //   #4392	-> 71
/*      */     //   #4394	-> 74
/*      */     //   #3215	-> 75
/*      */     //   #3216	-> 94
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   45	26	6	$i$a$-runtimeCheck-SlotWriter$updateNodeOfGroup$1	I
/*      */     //   36	39	5	$i$f$runtimeCheck	I
/*      */     //   33	42	4	value$iv	Z
/*      */     //   6	89	3	address	I
/*      */     //   0	95	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */     //   0	95	1	index	I
/*      */     //   0	95	2	value	Ljava/lang/Object; }
/*      */   private final void updateAnchors(int previousGapStart, int newGapStart) { int gapLen = this.groupGapLen; int size = getCapacity() - gapLen; if (previousGapStart < newGapStart) { int index = SlotTableKt.access$locationOf(this.anchors, previousGapStart, size); while (index < this.anchors.size()) { Intrinsics.checkNotNullExpressionValue(this.anchors.get(index), "get(...)"); Anchor anchor = this.anchors.get(index); int location = anchor.getLocation$runtime(); if (location < 0) { int newLocation = size + location; if (newLocation < newGapStart) { anchor.setLocation$runtime(size + location); index++; }  }  }  } else { int index = SlotTableKt.access$locationOf(this.anchors, newGapStart, size); while (index < this.anchors.size()) { Intrinsics.checkNotNullExpressionValue(this.anchors.get(index), "get(...)"); Anchor anchor = this.anchors.get(index); int location = anchor.getLocation$runtime(); if (location >= 0) { anchor.setLocation$runtime(-(size - location)); index++; }  }  }  }
/*      */   private final boolean removeAnchors(int gapStart, int size, HashMap sourceInformationMap) { int gapLen = this.groupGapLen; int removeEnd = gapStart + size; int groupsSize = getCapacity() - gapLen; int it = SlotTableKt.access$locationOf(this.anchors, gapStart + size, groupsSize), $i$a$-let-SlotWriter$removeAnchors$index$1 = 0, index = (it >= this.anchors.size()) ? (it - 1) : it; int removeAnchorEnd = 0; int removeAnchorStart = 0; removeAnchorStart = index + 1; while (index >= 0) { Intrinsics.checkNotNullExpressionValue(this.anchors.get(index), "get(...)"); Anchor anchor = this.anchors.get(index); int location = anchorIndex(anchor); if (location >= gapStart) { if (location < removeEnd) { anchor.setLocation$runtime(-2147483648); if (sourceInformationMap != null) { (GroupSourceInformation)sourceInformationMap.remove(anchor); } else {  }  removeAnchorStart = index; if (removeAnchorEnd == 0)
/*      */             removeAnchorEnd = index + 1;  }  index--; }  }  int i = $i$a$-let-SlotWriter$removeAnchors$index$1 = (removeAnchorStart < removeAnchorEnd) ? 1 : 0, $i$a$-also-SlotWriter$removeAnchors$1 = 0; if (i != 0)
/*      */       this.anchors.subList(removeAnchorStart, removeAnchorEnd).clear();  return $i$a$-let-SlotWriter$removeAnchors$index$1; } private final void moveAnchors(int originalLocation, int newLocation, int size) { int end = originalLocation + size; int groupsSize = getSize$runtime(); int index = SlotTableKt.access$locationOf(this.anchors, originalLocation, groupsSize); List<Anchor> removedAnchors = new ArrayList(); if (index >= 0)
/* 4396 */       while (index < this.anchors.size()) { Intrinsics.checkNotNullExpressionValue(this.anchors.get(index), "get(...)"); Anchor anchor = this.anchors.get(index); int location = anchorIndex(anchor); if (location >= originalLocation && location < end) { removedAnchors.add(anchor); this.anchors.remove(index); }  }   int moveDelta = newLocation - originalLocation; List<Anchor> $this$fastForEach$iv = removedAnchors; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 4397 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 4398 */       Anchor anchor = (Anchor)item$iv; int $i$a$-fastForEach-SlotWriter$moveAnchors$1 = 0; int anchorIndex = anchorIndex(anchor); int newAnchorIndex = anchorIndex + moveDelta;
/*      */     }  } @NotNull public final String toDebugString() { StringBuilder stringBuilder1 = new StringBuilder(), $this$toDebugString_u24lambda_u2445 = stringBuilder1; int $i$a$-buildString-SlotWriter$toDebugString$1 = 0; Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append(toString()), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append(toString()).append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append(toString()).append('\n'); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  parent:    " + this.parent), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  parent:    " + this.parent).append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append("  parent:    " + this.parent).append('\n'); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  current:   " + this.currentGroup), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  current:   " + this.currentGroup).append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append("  current:   " + this.currentGroup).append('\n'); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')'), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')').append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')').append('\n'); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')'), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')').append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')').append('\n'); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  gap owner: " + this.slotsGapOwner), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2445.append("  gap owner: " + this.slotsGapOwner).append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2445.append("  gap owner: " + this.slotsGapOwner).append('\n'); for (int index = 0, i = getSize$runtime(); index < i; index++) {
/*      */       groupAsString($this$toDebugString_u24lambda_u2445, index); $this$toDebugString_u24lambda_u2445.append('\n');
/*      */     }  Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); }
/*      */   private final void groupAsString(StringBuilder $this$groupAsString, int index) { int address = groupIndexToAddress(index); $this$groupAsString.append("Group("); if (index < 10)
/*      */       $this$groupAsString.append(' ');  if (index < 100)
/*      */       $this$groupAsString.append(' ');  if (index < 1000)
/*      */       $this$groupAsString.append(' ');  $this$groupAsString.append(index); if (address != index) {
/*      */       $this$groupAsString.append("("); $this$groupAsString.append(address); $this$groupAsString.append(")");
/*      */     }  $this$groupAsString.append('#'); $this$groupAsString.append(SlotTableKt.access$groupSize(this.groups, address)); $this$groupAsString.append('^'); $this$groupAsString.append(parentAnchorToIndex(SlotTableKt.access$parentAnchor(this.groups, address))); $this$groupAsString.append(": key="); $this$groupAsString.append(SlotTableKt.access$key(this.groups, address)); $this$groupAsString.append(", nodes="); $this$groupAsString.append(SlotTableKt.access$nodeCount(this.groups, address)); $this$groupAsString.append(", dataAnchor=");
/*      */     $this$groupAsString.append(SlotTableKt.access$dataAnchor(this.groups, address));
/*      */     $this$groupAsString.append(", parentAnchor=");
/*      */     $this$groupAsString.append(SlotTableKt.access$parentAnchor(this.groups, address));
/*      */     if (SlotTableKt.access$isNode(this.groups, address))
/*      */       $this$groupAsString.append(", node=" + SlotTableKt.access$summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, address))]), 10)); 
/*      */     int startData = slotIndex(this.groups, address);
/*      */     int successorAddress = groupIndexToAddress(index + 1);
/*      */     int endData = dataIndex(this.groups, successorAddress);
/*      */     if (endData > startData) {
/*      */       $this$groupAsString.append(", [");
/*      */       for (int dataIndex = startData; dataIndex < endData; dataIndex++) {
/*      */         if (dataIndex != startData)
/*      */           $this$groupAsString.append(", "); 
/*      */         int dataAddress = dataIndexToDataAddress(dataIndex);
/*      */         $this$groupAsString.append(String.valueOf(SlotTableKt.access$summarize(String.valueOf(this.slots[dataAddress]), 10)));
/*      */       } 
/*      */       $this$groupAsString.append(']');
/*      */     } 
/*      */     $this$groupAsString.append(")"); }
/*      */   public final void verifyDataAnchors$runtime() { // Byte code:
/*      */     //   0: iconst_0
/*      */     //   1: istore_1
/*      */     //   2: aload_0
/*      */     //   3: getfield slotsGapOwner : I
/*      */     //   6: istore_2
/*      */     //   7: iconst_0
/*      */     //   8: istore_3
/*      */     //   9: aload_0
/*      */     //   10: getfield slots : [Ljava/lang/Object;
/*      */     //   13: arraylength
/*      */     //   14: aload_0
/*      */     //   15: getfield slotsGapLen : I
/*      */     //   18: isub
/*      */     //   19: istore #4
/*      */     //   21: iconst_0
/*      */     //   22: istore #5
/*      */     //   24: aload_0
/*      */     //   25: invokevirtual getSize$runtime : ()I
/*      */     //   28: istore #6
/*      */     //   30: iload #5
/*      */     //   32: iload #6
/*      */     //   34: if_icmpge -> 281
/*      */     //   37: aload_0
/*      */     //   38: iload #5
/*      */     //   40: invokespecial groupIndexToAddress : (I)I
/*      */     //   43: istore #7
/*      */     //   45: aload_0
/*      */     //   46: getfield groups : [I
/*      */     //   49: iload #7
/*      */     //   51: invokestatic access$dataAnchor : ([II)I
/*      */     //   54: istore #8
/*      */     //   56: aload_0
/*      */     //   57: aload_0
/*      */     //   58: getfield groups : [I
/*      */     //   61: iload #7
/*      */     //   63: invokespecial dataIndex : ([II)I
/*      */     //   66: istore #9
/*      */     //   68: iload #9
/*      */     //   70: iload_1
/*      */     //   71: if_icmplt -> 78
/*      */     //   74: iconst_1
/*      */     //   75: goto -> 79
/*      */     //   78: iconst_0
/*      */     //   79: istore #10
/*      */     //   81: iconst_0
/*      */     //   82: istore #11
/*      */     //   84: nop
/*      */     //   85: iload #10
/*      */     //   87: ifne -> 138
/*      */     //   90: iconst_0
/*      */     //   91: istore #12
/*      */     //   93: new java/lang/StringBuilder
/*      */     //   96: dup
/*      */     //   97: invokespecial <init> : ()V
/*      */     //   100: ldc_w 'Data index out of order at '
/*      */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   106: iload #5
/*      */     //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   111: ldc_w ', previous = '
/*      */     //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   117: iload_1
/*      */     //   118: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   121: ldc_w ', current = '
/*      */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   127: iload #9
/*      */     //   129: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   132: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   135: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   138: nop
/*      */     //   139: iload #9
/*      */     //   141: iload #4
/*      */     //   143: if_icmpgt -> 150
/*      */     //   146: iconst_1
/*      */     //   147: goto -> 151
/*      */     //   150: iconst_0
/*      */     //   151: istore #10
/*      */     //   153: iconst_0
/*      */     //   154: istore #11
/*      */     //   156: nop
/*      */     //   157: iload #10
/*      */     //   159: ifne -> 200
/*      */     //   162: iconst_0
/*      */     //   163: istore #12
/*      */     //   165: new java/lang/StringBuilder
/*      */     //   168: dup
/*      */     //   169: invokespecial <init> : ()V
/*      */     //   172: ldc_w 'Data index, '
/*      */     //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   178: iload #9
/*      */     //   180: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   183: ldc_w ', out of bound at '
/*      */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   189: iload #5
/*      */     //   191: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   194: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   197: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   200: nop
/*      */     //   201: iload #8
/*      */     //   203: ifge -> 272
/*      */     //   206: iload_3
/*      */     //   207: ifne -> 272
/*      */     //   210: iload_2
/*      */     //   211: iload #5
/*      */     //   213: if_icmpne -> 220
/*      */     //   216: iconst_1
/*      */     //   217: goto -> 221
/*      */     //   220: iconst_0
/*      */     //   221: istore #10
/*      */     //   223: iconst_0
/*      */     //   224: istore #11
/*      */     //   226: nop
/*      */     //   227: iload #10
/*      */     //   229: ifne -> 269
/*      */     //   232: iconst_0
/*      */     //   233: istore #12
/*      */     //   235: new java/lang/StringBuilder
/*      */     //   238: dup
/*      */     //   239: invokespecial <init> : ()V
/*      */     //   242: ldc_w 'Expected the slot gap owner to be '
/*      */     //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   248: iload_2
/*      */     //   249: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   252: ldc_w ' found gap at '
/*      */     //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   258: iload #5
/*      */     //   260: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   263: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   266: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   269: nop
/*      */     //   270: iconst_1
/*      */     //   271: istore_3
/*      */     //   272: iload #9
/*      */     //   274: istore_1
/*      */     //   275: iinc #5, 1
/*      */     //   278: goto -> 30
/*      */     //   281: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3396	-> 0
/*      */     //   #3397	-> 2
/*      */     //   #3398	-> 7
/*      */     //   #3399	-> 9
/*      */     //   #3400	-> 21
/*      */     //   #3401	-> 37
/*      */     //   #3402	-> 45
/*      */     //   #3403	-> 56
/*      */     //   #3404	-> 68
/*      */     //   #4401	-> 84
/*      */     //   #4404	-> 85
/*      */     //   #4405	-> 90
/*      */     //   #3405	-> 93
/*      */     //   #3406	-> 127
/*      */     //   #3405	-> 129
/*      */     //   #4405	-> 135
/*      */     //   #4407	-> 138
/*      */     //   #3408	-> 139
/*      */     //   #4408	-> 156
/*      */     //   #4411	-> 157
/*      */     //   #4412	-> 162
/*      */     //   #3409	-> 165
/*      */     //   #4412	-> 197
/*      */     //   #4414	-> 200
/*      */     //   #3411	-> 201
/*      */     //   #3412	-> 210
/*      */     //   #4415	-> 226
/*      */     //   #4418	-> 227
/*      */     //   #4419	-> 232
/*      */     //   #3413	-> 235
/*      */     //   #4419	-> 266
/*      */     //   #4421	-> 269
/*      */     //   #3415	-> 270
/*      */     //   #3417	-> 272
/*      */     //   #3400	-> 275
/*      */     //   #3419	-> 281
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   93	42	12	$i$a$-checkPrecondition-SlotWriter$verifyDataAnchors$1	I
/*      */     //   84	55	11	$i$f$checkPrecondition	I
/*      */     //   81	58	10	value$iv	Z
/*      */     //   165	32	12	$i$a$-checkPrecondition-SlotWriter$verifyDataAnchors$2	I
/*      */     //   156	45	11	$i$f$checkPrecondition	I
/*      */     //   153	48	10	value$iv	Z
/*      */     //   235	31	12	$i$a$-checkPrecondition-SlotWriter$verifyDataAnchors$3	I
/*      */     //   226	44	11	$i$f$checkPrecondition	I
/*      */     //   223	47	10	value$iv	Z
/*      */     //   45	230	7	address	I
/*      */     //   56	219	8	dataAnchor	I
/*      */     //   68	207	9	dataIndex	I
/*      */     //   24	257	5	index	I
/*      */     //   2	280	1	previousDataIndex	I
/*      */     //   7	275	2	owner	I
/*      */     //   9	273	3	ownerFound	Z
/*      */     //   21	261	4	slotsSize	I
/*      */     //   0	282	0	this	Landroidx/compose/runtime/SlotWriter; }
/*      */   public final void verifyParentAnchors$runtime() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield groupGapStart : I
/*      */     //   4: istore_1
/*      */     //   5: aload_0
/*      */     //   6: getfield groupGapLen : I
/*      */     //   9: istore_2
/*      */     //   10: aload_0
/*      */     //   11: invokespecial getCapacity : ()I
/*      */     //   14: istore_3
/*      */     //   15: iconst_0
/*      */     //   16: istore #4
/*      */     //   18: iload #4
/*      */     //   20: iload_1
/*      */     //   21: if_icmpge -> 92
/*      */     //   24: aload_0
/*      */     //   25: getfield groups : [I
/*      */     //   28: iload #4
/*      */     //   30: invokestatic access$parentAnchor : ([II)I
/*      */     //   33: istore #5
/*      */     //   35: iload #5
/*      */     //   37: bipush #-2
/*      */     //   39: if_icmple -> 46
/*      */     //   42: iconst_1
/*      */     //   43: goto -> 47
/*      */     //   46: iconst_0
/*      */     //   47: istore #6
/*      */     //   49: iconst_0
/*      */     //   50: istore #7
/*      */     //   52: nop
/*      */     //   53: iload #6
/*      */     //   55: ifne -> 85
/*      */     //   58: iconst_0
/*      */     //   59: istore #8
/*      */     //   61: new java/lang/StringBuilder
/*      */     //   64: dup
/*      */     //   65: invokespecial <init> : ()V
/*      */     //   68: ldc_w 'Expected a start relative anchor at '
/*      */     //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   74: iload #4
/*      */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   79: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   82: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   85: nop
/*      */     //   86: iinc #4, 1
/*      */     //   89: goto -> 18
/*      */     //   92: iload_1
/*      */     //   93: iload_2
/*      */     //   94: iadd
/*      */     //   95: istore #4
/*      */     //   97: iload #4
/*      */     //   99: iload_3
/*      */     //   100: if_icmpge -> 239
/*      */     //   103: aload_0
/*      */     //   104: getfield groups : [I
/*      */     //   107: iload #4
/*      */     //   109: invokestatic access$parentAnchor : ([II)I
/*      */     //   112: istore #5
/*      */     //   114: aload_0
/*      */     //   115: iload #5
/*      */     //   117: invokespecial parentAnchorToIndex : (I)I
/*      */     //   120: istore #6
/*      */     //   122: iload #6
/*      */     //   124: iload_1
/*      */     //   125: if_icmpge -> 182
/*      */     //   128: iload #5
/*      */     //   130: bipush #-2
/*      */     //   132: if_icmple -> 139
/*      */     //   135: iconst_1
/*      */     //   136: goto -> 140
/*      */     //   139: iconst_0
/*      */     //   140: istore #7
/*      */     //   142: iconst_0
/*      */     //   143: istore #8
/*      */     //   145: nop
/*      */     //   146: iload #7
/*      */     //   148: ifne -> 178
/*      */     //   151: iconst_0
/*      */     //   152: istore #9
/*      */     //   154: new java/lang/StringBuilder
/*      */     //   157: dup
/*      */     //   158: invokespecial <init> : ()V
/*      */     //   161: ldc_w 'Expected a start relative anchor at '
/*      */     //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   167: iload #4
/*      */     //   169: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   172: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   175: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   178: nop
/*      */     //   179: goto -> 233
/*      */     //   182: iload #5
/*      */     //   184: bipush #-2
/*      */     //   186: if_icmpgt -> 193
/*      */     //   189: iconst_1
/*      */     //   190: goto -> 194
/*      */     //   193: iconst_0
/*      */     //   194: istore #7
/*      */     //   196: iconst_0
/*      */     //   197: istore #8
/*      */     //   199: nop
/*      */     //   200: iload #7
/*      */     //   202: ifne -> 232
/*      */     //   205: iconst_0
/*      */     //   206: istore #9
/*      */     //   208: new java/lang/StringBuilder
/*      */     //   211: dup
/*      */     //   212: invokespecial <init> : ()V
/*      */     //   215: ldc_w 'Expected an end relative anchor at '
/*      */     //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   221: iload #4
/*      */     //   223: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*      */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   229: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   232: nop
/*      */     //   233: iinc #4, 1
/*      */     //   236: goto -> 97
/*      */     //   239: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3423	-> 0
/*      */     //   #3424	-> 5
/*      */     //   #3425	-> 10
/*      */     //   #3426	-> 15
/*      */     //   #3427	-> 24
/*      */     //   #3428	-> 35
/*      */     //   #4422	-> 52
/*      */     //   #4425	-> 53
/*      */     //   #4426	-> 58
/*      */     //   #3429	-> 61
/*      */     //   #4426	-> 82
/*      */     //   #4428	-> 85
/*      */     //   #3426	-> 86
/*      */     //   #3432	-> 92
/*      */     //   #3433	-> 103
/*      */     //   #3434	-> 114
/*      */     //   #3435	-> 122
/*      */     //   #3436	-> 128
/*      */     //   #4429	-> 145
/*      */     //   #4432	-> 146
/*      */     //   #4433	-> 151
/*      */     //   #3437	-> 154
/*      */     //   #4433	-> 175
/*      */     //   #4435	-> 178
/*      */     //   #3440	-> 182
/*      */     //   #4436	-> 199
/*      */     //   #4439	-> 200
/*      */     //   #4440	-> 205
/*      */     //   #3441	-> 208
/*      */     //   #4440	-> 229
/*      */     //   #4442	-> 232
/*      */     //   #3432	-> 233
/*      */     //   #3445	-> 239
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   61	21	8	$i$a$-checkPrecondition-SlotWriter$verifyParentAnchors$1	I
/*      */     //   52	34	7	$i$f$checkPrecondition	I
/*      */     //   49	37	6	value$iv	Z
/*      */     //   35	51	5	parentAnchor	I
/*      */     //   18	74	4	groupAddress	I
/*      */     //   154	21	9	$i$a$-checkPrecondition-SlotWriter$verifyParentAnchors$2	I
/*      */     //   145	34	8	$i$f$checkPrecondition	I
/*      */     //   142	37	7	value$iv	Z
/*      */     //   208	21	9	$i$a$-checkPrecondition-SlotWriter$verifyParentAnchors$3	I
/*      */     //   199	34	8	$i$f$checkPrecondition	I
/*      */     //   196	37	7	value$iv	Z
/*      */     //   114	119	5	parentAnchor	I
/*      */     //   122	111	6	parentIndex	I
/*      */     //   97	142	4	groupAddress	I
/*      */     //   5	235	1	gapStart	I
/*      */     //   10	230	2	gapLen	I
/*      */     //   15	225	3	capacity	I
/*      */     //   0	240	0	this	Landroidx/compose/runtime/SlotWriter; }
/*      */   public final int getSize$runtime() { return getCapacity() - this.groupGapLen; }
/*      */   private final int getCapacity() { return this.groups.length / 5; }
/*      */   private final int groupIndexToAddress(int index) { return (index < this.groupGapStart) ? index : (index + this.groupGapLen); }
/*      */   private final int dataIndexToDataAddress(int dataIndex) { return (dataIndex < this.slotsGapStart) ? dataIndex : (dataIndex + this.slotsGapLen); }
/*      */   private final int parent(int[] $this$parent, int index) { return parentAnchorToIndex(SlotTableKt.access$parentAnchor($this$parent, groupIndexToAddress(index))); }
/*      */   private final int dataIndex(int index) { return dataIndex(this.groups, groupIndexToAddress(index)); }
/*      */   private final int dataIndex(int[] $this$dataIndex, int address) { return (address >= getCapacity()) ? (this.slots.length - this.slotsGapLen) : dataAnchorToDataIndex(SlotTableKt.access$dataAnchor($this$dataIndex, address), this.slotsGapLen, this.slots.length); }
/*      */   private final int slotIndex(int[] $this$slotIndex, int address) { return (address >= getCapacity()) ? (this.slots.length - this.slotsGapLen) : dataAnchorToDataIndex(SlotTableKt.access$slotAnchor($this$slotIndex, address), this.slotsGapLen, this.slots.length); }
/*      */   private final void updateDataIndex(int[] $this$updateDataIndex, int address, int dataIndex) { SlotTableKt.access$updateDataAnchor($this$updateDataIndex, address, dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length)); }
/*      */   private final int nodeIndex(int[] $this$nodeIndex, int address) { return dataIndex($this$nodeIndex, address); }
/*      */   private final int auxIndex(int[] $this$auxIndex, int address) { return dataIndex($this$auxIndex, address) + SlotTableKt.access$countOneBits(SlotTableKt.access$groupInfo($this$auxIndex, address) >> 29); }
/*      */   private final List<Integer> dataIndexes(int[] $this$dataIndexes) { List it = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
/*      */     int $i$a$-let-SlotWriter$dataIndexes$1 = 0;
/*      */     List list1 = CollectionsKt.plus(CollectionsKt.slice(it, RangesKt.until(0, this.groupGapStart)), CollectionsKt.slice(it, RangesKt.until(this.groupGapStart + this.groupGapLen, $this$dataIndexes.length / 5)));
/*      */     int $i$f$fastMap = 0;
/* 4444 */     ArrayList<Integer> target$iv = new ArrayList(list1.size());
/* 4445 */     List $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*      */     
/* 4447 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 4448 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 4449 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 4450 */       int j = ((Number)it$iv).intValue(); ArrayList<Integer> arrayList = target$iv; int $i$a$-fastMap-SlotWriter$dataIndexes$2 = 0; arrayList.add(Integer.valueOf(dataAnchorToDataIndex(j, this.slotsGapLen, this.slots.length)));
/*      */     } 
/*      */     
/* 4453 */     return target$iv; }
/*      */ 
/*      */   
/*      */   private final List<Integer> keys() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield groups : [I
/*      */     //   4: iconst_0
/*      */     //   5: iconst_1
/*      */     //   6: aconst_null
/*      */     //   7: invokestatic keys$default : ([IIILjava/lang/Object;)Ljava/util/List;
/*      */     //   10: astore_1
/*      */     //   11: iconst_0
/*      */     //   12: istore_2
/*      */     //   13: nop
/*      */     //   14: new java/util/ArrayList
/*      */     //   17: dup
/*      */     //   18: aload_1
/*      */     //   19: invokeinterface size : ()I
/*      */     //   24: invokespecial <init> : (I)V
/*      */     //   27: astore_3
/*      */     //   28: aload_1
/*      */     //   29: astore #4
/*      */     //   31: iconst_0
/*      */     //   32: istore #5
/*      */     //   34: nop
/*      */     //   35: iconst_0
/*      */     //   36: istore #6
/*      */     //   38: aload #4
/*      */     //   40: invokeinterface size : ()I
/*      */     //   45: istore #7
/*      */     //   47: iload #6
/*      */     //   49: iload #7
/*      */     //   51: if_icmpge -> 143
/*      */     //   54: aload #4
/*      */     //   56: iload #6
/*      */     //   58: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   63: astore #8
/*      */     //   65: iload #6
/*      */     //   67: aload #8
/*      */     //   69: astore #9
/*      */     //   71: istore #10
/*      */     //   73: iconst_0
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: aload #9
/*      */     //   80: checkcast java/lang/Number
/*      */     //   83: invokevirtual intValue : ()I
/*      */     //   86: pop
/*      */     //   87: istore #12
/*      */     //   89: iconst_0
/*      */     //   90: istore #13
/*      */     //   92: iload #12
/*      */     //   94: aload_0
/*      */     //   95: getfield groupGapStart : I
/*      */     //   98: if_icmplt -> 115
/*      */     //   101: iload #12
/*      */     //   103: aload_0
/*      */     //   104: getfield groupGapStart : I
/*      */     //   107: aload_0
/*      */     //   108: getfield groupGapLen : I
/*      */     //   111: iadd
/*      */     //   112: if_icmplt -> 119
/*      */     //   115: iconst_1
/*      */     //   116: goto -> 120
/*      */     //   119: iconst_0
/*      */     //   120: ifeq -> 135
/*      */     //   123: aload_3
/*      */     //   124: checkcast java/util/Collection
/*      */     //   127: aload #9
/*      */     //   129: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   134: pop
/*      */     //   135: nop
/*      */     //   136: nop
/*      */     //   137: iinc #6, 1
/*      */     //   140: goto -> 47
/*      */     //   143: nop
/*      */     //   144: aload_3
/*      */     //   145: checkcast java/util/List
/*      */     //   148: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3487	-> 0
/*      */     //   #4454	-> 13
/*      */     //   #4455	-> 14
/*      */     //   #4456	-> 28
/*      */     //   #4457	-> 34
/*      */     //   #4458	-> 35
/*      */     //   #4459	-> 54
/*      */     //   #4460	-> 65
/*      */     //   #4461	-> 76
/*      */     //   #3488	-> 92
/*      */     //   #4461	-> 120
/*      */     //   #4462	-> 135
/*      */     //   #4460	-> 136
/*      */     //   #4458	-> 137
/*      */     //   #4463	-> 143
/*      */     //   #4464	-> 144
/*      */     //   #3489	-> 148
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   92	28	13	$i$a$-fastFilterIndexed-SlotWriter$keys$1	I
/*      */     //   89	31	12	index	I
/*      */     //   76	60	11	$i$a$-fastForEachIndexed-ListUtilsKt$fastFilterIndexed$2$iv	I
/*      */     //   73	63	10	index$iv	I
/*      */     //   73	63	9	e$iv	Ljava/lang/Object;
/*      */     //   65	72	8	item$iv$iv	Ljava/lang/Object;
/*      */     //   38	105	6	index$iv$iv	I
/*      */     //   34	110	5	$i$f$fastForEachIndexed	I
/*      */     //   31	113	4	$this$fastForEachIndexed$iv$iv	Ljava/util/List;
/*      */     //   13	135	2	$i$f$fastFilterIndexed	I
/*      */     //   28	120	3	target$iv	Ljava/util/ArrayList;
/*      */     //   11	137	1	$this$fastFilterIndexed$iv	Ljava/util/List;
/*      */     //   0	149	0	this	Landroidx/compose/runtime/SlotWriter;
/*      */   }
/*      */   
/*      */   private final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
/*      */     return (index > gapStart) ? -(capacity - gapLen - index + 1) : index;
/*      */   }
/*      */   
/*      */   private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
/*      */     return (anchor < 0) ? (capacity - gapLen + anchor + 1) : anchor;
/*      */   }
/*      */   
/*      */   private final int parentIndexToAnchor(int index, int gapStart) {
/*      */     return (index < gapStart) ? index : -(getSize$runtime() - index - -2);
/*      */   }
/*      */   
/*      */   private final int parentAnchorToIndex(int index) {
/*      */     return (index > -2) ? index : (getSize$runtime() + index - -2);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SlotWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */