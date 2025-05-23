/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.collection.MutableIntIntMap;
/*      */ import androidx.compose.runtime.changelist.ChangeList;
/*      */ import androidx.compose.runtime.changelist.ComposerChangeListWriter;
/*      */ import androidx.compose.runtime.changelist.FixupList;
/*      */ import androidx.compose.runtime.collection.IntMap;
/*      */ import androidx.compose.runtime.collection.ScopeMap;
/*      */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*      */ import androidx.compose.runtime.internal.IntRef;
/*      */ import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.runtime.tooling.CompositionData;
/*      */ import androidx.compose.runtime.tooling.InspectionTablesKt;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedHashSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.CoroutineContext;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.TypeIntrinsics;
/*      */ import kotlin.reflect.KProperty;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.annotations.TestOnly;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000ñ\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020#\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\013\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\002\b\005\n\002\020\025\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\000\n\002\b\t\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\005\n\002\020\f\n\002\020\006\n\002\020\007\n\002\020\t\n\002\020\n\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\033\n\002\030\002\n\002\b\016\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\030\002\n\002\b2\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b**\001A\b\000\030\0002\0020\001:\004Ø\002Ù\002BG\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\f\022\006\020\016\032\0020\017¢\006\002\020\020J\n\020\001\032\0030\001H\002J\n\020\001\032\0030\001H\002JM\020\001\032\0030\001\"\005\b\000\020\001\"\005\b\001\020\0012\b\020\001\032\003H\0012#\020\001\032\036\022\005\022\003H\001\022\005\022\003H\001\022\005\022\0030\0010\001¢\006\003\b\001H\026¢\006\003\020\001J\t\020\001\032\0020\005H\026J5\020\001\032\003H\001\"\005\b\000\020\0012\007\020\001\032\0020\0302\017\020\001\032\n\022\005\022\003H\0010\001H\bø\001\000¢\006\003\020\001J\024\020\001\032\0020\0302\t\020\001\032\004\030\0010~H\027J\022\020\001\032\0020\0302\007\020\001\032\0020\030H\027J\023\020\001\032\0020\0302\b\020\001\032\0030\001H\027J\023\020\001\032\0020\0302\b\020\001\032\0030\001H\027J\023\020\001\032\0020\0302\b\020\001\032\0030 \001H\027J\023\020\001\032\0020\0302\b\020\001\032\0030¡\001H\027J\022\020\001\032\0020\0302\007\020\001\032\0020\034H\027J\023\020\001\032\0020\0302\b\020\001\032\0030¢\001H\027J\023\020\001\032\0020\0302\b\020\001\032\0030£\001H\027J\024\020¤\001\032\0020\0302\t\020\001\032\004\030\0010~H\027J\020\020¥\001\032\0030\001H\000¢\006\003\b¦\001J\n\020§\001\032\0030\001H\002J\n\020¨\001\032\0030\001H\002J\n\020©\001\032\0030\001H\026J@\020ª\001\032\0030\0012\024\020«\001\032\017\022\004\022\00205\022\004\022\0020~0¬\0012\025\020­\001\032\020\022\005\022\0030\0010\001¢\006\003\b®\001H\000¢\006\006\b¯\001\020°\001J,\020±\001\032\0020\0342\007\020²\001\032\0020\0342\006\020r\032\0020\0342\007\020³\001\032\0020\0342\007\020´\001\032\0020\034H\002J(\020µ\001\032\003H\001\"\005\b\000\020\0012\017\020¶\001\032\n\022\005\022\003H\0010·\001H\027¢\006\003\020¸\001J\n\020¹\001\032\0030\001H\002J\"\020º\001\032\0030\001\"\005\b\000\020\0012\017\020»\001\032\n\022\005\022\003H\0010\001H\026J\t\020¼\001\032\0020hH\002J\022\020¼\001\032\0020h2\007\020²\001\032\0020\034H\002J\020\020½\001\032\0030\001H\000¢\006\003\b¾\001J\023\020¿\001\032\0030\0012\007\020\001\032\0020\030H\027J\n\020À\001\032\0030\001H\026J\n\020Á\001\032\0030\001H\026J\020\020Â\001\032\0030\001H\000¢\006\003\bÃ\001J?\020Ä\001\032\0030\0012\024\020«\001\032\017\022\004\022\00205\022\004\022\0020~0¬\0012\027\020­\001\032\022\022\005\022\0030\001\030\0010\001¢\006\003\b®\001H\002¢\006\003\020°\001J\034\020Å\001\032\0030\0012\007\020²\001\032\0020\0342\007\020Æ\001\032\0020\034H\002J\n\020Ç\001\032\0030\001H\026J\023\020È\001\032\0030\0012\007\020É\001\032\0020\030H\002J\n\020Ê\001\032\0030\001H\027J\n\020Ë\001\032\0030\001H\002J\n\020Ì\001\032\0030\001H\027J\n\020Í\001\032\0030\001H\026J\n\020Î\001\032\0030\001H\027J\n\020Ï\001\032\0030\001H\027J\n\020Ð\001\032\0030\001H\027J\n\020Ñ\001\032\0030\001H\027J\f\020Ò\001\032\005\030\0010Ó\001H\027J\n\020Ô\001\032\0030\001H\026J\b\020Õ\001\032\0030\001J\n\020Ö\001\032\0030\001H\002J\023\020×\001\032\0030\0012\007\020Ø\001\032\0020\034H\026J\n\020Ù\001\032\0030\001H\002J\036\020Ú\001\032\0030\0012\007\020É\001\032\0020\0302\t\020Û\001\032\004\030\0010kH\002J\033\020Ü\001\032\0030\0012\007\020Ý\001\032\0020\0342\006\020U\032\0020\030H\002J\n\020Þ\001\032\0030\001H\002J\n\020ß\001\032\0030\001H\002J\016\020E\032\0020\030H\000¢\006\003\bà\001J#\020á\001\032\0030\0012\f\020\001\032\007\022\002\b\0030â\0012\t\020ã\001\032\004\030\0010~H\027J+\020ä\001\032\0030\0012\037\020å\001\032\032\022\025\022\023\022\005\022\0030è\001\022\007\022\005\030\0010è\0010ç\0010æ\001H\002J+\020é\001\032\0030\0012\037\020å\001\032\032\022\025\022\023\022\005\022\0030è\001\022\007\022\005\030\0010è\0010ç\0010æ\001H\027J\022\020ê\001\032\0020\0342\007\020ë\001\032\0020\034H\002J9\020ì\001\032\0030\0012\020\020­\001\032\013\022\006\022\004\030\0010~0â\0012\007\020í\001\032\0020h2\t\020ã\001\032\004\030\0010~2\007\020î\001\032\0020\030H\002J\037\020ï\001\032\0020~2\t\020ð\001\032\004\030\0010~2\t\020ñ\001\032\004\030\0010~H\027J\013\020ò\001\032\004\030\0010~H\001J\013\020ó\001\032\004\030\0010~H\001J-\020ô\001\032\0020\0342\007\020õ\001\032\0020\0342\007\020²\001\032\0020\0342\007\020³\001\032\0020\0342\007\020ö\001\032\0020\034H\002J\017\020÷\001\032\0020\034H\001¢\006\003\bø\001J!\020ù\001\032\0030\0012\017\020\001\032\n\022\005\022\0030\0010\001H\000¢\006\003\bú\001J\022\020û\001\032\0020\0342\007\020²\001\032\0020\034H\002J%\020ü\001\032\0020\0302\024\020«\001\032\017\022\004\022\00205\022\004\022\0020~0¬\001H\000¢\006\003\bý\001Jo\020þ\001\032\003Hÿ\001\"\005\b\000\020ÿ\0012\013\b\002\020\002\032\004\030\0010\0172\013\b\002\020\002\032\004\030\0010\0172\013\b\002\020ë\001\032\004\030\0010\0342\036\b\002\020Z\032\030\022\023\022\021\022\004\022\00205\022\006\022\004\030\0010~0ç\0010æ\0012\017\020\001\032\n\022\005\022\003Hÿ\0010\001H\002¢\006\003\020\002J\n\020\002\032\0030\001H\002J\n\020\002\032\0030\001H\002J\023\020\002\032\0030\0012\007\020\002\032\0020MH\002J\023\020\002\032\0030\0012\007\020\002\032\0020hH\002J\033\020\002\032\0030\0012\017\020\002\032\n\022\005\022\0030\0010\001H\026J%\020\002\032\0030\0012\007\020\002\032\0020\0342\007\020\002\032\0020\0342\007\020\002\032\0020\034H\002J\023\020\002\032\0030\0012\007\020\002\032\0020zH\026J\013\020\002\032\004\030\0010MH\002J\013\020\002\032\004\030\0010~H\026J\n\020\002\032\0030\001H\002J\023\020\002\032\0030\0012\007\020\002\032\0020\034H\002J\n\020\002\032\0030\001H\027J\n\020\002\032\0030\001H\002J\n\020\002\032\0030\001H\002J\n\020\002\032\0030\001H\027J\024\020\002\032\0030\0012\b\020\002\032\0030\002H\027J\n\020\002\032\0030\001H\027J\035\020\002\032\0030\0012\007\020¶\001\032\0020\0342\b\020\002\032\0030\002H\027J\017\020\002\032\0020\034H\000¢\006\003\b\002J?\020 \002\032\0030\0012\007\020¶\001\032\0020\0342\t\020¡\002\032\004\030\0010~2\b\020¢\002\032\0030£\0022\t\020¤\002\032\004\030\0010~H\002ø\001\001¢\006\006\b¥\002\020¦\002J\n\020§\002\032\0030\001H\027J\023\020¨\002\032\0030\0012\007\020¶\001\032\0020\034H\002J\036\020¨\002\032\0030\0012\007\020¶\001\032\0020\0342\t\020©\002\032\004\030\0010~H\002J\036\020ª\002\032\0030\0012\007\020¶\001\032\0020\0342\t\020©\002\032\004\030\0010~H\027J\n\020«\002\032\0030\001H\026J\030\020¬\002\032\0030\0012\f\020\001\032\007\022\002\b\0030­\002H\027J'\020®\002\032\0030\0012\025\020¯\002\032\020\022\013\b\001\022\007\022\002\b\0030­\0020°\002H\027¢\006\003\020±\002J\036\020²\002\032\0030\0012\007\020É\001\032\0020\0302\t\020¤\002\032\004\030\0010~H\002J\023\020³\002\032\0030\0012\007\020¶\001\032\0020\034H\027J\023\020´\002\032\0030\0012\007\020¶\001\032\0020\034H\027J\022\020µ\002\032\0020\0012\007\020¶\001\032\0020\034H\027J\036\020¶\002\032\0030\0012\007\020¶\001\032\0020\0342\t\020©\002\032\004\030\0010~H\026J\n\020·\002\032\0030\001H\026J\b\020¸\002\032\0030\001J\n\020¹\002\032\0030\001H\002J#\020º\002\032\0020\0302\007\020\002\032\002052\t\020»\002\032\004\030\0010~H\000¢\006\003\b¼\002J\025\020½\002\032\0030\0012\t\020\001\032\004\030\0010~H\001J2\020¾\002\032\0030\0012\007\020¿\002\032\0020\0342\006\020r\032\0020\0342\t\020©\002\032\004\030\0010~2\t\020¤\002\032\004\030\0010~H\bJ\034\020À\002\032\0030\0012\007\020Á\002\032\0020\0342\006\020r\032\0020\034H\bJ2\020Â\002\032\0030\0012\007\020¿\002\032\0020\0342\006\020r\032\0020\0342\t\020©\002\032\004\030\0010~2\t\020¤\002\032\004\030\0010~H\bJ\034\020Ã\002\032\0030\0012\007\020¿\002\032\0020\0342\006\020r\032\0020\034H\bJ\034\020Ä\002\032\0030\0012\007\020²\001\032\0020\0342\007\020Å\002\032\0020\034H\002J\034\020Æ\002\032\0030\0012\007\020²\001\032\0020\0342\007\020Ç\002\032\0020\034H\002J\033\020È\002\032\0020h2\007\020É\002\032\0020h2\007\020Ê\002\032\0020hH\002J\025\020Ë\002\032\0030\0012\t\020\001\032\004\030\0010~H\026J\025\020Ì\002\032\0030\0012\t\020\001\032\004\030\0010~H\002J\025\020Í\002\032\0030\0012\t\020\001\032\004\030\0010~H\001J\022\020Î\002\032\0020\0342\007\020²\001\032\0020\034H\002J\n\020Ï\002\032\0030\001H\026J\n\020Ð\002\032\0030\001H\002J\n\020Ñ\002\032\0030\001H\002J\020\020Ò\002\032\0030\001H\000¢\006\003\bÓ\002J1\020Ô\002\032\003Hÿ\001\"\005\b\000\020ÿ\0012\006\020s\032\0020t2\017\020\001\032\n\022\005\022\003Hÿ\0010\001H\b¢\006\003\020Õ\002J\026\020Ö\002\032\0020\034*\0020t2\007\020²\001\032\0020\034H\002J\030\020×\002\032\004\030\0010~*\0020t2\007\020ë\001\032\0020\034H\002R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\0020\0248WX\004¢\006\006\032\004\b\025\020\026R\024\020\027\032\0020\0308@X\004¢\006\006\032\004\b\031\020\032R\024\020\033\032\0020\0348@X\004¢\006\006\032\004\b\035\020\036R\016\020\037\032\0020 X\004¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000R\016\020!\032\0020\034X\016¢\006\002\n\000R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\"\020#R\024\020$\032\0020%8VX\004¢\006\006\032\004\b&\020'R\016\020(\032\0020\034X\016¢\006\002\n\000R&\020*\032\0020\0342\006\020)\032\0020\0348\026@RX\016¢\006\016\n\000\022\004\b+\020,\032\004\b-\020\036R\024\020.\032\0020/8VX\004¢\006\006\032\004\b0\0201R\024\0202\032\0020\0348VX\004¢\006\006\032\004\b3\020\036R\026\0204\032\004\030\001058@X\004¢\006\006\032\004\b6\0207R\032\0208\032\0020\0308VX\004¢\006\f\022\004\b9\020,\032\004\b:\020\032R\034\020;\032\004\030\0010\fX\016¢\006\016\n\000\032\004\b<\020=\"\004\b>\020?R\020\020@\032\0020AX\004¢\006\004\n\002\020BR\016\020C\032\0020DX\004¢\006\002\n\000R\016\020E\032\0020\030X\016¢\006\002\n\000R\016\020F\032\0020\030X\016¢\006\002\n\000R\016\020G\032\0020\034X\016¢\006\002\n\000R\021\020H\032\0020\0308F¢\006\006\032\004\bI\020\032R\024\020J\032\0020\0308@X\004¢\006\006\032\004\bK\020\032R\016\020L\032\0020MX\016¢\006\002\n\000R\016\020N\032\0020OX\016¢\006\002\n\000R\032\020P\032\0020\007X\016¢\006\016\n\000\032\004\bQ\020R\"\004\bS\020TR&\020U\032\0020\0302\006\020)\032\0020\0308\026@RX\016¢\006\016\n\000\022\004\bV\020,\032\004\bW\020\032R\024\020X\032\b\022\004\022\002050YX\004¢\006\002\n\000R\024\020Z\032\b\022\004\022\0020\\0[X\004¢\006\002\n\000R\036\020]\032\0020\0302\006\020)\032\0020\030@BX\016¢\006\b\n\000\032\004\b^\020\032R\036\020_\032\0020\0302\006\020)\032\0020\030@BX\016¢\006\b\n\000\032\004\b`\020\032R\016\020\r\032\0020\fX\016¢\006\002\n\000R\020\020a\032\004\030\0010bX\016¢\006\002\n\000R\020\020c\032\004\030\0010dX\016¢\006\002\n\000R\016\020e\032\0020\030X\016¢\006\002\n\000R\016\020f\032\0020\034X\016¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020g\032\0020hX\016¢\006\002\n\000R\016\020i\032\0020DX\004¢\006\002\n\000R\020\020j\032\004\030\0010kX\016¢\006\002\n\000R\026\020l\032\n\022\006\022\004\030\0010k0YX\004¢\006\002\n\000R\020\020m\032\004\030\0010hX\016¢\006\002\n\000R\026\020n\032\n\022\004\022\0020h\030\0010oX\016¢\006\002\n\000R\016\020p\032\0020\030X\016¢\006\002\n\000R\016\020q\032\0020DX\004¢\006\002\n\000R\016\020r\032\0020\034X\016¢\006\002\n\000R\032\020s\032\0020tX\016¢\006\016\n\000\032\004\bu\020v\"\004\bw\020xR\026\020y\032\004\030\0010z8VX\004¢\006\006\032\004\b{\020|R\027\020}\032\004\030\0010~8VX\004¢\006\007\032\005\b\020\001R\017\020\001\032\0020\030X\016¢\006\002\n\000R\017\020\001\032\0020\034X\016¢\006\002\n\000R\035\020\001\032\0020\0308VX\004¢\006\016\022\005\b\001\020,\032\005\b\001\020\032R\016\020\006\032\0020\007X\004¢\006\002\n\000R\017\020\001\032\0020\030X\016¢\006\002\n\000R\020\020\001\032\0030\001X\016¢\006\002\n\000R\017\020\001\032\0020\030X\016¢\006\002\n\000R\035\020\001\032\004\030\0010~*\0020t8BX\004¢\006\b\032\006\b\001\020\001\002\016\n\005\b20\001\n\005\b¡\0360\001¨\006Ú\002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime", "()Z", "changeCount", "", "getChangeCount$runtime", "()I", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "deferredChanges", "getDeferredChanges$runtime", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "derivedStateObserver", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "insertTable", "getInsertTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime", "(Landroidx/compose/runtime/SlotTable;)V", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "Landroidx/compose/runtime/Stack;", "invalidations", "", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime", "isDisposed", "isDisposed$runtime", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "nodeExpected", "nodeIndex", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentStateStack", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "providerCache", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "rGroupIndex", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime", "(Landroidx/compose/runtime/SlotReader;)V", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "sourceMarkersEnabled", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "", "addRecomposeScope", "apply", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changedInstance", "changesApplied", "changesApplied$runtime", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/ScopeMap;", "content", "Landroidx/compose/runtime/Composable;", "composeContent$runtime", "(Landroidx/compose/runtime/collection/ScopeMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "deactivate", "deactivate$runtime", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "dispose", "dispose$runtime", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProvider", "endProviders", "endReplaceGroup", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endReuseFromRoot", "endRoot", "endToMarker", "marker", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceFreshInsertTable", "forceRecomposeScopes$runtime", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentGuarded", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "insertedGroupVirtualIndex", "index", "invokeMovableContentLambda", "locals", "force", "joinKey", "left", "right", "nextSlot", "nextSlotForCache", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime", "prepareCompose", "prepareCompose$runtime", "rGroupIndexOf", "recompose", "recompose$runtime", "recomposeMovableContent", "R", "from", "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "recordDelete", "recordInsert", "anchor", "recordProviderUpdate", "providers", "recordSideEffect", "effect", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "rememberObserverAnchor", "rememberedValue", "reportAllMovableContent", "reportFreeMovableContent", "groupBeingRemoved", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "stacksSize", "stacksSize$runtime", "start", "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "data", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startReuseFromRoot", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "count", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateSlot", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "verifyConsistent", "verifyConsistent$runtime", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 11 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 12 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 14 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 15 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 16 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4584:1\n3960#1,3:4594\n3973#1:4597\n3974#1:4599\n3964#1,11:4600\n3960#1,3:4638\n3973#1:4641\n3974#1:4643\n3964#1,11:4644\n3983#1,3:4657\n3996#1:4660\n3997#1:4662\n3987#1,11:4663\n3983#1,3:4674\n3996#1:4677\n3997#1:4679\n3987#1,11:4680\n3960#1,3:4692\n3973#1:4695\n3974#1:4697\n3964#1,11:4698\n3983#1,3:4709\n3996#1:4712\n3997#1:4714\n3987#1,11:4715\n3446#1,8:4760\n3455#1,3:4783\n3973#1:4902\n3974#1:4904\n3973#1:4905\n3974#1:4907\n3973#1:4908\n3974#1:4910\n3973#1:4911\n3974#1:4913\n3996#1:4915\n3997#1:4917\n3996#1:4918\n3997#1:4920\n3996#1:4921\n3997#1:4923\n3996#1:4924\n3997#1:4926\n1#2:4585\n161#3,8:4586\n161#3,8:4748\n161#3,4:4756\n166#3,3:4786\n161#3,4:4880\n166#3,3:4892\n26#4:4598\n26#4:4642\n22#4:4661\n22#4:4678\n26#4:4691\n26#4:4696\n22#4:4713\n26#4:4903\n26#4:4906\n26#4:4909\n26#4:4912\n26#4:4914\n22#4:4916\n22#4:4919\n22#4:4922\n22#4:4925\n22#4:4927\n46#5,5:4611\n46#5,3:4827\n50#5:4865\n4553#6,7:4616\n4553#6,7:4623\n4553#6,7:4726\n4553#6,7:4733\n4553#6,7:4799\n4553#6,7:4806\n4553#6,7:4813\n4553#6,7:4820\n4553#6,7:4866\n4553#6,7:4873\n4553#6,7:4895\n33#7,7:4630\n82#8:4637\n4470#9:4655\n4471#9:4656\n182#10,4:4740\n182#10,4:4768\n192#10,8:4772\n187#10,3:4780\n187#10,3:4790\n182#10,8:4884\n33#11,4:4744\n38#11:4789\n33#11,6:4793\n82#11,3:4928\n33#11,4:4931\n85#11,2:4935\n38#11:4937\n87#11:4938\n391#12,4:4830\n363#12,6:4834\n373#12,3:4841\n376#12,2:4845\n396#12,2:4847\n379#12,6:4849\n398#12:4855\n1810#13:4840\n1672#13:4844\n393#14,6:4856\n399#14,2:4863\n48#15:4862\n1855#16,2:4939\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1495#1:4594,3\n1495#1:4597\n1495#1:4599\n1495#1:4600,11\n2457#1:4638,3\n2457#1:4641\n2457#1:4643\n2457#1:4644,11\n2604#1:4657,3\n2604#1:4660\n2604#1:4662\n2604#1:4663,11\n2612#1:4674,3\n2612#1:4677\n2612#1:4679\n2612#1:4680,11\n3114#1:4692,3\n3114#1:4695\n3114#1:4697\n3114#1:4698,11\n3118#1:4709,3\n3118#1:4712\n3118#1:4714\n3118#1:4715,11\n3409#1:4760,8\n3409#1:4783,3\n3962#1:4902\n3962#1:4904\n3964#1:4905\n3964#1:4907\n3966#1:4908\n3966#1:4910\n3968#1:4911\n3968#1:4913\n3985#1:4915\n3985#1:4917\n3987#1:4918\n3987#1:4920\n3989#1:4921\n3989#1:4923\n3991#1:4924\n3991#1:4926\n1430#1:4586,8\n3350#1:4748,8\n3408#1:4756,4\n3408#1:4786,3\n3773#1:4880,4\n3773#1:4892,3\n1495#1:4598\n2457#1:4642\n2604#1:4661\n2612#1:4678\n3058#1:4691\n3114#1:4696\n3118#1:4713\n3962#1:4903\n3964#1:4906\n3966#1:4909\n3968#1:4912\n3973#1:4914\n3985#1:4916\n3987#1:4919\n3989#1:4922\n3991#1:4925\n3996#1:4927\n1755#1:4611,5\n3563#1:4827,3\n3563#1:4865\n1828#1:4616,7\n1841#1:4623,7\n3132#1:4726,7\n3145#1:4733,7\n3521#1:4799,7\n3526#1:4806,7\n3542#1:4813,7\n3562#1:4820,7\n3628#1:4866,7\n3635#1:4873,7\n3785#1:4895,7\n1888#1:4630,7\n2258#1:4637\n2463#1:4655\n2487#1:4656\n3327#1:4740,4\n3414#1:4768,4\n3415#1:4772,8\n3414#1:4780,3\n3327#1:4790,3\n3775#1:4884,8\n3329#1:4744,4\n3329#1:4789\n3473#1:4793,6\n3684#1:4928,3\n3684#1:4931,4\n3684#1:4935,2\n3684#1:4937\n3684#1:4938\n3566#1:4830,4\n3566#1:4834,6\n3566#1:4841,3\n3566#1:4845,2\n3566#1:4847,2\n3566#1:4849,6\n3566#1:4855\n3566#1:4840\n3566#1:4844\n3592#1:4856,6\n3592#1:4863,2\n3592#1:4862\n3716#1:4939,2\n*E\n"})
/*      */ public final class ComposerImpl
/*      */   implements Composer
/*      */ {
/*      */   @NotNull
/*      */   private final Applier<?> applier;
/*      */   @NotNull
/*      */   private final CompositionContext parentContext;
/*      */   @NotNull
/*      */   private final SlotTable slotTable;
/*      */   @NotNull
/*      */   private final Set<RememberObserver> abandonSet;
/*      */   @NotNull
/*      */   private ChangeList changes;
/*      */   @NotNull
/*      */   private ChangeList lateChanges;
/*      */   @NotNull
/*      */   private final ControlledComposition composition;
/*      */   @NotNull
/*      */   private final Stack<Pending> pendingStack;
/*      */   @Nullable
/*      */   private Pending pending;
/*      */   private int nodeIndex;
/*      */   private int groupNodeCount;
/*      */   private int rGroupIndex;
/*      */   @NotNull
/*      */   private final IntStack parentStateStack;
/*      */   @Nullable
/*      */   private int[] nodeCountOverrides;
/*      */   @Nullable
/*      */   private MutableIntIntMap nodeCountVirtualOverrides;
/*      */   private boolean forceRecomposeScopes;
/*      */   private boolean forciblyRecompose;
/*      */   private boolean nodeExpected;
/*      */   @NotNull
/*      */   private final List<Invalidation> invalidations;
/*      */   @NotNull
/*      */   private final IntStack entersStack;
/*      */   @NotNull
/*      */   private PersistentCompositionLocalMap parentProvider;
/*      */   @Nullable
/*      */   private IntMap<PersistentCompositionLocalMap> providerUpdates;
/*      */   private boolean providersInvalid;
/*      */   @NotNull
/*      */   private final IntStack providersInvalidStack;
/*      */   private boolean reusing;
/*      */   private int reusingGroup;
/*      */   private int childrenComposing;
/*      */   private int compositionToken;
/*      */   private boolean sourceMarkersEnabled;
/*      */   @NotNull
/*      */   private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
/*      */   @NotNull
/*      */   private final Stack<RecomposeScopeImpl> invalidateStack;
/*      */   private boolean isComposing;
/*      */   private boolean isDisposed;
/*      */   @NotNull
/*      */   private SlotReader reader;
/*      */   @NotNull
/*      */   private SlotTable insertTable;
/*      */   @NotNull
/*      */   private SlotWriter writer;
/*      */   private boolean writerHasAProvider;
/*      */   @Nullable
/*      */   private PersistentCompositionLocalMap providerCache;
/*      */   @Nullable
/*      */   private ChangeList deferredChanges;
/*      */   @NotNull
/*      */   private final ComposerChangeListWriter changeListWriter;
/*      */   @NotNull
/*      */   private Anchor insertAnchor;
/*      */   @NotNull
/*      */   private FixupList insertFixups;
/*      */   private boolean inserting;
/*      */   private int compoundKeyHash;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext parentContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> abandonSet, @NotNull ChangeList changes, @NotNull ChangeList lateChanges, @NotNull ControlledComposition composition) {
/*      */     Anchor anchor;
/* 1350 */     this.applier = applier;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1355 */     this.parentContext = parentContext;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1360 */     this.slotTable = slotTable;
/*      */     
/* 1362 */     this.abandonSet = abandonSet;
/*      */     
/* 1364 */     this.changes = changes;
/*      */     
/* 1366 */     this.lateChanges = lateChanges;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1371 */     this.composition = composition;
/*      */     
/* 1373 */     this.pendingStack = new Stack<>();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1378 */     this.parentStateStack = new IntStack();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1384 */     this.invalidations = new ArrayList<>();
/* 1385 */     this.entersStack = new IntStack();
/*      */     
/* 1387 */     this.parentProvider = (PersistentCompositionLocalMap)PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
/*      */ 
/*      */     
/* 1390 */     this.providersInvalidStack = new IntStack();
/*      */     
/* 1392 */     this.reusingGroup = -1;
/*      */ 
/*      */     
/* 1395 */     this.sourceMarkersEnabled = (this.parentContext.getCollectingSourceInformation$runtime() || 
/* 1396 */       this.parentContext.getCollectingCallByInformation$runtime());
/* 1397 */     this.derivedStateObserver = new ComposerImpl$derivedStateObserver$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1407 */     this.invalidateStack = new Stack<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1417 */     SlotReader slotReader1 = this.slotTable.openReader(), slotReader2 = slotReader1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4585 */     ComposerImpl composerImpl = this; int $i$a$-also-ComposerImpl$reader$1 = 0; slotReader2.close(); composerImpl.reader = slotReader1; SlotTable slotTable2 = new SlotTable(), slotTable3 = slotTable2; composerImpl = this; int $i$a$-apply-ComposerImpl$insertTable$1 = 0; if (this.parentContext.getCollectingSourceInformation$runtime()) slotTable3.collectSourceInformation();  if (this.parentContext.getCollectingCallByInformation$runtime()) slotTable3.collectCalledByInformation();  composerImpl.insertTable = slotTable2; SlotWriter slotWriter1 = this.insertTable.openWriter(), slotWriter2 = slotWriter1; composerImpl = this; int $i$a$-also-ComposerImpl$writer$1 = 0; slotWriter2.close(true); composerImpl.writer = slotWriter1; this.changeListWriter = new ComposerChangeListWriter(this, this.changes); SlotTable slotTable1 = this.insertTable; composerImpl = this;
/*      */     int $i$f$read = 0;
/* 4587 */     SlotReader reader$iv = slotTable1.openReader(); int $i$a$-let-SlotTable$read$1$iv = 0;
/*      */     try {
/* 4589 */       SlotReader it = reader$iv; int $i$a$-read-ComposerImpl$insertAnchor$1 = 0; anchor = it.anchor(0);
/*      */     } finally {
/* 4591 */       reader$iv.close();
/*      */     } 
/* 4593 */     composerImpl.insertAnchor = anchor; this.insertFixups = new FixupList();
/*      */   } @NotNull public Applier<?> getApplier() { return this.applier; } @NotNull public ControlledComposition getComposition() { return this.composition; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H\026J\024\020\006\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H\026¨\006\007"}, d2 = {"androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/DerivedStateObserver;", "done", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "start", "runtime"}) public static final class ComposerImpl$derivedStateObserver$1 implements DerivedStateObserver {
/*      */     public void start(@NotNull DerivedState derivedState) { Intrinsics.checkNotNullParameter(derivedState, "derivedState"); ComposerImpl composerImpl = ComposerImpl.this; int i = composerImpl.childrenComposing; composerImpl.childrenComposing = i + 1; } public void done(@NotNull DerivedState derivedState) { Intrinsics.checkNotNullParameter(derivedState, "derivedState"); ComposerImpl composerImpl = ComposerImpl.this; int i = composerImpl.childrenComposing; composerImpl.childrenComposing = i + -1; } } public final boolean isComposing$runtime() { return this.isComposing; } public final boolean isDisposed$runtime() { return this.isDisposed; } public final boolean getAreChildrenComposing$runtime() { return (this.childrenComposing > 0); } public final boolean getHasPendingChanges$runtime() { return this.changes.isNotEmpty(); } @NotNull public final SlotReader getReader$runtime() { return this.reader; } public final void setReader$runtime(@NotNull SlotReader <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.reader = <set-?>; } @NotNull public final SlotTable getInsertTable$runtime() { return this.insertTable; } public final void setInsertTable$runtime(@NotNull SlotTable <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.insertTable = <set-?>; } @Nullable public final ChangeList getDeferredChanges$runtime() { return this.deferredChanges; }
/*      */   public final void setDeferredChanges$runtime(@Nullable ChangeList <set-?>) { this.deferredChanges = <set-?>; }
/*      */   @TestOnly @NotNull public CoroutineContext getApplyCoroutineContext() { return this.parentContext.getEffectCoroutineContext(); }
/*      */   @ComposeCompilerApi public void startReplaceableGroup(int key) { start-BaiHCIY(key, null, GroupKind.Companion.getGroup-ULZAiWs(), null); }
/*      */   @ComposeCompilerApi public void endReplaceableGroup() { endGroup(); }
/* 4600 */   @ComposeCompilerApi public void startReplaceGroup(int key) { Pending pending = this.pending; if (pending != null) { start-BaiHCIY(key, null, GroupKind.Companion.getGroup-ULZAiWs(), null); return; }  validateNodeNotExpected(); ComposerImpl composerImpl1 = this; int j = this.rGroupIndex; Object object = null; Object data$iv = null; int $i$f$updateCompoundKeyWhenWeEnterGroup = 0; ComposerImpl this_$iv$iv = composerImpl1; int $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4609 */     int k = this_$iv$iv.getCompoundKeyHash(), other$iv$iv$iv = 3, $i$f$rol = 0, $this$rol$iv$iv$iv = Integer.rotateLeft(k, other$iv$iv$iv) ^ key; other$iv$iv$iv = 3; $i$f$rol = 0; this_$iv$iv.compoundKeyHash = Integer.rotateLeft($this$rol$iv$iv$iv, other$iv$iv$iv) ^ j; int i = this.rGroupIndex; this.rGroupIndex = i + 1; SlotReader reader = this.reader; if (getInserting()) { reader.beginEmpty(); this.writer.startGroup(key, Composer.Companion.getEmpty()); enterGroup(false, null); return; }  int slotKey = reader.getGroupKey(); if (slotKey == key && !reader.getHasObjectKey()) { reader.startGroup(); enterGroup(false, null); return; }  if (!reader.isGroupEnd()) { int removeIndex = this.nodeIndex; int startSlot = reader.getCurrentGroup(); recordDelete(); int nodesToRemove = reader.skipGroup(); this.changeListWriter.removeNode(removeIndex, nodesToRemove); ComposerKt.access$removeRange(this.invalidations, startSlot, reader.getCurrentGroup()); }  reader.beginEmpty(); this.inserting = true; this.providerCache = null; ensureWriter(); SlotWriter writer = this.writer; writer.beginInsert(); int startIndex = writer.getCurrentGroup(); writer.startGroup(key, Composer.Companion.getEmpty()); this.insertAnchor = writer.anchor(startIndex); enterGroup(false, null); }
/*      */   @ComposeCompilerApi public void endReplaceGroup() { endGroup(); }
/*      */   @ComposeCompilerApi public void startDefaults() { start-BaiHCIY(-127, null, GroupKind.Companion.getGroup-ULZAiWs(), null); } @ComposeCompilerApi public void endDefaults() { endGroup(); RecomposeScopeImpl scope = getCurrentRecomposeScope$runtime(); if (scope != null && scope.getUsed()) scope.setDefaultsInScope(true);  } public boolean getDefaultsInvalid() { if (getSkipping() && !this.providersInvalid) { getCurrentRecomposeScope$runtime(); if ((getCurrentRecomposeScope$runtime() != null) ? ((getCurrentRecomposeScope$runtime().getDefaultsInvalid() == true)) : false); return false; }  } @ComposeCompilerApi public void startMovableGroup(int key, @Nullable Object dataKey) { start-BaiHCIY(key, dataKey, GroupKind.Companion.getGroup-ULZAiWs(), null); } @ComposeCompilerApi public void endMovableGroup() { endGroup(); } private final void startRoot() { this.rGroupIndex = 0; this.reader = this.slotTable.openReader(); startGroup(100); this.parentContext.startComposing$runtime(); this.parentProvider = this.parentContext.getCompositionLocalScope$runtime(); this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid)); this.providersInvalid = changed(this.parentProvider); this.providerCache = null; if (!this.forceRecomposeScopes) this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime();  if (!this.sourceMarkersEnabled) this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation$runtime();  Set<SlotTable> it = CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables()); int $i$a$-let-ComposerImpl$startRoot$1 = 0; it.add(this.slotTable); this.parentContext.recordInspectionTable$runtime((Set)it); (Set)CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables()); startGroup(this.parentContext.getCompoundHashKey$runtime()); } private final void endRoot() { endGroup(); this.parentContext.doneComposing$runtime(); endGroup(); this.changeListWriter.endRoot(); finalizeCompose(); this.reader.close(); this.forciblyRecompose = false; this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop()); } private final void abortRoot() { cleanUpCompose(); this.pendingStack.clear(); this.parentStateStack.clear(); this.entersStack.clear(); this.providersInvalidStack.clear(); this.providerUpdates = null; this.insertFixups.clear(); this.compoundKeyHash = 0; this.childrenComposing = 0; this.nodeExpected = false; this.inserting = false; this.reusing = false; this.isComposing = false; this.forciblyRecompose = false; this.reusingGroup = -1; if (!this.reader.getClosed()) this.reader.close();  if (!this.writer.getClosed()) forceFreshInsertTable();  } public final void changesApplied$runtime() { this.providerUpdates = null; } public boolean getInserting() { return this.inserting; } public boolean getSkipping() { if (!getInserting() && !this.reusing && !this.providersInvalid) { getCurrentRecomposeScope$runtime(); if (((getCurrentRecomposeScope$runtime() != null) ? (!getCurrentRecomposeScope$runtime().getRequiresRecompose()) : false) && !this.forciblyRecompose); }  return false; } public int getCompoundKeyHash() { return this.compoundKeyHash; } public void collectParameterInformation() { this.forceRecomposeScopes = true; this.sourceMarkersEnabled = true; this.slotTable.collectSourceInformation(); this.insertTable.collectSourceInformation(); this.writer.updateToTableMaps(); } public final void deactivate$runtime() { this.invalidateStack.clear(); this.invalidations.clear(); this.changes.clear(); this.providerUpdates = null; } public final boolean forceRecomposeScopes$runtime() { this.forceRecomposeScopes = true; this.forciblyRecompose = true; return !this.forceRecomposeScopes; } private final void startGroup(int key) { start-BaiHCIY(key, null, GroupKind.Companion.getGroup-ULZAiWs(), null); } private final void startGroup(int key, Object dataKey) { start-BaiHCIY(key, dataKey, GroupKind.Companion.getGroup-ULZAiWs(), null); } private final void endGroup() { end(false); } private final void skipGroup() { this.groupNodeCount += this.reader.skipGroup(); } public void startNode() { start-BaiHCIY(125, null, GroupKind.Companion.getNode-ULZAiWs(), null); this.nodeExpected = true; } public void startReusableNode() { start-BaiHCIY(125, null, GroupKind.Companion.getReusableNode-ULZAiWs(), null); this.nodeExpected = true; } public <T> void createNode(@NotNull Function0 factory) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'factory'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_0
/*      */     //   8: invokespecial validateNodeExpected : ()V
/*      */     //   11: aload_0
/*      */     //   12: invokevirtual getInserting : ()Z
/*      */     //   15: istore_2
/*      */     //   16: iconst_0
/*      */     //   17: istore_3
/*      */     //   18: nop
/*      */     //   19: iload_2
/*      */     //   20: ifne -> 32
/*      */     //   23: iconst_0
/*      */     //   24: istore #4
/*      */     //   26: ldc_w 'createNode() can only be called when inserting'
/*      */     //   29: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   32: nop
/*      */     //   33: aload_0
/*      */     //   34: getfield parentStateStack : Landroidx/compose/runtime/IntStack;
/*      */     //   37: invokevirtual peek : ()I
/*      */     //   40: istore_2
/*      */     //   41: aload_0
/*      */     //   42: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   45: aload_0
/*      */     //   46: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   49: invokevirtual getParent : ()I
/*      */     //   52: invokevirtual anchor : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   55: astore_3
/*      */     //   56: aload_0
/*      */     //   57: getfield groupNodeCount : I
/*      */     //   60: istore #4
/*      */     //   62: aload_0
/*      */     //   63: iload #4
/*      */     //   65: iconst_1
/*      */     //   66: iadd
/*      */     //   67: putfield groupNodeCount : I
/*      */     //   70: aload_0
/*      */     //   71: getfield insertFixups : Landroidx/compose/runtime/changelist/FixupList;
/*      */     //   74: aload_1
/*      */     //   75: iload_2
/*      */     //   76: aload_3
/*      */     //   77: invokevirtual createAndInsertNode : (Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V
/*      */     //   80: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1827	-> 7
/*      */     //   #1828	-> 11
/*      */     //   #4616	-> 18
/*      */     //   #4619	-> 19
/*      */     //   #4620	-> 23
/*      */     //   #1828	-> 26
/*      */     //   #4620	-> 29
/*      */     //   #4622	-> 32
/*      */     //   #1829	-> 33
/*      */     //   #1830	-> 41
/*      */     //   #1831	-> 56
/*      */     //   #1832	-> 70
/*      */     //   #1833	-> 80
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   26	3	4	$i$a$-runtimeCheck-ComposerImpl$createNode$1	I
/*      */     //   18	15	3	$i$f$runtimeCheck	I
/*      */     //   16	17	2	value$iv	Z
/*      */     //   41	40	2	insertIndex	I
/*      */     //   56	25	3	groupAnchor	Landroidx/compose/runtime/Anchor;
/*      */     //   0	81	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	81	1	factory	Lkotlin/jvm/functions/Function0; } public void useNode() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokespecial validateNodeExpected : ()V
/*      */     //   4: aload_0
/*      */     //   5: invokevirtual getInserting : ()Z
/*      */     //   8: ifne -> 15
/*      */     //   11: iconst_1
/*      */     //   12: goto -> 16
/*      */     //   15: iconst_0
/*      */     //   16: istore_1
/*      */     //   17: iconst_0
/*      */     //   18: istore_2
/*      */     //   19: nop
/*      */     //   20: iload_1
/*      */     //   21: ifne -> 32
/*      */     //   24: iconst_0
/*      */     //   25: istore_3
/*      */     //   26: ldc_w 'useNode() called while inserting'
/*      */     //   29: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   32: nop
/*      */     //   33: aload_0
/*      */     //   34: aload_0
/*      */     //   35: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   38: invokespecial getNode : (Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;
/*      */     //   41: astore_1
/*      */     //   42: aload_0
/*      */     //   43: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   46: aload_1
/*      */     //   47: invokevirtual moveDown : (Ljava/lang/Object;)V
/*      */     //   50: aload_0
/*      */     //   51: getfield reusing : Z
/*      */     //   54: ifeq -> 72
/*      */     //   57: aload_1
/*      */     //   58: instanceof androidx/compose/runtime/ComposeNodeLifecycleCallback
/*      */     //   61: ifeq -> 72
/*      */     //   64: aload_0
/*      */     //   65: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   68: aload_1
/*      */     //   69: invokevirtual useNode : (Ljava/lang/Object;)V
/*      */     //   72: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1840	-> 0
/*      */     //   #1841	-> 4
/*      */     //   #4623	-> 19
/*      */     //   #4626	-> 20
/*      */     //   #4627	-> 24
/*      */     //   #1841	-> 26
/*      */     //   #4627	-> 29
/*      */     //   #4629	-> 32
/*      */     //   #1842	-> 33
/*      */     //   #1843	-> 42
/*      */     //   #1845	-> 50
/*      */     //   #1846	-> 64
/*      */     //   #1848	-> 72
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   26	3	3	$i$a$-runtimeCheck-ComposerImpl$useNode$1	I
/*      */     //   19	14	2	$i$f$runtimeCheck	I
/*      */     //   17	16	1	value$iv	Z
/*      */     //   42	31	1	node	Ljava/lang/Object;
/*      */     //   0	73	0	this	Landroidx/compose/runtime/ComposerImpl; } public void endNode() { end(true); } public void startReusableGroup(int key, @Nullable Object dataKey) { if (!getInserting() && this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) { this.reusingGroup = this.reader.getCurrentGroup(); this.reusing = true; }  start-BaiHCIY(key, null, GroupKind.Companion.getGroup-ULZAiWs(), dataKey); } public void endReusableGroup() { if (this.reusing && this.reader.getParent() == this.reusingGroup) { this.reusingGroup = -1; this.reusing = false; }  end(false); } public void disableReusing() { this.reusing = false; } public void enableReusing() { this.reusing = (this.reusingGroup >= 0); } public final void startReuseFromRoot() { this.reusingGroup = 100; this.reusing = true; } public final void endReuseFromRoot() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield isComposing : Z
/*      */     //   4: ifne -> 20
/*      */     //   7: aload_0
/*      */     //   8: getfield reusingGroup : I
/*      */     //   11: bipush #100
/*      */     //   13: if_icmpne -> 20
/*      */     //   16: iconst_1
/*      */     //   17: goto -> 21
/*      */     //   20: iconst_0
/*      */     //   21: istore_1
/*      */     //   22: iconst_0
/*      */     //   23: istore_2
/*      */     //   24: nop
/*      */     //   25: iload_1
/*      */     //   26: ifne -> 37
/*      */     //   29: iconst_0
/*      */     //   30: istore_3
/*      */     //   31: ldc_w 'Cannot disable reuse from root if it was caused by other groups'
/*      */     //   34: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   37: nop
/*      */     //   38: aload_0
/*      */     //   39: iconst_m1
/*      */     //   40: putfield reusingGroup : I
/*      */     //   43: aload_0
/*      */     //   44: iconst_0
/*      */     //   45: putfield reusing : Z
/*      */     //   48: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1888	-> 0
/*      */     //   #4630	-> 24
/*      */     //   #4633	-> 25
/*      */     //   #4634	-> 29
/*      */     //   #1889	-> 31
/*      */     //   #4634	-> 34
/*      */     //   #4636	-> 37
/*      */     //   #1891	-> 38
/*      */     //   #1892	-> 43
/*      */     //   #1893	-> 48
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   31	3	3	$i$a$-requirePrecondition-ComposerImpl$endReuseFromRoot$1	I
/*      */     //   24	14	2	$i$f$requirePrecondition	I
/*      */     //   22	16	1	value$iv	Z
/* 4611 */     //   0	49	0	this	Landroidx/compose/runtime/ComposerImpl; } public int getCurrentMarker() { return getInserting() ? -this.writer.getParent() : this.reader.getParent(); } public void endToMarker(int marker) { if (marker < 0) { int writerLocation = -marker; SlotWriter writer = this.writer; while (true) { int parent = writer.getParent(); if (parent > writerLocation) { end(writer.isNode(parent)); continue; }  break; }  } else { if (getInserting()) { SlotWriter writer = this.writer; while (getInserting()) end(writer.isNode(writer.getParent()));  }  SlotReader reader = this.reader; while (true) { int parent = reader.getParent(); if (parent > marker) { end(reader.isNode(parent)); continue; }  break; }  }  } public <V, T> void apply(Object value, @NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); if (getInserting()) { this.insertFixups.updateNode(value, block); } else { this.changeListWriter.updateNode(value, block); }  } @ComposeCompilerApi @NotNull public Object joinKey(@Nullable Object left, @Nullable Object right) { if (ComposerKt.access$getKey(this.reader.getGroupObjectKey(), left, right) == null) ComposerKt.access$getKey(this.reader.getGroupObjectKey(), left, right);  return new JoinedKey(left, right); } @PublishedApi @Nullable public final Object nextSlot() { validateNodeNotExpected(); Object it = this.reader.next(); int $i$a$-let-ComposerImpl$nextSlot$1 = 0; return getInserting() ? Composer.Companion.getEmpty() : ((this.reusing && !(it instanceof ReusableRememberObserver)) ? Composer.Companion.getEmpty() : it); } public final void dispose$runtime() { String sectionName$iv = "Compose:Composer.dispose"; int $i$f$trace = 0; Object token$iv = Trace.INSTANCE.beginSection(sectionName$iv);
/*      */     
/* 4613 */     try { int $i$a$-trace-ComposerImpl$dispose$1 = 0; this.parentContext.unregisterComposer$runtime(this); deactivate$runtime(); getApplier().clear(); this.isDisposed = true; Unit unit = Unit.INSTANCE; }
/*      */     finally
/* 4615 */     { Trace.INSTANCE.endSection(token$iv); }  }
/*      */   @PublishedApi @Nullable public final Object nextSlotForCache() { validateNodeNotExpected(); Object it = this.reader.next(); int $i$a$-let-ComposerImpl$nextSlotForCache$1 = 0; return getInserting() ? Composer.Companion.getEmpty() : ((this.reusing && !(it instanceof ReusableRememberObserver)) ? Composer.Companion.getEmpty() : ((it instanceof RememberObserverHolder) ? ((RememberObserverHolder)it).getWrapped() : it)); }
/*      */   @ComposeCompilerApi public boolean changed(@Nullable Object value) { updateValue(value); return !Intrinsics.areEqual(nextSlot(), value); }
/*      */   @ComposeCompilerApi public boolean changedInstance(@Nullable Object value) { updateValue(value); return (nextSlot() != value); }
/*      */   @ComposeCompilerApi public boolean changed(char value) { Object next = nextSlot(); if (next instanceof Character) { char nextPrimitive = ((Character)next).charValue(); if (value == nextPrimitive) return false;  }  updateValue(Character.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(byte value) { Object next = nextSlot(); if (next instanceof Byte) { byte nextPrimitive = ((Number)next).byteValue(); if (value == nextPrimitive) return false;  }  updateValue(Byte.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(short value) { Object next = nextSlot(); if (next instanceof Short) { short nextPrimitive = ((Number)next).shortValue(); if (value == nextPrimitive) return false;  }  updateValue(Short.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(boolean value) { Object next = nextSlot(); if (next instanceof Boolean) { boolean nextPrimitive = ((Boolean)next).booleanValue(); if (value == nextPrimitive) return false;  }  updateValue(Boolean.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(float value) { Object next = nextSlot(); if (next instanceof Float) { float nextPrimitive = ((Number)next).floatValue(); if ((value == nextPrimitive)) return false;  }  updateValue(Float.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(long value) { Object next = nextSlot(); if (next instanceof Long) { long nextPrimitive = ((Number)next).longValue(); if (value == nextPrimitive) return false;  }  updateValue(Long.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(double value) { Object next = nextSlot(); if (next instanceof Double) { double nextPrimitive = ((Number)next).doubleValue(); if ((value == nextPrimitive)) return false;  }  updateValue(Double.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public boolean changed(int value) { Object next = nextSlot(); if (next instanceof Integer) { int nextPrimitive = ((Number)next).intValue(); if (value == nextPrimitive) return false;  }  updateValue(Integer.valueOf(value)); return true; }
/*      */   @ComposeCompilerApi public final <T> T cache(boolean invalid, @NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$cache = 0; Object result = nextSlotForCache(); if (result == Composer.Companion.getEmpty() || invalid) { Object value = block.invoke(); updateCachedValue(value); result = value; }  return (T)result; }
/*      */   private final void updateSlot(Object value) { nextSlot(); updateValue(value); }
/*      */   @PublishedApi public final void updateValue(@Nullable Object value) { if (getInserting()) { this.writer.update(value); } else if (this.reader.getHadNext()) { int groupSlotIndex = this.reader.getGroupSlotIndex() - 1; if (this.changeListWriter.getPastParent()) { this.changeListWriter.updateAnchoredValue(value, this.reader.anchor(this.reader.getParent()), groupSlotIndex); } else { this.changeListWriter.updateValue(value, groupSlotIndex); }  } else { this.changeListWriter.appendValue(this.reader.anchor(this.reader.getParent()), value); }  }
/*      */   @PublishedApi public final void updateCachedValue(@Nullable Object value) { if (getInserting())
/*      */       this.changeListWriter.remember((RememberObserver)value);  this.abandonSet.add(value); Object toStore = (value instanceof RememberObserver) ? new RememberObserverHolder((RememberObserver)value, rememberObserverAnchor()) : value; updateValue(toStore); }
/*      */   private final Anchor rememberObserverAnchor() { int group = this.writer.getCurrentGroup() - 1; int parent = this.writer.parent(group); while (parent != this.writer.getParent() && parent >= 0) { group = parent; parent = this.writer.parent(group); }  group = this.reader.getCurrentGroup() - 1; parent = this.reader.parent(group); while (parent != this.reader.getParent() && parent >= 0) { group = parent; parent = this.reader.parent(group); }  return getInserting() ? (ComposerKt.isAfterFirstChild(this.writer) ? this.writer.anchor(group) : null) : (ComposerKt.isAfterFirstChild(this.reader) ? this.reader.anchor(group) : null); }
/*      */   @NotNull public CompositionData getCompositionData() { return this.slotTable; }
/*      */   public void recordSideEffect(@NotNull Function0 effect) { Intrinsics.checkNotNullParameter(effect, "effect"); this.changeListWriter.sideEffect(effect); }
/*      */   private final PersistentCompositionLocalMap currentCompositionLocalScope() { if (this.providerCache != null) { PersistentCompositionLocalMap it = this.providerCache; int $i$a$-let-ComposerImpl$currentCompositionLocalScope$1 = 0; return it; }  return currentCompositionLocalScope(this.reader.getParent()); }
/*      */   @NotNull public CompositionLocalMap getCurrentCompositionLocalMap() { return currentCompositionLocalScope(); }
/* 4637 */   private final PersistentCompositionLocalMap currentCompositionLocalScope(int group) { if (getInserting() && this.writerHasAProvider) { int current = this.writer.getParent(); while (current > 0) { if (this.writer.groupKey(current) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(current), ComposerKt.getCompositionLocalMap())) { Intrinsics.checkNotNull(this.writer.groupAux(current), "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"); PersistentCompositionLocalMap providers = (PersistentCompositionLocalMap)this.writer.groupAux(current); this.providerCache = providers; return providers; }  current = this.writer.parent(current); }  }  if (this.reader.getSize() > 0) { int current = group; while (current > 0) { if (this.reader.groupKey(current) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(current), ComposerKt.getCompositionLocalMap())) { if (this.providerUpdates == null || (PersistentCompositionLocalMap)this.providerUpdates.get(current) == null) { (PersistentCompositionLocalMap)this.providerUpdates.get(current); Intrinsics.checkNotNull(this.reader.groupAux(current), "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"); }  PersistentCompositionLocalMap providers = (PersistentCompositionLocalMap)this.reader.groupAux(current); this.providerCache = providers; return providers; }  current = this.reader.parent(current); }  }  this.providerCache = this.parentProvider; return this.parentProvider; } private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) { PersistentCompositionLocalMap $this$mutate$iv = parentScope; int $i$f$mutate = 0; PersistentCompositionLocalMap.Builder builder = $this$mutate$iv.builder(); Map it = (Map)builder; int $i$a$-mutate-ComposerImpl$updateProviderMapGroup$providerScope$1 = 0; it.putAll((Map)currentProviders); PersistentCompositionLocalMap providerScope = builder.build(); startGroup(204, ComposerKt.getProviderMaps()); updateSlot(providerScope); updateSlot(currentProviders); endGroup(); return providerScope; } @InternalComposeApi public void startProvider(@NotNull ProvidedValue value) { Intrinsics.checkNotNullParameter(value, "value"); PersistentCompositionLocalMap parentScope = currentCompositionLocalScope(); startGroup(201, ComposerKt.getProvider()); Object it = rememberedValue(); int $i$a$-let-ComposerImpl$startProvider$oldState$1 = 0; Intrinsics.checkNotNull(it, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"); ValueHolder oldState = Intrinsics.areEqual(it, Composer.Companion.getEmpty()) ? null : (ValueHolder)it; Intrinsics.checkNotNull(value.getCompositionLocal(), "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"); CompositionLocal<?> local = value.getCompositionLocal(); ValueHolder<Object> state = local.updatedStateOf$runtime(value, oldState); boolean change = !Intrinsics.areEqual(state, oldState); if (change) updateRememberedValue(state);  PersistentCompositionLocalMap providers = null; boolean invalid = false; if (getInserting()) { providers = (value.getCanOverride() || !CompositionLocalMapKt.contains(parentScope, local)) ? parentScope.putValue((CompositionLocal)local, state) : parentScope; invalid = false; this.writerHasAProvider = true; } else { Intrinsics.checkNotNull(this.reader.groupAux(this.reader.getCurrentGroup()), "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"); PersistentCompositionLocalMap oldScope = (PersistentCompositionLocalMap)this.reader.groupAux(this.reader.getCurrentGroup()); providers = ((!getSkipping() || change) && (value.getCanOverride() || !CompositionLocalMapKt.contains(parentScope, local))) ? parentScope.putValue((CompositionLocal)local, state) : oldScope; invalid = (this.reusing || oldScope != providers); }  if (invalid && !getInserting()) recordProviderUpdate(providers);  this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid)); this.providersInvalid = invalid; this.providerCache = providers; start-BaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.getGroup-ULZAiWs(), providers); }
/*      */   private final void recordProviderUpdate(PersistentCompositionLocalMap providers) { if (this.providerUpdates == null) { ComposerImpl $this$recordProviderUpdate_u24lambda_u2414 = this; int $i$a$-run-ComposerImpl$recordProviderUpdate$providerUpdates$1 = 0; IntMap<PersistentCompositionLocalMap> newProviderUpdates = new IntMap(0, 1, null); $this$recordProviderUpdate_u24lambda_u2414.providerUpdates = newProviderUpdates; }  IntMap<PersistentCompositionLocalMap> providerUpdates = newProviderUpdates; providerUpdates.set(this.reader.getCurrentGroup(), providers); }
/*      */   @InternalComposeApi public void endProvider() { endGroup(); endGroup(); this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop()); this.providerCache = null; }
/*      */   @InternalComposeApi public void startProviders(@NotNull ProvidedValue[] values) { Intrinsics.checkNotNullParameter(values, "values"); PersistentCompositionLocalMap parentScope = currentCompositionLocalScope(); startGroup(201, ComposerKt.getProvider()); PersistentCompositionLocalMap providers = null; boolean invalid = false; if (getInserting()) { PersistentCompositionLocalMap currentProviders = CompositionLocalMapKt.updateCompositionMap$default(values, parentScope, null, 4, null); providers = updateProviderMapGroup(parentScope, currentProviders); invalid = false; this.writerHasAProvider = true; } else { Intrinsics.checkNotNull(this.reader.groupGet(0), "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"); PersistentCompositionLocalMap oldScope = (PersistentCompositionLocalMap)this.reader.groupGet(0); Intrinsics.checkNotNull(this.reader.groupGet(1), "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"); PersistentCompositionLocalMap oldValues = (PersistentCompositionLocalMap)this.reader.groupGet(1); PersistentCompositionLocalMap currentProviders = CompositionLocalMapKt.updateCompositionMap((ProvidedValue<?>[])values, parentScope, oldValues); if (!getSkipping() || this.reusing || !Intrinsics.areEqual(oldValues, currentProviders)) { providers = updateProviderMapGroup(parentScope, currentProviders); invalid = (this.reusing || !Intrinsics.areEqual(providers, oldScope)); } else { skipGroup(); providers = oldScope; invalid = false; }  }  if (invalid && !getInserting())
/*      */       recordProviderUpdate(providers);  this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid)); this.providersInvalid = invalid; this.providerCache = providers; start-BaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.getGroup-ULZAiWs(), providers); }
/*      */   @InternalComposeApi public void endProviders() { endGroup(); endGroup(); this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop()); this.providerCache = null; }
/*      */   @InternalComposeApi public <T> T consume(@NotNull CompositionLocal<T> key) { Intrinsics.checkNotNullParameter(key, "key"); return CompositionLocalMapKt.read(currentCompositionLocalScope(), key); }
/*      */   @NotNull public CompositionContext buildContext() { startGroup(206, ComposerKt.getReference()); if (getInserting())
/*      */       SlotWriter.markGroup$default(this.writer, 0, 1, null);  Object object = nextSlot(); CompositionContextHolder holder = (object instanceof CompositionContextHolder) ? (CompositionContextHolder)object : null; if (holder == null) { ControlledComposition controlledComposition = getComposition(); (controlledComposition instanceof CompositionImpl) ? controlledComposition : null; holder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes, this.sourceMarkersEnabled, (((controlledComposition instanceof CompositionImpl) ? controlledComposition : null) != null) ? ((controlledComposition instanceof CompositionImpl) ? controlledComposition : null).getObserverHolder$runtime() : null)); updateValue(holder); }  holder.getRef().updateCompositionLocalScope(currentCompositionLocalScope()); endGroup(); return holder.getRef(); }
/*      */   public final int getChangeCount$runtime() { return this.changes.getSize(); }
/*      */   @Nullable public final RecomposeScopeImpl getCurrentRecomposeScope$runtime() { Stack<RecomposeScopeImpl> it = this.invalidateStack; int $i$a$-let-ComposerImpl$currentRecomposeScope$1 = 0; return (this.childrenComposing == 0 && it.isNotEmpty()) ? it.peek() : null; }
/*      */   private final void ensureWriter() { if (this.writer.getClosed()) { this.writer = this.insertTable.openWriter(); this.writer.skipToGroupEnd(); this.writerHasAProvider = false; this.providerCache = null; }  }
/*      */   private final void createFreshInsertTable() { ComposerKt.runtimeCheck(this.writer.getClosed()); forceFreshInsertTable(); }
/*      */   private final void forceFreshInsertTable() { SlotTable slotTable1 = new SlotTable(), slotTable2 = slotTable1; ComposerImpl composerImpl = this; int $i$a$-apply-ComposerImpl$forceFreshInsertTable$1 = 0; if (this.sourceMarkersEnabled)
/*      */       slotTable2.collectSourceInformation();  if (this.parentContext.getCollectingCallByInformation$runtime())
/*      */       slotTable2.collectCalledByInformation();  composerImpl.insertTable = slotTable1; SlotWriter slotWriter1 = this.insertTable.openWriter(), slotWriter2 = slotWriter1; composerImpl = this; int $i$a$-also-ComposerImpl$forceFreshInsertTable$2 = 0; slotWriter2.close(true); composerImpl.writer = slotWriter1; }
/*      */   private final void startReaderGroup(boolean isNode, Object data) { if (isNode) { this.reader.startNode(); } else { if (data != null && this.reader.getGroupAux() != data)
/*      */         this.changeListWriter.updateAuxData(data);  this.reader.startGroup(); }  }
/*      */   private final void start-BaiHCIY(int key, Object objectKey, int kind, Object data) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokespecial validateNodeNotExpected : ()V
/*      */     //   4: aload_0
/*      */     //   5: astore #5
/*      */     //   7: aload_0
/*      */     //   8: getfield rGroupIndex : I
/*      */     //   11: istore #6
/*      */     //   13: iconst_0
/*      */     //   14: istore #7
/*      */     //   16: aload_2
/*      */     //   17: ifnonnull -> 170
/*      */     //   20: aload #4
/*      */     //   22: ifnull -> 112
/*      */     //   25: iload_1
/*      */     //   26: sipush #207
/*      */     //   29: if_icmpne -> 112
/*      */     //   32: aload #4
/*      */     //   34: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   37: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   40: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   43: ifne -> 112
/*      */     //   46: aload #5
/*      */     //   48: astore #8
/*      */     //   50: aload #4
/*      */     //   52: invokevirtual hashCode : ()I
/*      */     //   55: istore #9
/*      */     //   57: iconst_0
/*      */     //   58: istore #10
/*      */     //   60: aload #8
/*      */     //   62: aload #8
/*      */     //   64: invokevirtual getCompoundKeyHash : ()I
/*      */     //   67: istore #11
/*      */     //   69: iconst_3
/*      */     //   70: istore #12
/*      */     //   72: iconst_0
/*      */     //   73: istore #13
/*      */     //   75: iload #11
/*      */     //   77: iload #12
/*      */     //   79: invokestatic rotateLeft : (II)I
/*      */     //   82: nop
/*      */     //   83: iload #9
/*      */     //   85: ixor
/*      */     //   86: istore #11
/*      */     //   88: iconst_3
/*      */     //   89: istore #12
/*      */     //   91: iconst_0
/*      */     //   92: istore #13
/*      */     //   94: iload #11
/*      */     //   96: iload #12
/*      */     //   98: invokestatic rotateLeft : (II)I
/*      */     //   101: nop
/*      */     //   102: iload #6
/*      */     //   104: ixor
/*      */     //   105: putfield compoundKeyHash : I
/*      */     //   108: nop
/*      */     //   109: goto -> 313
/*      */     //   112: aload #5
/*      */     //   114: astore #8
/*      */     //   116: iconst_0
/*      */     //   117: istore #9
/*      */     //   119: aload #8
/*      */     //   121: aload #8
/*      */     //   123: invokevirtual getCompoundKeyHash : ()I
/*      */     //   126: istore #10
/*      */     //   128: iconst_3
/*      */     //   129: istore #11
/*      */     //   131: iconst_0
/*      */     //   132: istore #12
/*      */     //   134: iload #10
/*      */     //   136: iload #11
/*      */     //   138: invokestatic rotateLeft : (II)I
/*      */     //   141: nop
/*      */     //   142: iload_1
/*      */     //   143: ixor
/*      */     //   144: istore #10
/*      */     //   146: iconst_3
/*      */     //   147: istore #11
/*      */     //   149: iconst_0
/*      */     //   150: istore #12
/*      */     //   152: iload #10
/*      */     //   154: iload #11
/*      */     //   156: invokestatic rotateLeft : (II)I
/*      */     //   159: nop
/*      */     //   160: iload #6
/*      */     //   162: ixor
/*      */     //   163: putfield compoundKeyHash : I
/*      */     //   166: nop
/*      */     //   167: goto -> 313
/*      */     //   170: aload_2
/*      */     //   171: instanceof java/lang/Enum
/*      */     //   174: ifeq -> 248
/*      */     //   177: aload #5
/*      */     //   179: astore #8
/*      */     //   181: aload_2
/*      */     //   182: checkcast java/lang/Enum
/*      */     //   185: invokevirtual ordinal : ()I
/*      */     //   188: istore #9
/*      */     //   190: iconst_0
/*      */     //   191: istore #10
/*      */     //   193: iconst_0
/*      */     //   194: istore #11
/*      */     //   196: aload #8
/*      */     //   198: aload #8
/*      */     //   200: invokevirtual getCompoundKeyHash : ()I
/*      */     //   203: istore #12
/*      */     //   205: iconst_3
/*      */     //   206: istore #13
/*      */     //   208: iconst_0
/*      */     //   209: istore #14
/*      */     //   211: iload #12
/*      */     //   213: iload #13
/*      */     //   215: invokestatic rotateLeft : (II)I
/*      */     //   218: nop
/*      */     //   219: iload #9
/*      */     //   221: ixor
/*      */     //   222: istore #12
/*      */     //   224: iconst_3
/*      */     //   225: istore #13
/*      */     //   227: iconst_0
/*      */     //   228: istore #14
/*      */     //   230: iload #12
/*      */     //   232: iload #13
/*      */     //   234: invokestatic rotateLeft : (II)I
/*      */     //   237: nop
/*      */     //   238: iload #10
/*      */     //   240: ixor
/*      */     //   241: putfield compoundKeyHash : I
/*      */     //   244: nop
/*      */     //   245: goto -> 313
/*      */     //   248: aload #5
/*      */     //   250: astore #8
/*      */     //   252: aload_2
/*      */     //   253: invokevirtual hashCode : ()I
/*      */     //   256: istore #9
/*      */     //   258: iconst_0
/*      */     //   259: istore #10
/*      */     //   261: iconst_0
/*      */     //   262: istore #11
/*      */     //   264: aload #8
/*      */     //   266: aload #8
/*      */     //   268: invokevirtual getCompoundKeyHash : ()I
/*      */     //   271: istore #12
/*      */     //   273: iconst_3
/*      */     //   274: istore #13
/*      */     //   276: iconst_0
/*      */     //   277: istore #14
/*      */     //   279: iload #12
/*      */     //   281: iload #13
/*      */     //   283: invokestatic rotateLeft : (II)I
/*      */     //   286: nop
/*      */     //   287: iload #9
/*      */     //   289: ixor
/*      */     //   290: istore #12
/*      */     //   292: iconst_3
/*      */     //   293: istore #13
/*      */     //   295: iconst_0
/*      */     //   296: istore #14
/*      */     //   298: iload #12
/*      */     //   300: iload #13
/*      */     //   302: invokestatic rotateLeft : (II)I
/*      */     //   305: nop
/*      */     //   306: iload #10
/*      */     //   308: ixor
/*      */     //   309: putfield compoundKeyHash : I
/*      */     //   312: nop
/*      */     //   313: nop
/*      */     //   314: aload_2
/*      */     //   315: ifnonnull -> 332
/*      */     //   318: aload_0
/*      */     //   319: getfield rGroupIndex : I
/*      */     //   322: istore #5
/*      */     //   324: aload_0
/*      */     //   325: iload #5
/*      */     //   327: iconst_1
/*      */     //   328: iadd
/*      */     //   329: putfield rGroupIndex : I
/*      */     //   332: iconst_0
/*      */     //   333: istore #6
/*      */     //   335: iload_3
/*      */     //   336: getstatic androidx/compose/runtime/GroupKind.Companion : Landroidx/compose/runtime/GroupKind$Companion;
/*      */     //   339: invokevirtual getGroup-ULZAiWs : ()I
/*      */     //   342: if_icmpeq -> 349
/*      */     //   345: iconst_1
/*      */     //   346: goto -> 350
/*      */     //   349: iconst_0
/*      */     //   350: istore #5
/*      */     //   352: aload_0
/*      */     //   353: invokevirtual getInserting : ()Z
/*      */     //   356: ifeq -> 521
/*      */     //   359: aload_0
/*      */     //   360: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   363: invokevirtual beginEmpty : ()V
/*      */     //   366: aload_0
/*      */     //   367: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   370: invokevirtual getCurrentGroup : ()I
/*      */     //   373: istore #6
/*      */     //   375: nop
/*      */     //   376: iload #5
/*      */     //   378: ifeq -> 398
/*      */     //   381: aload_0
/*      */     //   382: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   385: iload_1
/*      */     //   386: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   389: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   392: invokevirtual startNode : (ILjava/lang/Object;)V
/*      */     //   395: goto -> 448
/*      */     //   398: aload #4
/*      */     //   400: ifnull -> 428
/*      */     //   403: aload_0
/*      */     //   404: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   407: iload_1
/*      */     //   408: aload_2
/*      */     //   409: dup
/*      */     //   410: ifnonnull -> 420
/*      */     //   413: pop
/*      */     //   414: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   417: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   420: aload #4
/*      */     //   422: invokevirtual startData : (ILjava/lang/Object;Ljava/lang/Object;)V
/*      */     //   425: goto -> 448
/*      */     //   428: aload_0
/*      */     //   429: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   432: iload_1
/*      */     //   433: aload_2
/*      */     //   434: dup
/*      */     //   435: ifnonnull -> 445
/*      */     //   438: pop
/*      */     //   439: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   442: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   445: invokevirtual startGroup : (ILjava/lang/Object;)V
/*      */     //   448: aload_0
/*      */     //   449: getfield pending : Landroidx/compose/runtime/Pending;
/*      */     //   452: dup
/*      */     //   453: ifnull -> 511
/*      */     //   456: astore #9
/*      */     //   458: iconst_0
/*      */     //   459: istore #10
/*      */     //   461: new androidx/compose/runtime/KeyInfo
/*      */     //   464: dup
/*      */     //   465: iload_1
/*      */     //   466: iconst_m1
/*      */     //   467: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   470: aload_0
/*      */     //   471: iload #6
/*      */     //   473: invokespecial insertedGroupVirtualIndex : (I)I
/*      */     //   476: iconst_m1
/*      */     //   477: iconst_0
/*      */     //   478: invokespecial <init> : (ILjava/lang/Object;III)V
/*      */     //   481: astore #11
/*      */     //   483: aload #9
/*      */     //   485: aload #11
/*      */     //   487: aload_0
/*      */     //   488: getfield nodeIndex : I
/*      */     //   491: aload #9
/*      */     //   493: invokevirtual getStartIndex : ()I
/*      */     //   496: isub
/*      */     //   497: invokevirtual registerInsert : (Landroidx/compose/runtime/KeyInfo;I)V
/*      */     //   500: aload #9
/*      */     //   502: aload #11
/*      */     //   504: invokevirtual recordUsed : (Landroidx/compose/runtime/KeyInfo;)Z
/*      */     //   507: pop
/*      */     //   508: goto -> 513
/*      */     //   511: pop
/*      */     //   512: nop
/*      */     //   513: aload_0
/*      */     //   514: iload #5
/*      */     //   516: aconst_null
/*      */     //   517: invokespecial enterGroup : (ZLandroidx/compose/runtime/Pending;)V
/*      */     //   520: return
/*      */     //   521: iconst_0
/*      */     //   522: istore #7
/*      */     //   524: iload_3
/*      */     //   525: getstatic androidx/compose/runtime/GroupKind.Companion : Landroidx/compose/runtime/GroupKind$Companion;
/*      */     //   528: invokevirtual getNode-ULZAiWs : ()I
/*      */     //   531: if_icmpeq -> 538
/*      */     //   534: iconst_1
/*      */     //   535: goto -> 539
/*      */     //   538: iconst_0
/*      */     //   539: ifne -> 553
/*      */     //   542: aload_0
/*      */     //   543: getfield reusing : Z
/*      */     //   546: ifeq -> 553
/*      */     //   549: iconst_1
/*      */     //   550: goto -> 554
/*      */     //   553: iconst_0
/*      */     //   554: istore #6
/*      */     //   556: aload_0
/*      */     //   557: getfield pending : Landroidx/compose/runtime/Pending;
/*      */     //   560: ifnonnull -> 630
/*      */     //   563: aload_0
/*      */     //   564: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   567: invokevirtual getGroupKey : ()I
/*      */     //   570: istore #7
/*      */     //   572: iload #6
/*      */     //   574: ifne -> 608
/*      */     //   577: iload #7
/*      */     //   579: iload_1
/*      */     //   580: if_icmpne -> 608
/*      */     //   583: aload_2
/*      */     //   584: aload_0
/*      */     //   585: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   588: invokevirtual getGroupObjectKey : ()Ljava/lang/Object;
/*      */     //   591: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   594: ifeq -> 608
/*      */     //   597: aload_0
/*      */     //   598: iload #5
/*      */     //   600: aload #4
/*      */     //   602: invokespecial startReaderGroup : (ZLjava/lang/Object;)V
/*      */     //   605: goto -> 630
/*      */     //   608: aload_0
/*      */     //   609: new androidx/compose/runtime/Pending
/*      */     //   612: dup
/*      */     //   613: aload_0
/*      */     //   614: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   617: invokevirtual extractKeys : ()Ljava/util/List;
/*      */     //   620: aload_0
/*      */     //   621: getfield nodeIndex : I
/*      */     //   624: invokespecial <init> : (Ljava/util/List;I)V
/*      */     //   627: putfield pending : Landroidx/compose/runtime/Pending;
/*      */     //   630: aload_0
/*      */     //   631: getfield pending : Landroidx/compose/runtime/Pending;
/*      */     //   634: astore #7
/*      */     //   636: aconst_null
/*      */     //   637: astore #8
/*      */     //   639: aload #7
/*      */     //   641: ifnull -> 971
/*      */     //   644: aload #7
/*      */     //   646: iload_1
/*      */     //   647: aload_2
/*      */     //   648: invokevirtual getNext : (ILjava/lang/Object;)Landroidx/compose/runtime/KeyInfo;
/*      */     //   651: astore #9
/*      */     //   653: iload #6
/*      */     //   655: ifne -> 769
/*      */     //   658: aload #9
/*      */     //   660: ifnull -> 769
/*      */     //   663: aload #7
/*      */     //   665: aload #9
/*      */     //   667: invokevirtual recordUsed : (Landroidx/compose/runtime/KeyInfo;)Z
/*      */     //   670: pop
/*      */     //   671: aload #9
/*      */     //   673: invokevirtual getLocation : ()I
/*      */     //   676: istore #10
/*      */     //   678: aload_0
/*      */     //   679: aload #7
/*      */     //   681: aload #9
/*      */     //   683: invokevirtual nodePositionOf : (Landroidx/compose/runtime/KeyInfo;)I
/*      */     //   686: aload #7
/*      */     //   688: invokevirtual getStartIndex : ()I
/*      */     //   691: iadd
/*      */     //   692: putfield nodeIndex : I
/*      */     //   695: aload #7
/*      */     //   697: aload #9
/*      */     //   699: invokevirtual slotPositionOf : (Landroidx/compose/runtime/KeyInfo;)I
/*      */     //   702: istore #11
/*      */     //   704: iload #11
/*      */     //   706: aload #7
/*      */     //   708: invokevirtual getGroupIndex : ()I
/*      */     //   711: isub
/*      */     //   712: istore #12
/*      */     //   714: aload #7
/*      */     //   716: iload #11
/*      */     //   718: aload #7
/*      */     //   720: invokevirtual getGroupIndex : ()I
/*      */     //   723: invokevirtual registerMoveSlot : (II)V
/*      */     //   726: aload_0
/*      */     //   727: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   730: iload #10
/*      */     //   732: invokevirtual moveReaderRelativeTo : (I)V
/*      */     //   735: aload_0
/*      */     //   736: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   739: iload #10
/*      */     //   741: invokevirtual reposition : (I)V
/*      */     //   744: iload #12
/*      */     //   746: ifle -> 758
/*      */     //   749: aload_0
/*      */     //   750: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   753: iload #12
/*      */     //   755: invokevirtual moveCurrentGroup : (I)V
/*      */     //   758: aload_0
/*      */     //   759: iload #5
/*      */     //   761: aload #4
/*      */     //   763: invokespecial startReaderGroup : (ZLjava/lang/Object;)V
/*      */     //   766: goto -> 971
/*      */     //   769: aload_0
/*      */     //   770: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   773: invokevirtual beginEmpty : ()V
/*      */     //   776: aload_0
/*      */     //   777: iconst_1
/*      */     //   778: putfield inserting : Z
/*      */     //   781: aload_0
/*      */     //   782: aconst_null
/*      */     //   783: putfield providerCache : Landroidx/compose/runtime/PersistentCompositionLocalMap;
/*      */     //   786: aload_0
/*      */     //   787: invokespecial ensureWriter : ()V
/*      */     //   790: aload_0
/*      */     //   791: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   794: invokevirtual beginInsert : ()V
/*      */     //   797: aload_0
/*      */     //   798: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   801: invokevirtual getCurrentGroup : ()I
/*      */     //   804: istore #10
/*      */     //   806: nop
/*      */     //   807: iload #5
/*      */     //   809: ifeq -> 829
/*      */     //   812: aload_0
/*      */     //   813: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   816: iload_1
/*      */     //   817: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   820: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   823: invokevirtual startNode : (ILjava/lang/Object;)V
/*      */     //   826: goto -> 879
/*      */     //   829: aload #4
/*      */     //   831: ifnull -> 859
/*      */     //   834: aload_0
/*      */     //   835: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   838: iload_1
/*      */     //   839: aload_2
/*      */     //   840: dup
/*      */     //   841: ifnonnull -> 851
/*      */     //   844: pop
/*      */     //   845: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   848: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   851: aload #4
/*      */     //   853: invokevirtual startData : (ILjava/lang/Object;Ljava/lang/Object;)V
/*      */     //   856: goto -> 879
/*      */     //   859: aload_0
/*      */     //   860: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   863: iload_1
/*      */     //   864: aload_2
/*      */     //   865: dup
/*      */     //   866: ifnonnull -> 876
/*      */     //   869: pop
/*      */     //   870: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   873: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   876: invokevirtual startGroup : (ILjava/lang/Object;)V
/*      */     //   879: aload_0
/*      */     //   880: aload_0
/*      */     //   881: getfield writer : Landroidx/compose/runtime/SlotWriter;
/*      */     //   884: iload #10
/*      */     //   886: invokevirtual anchor : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   889: putfield insertAnchor : Landroidx/compose/runtime/Anchor;
/*      */     //   892: new androidx/compose/runtime/KeyInfo
/*      */     //   895: dup
/*      */     //   896: iload_1
/*      */     //   897: iconst_m1
/*      */     //   898: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   901: aload_0
/*      */     //   902: iload #10
/*      */     //   904: invokespecial insertedGroupVirtualIndex : (I)I
/*      */     //   907: iconst_m1
/*      */     //   908: iconst_0
/*      */     //   909: invokespecial <init> : (ILjava/lang/Object;III)V
/*      */     //   912: astore #11
/*      */     //   914: aload #7
/*      */     //   916: aload #11
/*      */     //   918: aload_0
/*      */     //   919: getfield nodeIndex : I
/*      */     //   922: aload #7
/*      */     //   924: invokevirtual getStartIndex : ()I
/*      */     //   927: isub
/*      */     //   928: invokevirtual registerInsert : (Landroidx/compose/runtime/KeyInfo;I)V
/*      */     //   931: aload #7
/*      */     //   933: aload #11
/*      */     //   935: invokevirtual recordUsed : (Landroidx/compose/runtime/KeyInfo;)Z
/*      */     //   938: pop
/*      */     //   939: new androidx/compose/runtime/Pending
/*      */     //   942: dup
/*      */     //   943: new java/util/ArrayList
/*      */     //   946: dup
/*      */     //   947: invokespecial <init> : ()V
/*      */     //   950: checkcast java/util/List
/*      */     //   953: iload #5
/*      */     //   955: ifeq -> 962
/*      */     //   958: iconst_0
/*      */     //   959: goto -> 966
/*      */     //   962: aload_0
/*      */     //   963: getfield nodeIndex : I
/*      */     //   966: invokespecial <init> : (Ljava/util/List;I)V
/*      */     //   969: astore #8
/*      */     //   971: aload_0
/*      */     //   972: iload #5
/*      */     //   974: aload #8
/*      */     //   976: invokespecial enterGroup : (ZLandroidx/compose/runtime/Pending;)V
/*      */     //   979: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #2455	-> 0
/*      */     //   #2457	-> 4
/*      */     //   #4638	-> 16
/*      */     //   #4639	-> 20
/*      */     //   #4640	-> 46
/*      */     //   #4641	-> 60
/*      */     //   #4642	-> 75
/*      */     //   #4642	-> 82
/*      */     //   #4641	-> 83
/*      */     //   #4642	-> 94
/*      */     //   #4642	-> 101
/*      */     //   #4641	-> 102
/*      */     //   #4643	-> 108
/*      */     //   #4644	-> 112
/*      */     //   #4653	-> 119
/*      */     //   #4642	-> 134
/*      */     //   #4642	-> 141
/*      */     //   #4653	-> 142
/*      */     //   #4642	-> 152
/*      */     //   #4642	-> 159
/*      */     //   #4653	-> 160
/*      */     //   #4654	-> 166
/*      */     //   #4645	-> 170
/*      */     //   #4646	-> 177
/*      */     //   #4653	-> 196
/*      */     //   #4642	-> 211
/*      */     //   #4642	-> 218
/*      */     //   #4653	-> 219
/*      */     //   #4642	-> 230
/*      */     //   #4642	-> 237
/*      */     //   #4653	-> 238
/*      */     //   #4654	-> 244
/*      */     //   #4648	-> 248
/*      */     //   #4653	-> 264
/*      */     //   #4642	-> 279
/*      */     //   #4642	-> 286
/*      */     //   #4653	-> 287
/*      */     //   #4642	-> 298
/*      */     //   #4642	-> 305
/*      */     //   #4653	-> 306
/*      */     //   #4654	-> 312
/*      */     //   #4649	-> 313
/*      */     //   #2459	-> 314
/*      */     //   #2463	-> 332
/*      */     //   #4655	-> 335
/*      */     //   #2463	-> 350
/*      */     //   #2464	-> 352
/*      */     //   #2465	-> 359
/*      */     //   #2466	-> 366
/*      */     //   #2467	-> 375
/*      */     //   #2468	-> 376
/*      */     //   #2469	-> 398
/*      */     //   #2470	-> 428
/*      */     //   #2472	-> 448
/*      */     //   #2473	-> 461
/*      */     //   #2474	-> 465
/*      */     //   #2475	-> 466
/*      */     //   #2476	-> 470
/*      */     //   #2477	-> 476
/*      */     //   #2478	-> 477
/*      */     //   #2473	-> 478
/*      */     //   #2480	-> 483
/*      */     //   #2481	-> 500
/*      */     //   #2472	-> 508
/*      */     //   #2472	-> 511
/*      */     //   #2483	-> 513
/*      */     //   #2484	-> 520
/*      */     //   #2487	-> 521
/*      */     //   #4656	-> 524
/*      */     //   #2487	-> 542
/*      */     //   #2488	-> 556
/*      */     //   #2489	-> 563
/*      */     //   #2490	-> 572
/*      */     //   #2492	-> 597
/*      */     //   #2494	-> 608
/*      */     //   #2495	-> 613
/*      */     //   #2496	-> 620
/*      */     //   #2494	-> 624
/*      */     //   #2501	-> 630
/*      */     //   #2502	-> 636
/*      */     //   #2503	-> 639
/*      */     //   #2505	-> 644
/*      */     //   #2506	-> 653
/*      */     //   #2508	-> 663
/*      */     //   #2513	-> 671
/*      */     //   #2517	-> 678
/*      */     //   #2520	-> 695
/*      */     //   #2521	-> 704
/*      */     //   #2522	-> 714
/*      */     //   #2523	-> 726
/*      */     //   #2524	-> 735
/*      */     //   #2525	-> 744
/*      */     //   #2527	-> 749
/*      */     //   #2529	-> 758
/*      */     //   #2534	-> 769
/*      */     //   #2535	-> 776
/*      */     //   #2536	-> 781
/*      */     //   #2537	-> 786
/*      */     //   #2538	-> 790
/*      */     //   #2539	-> 797
/*      */     //   #2540	-> 806
/*      */     //   #2541	-> 807
/*      */     //   #2542	-> 829
/*      */     //   #2543	-> 859
/*      */     //   #2545	-> 879
/*      */     //   #2546	-> 892
/*      */     //   #2547	-> 896
/*      */     //   #2548	-> 897
/*      */     //   #2549	-> 901
/*      */     //   #2550	-> 907
/*      */     //   #2551	-> 908
/*      */     //   #2546	-> 909
/*      */     //   #2553	-> 914
/*      */     //   #2554	-> 931
/*      */     //   #2555	-> 939
/*      */     //   #2556	-> 943
/*      */     //   #2557	-> 953
/*      */     //   #2555	-> 966
/*      */     //   #2562	-> 971
/*      */     //   #2563	-> 979
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   75	8	13	$i$f$rol	I
/*      */     //   72	11	11	$this$rol$iv$iv$iv	I
/*      */     //   72	11	12	other$iv$iv$iv	I
/*      */     //   94	8	13	$i$f$rol	I
/*      */     //   91	11	11	$this$rol$iv$iv$iv	I
/*      */     //   91	11	12	other$iv$iv$iv	I
/*      */     //   60	49	10	$i$f$updateCompoundKeyWhenWeEnterGroupKeyHash	I
/*      */     //   57	52	8	this_$iv$iv	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   57	52	9	keyHash$iv$iv	I
/*      */     //   134	8	12	$i$f$rol	I
/*      */     //   131	11	10	$this$rol$iv$iv$iv	I
/*      */     //   131	11	11	other$iv$iv$iv	I
/*      */     //   152	8	12	$i$f$rol	I
/*      */     //   149	11	10	$this$rol$iv$iv$iv	I
/*      */     //   149	11	11	other$iv$iv$iv	I
/*      */     //   119	48	9	$i$f$updateCompoundKeyWhenWeEnterGroupKeyHash	I
/*      */     //   116	51	8	this_$iv$iv	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   211	8	14	$i$f$rol	I
/*      */     //   208	11	12	$this$rol$iv$iv$iv	I
/*      */     //   208	11	13	other$iv$iv$iv	I
/*      */     //   230	8	14	$i$f$rol	I
/*      */     //   227	11	12	$this$rol$iv$iv$iv	I
/*      */     //   227	11	13	other$iv$iv$iv	I
/*      */     //   196	49	11	$i$f$updateCompoundKeyWhenWeEnterGroupKeyHash	I
/*      */     //   193	52	8	this_$iv$iv	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   193	52	9	keyHash$iv$iv	I
/*      */     //   193	52	10	rGroupIndex$iv$iv	I
/*      */     //   279	8	14	$i$f$rol	I
/*      */     //   276	11	12	$this$rol$iv$iv$iv	I
/*      */     //   276	11	13	other$iv$iv$iv	I
/*      */     //   298	8	14	$i$f$rol	I
/*      */     //   295	11	12	$this$rol$iv$iv$iv	I
/*      */     //   295	11	13	other$iv$iv$iv	I
/*      */     //   264	49	11	$i$f$updateCompoundKeyWhenWeEnterGroupKeyHash	I
/*      */     //   261	52	8	this_$iv$iv	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   261	52	9	keyHash$iv$iv	I
/*      */     //   261	52	10	rGroupIndex$iv$iv	I
/*      */     //   16	298	7	$i$f$updateCompoundKeyWhenWeEnterGroup	I
/*      */     //   13	301	5	this_$iv	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   13	301	6	rGroupIndex$iv	I
/*      */     //   335	15	6	$i$f$isNode-impl	I
/*      */     //   461	46	10	$i$a$-let-ComposerImpl$start$1	I
/*      */     //   483	24	11	insertKeyInfo	Landroidx/compose/runtime/KeyInfo;
/*      */     //   458	49	9	pending	Landroidx/compose/runtime/Pending;
/*      */     //   375	146	6	startIndex	I
/*      */     //   524	15	7	$i$f$isReusable-impl	I
/*      */     //   572	58	7	slotKey	I
/*      */     //   678	88	10	location	I
/*      */     //   704	62	11	relativePosition	I
/*      */     //   714	52	12	currentRelativePosition	I
/*      */     //   806	165	10	startIndex	I
/*      */     //   914	57	11	insertKeyInfo	Landroidx/compose/runtime/KeyInfo;
/*      */     //   653	318	9	keyInfo	Landroidx/compose/runtime/KeyInfo;
/*      */     //   352	628	5	isNode	Z
/*      */     //   556	424	6	forceReplace	Z
/*      */     //   636	344	7	pending	Landroidx/compose/runtime/Pending;
/*      */     //   639	341	8	newPending	Landroidx/compose/runtime/Pending;
/*      */     //   0	980	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	980	1	key	I
/*      */     //   0	980	2	objectKey	Ljava/lang/Object;
/*      */     //   0	980	3	kind	I
/*      */     //   0	980	4	data	Ljava/lang/Object; }
/*      */   private final void enterGroup(boolean isNode, Pending newPending) { this.pendingStack.push(this.pending); this.pending = newPending; this.parentStateStack.push(this.groupNodeCount); this.parentStateStack.push(this.rGroupIndex); this.parentStateStack.push(this.nodeIndex); if (isNode)
/*      */       this.nodeIndex = 0;  this.groupNodeCount = 0; this.rGroupIndex = 0; }
/*      */   private final void exitGroup(int expectedNodeCount, boolean inserting) { Pending previousPending = this.pendingStack.pop(); if (previousPending != null && !inserting) { int i = previousPending.getGroupIndex(); previousPending.setGroupIndex(i + 1); }  this.pending = previousPending; this.nodeIndex = this.parentStateStack.pop() + expectedNodeCount; this.rGroupIndex = this.parentStateStack.pop(); this.groupNodeCount = this.parentStateStack.pop() + expectedNodeCount; }
/* 4659 */   private final void end(boolean isNode) { int rGroupIndex = this.parentStateStack.peek2() - 1; if (getInserting()) { int parent = this.writer.getParent(); ComposerImpl composerImpl1 = this; int i = this.writer.groupKey(parent); Object object1 = this.writer.groupObjectKey(parent); Object object2 = this.writer.groupAux(parent); int $i$f$updateCompoundKeyWhenWeExitGroup = 0; ComposerImpl composerImpl2 = composerImpl1; int j = object2.hashCode(), k = 0;
/* 4660 */       int i1 = composerImpl2.getCompoundKeyHash() ^ rGroupIndex, i3 = 3, i5 = 0, n = 
/* 4661 */         Integer.rotateRight(i1, i3) ^ Integer.hashCode(j); i3 = 3; i5 = 0; composerImpl2.compoundKeyHash = Integer.rotateRight(n, i3);
/*      */       
/* 4663 */       ComposerImpl this_$iv$iv = composerImpl1; int $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4672 */       k = this_$iv$iv.getCompoundKeyHash() ^ rGroupIndex; int other$iv$iv$iv = 3, $i$f$ror = 0, $this$ror$iv$iv$iv = Integer.rotateRight(k, other$iv$iv$iv) ^ Integer.hashCode(i); other$iv$iv$iv = 3; $i$f$ror = 0; this_$iv$iv.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv, other$iv$iv$iv); if (object1 instanceof Enum) { this_$iv$iv = composerImpl1; $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = ((Enum)object1).ordinal(); int i7 = 0, i8 = 0; $i$f$ror = this_$iv$iv.getCompoundKeyHash() ^ i7; int i10 = 3, i11 = 0, i9 = Integer.rotateRight($i$f$ror, i10) ^ Integer.hashCode($i$f$updateCompoundKeyWhenWeExitGroupKeyHash); i10 = 3; i11 = 0; }  this_$iv$iv = composerImpl1; int groupKey$iv$iv = object1.hashCode(), rGroupIndex$iv$iv = 0, m = 0; int i2 = this_$iv$iv.getCompoundKeyHash() ^ rGroupIndex$iv$iv, i4 = 3, i6 = 0; i2 = Integer.rotateRight(i2, i4) ^ Integer.hashCode(groupKey$iv$iv); i4 = 3; i6 = 0; this_$iv$iv.compoundKeyHash = Integer.rotateRight(i2, i4); }
/*      */     else
/*      */     { int parent = this.reader.getParent(); ComposerImpl this_$iv = this; int groupKey$iv = this.reader.groupKey(parent); Object dataKey$iv = this.reader.groupObjectKey(parent); Object data$iv = this.reader.groupAux(parent);
/*      */       int $i$f$updateCompoundKeyWhenWeExitGroup = 0;
/* 4676 */       ComposerImpl this_$iv$iv = this_$iv; int i = data$iv.hashCode(), j = 0;
/* 4677 */       int m = this_$iv$iv.getCompoundKeyHash() ^ rGroupIndex, i1 = 3, i3 = 0; m = 
/* 4678 */         Integer.rotateRight(m, i1) ^ Integer.hashCode(i); i1 = 3; i3 = 0; this_$iv$iv.compoundKeyHash = Integer.rotateRight(m, i1);
/*      */       
/* 4680 */       this_$iv$iv = this_$iv; int $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4689 */       int $this$ror$iv$iv$iv = this_$iv$iv.getCompoundKeyHash() ^ rGroupIndex, other$iv$iv$iv = 3, $i$f$ror = 0; $this$ror$iv$iv$iv = Integer.rotateRight($this$ror$iv$iv$iv, other$iv$iv$iv) ^ Integer.hashCode(groupKey$iv); other$iv$iv$iv = 3; $i$f$ror = 0; this_$iv$iv.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv, other$iv$iv$iv); if (dataKey$iv instanceof Enum) { this_$iv$iv = this_$iv; int i5 = ((Enum)dataKey$iv).ordinal(), i6 = 0, i7 = 0; int i8 = this_$iv$iv.getCompoundKeyHash() ^ i6, i9 = 3, i10 = 0; i8 = Integer.rotateRight(i8, i9) ^ Integer.hashCode(i5); i9 = 3; i10 = 0; }  this_$iv$iv = this_$iv; int groupKey$iv$iv = dataKey$iv.hashCode(), rGroupIndex$iv$iv = 0, k = 0; int n = this_$iv$iv.getCompoundKeyHash() ^ rGroupIndex$iv$iv, i2 = 3, i4 = 0; n = Integer.rotateRight(n, i2) ^ Integer.hashCode(groupKey$iv$iv); i2 = 3; i4 = 0; this_$iv$iv.compoundKeyHash = Integer.rotateRight(n, i2); }  } private final void recomposeToGroupEnd() { boolean wasComposing = this.isComposing; this.isComposing = true; boolean recomposed = false; int parent = this.reader.getParent(); int end = parent + this.reader.groupSize(parent); int recomposeIndex = this.nodeIndex; int recomposeCompoundKey = getCompoundKeyHash(); int oldGroupNodeCount = this.groupNodeCount; int oldRGroupIndex = this.rGroupIndex; int oldGroup = parent; Invalidation firstInRange = ComposerKt.access$firstInRange(this.invalidations, this.reader.getCurrentGroup(), end); while (firstInRange != null) { int location = firstInRange.getLocation(); ComposerKt.access$removeLocation(this.invalidations, location); if (firstInRange.isInvalid()) { recomposed = true; this.reader.reposition(location); int newGroup = this.reader.getCurrentGroup(); recordUpsAndDowns(oldGroup, newGroup, parent); oldGroup = newGroup; this.nodeIndex = nodeIndexOf(location, newGroup, parent, recomposeIndex); this.rGroupIndex = rGroupIndexOf(newGroup); int newParent = this.reader.parent(newGroup); this.compoundKeyHash = compoundKeyOf(newParent, rGroupIndexOf(newParent), parent, recomposeCompoundKey); this.providerCache = null; firstInRange.getScope().compose(this); this.providerCache = null; this.reader.restoreParent(parent); } else { this.invalidateStack.push(firstInRange.getScope()); firstInRange.getScope().rereadTrackedInstances(); this.invalidateStack.pop(); }  firstInRange = ComposerKt.access$firstInRange(this.invalidations, this.reader.getCurrentGroup(), end); }  if (recomposed) { recordUpsAndDowns(oldGroup, parent, parent); this.reader.skipToGroupEnd(); int parentGroupNodes = updatedNodeCount(parent); this.nodeIndex = recomposeIndex + parentGroupNodes; this.groupNodeCount = oldGroupNodeCount + parentGroupNodes; this.rGroupIndex = oldRGroupIndex; } else { skipReaderToGroupEnd(); }  this.compoundKeyHash = recomposeCompoundKey; this.isComposing = wasComposing; } private final int insertedGroupVirtualIndex(int index) { return -2 - index; } private final void updateNodeCountOverrides(int group, int newCount) { int currentCount = updatedNodeCount(group); if (currentCount != newCount) { int delta = newCount - currentCount; int current = group; int minPending = this.pendingStack.getSize() - 1; while (current != -1) { int newCurrentNodes = updatedNodeCount(current) + delta; updateNodeCount(current, newCurrentNodes); for (int pendingIndex = minPending; -1 < pendingIndex; pendingIndex--) { Pending pending = this.pendingStack.peek(pendingIndex); if (pending != null && pending.updateNodeCount(current, newCurrentNodes)) { minPending = pendingIndex - 1; break; }  }  if (current < 0) { current = this.reader.getParent(); continue; }  if (!this.reader.isNode(current)) current = this.reader.parent(current);  }  }  } private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) { int anchorGroup = this.reader.parent(group); while (anchorGroup != recomposeGroup && !this.reader.isNode(anchorGroup)) anchorGroup = this.reader.parent(anchorGroup);  int index = this.reader.isNode(anchorGroup) ? 0 : recomposeIndex; if (anchorGroup == group) return index;  int current = anchorGroup; int nodeIndexLimit = index + updatedNodeCount(anchorGroup) - this.reader.nodeCount(group); label29: while (index < nodeIndexLimit && current != groupLocation) { current++; while (current < groupLocation) { int end = current + this.reader.groupSize(current); if (groupLocation >= end) { index += this.reader.isNode(current) ? 1 : updatedNodeCount(current); current = end; continue; }  continue label29; }  }  return index; } private final int rGroupIndexOf(int group) { int result = 0; int parent = this.reader.parent(group); int child = parent + 1; while (child < group) { if (!this.reader.hasObjectKey(child)) result++;  child += this.reader.groupSize(child); }  return result; } private final int updatedNodeCount(int group) { if (group < 0) { MutableIntIntMap it = this.nodeCountVirtualOverrides; int $i$a$-let-ComposerImpl$updatedNodeCount$1 = 0; return (this.nodeCountVirtualOverrides != null) ? (it.contains(group) ? it.get(group) : 0) : 0; }  int[] nodeCounts = this.nodeCountOverrides; if (nodeCounts != null) { int override = nodeCounts[group]; if (override >= 0) return override;  }  return this.reader.nodeCount(group); } private final void updateNodeCount(int group, int count) { if (updatedNodeCount(group) != count) if (group < 0) { if (this.nodeCountVirtualOverrides == null) { ComposerImpl $this$updateNodeCount_u24lambda_u2420 = this; int $i$a$-run-ComposerImpl$updateNodeCount$virtualCounts$1 = 0; MutableIntIntMap newCounts = new MutableIntIntMap(0, 1, null); $this$updateNodeCount_u24lambda_u2420.nodeCountVirtualOverrides = newCounts; }  MutableIntIntMap virtualCounts = newCounts; virtualCounts.set(group, count); } else { if (this.nodeCountOverrides == null) { ComposerImpl $this$updateNodeCount_u24lambda_u2421 = this; int $i$a$-run-ComposerImpl$updateNodeCount$nodeCounts$1 = 0; int[] newCounts = new int[$this$updateNodeCount_u24lambda_u2421.reader.getSize()]; ArraysKt.fill$default(newCounts, -1, 0, 0, 6, null); $this$updateNodeCount_u24lambda_u2421.nodeCountOverrides = newCounts; }  int[] nodeCounts = newCounts; nodeCounts[group] = count; }   } private final void clearUpdatedNodeCounts() { this.nodeCountOverrides = null; this.nodeCountVirtualOverrides = null; } private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) { SlotReader reader = this.reader; int nearestCommonRoot = ComposerKt.access$nearestCommonRootOf(reader, oldGroup, newGroup, commonRoot); int current = oldGroup; while (current > 0 && current != nearestCommonRoot) { if (reader.isNode(current)) this.changeListWriter.moveUp();  current = reader.parent(current); }  doRecordDownsFor(newGroup, nearestCommonRoot); }
/*      */   private final void doRecordDownsFor(int group, int nearestCommonRoot) { if (group > 0 && group != nearestCommonRoot) { doRecordDownsFor(this.reader.parent(group), nearestCommonRoot); if (this.reader.isNode(group)) this.changeListWriter.moveDown(nodeAt(this.reader, group));  }  }
/* 4691 */   private final int compoundKeyOf(int group, int rGroupIndex, int recomposeGroup, int recomposeKey) { ComposerImpl $this$compoundKeyOf_u24lambda_u2422 = this; int $i$a$-run-ComposerImpl$compoundKeyOf$1 = 0; int groupKey = $this$compoundKeyOf_u24lambda_u2422.groupCompoundKeyPart($this$compoundKeyOf_u24lambda_u2422.reader, group); int parent = $this$compoundKeyOf_u24lambda_u2422.reader.parent(group); int parentKey = (parent == recomposeGroup) ? recomposeKey : $this$compoundKeyOf_u24lambda_u2422.compoundKeyOf(parent, $this$compoundKeyOf_u24lambda_u2422.rGroupIndexOf(parent), recomposeGroup, recomposeKey); int effectiveRGroupIndex = $this$compoundKeyOf_u24lambda_u2422.reader.hasObjectKey(group) ? 0 : rGroupIndex; int i = parentKey, other$iv = 3, $i$f$rol = 0, $this$rol$iv = Integer.rotateLeft(i, other$iv) ^ groupKey; other$iv = 3; $i$f$rol = 0; return (group == recomposeGroup) ? recomposeKey : ((groupKey == 126665345) ? groupKey : (Integer.rotateLeft($this$rol$iv, other$iv) ^ effectiveRGroupIndex)); } private final int groupCompoundKeyPart(SlotReader $this$groupCompoundKeyPart, int group) { Object object1 = $this$groupCompoundKeyPart.groupObjectKey(group); int $i$a$-let-ComposerImpl$groupCompoundKeyPart$1 = 0; Object object2 = object1; $this$groupCompoundKeyPart.groupObjectKey(group); int it = $this$groupCompoundKeyPart.groupKey(group), $i$a$-let-ComposerImpl$groupCompoundKeyPart$2 = 0; Object aux = $this$groupCompoundKeyPart.groupAux(group); int $i$a$-let-ComposerImpl$groupCompoundKeyPart$2$1 = 0; $this$groupCompoundKeyPart.groupAux(group); return $this$groupCompoundKeyPart.hasObjectKey(group) ? (($this$groupCompoundKeyPart.groupObjectKey(group) != null) ? ((object2 instanceof Enum) ? ((Enum)object1).ordinal() : ((object2 instanceof MovableContent) ? 126665345 : object1.hashCode())) : 0) : ((it == 207) ? (($this$groupCompoundKeyPart.groupAux(group) != null) ? (Intrinsics.areEqual(aux, Composer.Companion.getEmpty()) ? it : aux.hashCode()) : it) : it); }
/*      */   public final boolean tryImminentInvalidation$runtime(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) { Anchor anchor; Intrinsics.checkNotNullParameter(scope, "scope"); if (scope.getAnchor() == null) { scope.getAnchor(); return false; }  SlotTable slotTable = this.reader.getTable$runtime(); int location = anchor.toIndexFor(slotTable); if (this.isComposing && location >= this.reader.getCurrentGroup()) { ComposerKt.access$insertIfMissing(this.invalidations, location, scope, instance); return true; }  return false; }
/*      */   @TestOnly public final int parentKey$runtime() { return getInserting() ? this.writer.groupKey(this.writer.getParent()) : this.reader.groupKey(this.reader.getParent()); }
/* 4694 */   @ComposeCompilerApi public void skipCurrentGroup() { if (this.invalidations.isEmpty()) { skipGroup(); } else { SlotReader reader = this.reader; int key = reader.getGroupKey(); Object dataKey = reader.getGroupObjectKey(); Object aux = reader.getGroupAux(); int rGroupIndex = this.rGroupIndex; ComposerImpl this_$iv = this; int $i$f$updateCompoundKeyWhenWeEnterGroup = 0; ComposerImpl composerImpl1 = this_$iv; int i = aux.hashCode(), j = 0;
/* 4695 */       int n = composerImpl1.getCompoundKeyHash(), i2 = 3, i4 = 0, m = 
/* 4696 */         Integer.rotateLeft(n, i2) ^ i; i2 = 3; i4 = 0; composerImpl1.compoundKeyHash = Integer.rotateLeft(m, i2) ^ rGroupIndex;
/*      */       
/* 4698 */       ComposerImpl this_$iv$iv = this_$iv; int $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 4707 */       j = this_$iv$iv.getCompoundKeyHash(); int other$iv$iv$iv = 3, $i$f$rol = 0, $this$rol$iv$iv$iv = Integer.rotateLeft(j, other$iv$iv$iv) ^ key; other$iv$iv$iv = 3; $i$f$rol = 0; this_$iv$iv.compoundKeyHash = Integer.rotateLeft($this$rol$iv$iv$iv, other$iv$iv$iv) ^ rGroupIndex; if (dataKey instanceof Enum) { this_$iv$iv = this_$iv; $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = ((Enum)dataKey).ordinal(); int i6 = 0, i7 = 0; $i$f$rol = this_$iv$iv.getCompoundKeyHash(); int i9 = 3, i10 = 0, i8 = Integer.rotateLeft($i$f$rol, i9) ^ $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash; i9 = 3; i10 = 0; }  this_$iv$iv = this_$iv; int keyHash$iv$iv = dataKey.hashCode(), rGroupIndex$iv$iv = 0, k = 0; int i1 = this_$iv$iv.getCompoundKeyHash(), i3 = 3, i5 = 0; i1 = Integer.rotateLeft(i1, i3) ^ keyHash$iv$iv; i3 = 3; i5 = 0; this_$iv$iv.compoundKeyHash = Integer.rotateLeft(i1, i3) ^ rGroupIndex$iv$iv; }
/*      */      } private final void skipReaderToGroupEnd() { this.groupNodeCount = this.reader.getParentNodes(); this.reader.skipToGroupEnd(); }
/*      */   @ComposeCompilerApi public void skipToGroupEnd() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield groupNodeCount : I
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
/*      */     //   22: ldc_w 'No nodes can be emitted before calling skipAndEndGroup'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: aload_0
/*      */     //   30: invokevirtual getCurrentRecomposeScope$runtime : ()Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   33: dup
/*      */     //   34: ifnull -> 43
/*      */     //   37: invokevirtual scopeSkipped : ()V
/*      */     //   40: goto -> 44
/*      */     //   43: pop
/*      */     //   44: aload_0
/*      */     //   45: getfield invalidations : Ljava/util/List;
/*      */     //   48: invokeinterface isEmpty : ()Z
/*      */     //   53: ifeq -> 63
/*      */     //   56: aload_0
/*      */     //   57: invokespecial skipReaderToGroupEnd : ()V
/*      */     //   60: goto -> 67
/*      */     //   63: aload_0
/*      */     //   64: invokespecial recomposeToGroupEnd : ()V
/*      */     //   67: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3132	-> 0
/*      */     //   #4726	-> 15
/*      */     //   #4729	-> 16
/*      */     //   #4730	-> 20
/*      */     //   #3133	-> 22
/*      */     //   #4730	-> 25
/*      */     //   #4732	-> 28
/*      */     //   #3135	-> 29
/*      */     //   #3136	-> 44
/*      */     //   #3137	-> 56
/*      */     //   #3139	-> 63
/*      */     //   #3141	-> 67
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-ComposerImpl$skipToGroupEnd$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   0	68	0	this	Landroidx/compose/runtime/ComposerImpl; }
/*      */   @ComposeCompilerApi public void deactivateToEndGroup(boolean changed) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield groupNodeCount : I
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
/*      */     //   23: ldc_w 'No nodes can be emitted before calling dactivateToEndGroup'
/*      */     //   26: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: aload_0
/*      */     //   31: invokevirtual getInserting : ()Z
/*      */     //   34: ifne -> 85
/*      */     //   37: iload_1
/*      */     //   38: ifne -> 46
/*      */     //   41: aload_0
/*      */     //   42: invokespecial skipReaderToGroupEnd : ()V
/*      */     //   45: return
/*      */     //   46: aload_0
/*      */     //   47: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   50: invokevirtual getCurrentGroup : ()I
/*      */     //   53: istore_2
/*      */     //   54: aload_0
/*      */     //   55: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   58: invokevirtual getCurrentEnd : ()I
/*      */     //   61: istore_3
/*      */     //   62: aload_0
/*      */     //   63: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   66: invokevirtual deactivateCurrentGroup : ()V
/*      */     //   69: aload_0
/*      */     //   70: getfield invalidations : Ljava/util/List;
/*      */     //   73: iload_2
/*      */     //   74: iload_3
/*      */     //   75: invokestatic access$removeRange : (Ljava/util/List;II)V
/*      */     //   78: aload_0
/*      */     //   79: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   82: invokevirtual skipToGroupEnd : ()V
/*      */     //   85: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3145	-> 0
/*      */     //   #4733	-> 15
/*      */     //   #4736	-> 16
/*      */     //   #4737	-> 20
/*      */     //   #3146	-> 23
/*      */     //   #4737	-> 26
/*      */     //   #4739	-> 29
/*      */     //   #3148	-> 30
/*      */     //   #3149	-> 37
/*      */     //   #3150	-> 41
/*      */     //   #3151	-> 45
/*      */     //   #3153	-> 46
/*      */     //   #3154	-> 54
/*      */     //   #3155	-> 62
/*      */     //   #3156	-> 69
/*      */     //   #3157	-> 78
/*      */     //   #3159	-> 85
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	4	$i$a$-runtimeCheck-ComposerImpl$deactivateToEndGroup$1	I
/*      */     //   15	15	3	$i$f$runtimeCheck	I
/*      */     //   13	17	2	value$iv	Z
/*      */     //   54	31	2	start	I
/*      */     //   62	23	3	end	I
/*      */     //   0	86	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	86	1	changed	Z }
/*      */   @ComposeCompilerApi @NotNull public Composer startRestartGroup(int key) { startReplaceGroup(key); addRecomposeScope(); return this; }
/*      */   private final void addRecomposeScope() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual getInserting : ()Z
/*      */     //   4: ifeq -> 57
/*      */     //   7: new androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   10: dup
/*      */     //   11: aload_0
/*      */     //   12: invokevirtual getComposition : ()Landroidx/compose/runtime/ControlledComposition;
/*      */     //   15: dup
/*      */     //   16: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl'
/*      */     //   19: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   22: checkcast androidx/compose/runtime/CompositionImpl
/*      */     //   25: checkcast androidx/compose/runtime/RecomposeScopeOwner
/*      */     //   28: invokespecial <init> : (Landroidx/compose/runtime/RecomposeScopeOwner;)V
/*      */     //   31: astore_1
/*      */     //   32: aload_0
/*      */     //   33: getfield invalidateStack : Landroidx/compose/runtime/Stack;
/*      */     //   36: aload_1
/*      */     //   37: invokevirtual push : (Ljava/lang/Object;)Z
/*      */     //   40: pop
/*      */     //   41: aload_0
/*      */     //   42: aload_1
/*      */     //   43: invokevirtual updateValue : (Ljava/lang/Object;)V
/*      */     //   46: aload_1
/*      */     //   47: aload_0
/*      */     //   48: getfield compositionToken : I
/*      */     //   51: invokevirtual start : (I)V
/*      */     //   54: goto -> 205
/*      */     //   57: aload_0
/*      */     //   58: getfield invalidations : Ljava/util/List;
/*      */     //   61: aload_0
/*      */     //   62: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   65: invokevirtual getParent : ()I
/*      */     //   68: invokestatic access$removeLocation : (Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;
/*      */     //   71: astore_1
/*      */     //   72: aload_0
/*      */     //   73: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   76: invokevirtual next : ()Ljava/lang/Object;
/*      */     //   79: astore_2
/*      */     //   80: aload_2
/*      */     //   81: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   84: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   87: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   90: ifeq -> 130
/*      */     //   93: new androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   96: dup
/*      */     //   97: aload_0
/*      */     //   98: invokevirtual getComposition : ()Landroidx/compose/runtime/ControlledComposition;
/*      */     //   101: dup
/*      */     //   102: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl'
/*      */     //   105: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   108: checkcast androidx/compose/runtime/CompositionImpl
/*      */     //   111: checkcast androidx/compose/runtime/RecomposeScopeOwner
/*      */     //   114: invokespecial <init> : (Landroidx/compose/runtime/RecomposeScopeOwner;)V
/*      */     //   117: astore #4
/*      */     //   119: aload_0
/*      */     //   120: aload #4
/*      */     //   122: invokevirtual updateValue : (Ljava/lang/Object;)V
/*      */     //   125: aload #4
/*      */     //   127: goto -> 141
/*      */     //   130: aload_2
/*      */     //   131: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl'
/*      */     //   134: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   137: aload_2
/*      */     //   138: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   141: astore_3
/*      */     //   142: aload_3
/*      */     //   143: aload_1
/*      */     //   144: ifnonnull -> 180
/*      */     //   147: aload_3
/*      */     //   148: invokevirtual getForcedRecompose : ()Z
/*      */     //   151: istore #4
/*      */     //   153: iload #4
/*      */     //   155: istore #5
/*      */     //   157: astore #7
/*      */     //   159: iconst_0
/*      */     //   160: istore #6
/*      */     //   162: iload #5
/*      */     //   164: ifeq -> 172
/*      */     //   167: aload_3
/*      */     //   168: iconst_0
/*      */     //   169: invokevirtual setForcedRecompose : (Z)V
/*      */     //   172: nop
/*      */     //   173: aload #7
/*      */     //   175: iload #4
/*      */     //   177: ifeq -> 184
/*      */     //   180: iconst_1
/*      */     //   181: goto -> 185
/*      */     //   184: iconst_0
/*      */     //   185: invokevirtual setRequiresRecompose : (Z)V
/*      */     //   188: aload_0
/*      */     //   189: getfield invalidateStack : Landroidx/compose/runtime/Stack;
/*      */     //   192: aload_3
/*      */     //   193: invokevirtual push : (Ljava/lang/Object;)Z
/*      */     //   196: pop
/*      */     //   197: aload_3
/*      */     //   198: aload_0
/*      */     //   199: getfield compositionToken : I
/*      */     //   202: invokevirtual start : (I)V
/*      */     //   205: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3175	-> 0
/*      */     //   #3176	-> 7
/*      */     //   #3177	-> 32
/*      */     //   #3178	-> 41
/*      */     //   #3179	-> 46
/*      */     //   #3181	-> 57
/*      */     //   #3182	-> 72
/*      */     //   #3183	-> 80
/*      */     //   #3186	-> 93
/*      */     //   #3187	-> 119
/*      */     //   #3188	-> 125
/*      */     //   #3189	-> 130
/*      */     //   #3183	-> 141
/*      */     //   #3190	-> 142
/*      */     //   #3191	-> 162
/*      */     //   #3192	-> 172
/*      */     //   #3190	-> 175
/*      */     //   #3190	-> 185
/*      */     //   #3193	-> 188
/*      */     //   #3194	-> 197
/*      */     //   #3196	-> 205
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   32	22	1	scope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   119	8	4	newScope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   162	11	6	$i$a$-also-ComposerImpl$addRecomposeScope$1	I
/*      */     //   159	14	5	forced	Z
/*      */     //   72	133	1	invalidation	Landroidx/compose/runtime/Invalidation;
/*      */     //   80	125	2	slot	Ljava/lang/Object;
/*      */     //   142	63	3	scope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   0	206	0	this	Landroidx/compose/runtime/ComposerImpl; }
/*      */   @ComposeCompilerApi @Nullable public ScopeUpdateScope endRestartGroup() { RecomposeScopeImpl scope = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null; if (scope == null) {  }
/*      */     else { scope.setRequiresRecompose(false); }
/*      */      Function1<Composition, Unit> it = scope.end(this.compositionToken); int $i$a$-let-ComposerImpl$endRestartGroup$1 = 0; this.changeListWriter.endCompositionScope(it, getComposition()); scope.end(this.compositionToken); if (scope.getAnchor() == null)
/*      */       scope.setAnchor(getInserting() ? this.writer.anchor(this.writer.getParent()) : this.reader.anchor(this.reader.getParent()));  scope.setDefaultsInvalid(false); RecomposeScopeImpl result = (scope != null && !scope.getSkipped$runtime() && (scope.getUsed() || this.forceRecomposeScopes)) ? scope : null; end(false); return result; }
/*      */   @InternalComposeApi public void insertMovableContent(@NotNull MovableContent<Object> value, @Nullable Object parameter) { Intrinsics.checkNotNullParameter(value, "value"); invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false); }
/*      */   private final void invokeMovableContentLambda(MovableContent<Object> content, PersistentCompositionLocalMap locals, Object parameter, boolean force) { startMovableGroup(126665345, content); updateSlot(parameter); int savedCompoundKeyHash = getCompoundKeyHash(); try { this.compoundKeyHash = 126665345; if (getInserting())
/*      */         SlotWriter.markGroup$default(this.writer, 0, 1, null);  boolean providersChanged = getInserting() ? false : (!Intrinsics.areEqual(this.reader.getGroupAux(), locals)); if (providersChanged)
/*      */         recordProviderUpdate(locals);  start-BaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.getGroup-ULZAiWs(), locals); this.providerCache = null; if (getInserting() && !force) { this.writerHasAProvider = true; Anchor anchor = this.writer.anchor(this.writer.parent(this.writer.getParent())); MovableContentStateReference reference = new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, anchor, CollectionsKt.emptyList(), currentCompositionLocalScope()); this.parentContext.insertMovableContent$runtime(reference); }
/*      */       else { boolean savedProvidersInvalid = this.providersInvalid; this.providersInvalid = providersChanged; ActualJvm_jvmKt.invokeComposable(this, (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(316014703, true, new ComposerImpl$invokeMovableContentLambda$1(content, parameter))); this.providersInvalid = savedProvidersInvalid; }
/*      */        }
/*      */     finally
/*      */     { endGroup(); this.providerCache = null; this.compoundKeyHash = savedCompoundKeyHash; endMovableGroup(); }
/*      */      }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}) static final class ComposerImpl$invokeMovableContentLambda$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     ComposerImpl$invokeMovableContentLambda$1(MovableContent<Object> $content, Object $parameter) { super(2); }
/*      */     @Composable public final void invoke(@Nullable Composer $composer, int $changed) { ComposerKt.sourceInformation($composer, "C3293@126183L18:Composer.kt#9igjgp"); if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(316014703, $changed, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");  this.$content.getContent().invoke(this.$parameter, $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       }  } }
/*      */   @InternalComposeApi public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) { Intrinsics.checkNotNullParameter(references, "references"); boolean completed = false; try {
/*      */       insertMovableContentGuarded(references); completed = true; cleanUpCompose();
/*      */     } finally {
/*      */       abortRoot();
/*      */     }  }
/* 4740 */   private final void insertMovableContentGuarded(List references) { ComposerChangeListWriter composerChangeListWriter = this.changeListWriter; ChangeList newChangeList$iv = this.lateChanges; int $i$f$withChangeList = 0; ChangeList previousChangeList$iv = composerChangeListWriter.getChangeList();
/*      */     try {
/* 4742 */       composerChangeListWriter.setChangeList(newChangeList$iv);
/* 4743 */       int $i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1 = 0; this.changeListWriter.resetSlots(); List $this$fastForEach$iv = references;
/*      */       int $i$f$fastForEach = 0;
/* 4745 */       int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 4746 */         Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 4747 */         Pair pair = (Pair)item$iv; int $i$a$-fastForEach-ComposerImpl$insertMovableContentGuarded$1$1 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         MovableContentStateReference to = (MovableContentStateReference)pair.component1(), from = (MovableContentStateReference)pair.component2();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         Anchor anchor = to.getAnchor$runtime();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         int location = to.getSlotTable$runtime().anchorIndex(anchor);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         IntRef effectiveNodeIndex = new IntRef(0, 1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         this.changeListWriter.determineMovableContentNodeIndex(effectiveNodeIndex, anchor);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       this.changeListWriter.endMovableContentPlacement();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       this.changeListWriter.moveReaderToAbsolute(0);
/*      */     } finally {
/* 4790 */       composerChangeListWriter.setChangeList(previousChangeList$iv);
/*      */     }  } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4584:1\n182#2,4:4585\n192#2,8:4597\n187#2,3:4608\n3446#3,8:4589\n3455#3,3:4605\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3355#1:4585,4\n3357#1:4597,8\n3355#1:4608,3\n3356#1:4589,8\n3356#1:4605,3\n*E\n"})
/*      */   static final class ComposerImpl$insertMovableContentGuarded$1$1$1$1 extends Lambda implements Function0<Unit> {
/*      */     public final void invoke() { ComposerChangeListWriter composerChangeListWriter = ComposerImpl.this.changeListWriter;
/*      */       ChangeList changeList1 = this.$offsetChanges;
/*      */       ComposerImpl composerImpl = ComposerImpl.this;
/*      */       SlotReader slotReader = this.$reader;
/*      */       MovableContentStateReference movableContentStateReference = this.$to;
/*      */       int $i$f$withChangeList = 0;
/*      */       ChangeList previousChangeList$iv = composerChangeListWriter.getChangeList();
/*      */       try {
/*      */         composerChangeListWriter.setChangeList(changeList1);
/*      */         int $i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1 = 0;
/*      */         ComposerImpl this_$iv = composerImpl;
/*      */         int $i$f$withReader = 0;
/*      */         SlotReader savedReader$iv = this_$iv.getReader$runtime();
/*      */         int[] savedCountOverrides$iv = this_$iv.nodeCountOverrides;
/*      */         IntMap savedProviderUpdates$iv = this_$iv.providerUpdates;
/*      */       } finally {
/*      */         composerChangeListWriter.setChangeList(previousChangeList$iv);
/*      */       }  } ComposerImpl$insertMovableContentGuarded$1$1$1$1(ChangeList $offsetChanges, SlotReader $reader, MovableContentStateReference $to) { super(0); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*      */   static final class ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1 extends Lambda implements Function0<Unit> {
/*      */     public final void invoke() { ComposerImpl.this.invokeMovableContentLambda(this.$to.getContent$runtime(), this.$to.getLocals$runtime(), this.$to.getParameter$runtime(), true); } ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(MovableContentStateReference $to) { super(0); } } private final <R> R withReader(SlotReader reader, Function0 block) { int $i$f$withReader = 0;
/*      */     SlotReader savedReader = getReader$runtime();
/*      */     int[] savedCountOverrides = this.nodeCountOverrides;
/*      */     IntMap savedProviderUpdates = this.providerUpdates;
/*      */     this.nodeCountOverrides = null;
/*      */     this.providerUpdates = null;
/*      */     try {
/*      */       setReader$runtime(reader);
/*      */       return (R)block.invoke();
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       setReader$runtime(savedReader);
/*      */       this.nodeCountOverrides = savedCountOverrides;
/*      */       this.providerUpdates = savedProviderUpdates;
/*      */       InlineMarker.finallyEnd(1);
/*      */     }  } private final <R> R recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List invalidations, Function0 block) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield isComposing : Z
/*      */     //   4: istore #6
/*      */     //   6: aload_0
/*      */     //   7: getfield nodeIndex : I
/*      */     //   10: istore #7
/*      */     //   12: nop
/*      */     //   13: aload_0
/*      */     //   14: iconst_1
/*      */     //   15: putfield isComposing : Z
/*      */     //   18: aload_0
/*      */     //   19: iconst_0
/*      */     //   20: putfield nodeIndex : I
/*      */     //   23: aload #4
/*      */     //   25: astore #8
/*      */     //   27: iconst_0
/*      */     //   28: istore #9
/*      */     //   30: nop
/*      */     //   31: iconst_0
/*      */     //   32: istore #10
/*      */     //   34: aload #8
/*      */     //   36: invokeinterface size : ()I
/*      */     //   41: istore #11
/*      */     //   43: iload #10
/*      */     //   45: iload #11
/*      */     //   47: if_icmpge -> 121
/*      */     //   50: aload #8
/*      */     //   52: iload #10
/*      */     //   54: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   59: astore #12
/*      */     //   61: aload #12
/*      */     //   63: checkcast kotlin/Pair
/*      */     //   66: astore #13
/*      */     //   68: iconst_0
/*      */     //   69: istore #14
/*      */     //   71: aload #13
/*      */     //   73: invokevirtual component1 : ()Ljava/lang/Object;
/*      */     //   76: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   79: astore #15
/*      */     //   81: aload #13
/*      */     //   83: invokevirtual component2 : ()Ljava/lang/Object;
/*      */     //   86: astore #16
/*      */     //   88: aload #16
/*      */     //   90: ifnull -> 105
/*      */     //   93: aload_0
/*      */     //   94: aload #15
/*      */     //   96: aload #16
/*      */     //   98: invokevirtual tryImminentInvalidation$runtime : (Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z
/*      */     //   101: pop
/*      */     //   102: goto -> 113
/*      */     //   105: aload_0
/*      */     //   106: aload #15
/*      */     //   108: aconst_null
/*      */     //   109: invokevirtual tryImminentInvalidation$runtime : (Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z
/*      */     //   112: pop
/*      */     //   113: nop
/*      */     //   114: nop
/*      */     //   115: iinc #10, 1
/*      */     //   118: goto -> 43
/*      */     //   121: nop
/*      */     //   122: aload_1
/*      */     //   123: dup
/*      */     //   124: ifnull -> 152
/*      */     //   127: aload_2
/*      */     //   128: aload_3
/*      */     //   129: dup
/*      */     //   130: ifnull -> 139
/*      */     //   133: invokevirtual intValue : ()I
/*      */     //   136: goto -> 141
/*      */     //   139: pop
/*      */     //   140: iconst_m1
/*      */     //   141: aload #5
/*      */     //   143: invokeinterface delegateInvalidations : (Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*      */     //   148: dup
/*      */     //   149: ifnonnull -> 160
/*      */     //   152: pop
/*      */     //   153: aload #5
/*      */     //   155: invokeinterface invoke : ()Ljava/lang/Object;
/*      */     //   160: astore #8
/*      */     //   162: aload_0
/*      */     //   163: iload #6
/*      */     //   165: putfield isComposing : Z
/*      */     //   168: aload_0
/*      */     //   169: iload #7
/*      */     //   171: putfield nodeIndex : I
/*      */     //   174: aload #8
/*      */     //   176: areturn
/*      */     //   177: astore #8
/*      */     //   179: aload_0
/*      */     //   180: iload #6
/*      */     //   182: putfield isComposing : Z
/*      */     //   185: aload_0
/*      */     //   186: iload #7
/*      */     //   188: putfield nodeIndex : I
/*      */     //   191: aload #8
/*      */     //   193: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3468	-> 0
/*      */     //   #3469	-> 6
/*      */     //   #3470	-> 12
/*      */     //   #3471	-> 13
/*      */     //   #3472	-> 18
/*      */     //   #3473	-> 23
/*      */     //   #4793	-> 30
/*      */     //   #4794	-> 31
/*      */     //   #4795	-> 50
/*      */     //   #4796	-> 61
/*      */     //   #3473	-> 71
/*      */     //   #3474	-> 88
/*      */     //   #3475	-> 93
/*      */     //   #3477	-> 105
/*      */     //   #3479	-> 113
/*      */     //   #4796	-> 114
/*      */     //   #4794	-> 115
/*      */     //   #4798	-> 121
/*      */     //   #3480	-> 122
/*      */     //   #3482	-> 162
/*      */     //   #3483	-> 168
/*      */     //   #3480	-> 176
/*      */     //   #3482	-> 177
/*      */     //   #3483	-> 185
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   71	43	14	$i$a$-fastForEach-ComposerImpl$recomposeMovableContent$1	I
/*      */     //   81	33	15	scope	Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   88	26	16	instances	Ljava/lang/Object;
/*      */     //   61	54	12	item$iv	Ljava/lang/Object;
/*      */     //   34	87	10	index$iv	I
/*      */     //   30	92	9	$i$f$fastForEach	I
/*      */     //   27	95	8	$this$fastForEach$iv	Ljava/util/List;
/*      */     //   6	188	6	savedIsComposing	Z
/*      */     //   12	182	7	savedNodeIndex	I
/*      */     //   0	194	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	194	1	from	Landroidx/compose/runtime/ControlledComposition;
/*      */     //   0	194	2	to	Landroidx/compose/runtime/ControlledComposition;
/*      */     //   0	194	3	index	Ljava/lang/Integer;
/*      */     //   0	194	4	invalidations	Ljava/util/List;
/*      */     //   0	194	5	block	Lkotlin/jvm/functions/Function0;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   12	162	177	finally
/*      */     //   177	179	177	finally } @ComposeCompilerApi
/*      */   public void sourceInformation(@NotNull String sourceInformation) { Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
/*      */     if (getInserting() && this.sourceMarkersEnabled)
/*      */       this.writer.recordGroupSourceInformation(sourceInformation);  } @ComposeCompilerApi
/*      */   public void sourceInformationMarkerStart(int key, @NotNull String sourceInformation) { Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
/*      */     if (getInserting() && this.sourceMarkersEnabled)
/*      */       this.writer.recordGrouplessCallSourceInformationStart(key, sourceInformation);  } @ComposeCompilerApi
/*      */   public void sourceInformationMarkerEnd() { if (getInserting() && this.sourceMarkersEnabled)
/*      */       this.writer.recordGrouplessCallSourceInformationEnd();  }
/*      */   public void disableSourceInformation() { this.sourceMarkersEnabled = false; }
/*      */   public final void composeContent$runtime(@NotNull ScopeMap invalidationsRequested, @NotNull Function2 content) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'invalidationsRequested'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_2
/*      */     //   8: ldc_w 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_0
/*      */     //   15: getfield changes : Landroidx/compose/runtime/changelist/ChangeList;
/*      */     //   18: invokevirtual isEmpty : ()Z
/*      */     //   21: istore_3
/*      */     //   22: iconst_0
/*      */     //   23: istore #4
/*      */     //   25: nop
/*      */     //   26: iload_3
/*      */     //   27: ifne -> 39
/*      */     //   30: iconst_0
/*      */     //   31: istore #5
/*      */     //   33: ldc_w 'Expected applyChanges() to have been called'
/*      */     //   36: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   39: nop
/*      */     //   40: aload_0
/*      */     //   41: aload_1
/*      */     //   42: aload_2
/*      */     //   43: invokespecial doCompose : (Landroidx/compose/runtime/collection/ScopeMap;Lkotlin/jvm/functions/Function2;)V
/*      */     //   46: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3521	-> 14
/*      */     //   #4799	-> 25
/*      */     //   #4802	-> 26
/*      */     //   #4803	-> 30
/*      */     //   #3521	-> 33
/*      */     //   #4803	-> 36
/*      */     //   #4805	-> 39
/*      */     //   #3522	-> 40
/*      */     //   #3523	-> 46
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   33	3	5	$i$a$-runtimeCheck-ComposerImpl$composeContent$1	I
/*      */     //   25	15	4	$i$f$runtimeCheck	I
/*      */     //   22	18	3	value$iv	Z
/*      */     //   0	47	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	47	1	invalidationsRequested	Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   0	47	2	content	Lkotlin/jvm/functions/Function2; }
/*      */   public final void prepareCompose$runtime(@NotNull Function0 block) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'block'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_0
/*      */     //   8: getfield isComposing : Z
/*      */     //   11: ifne -> 18
/*      */     //   14: iconst_1
/*      */     //   15: goto -> 19
/*      */     //   18: iconst_0
/*      */     //   19: istore_2
/*      */     //   20: iconst_0
/*      */     //   21: istore_3
/*      */     //   22: nop
/*      */     //   23: iload_2
/*      */     //   24: ifne -> 36
/*      */     //   27: iconst_0
/*      */     //   28: istore #4
/*      */     //   30: ldc_w 'Preparing a composition while composing is not supported'
/*      */     //   33: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   36: nop
/*      */     //   37: aload_0
/*      */     //   38: iconst_1
/*      */     //   39: putfield isComposing : Z
/*      */     //   42: nop
/*      */     //   43: aload_1
/*      */     //   44: invokeinterface invoke : ()Ljava/lang/Object;
/*      */     //   49: pop
/*      */     //   50: aload_0
/*      */     //   51: iconst_0
/*      */     //   52: putfield isComposing : Z
/*      */     //   55: goto -> 66
/*      */     //   58: astore_2
/*      */     //   59: aload_0
/*      */     //   60: iconst_0
/*      */     //   61: putfield isComposing : Z
/*      */     //   64: aload_2
/*      */     //   65: athrow
/*      */     //   66: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3526	-> 7
/*      */     //   #4806	-> 22
/*      */     //   #4809	-> 23
/*      */     //   #4810	-> 27
/*      */     //   #3526	-> 30
/*      */     //   #4810	-> 33
/*      */     //   #4812	-> 36
/*      */     //   #3527	-> 37
/*      */     //   #3528	-> 42
/*      */     //   #3529	-> 43
/*      */     //   #3531	-> 50
/*      */     //   #3532	-> 55
/*      */     //   #3531	-> 58
/*      */     //   #3533	-> 66
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   30	3	4	$i$a$-runtimeCheck-ComposerImpl$prepareCompose$1	I
/*      */     //   22	15	3	$i$f$runtimeCheck	I
/*      */     //   20	17	2	value$iv	Z
/*      */     //   0	67	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	67	1	block	Lkotlin/jvm/functions/Function0;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   42	50	58	finally
/*      */     //   58	59	58	finally }
/*      */   public final boolean recompose$runtime(@NotNull ScopeMap invalidationsRequested) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'invalidationsRequested'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_0
/*      */     //   8: getfield changes : Landroidx/compose/runtime/changelist/ChangeList;
/*      */     //   11: invokevirtual isEmpty : ()Z
/*      */     //   14: istore_2
/*      */     //   15: iconst_0
/*      */     //   16: istore_3
/*      */     //   17: nop
/*      */     //   18: iload_2
/*      */     //   19: ifne -> 31
/*      */     //   22: iconst_0
/*      */     //   23: istore #4
/*      */     //   25: ldc_w 'Expected applyChanges() to have been called'
/*      */     //   28: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   31: nop
/*      */     //   32: aload_1
/*      */     //   33: invokevirtual getSize : ()I
/*      */     //   36: ifgt -> 69
/*      */     //   39: aload_0
/*      */     //   40: getfield invalidations : Ljava/util/List;
/*      */     //   43: checkcast java/util/Collection
/*      */     //   46: invokeinterface isEmpty : ()Z
/*      */     //   51: ifne -> 58
/*      */     //   54: iconst_1
/*      */     //   55: goto -> 59
/*      */     //   58: iconst_0
/*      */     //   59: ifne -> 69
/*      */     //   62: aload_0
/*      */     //   63: getfield forciblyRecompose : Z
/*      */     //   66: ifeq -> 83
/*      */     //   69: aload_0
/*      */     //   70: aload_1
/*      */     //   71: aconst_null
/*      */     //   72: invokespecial doCompose : (Landroidx/compose/runtime/collection/ScopeMap;Lkotlin/jvm/functions/Function2;)V
/*      */     //   75: aload_0
/*      */     //   76: getfield changes : Landroidx/compose/runtime/changelist/ChangeList;
/*      */     //   79: invokevirtual isNotEmpty : ()Z
/*      */     //   82: ireturn
/*      */     //   83: iconst_0
/*      */     //   84: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3542	-> 7
/*      */     //   #4813	-> 17
/*      */     //   #4816	-> 18
/*      */     //   #4817	-> 22
/*      */     //   #3542	-> 25
/*      */     //   #4817	-> 28
/*      */     //   #4819	-> 31
/*      */     //   #3547	-> 32
/*      */     //   #3548	-> 32
/*      */     //   #3549	-> 39
/*      */     //   #3549	-> 59
/*      */     //   #3550	-> 62
/*      */     //   #3552	-> 69
/*      */     //   #3553	-> 75
/*      */     //   #3555	-> 83
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   25	3	4	$i$a$-runtimeCheck-ComposerImpl$recompose$1	I
/*      */     //   17	15	3	$i$f$runtimeCheck	I
/*      */     //   15	17	2	value$iv	Z
/*      */     //   0	85	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	85	1	invalidationsRequested	Landroidx/compose/runtime/collection/ScopeMap; }
/*      */   private final void doCompose(ScopeMap invalidationsRequested, Function2 content) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield isComposing : Z
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_3
/*      */     //   13: iconst_0
/*      */     //   14: istore #4
/*      */     //   16: nop
/*      */     //   17: iload_3
/*      */     //   18: ifne -> 30
/*      */     //   21: iconst_0
/*      */     //   22: istore #5
/*      */     //   24: ldc_w 'Reentrant composition is not supported'
/*      */     //   27: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   30: nop
/*      */     //   31: ldc_w 'Compose:recompose'
/*      */     //   34: astore_3
/*      */     //   35: iconst_0
/*      */     //   36: istore #4
/*      */     //   38: getstatic androidx/compose/runtime/Trace.INSTANCE : Landroidx/compose/runtime/Trace;
/*      */     //   41: aload_3
/*      */     //   42: invokevirtual beginSection : (Ljava/lang/String;)Ljava/lang/Object;
/*      */     //   45: astore #5
/*      */     //   47: nop
/*      */     //   48: iconst_0
/*      */     //   49: istore #6
/*      */     //   51: aload_0
/*      */     //   52: invokestatic currentSnapshot : ()Landroidx/compose/runtime/snapshots/Snapshot;
/*      */     //   55: invokevirtual getId : ()I
/*      */     //   58: putfield compositionToken : I
/*      */     //   61: aload_0
/*      */     //   62: aconst_null
/*      */     //   63: putfield providerUpdates : Landroidx/compose/runtime/collection/IntMap;
/*      */     //   66: aload_1
/*      */     //   67: invokevirtual getMap : ()Landroidx/collection/MutableScatterMap;
/*      */     //   70: checkcast androidx/collection/ScatterMap
/*      */     //   73: astore #7
/*      */     //   75: iconst_0
/*      */     //   76: istore #8
/*      */     //   78: aload #7
/*      */     //   80: getfield keys : [Ljava/lang/Object;
/*      */     //   83: astore #9
/*      */     //   85: aload #7
/*      */     //   87: getfield values : [Ljava/lang/Object;
/*      */     //   90: astore #10
/*      */     //   92: aload #7
/*      */     //   94: astore #11
/*      */     //   96: iconst_0
/*      */     //   97: istore #12
/*      */     //   99: aload #11
/*      */     //   101: getfield metadata : [J
/*      */     //   104: astore #13
/*      */     //   106: aload #13
/*      */     //   108: arraylength
/*      */     //   109: iconst_2
/*      */     //   110: isub
/*      */     //   111: istore #14
/*      */     //   113: iconst_0
/*      */     //   114: istore #15
/*      */     //   116: iload #15
/*      */     //   118: iload #14
/*      */     //   120: if_icmpgt -> 406
/*      */     //   123: aload #13
/*      */     //   125: iload #15
/*      */     //   127: laload
/*      */     //   128: lstore #16
/*      */     //   130: lload #16
/*      */     //   132: lstore #18
/*      */     //   134: iconst_0
/*      */     //   135: istore #20
/*      */     //   137: lload #18
/*      */     //   139: lload #18
/*      */     //   141: ldc2_w -1
/*      */     //   144: lxor
/*      */     //   145: bipush #7
/*      */     //   147: lshl
/*      */     //   148: land
/*      */     //   149: ldc2_w -9187201950435737472
/*      */     //   152: land
/*      */     //   153: ldc2_w -9187201950435737472
/*      */     //   156: lcmp
/*      */     //   157: ifeq -> 393
/*      */     //   160: bipush #8
/*      */     //   162: iload #15
/*      */     //   164: iload #14
/*      */     //   166: isub
/*      */     //   167: iconst_m1
/*      */     //   168: ixor
/*      */     //   169: bipush #31
/*      */     //   171: iushr
/*      */     //   172: isub
/*      */     //   173: istore #21
/*      */     //   175: iconst_0
/*      */     //   176: istore #22
/*      */     //   178: iload #22
/*      */     //   180: iload #21
/*      */     //   182: if_icmpge -> 386
/*      */     //   185: lload #16
/*      */     //   187: ldc2_w 255
/*      */     //   190: land
/*      */     //   191: lstore #23
/*      */     //   193: iconst_0
/*      */     //   194: istore #25
/*      */     //   196: lload #23
/*      */     //   198: ldc2_w 128
/*      */     //   201: lcmp
/*      */     //   202: ifge -> 209
/*      */     //   205: iconst_1
/*      */     //   206: goto -> 210
/*      */     //   209: iconst_0
/*      */     //   210: ifeq -> 373
/*      */     //   213: iload #15
/*      */     //   215: iconst_3
/*      */     //   216: ishl
/*      */     //   217: iload #22
/*      */     //   219: iadd
/*      */     //   220: istore #20
/*      */     //   222: iload #20
/*      */     //   224: istore #26
/*      */     //   226: iconst_0
/*      */     //   227: istore #27
/*      */     //   229: aload #9
/*      */     //   231: iload #26
/*      */     //   233: aaload
/*      */     //   234: aload #10
/*      */     //   236: iload #26
/*      */     //   238: aaload
/*      */     //   239: astore #28
/*      */     //   241: astore #29
/*      */     //   243: iconst_0
/*      */     //   244: istore #30
/*      */     //   246: aload #29
/*      */     //   248: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl'
/*      */     //   251: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   254: aload #29
/*      */     //   256: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   259: pop
/*      */     //   260: aload #29
/*      */     //   262: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   265: invokevirtual getAnchor : ()Landroidx/compose/runtime/Anchor;
/*      */     //   268: dup
/*      */     //   269: ifnull -> 278
/*      */     //   272: invokevirtual getLocation$runtime : ()I
/*      */     //   275: goto -> 282
/*      */     //   278: pop
/*      */     //   279: goto -> 370
/*      */     //   282: istore #31
/*      */     //   284: aload_0
/*      */     //   285: getfield invalidations : Ljava/util/List;
/*      */     //   288: aload #29
/*      */     //   290: checkcast androidx/compose/runtime/RecomposeScopeImpl
/*      */     //   293: iload #31
/*      */     //   295: aload #28
/*      */     //   297: astore #32
/*      */     //   299: aload #32
/*      */     //   301: astore #33
/*      */     //   303: istore #34
/*      */     //   305: astore #35
/*      */     //   307: astore #36
/*      */     //   309: iconst_0
/*      */     //   310: istore #37
/*      */     //   312: aload #33
/*      */     //   314: getstatic androidx/compose/runtime/ScopeInvalidated.INSTANCE : Landroidx/compose/runtime/ScopeInvalidated;
/*      */     //   317: if_acmpne -> 324
/*      */     //   320: iconst_1
/*      */     //   321: goto -> 325
/*      */     //   324: iconst_0
/*      */     //   325: istore #38
/*      */     //   327: aload #36
/*      */     //   329: aload #35
/*      */     //   331: iload #34
/*      */     //   333: iload #38
/*      */     //   335: ifne -> 343
/*      */     //   338: aload #32
/*      */     //   340: goto -> 344
/*      */     //   343: aconst_null
/*      */     //   344: astore #40
/*      */     //   346: istore #41
/*      */     //   348: astore #42
/*      */     //   350: new androidx/compose/runtime/Invalidation
/*      */     //   353: dup
/*      */     //   354: aload #42
/*      */     //   356: iload #41
/*      */     //   358: aload #40
/*      */     //   360: invokespecial <init> : (Landroidx/compose/runtime/RecomposeScopeImpl;ILjava/lang/Object;)V
/*      */     //   363: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   368: pop
/*      */     //   369: nop
/*      */     //   370: nop
/*      */     //   371: nop
/*      */     //   372: nop
/*      */     //   373: lload #16
/*      */     //   375: bipush #8
/*      */     //   377: lshr
/*      */     //   378: lstore #16
/*      */     //   380: iinc #22, 1
/*      */     //   383: goto -> 178
/*      */     //   386: iload #21
/*      */     //   388: bipush #8
/*      */     //   390: if_icmpne -> 407
/*      */     //   393: iload #15
/*      */     //   395: iload #14
/*      */     //   397: if_icmpeq -> 406
/*      */     //   400: iinc #15, 1
/*      */     //   403: goto -> 123
/*      */     //   406: nop
/*      */     //   407: nop
/*      */     //   408: aload_0
/*      */     //   409: getfield invalidations : Ljava/util/List;
/*      */     //   412: invokestatic access$getInvalidationLocationAscending$p : ()Ljava/util/Comparator;
/*      */     //   415: invokestatic sortWith : (Ljava/util/List;Ljava/util/Comparator;)V
/*      */     //   418: aload_0
/*      */     //   419: iconst_0
/*      */     //   420: putfield nodeIndex : I
/*      */     //   423: iconst_0
/*      */     //   424: istore #7
/*      */     //   426: aload_0
/*      */     //   427: iconst_1
/*      */     //   428: putfield isComposing : Z
/*      */     //   431: nop
/*      */     //   432: aload_0
/*      */     //   433: invokespecial startRoot : ()V
/*      */     //   436: aload_0
/*      */     //   437: invokevirtual nextSlot : ()Ljava/lang/Object;
/*      */     //   440: astore #8
/*      */     //   442: aload #8
/*      */     //   444: aload_2
/*      */     //   445: if_acmpeq -> 460
/*      */     //   448: aload_2
/*      */     //   449: ifnull -> 460
/*      */     //   452: aload_0
/*      */     //   453: aload_2
/*      */     //   454: checkcast java/lang/Object
/*      */     //   457: invokevirtual updateValue : (Ljava/lang/Object;)V
/*      */     //   460: aload_0
/*      */     //   461: getfield derivedStateObserver : Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;
/*      */     //   464: checkcast androidx/compose/runtime/DerivedStateObserver
/*      */     //   467: astore #9
/*      */     //   469: iconst_0
/*      */     //   470: istore #10
/*      */     //   472: invokestatic derivedStateObservers : ()Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   475: astore #11
/*      */     //   477: nop
/*      */     //   478: aload #11
/*      */     //   480: aload #9
/*      */     //   482: invokevirtual add : (Ljava/lang/Object;)Z
/*      */     //   485: pop
/*      */     //   486: iconst_0
/*      */     //   487: istore #12
/*      */     //   489: aload_2
/*      */     //   490: ifnull -> 518
/*      */     //   493: aload_0
/*      */     //   494: sipush #200
/*      */     //   497: invokestatic getInvocation : ()Ljava/lang/Object;
/*      */     //   500: invokespecial startGroup : (ILjava/lang/Object;)V
/*      */     //   503: aload_0
/*      */     //   504: checkcast androidx/compose/runtime/Composer
/*      */     //   507: aload_2
/*      */     //   508: invokestatic invokeComposable : (Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V
/*      */     //   511: aload_0
/*      */     //   512: invokespecial endGroup : ()V
/*      */     //   515: goto -> 588
/*      */     //   518: aload_0
/*      */     //   519: getfield forciblyRecompose : Z
/*      */     //   522: ifne -> 532
/*      */     //   525: aload_0
/*      */     //   526: getfield providersInvalid : Z
/*      */     //   529: ifeq -> 584
/*      */     //   532: aload #8
/*      */     //   534: ifnull -> 584
/*      */     //   537: aload #8
/*      */     //   539: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   542: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   545: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   548: ifne -> 584
/*      */     //   551: aload_0
/*      */     //   552: sipush #200
/*      */     //   555: invokestatic getInvocation : ()Ljava/lang/Object;
/*      */     //   558: invokespecial startGroup : (ILjava/lang/Object;)V
/*      */     //   561: aload_0
/*      */     //   562: checkcast androidx/compose/runtime/Composer
/*      */     //   565: aload #8
/*      */     //   567: iconst_2
/*      */     //   568: invokestatic beforeCheckcastToFunctionOfArity : (Ljava/lang/Object;I)Ljava/lang/Object;
/*      */     //   571: checkcast kotlin/jvm/functions/Function2
/*      */     //   574: invokestatic invokeComposable : (Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V
/*      */     //   577: aload_0
/*      */     //   578: invokespecial endGroup : ()V
/*      */     //   581: goto -> 588
/*      */     //   584: aload_0
/*      */     //   585: invokevirtual skipCurrentGroup : ()V
/*      */     //   588: nop
/*      */     //   589: nop
/*      */     //   590: aload #11
/*      */     //   592: aload #11
/*      */     //   594: astore #13
/*      */     //   596: iconst_0
/*      */     //   597: istore #14
/*      */     //   599: aload #13
/*      */     //   601: invokevirtual getSize : ()I
/*      */     //   604: iconst_1
/*      */     //   605: isub
/*      */     //   606: invokevirtual removeAt : (I)Ljava/lang/Object;
/*      */     //   609: pop
/*      */     //   610: goto -> 638
/*      */     //   613: astore #13
/*      */     //   615: aload #11
/*      */     //   617: aload #11
/*      */     //   619: astore #14
/*      */     //   621: iconst_0
/*      */     //   622: istore #15
/*      */     //   624: aload #14
/*      */     //   626: invokevirtual getSize : ()I
/*      */     //   629: iconst_1
/*      */     //   630: isub
/*      */     //   631: invokevirtual removeAt : (I)Ljava/lang/Object;
/*      */     //   634: pop
/*      */     //   635: aload #13
/*      */     //   637: athrow
/*      */     //   638: nop
/*      */     //   639: aload_0
/*      */     //   640: invokespecial endRoot : ()V
/*      */     //   643: iconst_1
/*      */     //   644: istore #7
/*      */     //   646: aload_0
/*      */     //   647: iconst_0
/*      */     //   648: putfield isComposing : Z
/*      */     //   651: aload_0
/*      */     //   652: getfield invalidations : Ljava/util/List;
/*      */     //   655: invokeinterface clear : ()V
/*      */     //   660: nop
/*      */     //   661: aload_0
/*      */     //   662: invokespecial createFreshInsertTable : ()V
/*      */     //   665: goto -> 695
/*      */     //   668: astore #8
/*      */     //   670: aload_0
/*      */     //   671: iconst_0
/*      */     //   672: putfield isComposing : Z
/*      */     //   675: aload_0
/*      */     //   676: getfield invalidations : Ljava/util/List;
/*      */     //   679: invokeinterface clear : ()V
/*      */     //   684: aload_0
/*      */     //   685: invokespecial abortRoot : ()V
/*      */     //   688: aload_0
/*      */     //   689: invokespecial createFreshInsertTable : ()V
/*      */     //   692: aload #8
/*      */     //   694: athrow
/*      */     //   695: nop
/*      */     //   696: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   699: astore #39
/*      */     //   701: getstatic androidx/compose/runtime/Trace.INSTANCE : Landroidx/compose/runtime/Trace;
/*      */     //   704: aload #5
/*      */     //   706: invokevirtual endSection : (Ljava/lang/Object;)V
/*      */     //   709: goto -> 725
/*      */     //   712: astore #39
/*      */     //   714: getstatic androidx/compose/runtime/Trace.INSTANCE : Landroidx/compose/runtime/Trace;
/*      */     //   717: aload #5
/*      */     //   719: invokevirtual endSection : (Ljava/lang/Object;)V
/*      */     //   722: aload #39
/*      */     //   724: athrow
/*      */     //   725: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3562	-> 0
/*      */     //   #4820	-> 16
/*      */     //   #4823	-> 17
/*      */     //   #4824	-> 21
/*      */     //   #3562	-> 24
/*      */     //   #4824	-> 27
/*      */     //   #4826	-> 30
/*      */     //   #3563	-> 31
/*      */     //   #4827	-> 38
/*      */     //   #4828	-> 47
/*      */     //   #4829	-> 48
/*      */     //   #3564	-> 51
/*      */     //   #3565	-> 61
/*      */     //   #3566	-> 66
/*      */     //   #4830	-> 78
/*      */     //   #4831	-> 85
/*      */     //   #4833	-> 92
/*      */     //   #4834	-> 99
/*      */     //   #4835	-> 106
/*      */     //   #4837	-> 113
/*      */     //   #4838	-> 123
/*      */     //   #4839	-> 130
/*      */     //   #4840	-> 137
/*      */     //   #4839	-> 153
/*      */     //   #4841	-> 160
/*      */     //   #4842	-> 175
/*      */     //   #4843	-> 185
/*      */     //   #4844	-> 196
/*      */     //   #4843	-> 210
/*      */     //   #4845	-> 213
/*      */     //   #4846	-> 222
/*      */     //   #4847	-> 229
/*      */     //   #3567	-> 246
/*      */     //   #3568	-> 260
/*      */     //   #3569	-> 284
/*      */     //   #3570	-> 288
/*      */     //   #3571	-> 288
/*      */     //   #3572	-> 293
/*      */     //   #3573	-> 295
/*      */     //   #4585	-> 303
/*      */     //   #3573	-> 312
/*      */     //   #3573	-> 335
/*      */     //   #3570	-> 344
/*      */     //   #3569	-> 363
/*      */     //   #3576	-> 369
/*      */     //   #4847	-> 370
/*      */     //   #4848	-> 371
/*      */     //   #4846	-> 372
/*      */     //   #4849	-> 373
/*      */     //   #4842	-> 380
/*      */     //   #4851	-> 386
/*      */     //   #4837	-> 393
/*      */     //   #4854	-> 406
/*      */     //   #4855	-> 407
/*      */     //   #3577	-> 408
/*      */     //   #3578	-> 418
/*      */     //   #3579	-> 423
/*      */     //   #3580	-> 426
/*      */     //   #3581	-> 431
/*      */     //   #3582	-> 432
/*      */     //   #3585	-> 436
/*      */     //   #3586	-> 442
/*      */     //   #3587	-> 452
/*      */     //   #3592	-> 460
/*      */     //   #4856	-> 472
/*      */     //   #4857	-> 477
/*      */     //   #4858	-> 478
/*      */     //   #4859	-> 486
/*      */     //   #3593	-> 489
/*      */     //   #3594	-> 493
/*      */     //   #3595	-> 503
/*      */     //   #3596	-> 511
/*      */     //   #3598	-> 518
/*      */     //   #3599	-> 532
/*      */     //   #3600	-> 537
/*      */     //   #3602	-> 551
/*      */     //   #3604	-> 561
/*      */     //   #3605	-> 577
/*      */     //   #3607	-> 584
/*      */     //   #3609	-> 588
/*      */     //   #4859	-> 589
/*      */     //   #4861	-> 590
/*      */     //   #4862	-> 599
/*      */     //   #4861	-> 606
/*      */     //   #4863	-> 610
/*      */     //   #4861	-> 613
/*      */     //   #4862	-> 624
/*      */     //   #4861	-> 631
/*      */     //   #4864	-> 638
/*      */     //   #3610	-> 639
/*      */     //   #3611	-> 643
/*      */     //   #3613	-> 646
/*      */     //   #3614	-> 651
/*      */     //   #3615	-> 660
/*      */     //   #3616	-> 661
/*      */     //   #3617	-> 665
/*      */     //   #3613	-> 668
/*      */     //   #3614	-> 675
/*      */     //   #3615	-> 684
/*      */     //   #3616	-> 688
/*      */     //   #3618	-> 695
/*      */     //   #4829	-> 699
/*      */     //   #4865	-> 701
/*      */     //   #4829	-> 709
/*      */     //   #4865	-> 712
/*      */     //   #3619	-> 725
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   24	3	5	$i$a$-runtimeCheck-ComposerImpl$doCompose$1	I
/*      */     //   16	15	4	$i$f$runtimeCheck	I
/*      */     //   13	18	3	value$iv	Z
/*      */     //   312	13	37	$i$a$-takeUnless-ComposerImpl$doCompose$2$1$1	I
/*      */     //   309	16	33	it	Ljava/lang/Object;
/*      */     //   246	124	30	$i$a$-forEach-ComposerImpl$doCompose$2$1	I
/*      */     //   284	86	31	location	I
/*      */     //   243	127	29	scope	Ljava/lang/Object;
/*      */     //   243	127	28	instances	Ljava/lang/Object;
/*      */     //   229	143	27	$i$a$-forEachIndexed-ScatterMap$forEach$1$iv	I
/*      */     //   226	146	26	index$iv	I
/*      */     //   137	16	20	$i$f$maskEmptyOrDeleted	I
/*      */     //   134	19	18	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*      */     //   196	14	25	$i$f$isFull	I
/*      */     //   193	17	23	value$iv$iv$iv	J
/*      */     //   222	151	20	index$iv$iv	I
/*      */     //   178	208	22	j$iv$iv	I
/*      */     //   175	218	21	bitCount$iv$iv	I
/*      */     //   130	263	16	slot$iv$iv	J
/*      */     //   116	290	15	i$iv$iv	I
/*      */     //   99	308	12	$i$f$forEachIndexed	I
/*      */     //   106	301	13	m$iv$iv	[J
/*      */     //   113	294	14	lastIndex$iv$iv	I
/*      */     //   96	311	11	this_$iv$iv	Landroidx/collection/ScatterMap;
/*      */     //   78	330	8	$i$f$forEach	I
/*      */     //   85	323	9	k$iv	[Ljava/lang/Object;
/*      */     //   92	316	10	v$iv	[Ljava/lang/Object;
/*      */     //   75	333	7	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   489	100	12	$i$a$-observeDerivedStateRecalculations-ComposerImpl$doCompose$2$2	I
/*      */     //   599	7	14	$i$f$getLastIndex	I
/*      */     //   596	10	13	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   624	7	15	$i$f$getLastIndex	I
/*      */     //   621	10	14	this_$iv$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   472	167	10	$i$f$observeDerivedStateRecalculations	I
/*      */     //   477	162	11	observers$iv	Landroidx/compose/runtime/collection/MutableVector;
/*      */     //   469	170	9	observer$iv	Landroidx/compose/runtime/DerivedStateObserver;
/*      */     //   442	204	8	savedContent	Ljava/lang/Object;
/*      */     //   51	645	6	$i$a$-trace-ComposerImpl$doCompose$2	I
/*      */     //   426	270	7	complete	Z
/*      */     //   38	687	4	$i$f$trace	I
/*      */     //   47	678	5	token$iv	Ljava/lang/Object;
/*      */     //   35	690	3	sectionName$iv	Ljava/lang/String;
/*      */     //   0	726	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	726	1	invalidationsRequested	Landroidx/compose/runtime/collection/ScopeMap;
/*      */     //   0	726	2	content	Lkotlin/jvm/functions/Function2;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   47	701	712	finally
/*      */     //   431	646	668	finally
/*      */     //   477	590	613	finally
/*      */     //   613	615	613	finally
/*      */     //   668	670	668	finally
/*      */     //   712	714	712	finally }
/*      */   public final boolean getHasInvalidations() {
/*      */     return !this.invalidations.isEmpty();
/*      */   }
/*      */   private final Object getNode(SlotReader $this$node) {
/*      */     return $this$node.node($this$node.getParent());
/*      */   }
/*      */   private final Object nodeAt(SlotReader $this$nodeAt, int index) {
/*      */     return $this$nodeAt.node(index);
/*      */   }
/*      */   private final void validateNodeExpected() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield nodeExpected : Z
/*      */     //   4: istore_1
/*      */     //   5: iconst_0
/*      */     //   6: istore_2
/*      */     //   7: nop
/*      */     //   8: iload_1
/*      */     //   9: ifne -> 20
/*      */     //   12: iconst_0
/*      */     //   13: istore_3
/*      */     //   14: ldc_w 'A call to createNode(), emitNode() or useNode() expected was not expected'
/*      */     //   17: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   20: nop
/*      */     //   21: aload_0
/*      */     //   22: iconst_0
/*      */     //   23: putfield nodeExpected : Z
/*      */     //   26: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3628	-> 0
/*      */     //   #4866	-> 7
/*      */     //   #4869	-> 8
/*      */     //   #4870	-> 12
/*      */     //   #3629	-> 14
/*      */     //   #4870	-> 17
/*      */     //   #4872	-> 20
/*      */     //   #3631	-> 21
/*      */     //   #3632	-> 26
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   14	3	3	$i$a$-runtimeCheck-ComposerImpl$validateNodeExpected$1	I
/*      */     //   7	14	2	$i$f$runtimeCheck	I
/*      */     //   5	16	1	value$iv	Z
/*      */     //   0	27	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */   }
/*      */   private final void validateNodeNotExpected() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield nodeExpected : Z
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
/*      */     //   22: ldc_w 'A call to createNode(), emitNode() or useNode() expected'
/*      */     //   25: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   28: nop
/*      */     //   29: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3635	-> 0
/*      */     //   #4873	-> 15
/*      */     //   #4876	-> 16
/*      */     //   #4877	-> 20
/*      */     //   #3635	-> 22
/*      */     //   #4877	-> 25
/*      */     //   #4879	-> 28
/*      */     //   #3636	-> 29
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   22	3	3	$i$a$-runtimeCheck-ComposerImpl$validateNodeNotExpected$1	I
/*      */     //   15	14	2	$i$f$runtimeCheck	I
/*      */     //   13	16	1	value$iv	Z
/*      */     //   0	30	0	this	Landroidx/compose/runtime/ComposerImpl;
/*      */   }
/*      */   private final void recordInsert(Anchor anchor) {
/*      */     if (this.insertFixups.isEmpty()) {
/*      */       this.changeListWriter.insertSlots(anchor, this.insertTable);
/*      */     } else {
/*      */       this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
/*      */       this.insertFixups = new FixupList();
/*      */     } 
/*      */   }
/*      */   private final void recordDelete() {
/*      */     reportFreeMovableContent(this.reader.getCurrentGroup());
/*      */     this.changeListWriter.removeCurrentGroup();
/*      */   }
/*      */   private static final int reportFreeMovableContent$reportGroup(ComposerImpl this$0, int group, boolean needsNodeDelete, int nodeIndex) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield reader : Landroidx/compose/runtime/SlotReader;
/*      */     //   4: astore #4
/*      */     //   6: aload #4
/*      */     //   8: iload_1
/*      */     //   9: invokevirtual hasMark : (I)Z
/*      */     //   12: ifeq -> 466
/*      */     //   15: aload #4
/*      */     //   17: iload_1
/*      */     //   18: invokevirtual groupKey : (I)I
/*      */     //   21: istore #5
/*      */     //   23: aload #4
/*      */     //   25: iload_1
/*      */     //   26: invokevirtual groupObjectKey : (I)Ljava/lang/Object;
/*      */     //   29: astore #6
/*      */     //   31: iload #5
/*      */     //   33: ldc_w 126665345
/*      */     //   36: if_icmpne -> 302
/*      */     //   39: aload #6
/*      */     //   41: instanceof androidx/compose/runtime/MovableContent
/*      */     //   44: ifeq -> 302
/*      */     //   47: aload #6
/*      */     //   49: checkcast androidx/compose/runtime/MovableContent
/*      */     //   52: astore #7
/*      */     //   54: aload #4
/*      */     //   56: iload_1
/*      */     //   57: iconst_0
/*      */     //   58: invokevirtual groupGet : (II)Ljava/lang/Object;
/*      */     //   61: astore #8
/*      */     //   63: aload #4
/*      */     //   65: iload_1
/*      */     //   66: invokevirtual anchor : (I)Landroidx/compose/runtime/Anchor;
/*      */     //   69: astore #9
/*      */     //   71: iload_1
/*      */     //   72: aload #4
/*      */     //   74: iload_1
/*      */     //   75: invokevirtual groupSize : (I)I
/*      */     //   78: iadd
/*      */     //   79: istore #10
/*      */     //   81: aload_0
/*      */     //   82: getfield invalidations : Ljava/util/List;
/*      */     //   85: iload_1
/*      */     //   86: iload #10
/*      */     //   88: invokestatic access$filterToRange : (Ljava/util/List;II)Ljava/util/List;
/*      */     //   91: astore #12
/*      */     //   93: iconst_0
/*      */     //   94: istore #13
/*      */     //   96: nop
/*      */     //   97: new java/util/ArrayList
/*      */     //   100: dup
/*      */     //   101: aload #12
/*      */     //   103: invokeinterface size : ()I
/*      */     //   108: invokespecial <init> : (I)V
/*      */     //   111: astore #14
/*      */     //   113: aload #12
/*      */     //   115: astore #15
/*      */     //   117: iconst_0
/*      */     //   118: istore #16
/*      */     //   120: nop
/*      */     //   121: iconst_0
/*      */     //   122: istore #17
/*      */     //   124: aload #15
/*      */     //   126: invokeinterface size : ()I
/*      */     //   131: istore #18
/*      */     //   133: iload #17
/*      */     //   135: iload #18
/*      */     //   137: if_icmpge -> 205
/*      */     //   140: aload #15
/*      */     //   142: iload #17
/*      */     //   144: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   149: astore #19
/*      */     //   151: aload #19
/*      */     //   153: astore #20
/*      */     //   155: iconst_0
/*      */     //   156: istore #21
/*      */     //   158: aload #14
/*      */     //   160: checkcast java/util/Collection
/*      */     //   163: aload #20
/*      */     //   165: checkcast androidx/compose/runtime/Invalidation
/*      */     //   168: astore #22
/*      */     //   170: astore #24
/*      */     //   172: iconst_0
/*      */     //   173: istore #23
/*      */     //   175: aload #22
/*      */     //   177: invokevirtual getScope : ()Landroidx/compose/runtime/RecomposeScopeImpl;
/*      */     //   180: aload #22
/*      */     //   182: invokevirtual getInstances : ()Ljava/lang/Object;
/*      */     //   185: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*      */     //   188: aload #24
/*      */     //   190: swap
/*      */     //   191: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   196: pop
/*      */     //   197: nop
/*      */     //   198: nop
/*      */     //   199: iinc #17, 1
/*      */     //   202: goto -> 133
/*      */     //   205: nop
/*      */     //   206: aload #14
/*      */     //   208: checkcast java/util/List
/*      */     //   211: astore #11
/*      */     //   213: new androidx/compose/runtime/MovableContentStateReference
/*      */     //   216: dup
/*      */     //   217: aload #7
/*      */     //   219: aload #8
/*      */     //   221: aload_0
/*      */     //   222: invokevirtual getComposition : ()Landroidx/compose/runtime/ControlledComposition;
/*      */     //   225: aload_0
/*      */     //   226: getfield slotTable : Landroidx/compose/runtime/SlotTable;
/*      */     //   229: aload #9
/*      */     //   231: aload #11
/*      */     //   233: aload_0
/*      */     //   234: iload_1
/*      */     //   235: invokespecial currentCompositionLocalScope : (I)Landroidx/compose/runtime/PersistentCompositionLocalMap;
/*      */     //   238: invokespecial <init> : (Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V
/*      */     //   241: astore #12
/*      */     //   243: aload_0
/*      */     //   244: getfield parentContext : Landroidx/compose/runtime/CompositionContext;
/*      */     //   247: aload #12
/*      */     //   249: invokevirtual deletedMovableContent$runtime : (Landroidx/compose/runtime/MovableContentStateReference;)V
/*      */     //   252: aload_0
/*      */     //   253: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   256: invokevirtual recordSlotEditing : ()V
/*      */     //   259: aload_0
/*      */     //   260: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   263: aload_0
/*      */     //   264: invokevirtual getComposition : ()Landroidx/compose/runtime/ControlledComposition;
/*      */     //   267: aload_0
/*      */     //   268: getfield parentContext : Landroidx/compose/runtime/CompositionContext;
/*      */     //   271: aload #12
/*      */     //   273: invokevirtual releaseMovableGroupAtCurrent : (Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V
/*      */     //   276: iload_2
/*      */     //   277: ifeq -> 293
/*      */     //   280: aload_0
/*      */     //   281: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   284: iload_3
/*      */     //   285: iload_1
/*      */     //   286: invokevirtual endNodeMovementAndDeleteNode : (II)V
/*      */     //   289: iconst_0
/*      */     //   290: goto -> 648
/*      */     //   293: aload #4
/*      */     //   295: iload_1
/*      */     //   296: invokevirtual nodeCount : (I)I
/*      */     //   299: goto -> 648
/*      */     //   302: iload #5
/*      */     //   304: sipush #206
/*      */     //   307: if_icmpne -> 444
/*      */     //   310: aload #6
/*      */     //   312: invokestatic getReference : ()Ljava/lang/Object;
/*      */     //   315: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   318: ifeq -> 444
/*      */     //   321: aload #4
/*      */     //   323: iload_1
/*      */     //   324: iconst_0
/*      */     //   325: invokevirtual groupGet : (II)Ljava/lang/Object;
/*      */     //   328: astore #8
/*      */     //   330: aload #8
/*      */     //   332: instanceof androidx/compose/runtime/ComposerImpl$CompositionContextHolder
/*      */     //   335: ifeq -> 346
/*      */     //   338: aload #8
/*      */     //   340: checkcast androidx/compose/runtime/ComposerImpl$CompositionContextHolder
/*      */     //   343: goto -> 347
/*      */     //   346: aconst_null
/*      */     //   347: astore #7
/*      */     //   349: aload #7
/*      */     //   351: ifnull -> 435
/*      */     //   354: aload #7
/*      */     //   356: invokevirtual getRef : ()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;
/*      */     //   359: astore #8
/*      */     //   361: aload #8
/*      */     //   363: invokevirtual getComposers : ()Ljava/util/Set;
/*      */     //   366: checkcast java/lang/Iterable
/*      */     //   369: astore #9
/*      */     //   371: iconst_0
/*      */     //   372: istore #10
/*      */     //   374: aload #9
/*      */     //   376: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   381: astore #11
/*      */     //   383: aload #11
/*      */     //   385: invokeinterface hasNext : ()Z
/*      */     //   390: ifeq -> 434
/*      */     //   393: aload #11
/*      */     //   395: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   400: astore #12
/*      */     //   402: aload #12
/*      */     //   404: checkcast androidx/compose/runtime/ComposerImpl
/*      */     //   407: astore #13
/*      */     //   409: iconst_0
/*      */     //   410: istore #14
/*      */     //   412: aload #13
/*      */     //   414: invokespecial reportAllMovableContent : ()V
/*      */     //   417: aload_0
/*      */     //   418: getfield parentContext : Landroidx/compose/runtime/CompositionContext;
/*      */     //   421: aload #13
/*      */     //   423: invokevirtual getComposition : ()Landroidx/compose/runtime/ControlledComposition;
/*      */     //   426: invokevirtual reportRemovedComposition$runtime : (Landroidx/compose/runtime/ControlledComposition;)V
/*      */     //   429: nop
/*      */     //   430: nop
/*      */     //   431: goto -> 383
/*      */     //   434: nop
/*      */     //   435: aload #4
/*      */     //   437: iload_1
/*      */     //   438: invokevirtual nodeCount : (I)I
/*      */     //   441: goto -> 648
/*      */     //   444: aload #4
/*      */     //   446: iload_1
/*      */     //   447: invokevirtual isNode : (I)Z
/*      */     //   450: ifeq -> 457
/*      */     //   453: iconst_1
/*      */     //   454: goto -> 648
/*      */     //   457: aload #4
/*      */     //   459: iload_1
/*      */     //   460: invokevirtual nodeCount : (I)I
/*      */     //   463: goto -> 648
/*      */     //   466: aload #4
/*      */     //   468: iload_1
/*      */     //   469: invokevirtual containsMark : (I)Z
/*      */     //   472: ifeq -> 629
/*      */     //   475: aload #4
/*      */     //   477: iload_1
/*      */     //   478: invokevirtual groupSize : (I)I
/*      */     //   481: istore #5
/*      */     //   483: iload_1
/*      */     //   484: iload #5
/*      */     //   486: iadd
/*      */     //   487: istore #6
/*      */     //   489: iload_1
/*      */     //   490: iconst_1
/*      */     //   491: iadd
/*      */     //   492: istore #7
/*      */     //   494: iconst_0
/*      */     //   495: istore #8
/*      */     //   497: iload #7
/*      */     //   499: iload #6
/*      */     //   501: if_icmpge -> 611
/*      */     //   504: aload #4
/*      */     //   506: iload #7
/*      */     //   508: invokevirtual isNode : (I)Z
/*      */     //   511: istore #9
/*      */     //   513: iload #9
/*      */     //   515: ifeq -> 539
/*      */     //   518: aload_0
/*      */     //   519: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   522: invokevirtual endNodeMovement : ()V
/*      */     //   525: aload_0
/*      */     //   526: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   529: aload #4
/*      */     //   531: iload #7
/*      */     //   533: invokevirtual node : (I)Ljava/lang/Object;
/*      */     //   536: invokevirtual moveDown : (Ljava/lang/Object;)V
/*      */     //   539: iload #8
/*      */     //   541: aload_0
/*      */     //   542: iload #7
/*      */     //   544: iload #9
/*      */     //   546: ifne -> 553
/*      */     //   549: iload_2
/*      */     //   550: ifeq -> 557
/*      */     //   553: iconst_1
/*      */     //   554: goto -> 558
/*      */     //   557: iconst_0
/*      */     //   558: iload #9
/*      */     //   560: ifeq -> 567
/*      */     //   563: iconst_0
/*      */     //   564: goto -> 571
/*      */     //   567: iload_3
/*      */     //   568: iload #8
/*      */     //   570: iadd
/*      */     //   571: invokestatic reportFreeMovableContent$reportGroup : (Landroidx/compose/runtime/ComposerImpl;IZI)I
/*      */     //   574: iadd
/*      */     //   575: istore #8
/*      */     //   577: iload #9
/*      */     //   579: ifeq -> 596
/*      */     //   582: aload_0
/*      */     //   583: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   586: invokevirtual endNodeMovement : ()V
/*      */     //   589: aload_0
/*      */     //   590: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   593: invokevirtual moveUp : ()V
/*      */     //   596: iload #7
/*      */     //   598: aload #4
/*      */     //   600: iload #7
/*      */     //   602: invokevirtual groupSize : (I)I
/*      */     //   605: iadd
/*      */     //   606: istore #7
/*      */     //   608: goto -> 497
/*      */     //   611: aload #4
/*      */     //   613: iload_1
/*      */     //   614: invokevirtual isNode : (I)Z
/*      */     //   617: ifeq -> 624
/*      */     //   620: iconst_1
/*      */     //   621: goto -> 648
/*      */     //   624: iload #8
/*      */     //   626: goto -> 648
/*      */     //   629: aload #4
/*      */     //   631: iload_1
/*      */     //   632: invokevirtual isNode : (I)Z
/*      */     //   635: ifeq -> 642
/*      */     //   638: iconst_1
/*      */     //   639: goto -> 648
/*      */     //   642: aload #4
/*      */     //   644: iload_1
/*      */     //   645: invokevirtual nodeCount : (I)I
/*      */     //   648: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3667	-> 0
/*      */     //   #3668	-> 6
/*      */     //   #3671	-> 15
/*      */     //   #3672	-> 23
/*      */     //   #3673	-> 31
/*      */     //   #3680	-> 47
/*      */     //   #3681	-> 54
/*      */     //   #3682	-> 63
/*      */     //   #3683	-> 71
/*      */     //   #3684	-> 81
/*      */     //   #4928	-> 96
/*      */     //   #4929	-> 97
/*      */     //   #4930	-> 113
/*      */     //   #4931	-> 120
/*      */     //   #4932	-> 121
/*      */     //   #4933	-> 140
/*      */     //   #4934	-> 151
/*      */     //   #4935	-> 158
/*      */     //   #3685	-> 175
/*      */     //   #4935	-> 191
/*      */     //   #4936	-> 197
/*      */     //   #4934	-> 198
/*      */     //   #4932	-> 199
/*      */     //   #4937	-> 205
/*      */     //   #4938	-> 206
/*      */     //   #3684	-> 211
/*      */     //   #3687	-> 213
/*      */     //   #3688	-> 217
/*      */     //   #3689	-> 219
/*      */     //   #3690	-> 221
/*      */     //   #3691	-> 225
/*      */     //   #3692	-> 229
/*      */     //   #3693	-> 231
/*      */     //   #3694	-> 233
/*      */     //   #3687	-> 238
/*      */     //   #3696	-> 243
/*      */     //   #3697	-> 252
/*      */     //   #3698	-> 259
/*      */     //   #3699	-> 263
/*      */     //   #3698	-> 273
/*      */     //   #3701	-> 276
/*      */     //   #3702	-> 280
/*      */     //   #3703	-> 289
/*      */     //   #3704	-> 293
/*      */     //   #3705	-> 302
/*      */     //   #3709	-> 321
/*      */     //   #3710	-> 349
/*      */     //   #3715	-> 354
/*      */     //   #3716	-> 361
/*      */     //   #4939	-> 374
/*      */     //   #3717	-> 412
/*      */     //   #3721	-> 417
/*      */     //   #3722	-> 429
/*      */     //   #4939	-> 430
/*      */     //   #4940	-> 434
/*      */     //   #3724	-> 435
/*      */     //   #3725	-> 444
/*      */     //   #3726	-> 466
/*      */     //   #3730	-> 475
/*      */     //   #3731	-> 483
/*      */     //   #3732	-> 489
/*      */     //   #3733	-> 494
/*      */     //   #3734	-> 497
/*      */     //   #3742	-> 504
/*      */     //   #3743	-> 513
/*      */     //   #3744	-> 518
/*      */     //   #3745	-> 525
/*      */     //   #3747	-> 539
/*      */     //   #3748	-> 542
/*      */     //   #3749	-> 544
/*      */     //   #3750	-> 558
/*      */     //   #3747	-> 571
/*      */     //   #3752	-> 577
/*      */     //   #3753	-> 582
/*      */     //   #3754	-> 589
/*      */     //   #3756	-> 596
/*      */     //   #3758	-> 611
/*      */     //   #3759	-> 629
/*      */     //   #3668	-> 648
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   175	13	23	$i$a$-fastMap-ComposerImpl$reportFreeMovableContent$reportGroup$invalidations$1	I
/*      */     //   172	16	22	it	Landroidx/compose/runtime/Invalidation;
/*      */     //   158	40	21	$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv	I
/*      */     //   155	43	20	it$iv	Ljava/lang/Object;
/*      */     //   151	48	19	item$iv$iv	Ljava/lang/Object;
/*      */     //   124	81	17	index$iv$iv	I
/*      */     //   120	86	16	$i$f$fastForEach	I
/*      */     //   117	89	15	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   96	115	13	$i$f$fastMap	I
/*      */     //   113	98	14	target$iv	Ljava/util/ArrayList;
/*      */     //   93	118	12	$this$fastMap$iv	Ljava/util/List;
/*      */     //   54	245	7	movableContent	Landroidx/compose/runtime/MovableContent;
/*      */     //   63	236	8	parameter	Ljava/lang/Object;
/*      */     //   71	228	9	anchor	Landroidx/compose/runtime/Anchor;
/*      */     //   81	218	10	end	I
/*      */     //   213	86	11	invalidations	Ljava/util/List;
/*      */     //   243	56	12	reference	Landroidx/compose/runtime/MovableContentStateReference;
/*      */     //   412	18	14	$i$a$-forEach-ComposerImpl$reportFreeMovableContent$reportGroup$1	I
/*      */     //   409	21	13	composer	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   402	29	12	element$iv	Ljava/lang/Object;
/*      */     //   374	61	10	$i$f$forEach	I
/*      */     //   371	64	9	$this$forEach$iv	Ljava/lang/Iterable;
/*      */     //   361	74	8	compositionContext	Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;
/*      */     //   349	92	7	contextHolder	Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;
/*      */     //   23	440	5	key	I
/*      */     //   31	432	6	objectKey	Ljava/lang/Object;
/*      */     //   513	95	9	isNode	Z
/*      */     //   483	143	5	size	I
/*      */     //   489	137	6	end	I
/*      */     //   494	132	7	current	I
/*      */     //   497	129	8	runningNodeCount	I
/*      */     //   6	643	4	reader	Landroidx/compose/runtime/SlotReader;
/*      */     //   0	649	0	this$0	Landroidx/compose/runtime/ComposerImpl;
/*      */     //   0	649	1	group	I
/*      */     //   0	649	2	needsNodeDelete	Z
/*      */     //   0	649	3	nodeIndex	I
/*      */   }
/*      */   private final void reportFreeMovableContent(int groupBeingRemoved) {
/*      */     reportFreeMovableContent$reportGroup(this, groupBeingRemoved, false, 0);
/*      */     this.changeListWriter.endNodeMovement();
/*      */   }
/*      */   private final void reportAllMovableContent() { if (this.slotTable.containsMark())
/*      */     { ChangeList changes = new ChangeList();
/*      */       this.deferredChanges = changes;
/*      */       SlotTable this_$iv = this.slotTable;
/*      */       int $i$f$read = 0;
/* 4881 */       SlotReader reader$iv = this_$iv.openReader(); int $i$a$-let-SlotTable$read$1$iv = 0; }  } private final void finalizeCompose() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield changeListWriter : Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
/*      */     //   4: invokevirtual finalizeComposition : ()V
/*      */     //   7: aload_0
/*      */     //   8: getfield pendingStack : Landroidx/compose/runtime/Stack;
/*      */     //   11: invokevirtual isEmpty : ()Z
/*      */     //   14: istore_1
/*      */     //   15: iconst_0
/*      */     //   16: istore_2
/*      */     //   17: nop
/*      */     //   18: iload_1
/*      */     //   19: ifne -> 30
/*      */     //   22: iconst_0
/*      */     //   23: istore_3
/*      */     //   24: ldc_w 'Start/end imbalance'
/*      */     //   27: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*      */     //   30: nop
/*      */     //   31: aload_0
/*      */     //   32: invokespecial cleanUpCompose : ()V
/*      */     //   35: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #3784	-> 0
/*      */     //   #3785	-> 7
/*      */     //   #4895	-> 17
/*      */     //   #4898	-> 18
/*      */     //   #4899	-> 22
/*      */     //   #3785	-> 24
/*      */     //   #4899	-> 27
/*      */     //   #4901	-> 30
/*      */     //   #3786	-> 31
/*      */     //   #3787	-> 35
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   24	3	3	$i$a$-runtimeCheck-ComposerImpl$finalizeCompose$1	I
/*      */     //   17	14	2	$i$f$runtimeCheck	I
/*      */     //   15	16	1	value$iv	Z
/*      */     //   0	36	0	this	Landroidx/compose/runtime/ComposerImpl; } private final void cleanUpCompose() { this.pending = null; this.nodeIndex = 0; this.groupNodeCount = 0; this.compoundKeyHash = 0; this.nodeExpected = false; this.changeListWriter.resetTransientState(); this.invalidateStack.clear(); clearUpdatedNodeCounts(); } public final void verifyConsistent$runtime() { this.insertTable.verifyWellFormed(); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003\b\002\030\0002\0020\001B\021\022\n\020\002\032\0060\003R\0020\004¢\006\002\020\005J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\tH\026J\b\020\013\032\0020\tH\026R\025\020\002\032\0060\003R\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime"}) private static final class CompositionContextHolder implements ReusableRememberObserver {
/*      */     @NotNull private final ComposerImpl.CompositionContextImpl ref; public CompositionContextHolder(@NotNull ComposerImpl.CompositionContextImpl ref) { this.ref = ref; } @NotNull public final ComposerImpl.CompositionContextImpl getRef() { return this.ref; } public void onRemembered() {} public void onAbandoned() { this.ref.dispose(); } public void onForgotten() { this.ref.dispose(); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000|\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020#\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\r\b\004\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ*\020.\032\0020/2\006\0200\032\002012\021\0202\032\r\022\004\022\0020/03¢\006\002\b4H\020¢\006\004\b5\0206J\025\0207\032\0020/2\006\0208\032\00209H\020¢\006\002\b:J\006\020;\032\0020/J\r\020<\032\0020/H\020¢\006\002\b=J\r\020\027\032\0020\025H\020¢\006\002\b>J\025\020?\032\0020/2\006\0208\032\00209H\020¢\006\002\b@J\025\020A\032\0020/2\006\0200\032\00201H\020¢\006\002\bBJ\025\020C\032\0020/2\006\020D\032\0020EH\020¢\006\002\bFJ\035\020G\032\0020/2\006\0208\032\002092\006\020H\032\0020IH\020¢\006\002\bJJ\027\020K\032\004\030\0010I2\006\0208\032\00209H\020¢\006\002\bLJ\033\020M\032\0020/2\f\020N\032\b\022\004\022\0020$0\020H\020¢\006\002\bOJ\025\020P\032\0020/2\006\020Q\032\0020RH\020¢\006\002\bSJ\025\020T\032\0020/2\006\0200\032\00201H\020¢\006\002\bUJ\025\020V\032\0020/2\006\0200\032\00201H\020¢\006\002\bWJ\r\020X\032\0020/H\020¢\006\002\bYJ\025\020Z\032\0020/2\006\020Q\032\0020RH\020¢\006\002\b[J\025\020\\\032\0020/2\006\0200\032\00201H\020¢\006\002\b]J\016\020^\032\0020/2\006\020D\032\0020\025R\024\020\n\032\0020\0058PX\004¢\006\006\032\004\b\013\020\fR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\r\020\fR\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\fR\027\020\017\032\b\022\004\022\0020\0210\020¢\006\b\n\000\032\004\b\022\020\023R+\020\026\032\0020\0252\006\020\024\032\0020\0258B@BX\002¢\006\022\n\004\b\033\020\034\032\004\b\027\020\030\"\004\b\031\020\032R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\035\020\036R\024\020\037\032\0020 8VX\004¢\006\006\032\004\b!\020\"R(\020#\032\020\022\n\022\b\022\004\022\0020$0\020\030\0010\020X\016¢\006\016\n\000\032\004\b%\020\023\"\004\b&\020'R\026\020\007\032\004\030\0010\bX\004¢\006\b\n\000\032\004\b(\020)R\032\020*\032\0020 8PX\004¢\006\f\022\004\b+\020,\032\004\b-\020\"¨\006_"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "collectingSourceInformation", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "collectingCallByInformation", "getCollectingCallByInformation$runtime", "()Z", "getCollectingParameterInformation$runtime", "getCollectingSourceInformation$runtime", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime$annotations", "()V", "getRecomposeCoroutineContext$runtime", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime", "dispose", "doneComposing", "doneComposing$runtime", "getCompositionLocalScope$runtime", "insertMovableContent", "insertMovableContent$runtime", "invalidate", "invalidate$runtime", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime", "movableContentStateResolve", "movableContentStateResolve$runtime", "recordInspectionTable", "table", "recordInspectionTable$runtime", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime", "registerComposition", "registerComposition$runtime", "reportRemovedComposition", "reportRemovedComposition$runtime", "startComposing", "startComposing$runtime", "unregisterComposer", "unregisterComposer$runtime", "unregisterComposition", "unregisterComposition$runtime", "updateCompositionLocalScope", "runtime"}) @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4584:1\n1855#2,2:4585\n81#3:4587\n107#3,2:4588\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3851#1:4585,2\n3901#1:4587\n3901#1:4588,2\n*E\n"}) private final class CompositionContextImpl extends CompositionContext {
/*      */     private final int compoundHashKey; private final boolean collectingParameterInformation; private final boolean collectingSourceInformation; @Nullable private final CompositionObserverHolder observerHolder; @Nullable private Set<Set<CompositionData>> inspectionTables; @NotNull private final Set<ComposerImpl> composers; @NotNull private final MutableState compositionLocalScope$delegate; public CompositionContextImpl(int compoundHashKey, boolean collectingParameterInformation, @Nullable boolean collectingSourceInformation, CompositionObserverHolder observerHolder) { this.compoundHashKey = compoundHashKey; this.collectingParameterInformation = collectingParameterInformation; this.collectingSourceInformation = collectingSourceInformation; this.observerHolder = observerHolder; this.composers = new LinkedHashSet<>(); this.compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy()); } public int getCompoundHashKey$runtime() { return this.compoundHashKey; } public boolean getCollectingParameterInformation$runtime() { return this.collectingParameterInformation; } public boolean getCollectingSourceInformation$runtime() { return this.collectingSourceInformation; } @Nullable public CompositionObserverHolder getObserverHolder$runtime() { return this.observerHolder; } @Nullable public final Set<Set<CompositionData>> getInspectionTables() { return this.inspectionTables; } public final void setInspectionTables(@Nullable Set<Set<CompositionData>> <set-?>) { this.inspectionTables = <set-?>; } @NotNull public final Set<ComposerImpl> getComposers() { return this.composers; } public boolean getCollectingCallByInformation$runtime() { return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime(); } public final void dispose() { if (!this.composers.isEmpty()) { Set<Set<CompositionData>> it = this.inspectionTables; int $i$a$-let-ComposerImpl$CompositionContextImpl$dispose$1 = 0; for (ComposerImpl composer : this.composers) { for (Set<CompositionData> table : it) table.remove(composer.slotTable);  }  this.composers.clear(); }  } public void registerComposer$runtime(@NotNull Composer composer) { Intrinsics.checkNotNullParameter(composer, "composer"); super.registerComposer$runtime(composer); this.composers.add(composer); } public void unregisterComposer$runtime(@NotNull Composer composer) { Iterator<Set<CompositionData>> iterator; Intrinsics.checkNotNullParameter(composer, "composer"); if (this.inspectionTables != null) { Iterable<Set<CompositionData>> $this$forEach$iv = this.inspectionTables; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { TypeIntrinsics.asMutableCollection(this.composers).remove(composer); }  if (iterator.hasNext()) { Object<CompositionData> element$iv = (Object<CompositionData>)iterator.next(); Set it = (Set)element$iv; int $i$a$-forEach-ComposerImpl$CompositionContextImpl$unregisterComposer$1 = 0; it.remove(((ComposerImpl)composer).slotTable); }  } public void registerComposition$runtime(@NotNull ControlledComposition composition) { Intrinsics.checkNotNullParameter(composition, "composition"); ComposerImpl.this.parentContext.registerComposition$runtime(composition); }
/*      */     public void unregisterComposition$runtime(@NotNull ControlledComposition composition) { Intrinsics.checkNotNullParameter(composition, "composition"); ComposerImpl.this.parentContext.unregisterComposition$runtime(composition); }
/*      */     @NotNull public CoroutineContext getEffectCoroutineContext() { return ComposerImpl.this.parentContext.getEffectCoroutineContext(); }
/*      */     @NotNull public CoroutineContext getRecomposeCoroutineContext$runtime() { return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition()); }
/*      */     @ComposableInferredTarget(scheme = "[0[0]]") public void composeInitial$runtime(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(composition, "composition"); Intrinsics.checkNotNullParameter(content, "content"); ComposerImpl.this.parentContext.composeInitial$runtime(composition, content); }
/*      */     public void invalidate$runtime(@NotNull ControlledComposition composition) { Intrinsics.checkNotNullParameter(composition, "composition"); ComposerImpl.this.parentContext.invalidate$runtime(ComposerImpl.this.getComposition()); ComposerImpl.this.parentContext.invalidate$runtime(composition); }
/*      */     public void invalidateScope$runtime(@NotNull RecomposeScopeImpl scope) { Intrinsics.checkNotNullParameter(scope, "scope"); ComposerImpl.this.parentContext.invalidateScope$runtime(scope); }
/*      */     private final PersistentCompositionLocalMap getCompositionLocalScope() { MutableState<PersistentCompositionLocalMap> mutableState = this.compositionLocalScope$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return mutableState.getValue(); }
/*      */     private final void setCompositionLocalScope(PersistentCompositionLocalMap <set-?>) { MutableState<PersistentCompositionLocalMap> mutableState = this.compositionLocalScope$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); }
/*      */     @NotNull public PersistentCompositionLocalMap getCompositionLocalScope$runtime() { return getCompositionLocalScope(); }
/*      */     public final void updateCompositionLocalScope(@NotNull PersistentCompositionLocalMap scope) { Intrinsics.checkNotNullParameter(scope, "scope"); setCompositionLocalScope(scope); }
/*      */     public void recordInspectionTable$runtime(@NotNull Set<CompositionData> table) { Intrinsics.checkNotNullParameter(table, "table"); if (this.inspectionTables == null) { HashSet<Set<CompositionData>> hashSet1 = new HashSet(), it = hashSet1; int $i$a$-also-ComposerImpl$CompositionContextImpl$recordInspectionTable$1 = 0; this.inspectionTables = it; }  hashSet1.add(table); }
/*      */     public void startComposing$runtime() { ComposerImpl composerImpl = ComposerImpl.this; int i = composerImpl.childrenComposing; composerImpl.childrenComposing = i + 1; }
/*      */     public void doneComposing$runtime() { ComposerImpl composerImpl = ComposerImpl.this; int i = composerImpl.childrenComposing; composerImpl.childrenComposing = i + -1; }
/*      */     public void insertMovableContent$runtime(@NotNull MovableContentStateReference reference) { Intrinsics.checkNotNullParameter(reference, "reference"); ComposerImpl.this.parentContext.insertMovableContent$runtime(reference); }
/*      */     public void deletedMovableContent$runtime(@NotNull MovableContentStateReference reference) { Intrinsics.checkNotNullParameter(reference, "reference"); ComposerImpl.this.parentContext.deletedMovableContent$runtime(reference); }
/*      */     @Nullable public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) { Intrinsics.checkNotNullParameter(reference, "reference"); return ComposerImpl.this.parentContext.movableContentStateResolve$runtime(reference); }
/*      */     public void movableContentStateReleased$runtime(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) { Intrinsics.checkNotNullParameter(reference, "reference"); Intrinsics.checkNotNullParameter(data, "data"); ComposerImpl.this.parentContext.movableContentStateReleased$runtime(reference, data); }
/*      */     public void reportRemovedComposition$runtime(@NotNull ControlledComposition composition) { Intrinsics.checkNotNullParameter(composition, "composition"); ComposerImpl.this.parentContext.reportRemovedComposition$runtime(composition); } }
/* 4902 */   private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) { int $i$f$updateCompoundKeyWhenWeEnterGroup = 0; ComposerImpl composerImpl1 = this; int i = data.hashCode(), j = 0; int n = composerImpl1.getCompoundKeyHash(), i2 = 3, i4 = 0, m = 
/* 4903 */       Integer.rotateLeft(n, i2) ^ i; i2 = 3; i4 = 0; composerImpl1.compoundKeyHash = Integer.rotateLeft(m, i2) ^ rGroupIndex; ComposerImpl this_$iv = this;
/*      */     int $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = 0;
/* 4905 */     j = this_$iv.getCompoundKeyHash(); int other$iv$iv = 3, $i$f$rol = 0, $this$rol$iv$iv = 
/* 4906 */       Integer.rotateLeft(j, other$iv$iv) ^ groupKey; other$iv$iv = 3; $i$f$rol = 0; this_$iv.compoundKeyHash = Integer.rotateLeft($this$rol$iv$iv, other$iv$iv) ^ rGroupIndex; this_$iv = this; $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = ((Enum)dataKey).ordinal();
/*      */     int rGroupIndex$iv = 0, k = 0;
/* 4908 */     $i$f$rol = this_$iv.getCompoundKeyHash(); int i3 = 3, i5 = 0, i1 = 
/* 4909 */       Integer.rotateLeft($i$f$rol, i3) ^ $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash; i3 = 3; i5 = 0; this_$iv.compoundKeyHash = Integer.rotateLeft(i1, i3) ^ rGroupIndex$iv; this_$iv = this; int keyHash$iv = dataKey.hashCode(); rGroupIndex$iv = 0;
/*      */     k = 0;
/* 4911 */     i1 = this_$iv.getCompoundKeyHash(); i3 = 3; i5 = 0; i1 = 
/* 4912 */       Integer.rotateLeft(i1, i3) ^ keyHash$iv; i3 = 3; i5 = 0; this_$iv.compoundKeyHash = Integer.rotateLeft(i1, i3) ^ rGroupIndex$iv; }
/*      */   
/* 4914 */   private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash, int rGroupIndex) { int $i$f$updateCompoundKeyWhenWeEnterGroupKeyHash = 0, i = getCompoundKeyHash(), other$iv = 3, $i$f$rol = 0, $this$rol$iv = Integer.rotateLeft(i, other$iv) ^ keyHash; other$iv = 3; $i$f$rol = 0; this.compoundKeyHash = Integer.rotateLeft($this$rol$iv, other$iv) ^ rGroupIndex; } private final void updateCompoundKeyWhenWeExitGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) { int $i$f$updateCompoundKeyWhenWeExitGroup = 0; ComposerImpl composerImpl1 = this; int i = data.hashCode(), j = 0;
/* 4915 */     int n = composerImpl1.getCompoundKeyHash() ^ rGroupIndex, i2 = 3, i4 = 0, m = 
/* 4916 */       Integer.rotateRight(n, i2) ^ Integer.hashCode(i); i2 = 3; i4 = 0; composerImpl1.compoundKeyHash = Integer.rotateRight(m, i2); ComposerImpl this_$iv = this;
/*      */     int $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = 0;
/* 4918 */     j = this_$iv.getCompoundKeyHash() ^ rGroupIndex; int other$iv$iv = 3, $i$f$ror = 0, $this$ror$iv$iv = 
/* 4919 */       Integer.rotateRight(j, other$iv$iv) ^ Integer.hashCode(groupKey); other$iv$iv = 3; $i$f$ror = 0; this_$iv.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv, other$iv$iv); this_$iv = this; $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = ((Enum)dataKey).ordinal();
/*      */     int rGroupIndex$iv = 0, k = 0;
/* 4921 */     $i$f$ror = this_$iv.getCompoundKeyHash() ^ rGroupIndex$iv; int i3 = 3, i5 = 0, i1 = 
/* 4922 */       Integer.rotateRight($i$f$ror, i3) ^ Integer.hashCode($i$f$updateCompoundKeyWhenWeExitGroupKeyHash); i3 = 3; i5 = 0; this_$iv.compoundKeyHash = Integer.rotateRight(i1, i3); this_$iv = this; int groupKey$iv = dataKey.hashCode(); rGroupIndex$iv = 0;
/*      */     k = 0;
/* 4924 */     i1 = this_$iv.getCompoundKeyHash() ^ rGroupIndex$iv; i3 = 3; i5 = 0; i1 = 
/* 4925 */       Integer.rotateRight(i1, i3) ^ Integer.hashCode(groupKey$iv); i3 = 3; i5 = 0; this_$iv.compoundKeyHash = Integer.rotateRight(i1, i3); }
/*      */    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey, int rGroupIndex) {
/* 4927 */     int $i$f$updateCompoundKeyWhenWeExitGroupKeyHash = 0, i = getCompoundKeyHash() ^ rGroupIndex, other$iv = 3, $i$f$ror = 0, $this$ror$iv = Integer.rotateRight(i, other$iv) ^ Integer.hashCode(groupKey); other$iv = 3; $i$f$ror = 0; this.compoundKeyHash = Integer.rotateRight($this$ror$iv, other$iv);
/*      */   }
/*      */   
/*      */   public final int stacksSize$runtime() {
/*      */     return this.entersStack.getSize() + this.invalidateStack.getSize() + this.providersInvalidStack.getSize() + this.pendingStack.getSize() + this.parentStateStack.getSize();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public RecomposeScope getRecomposeScope() {
/*      */     return getCurrentRecomposeScope$runtime();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public Object getRecomposeScopeIdentity() {
/*      */     getCurrentRecomposeScope$runtime();
/*      */     return (getCurrentRecomposeScope$runtime() != null) ? getCurrentRecomposeScope$runtime().getAnchor() : null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public Object rememberedValue() {
/*      */     return nextSlotForCache();
/*      */   }
/*      */   
/*      */   public void updateRememberedValue(@Nullable Object value) {
/*      */     updateCachedValue(value);
/*      */   }
/*      */   
/*      */   public void recordUsed(@NotNull RecomposeScope scope) {
/*      */     Intrinsics.checkNotNullParameter(scope, "scope");
/*      */     if (((scope instanceof RecomposeScopeImpl) ? scope : null) == null) {
/*      */       (scope instanceof RecomposeScopeImpl) ? scope : null;
/*      */     } else {
/*      */       ((scope instanceof RecomposeScopeImpl) ? scope : null).setUsed(true);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ComposerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */