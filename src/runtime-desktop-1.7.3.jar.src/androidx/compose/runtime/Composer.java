/*      */ package androidx.compose.runtime;
/*      */ 
/*      */ import androidx.compose.runtime.tooling.CompositionData;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Pair;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.CoroutineContext;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.Intrinsics;
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
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Î\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\005\n\002\020\f\n\002\020\006\n\002\020\007\n\002\020\t\n\002\020\n\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\013\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\t\n\002\030\002\n\000\bv\030\000 \0012\0020\001:\002\001J@\0205\032\00206\"\004\b\000\0207\"\004\b\001\02082\006\0209\032\002H72\035\020:\032\031\022\004\022\002H8\022\004\022\002H7\022\004\022\002060;¢\006\002\b<H'¢\006\002\020=J\b\020>\032\0020?H'J\022\020@\032\0020\"2\b\0209\032\004\030\0010\001H'J\020\020@\032\0020\"2\006\0209\032\0020\"H\027J\020\020@\032\0020\"2\006\0209\032\0020AH\027J\020\020@\032\0020\"2\006\0209\032\0020BH\027J\020\020@\032\0020\"2\006\0209\032\0020CH\027J\020\020@\032\0020\"2\006\0209\032\0020DH\027J\020\020@\032\0020\"2\006\0209\032\0020\026H\027J\020\020@\032\0020\"2\006\0209\032\0020EH\027J\020\020@\032\0020\"2\006\0209\032\0020FH\027J\022\020G\032\0020\"2\b\0209\032\004\030\0010\001H\027J\b\020H\032\00206H&J!\020I\032\002H8\"\004\b\000\02082\f\020J\032\b\022\004\022\002H80KH'¢\006\002\020LJ\034\020M\032\00206\"\004\b\000\02082\f\020N\032\b\022\004\022\002H80OH'J\020\020P\032\002062\006\020@\032\0020\"H'J\b\020Q\032\00206H'J\b\020R\032\00206H'J\b\020S\032\00206H'J\b\020T\032\00206H'J\b\020U\032\00206H'J\b\020V\032\00206H'J\b\020W\032\00206H'J\b\020X\032\00206H'J\b\020Y\032\00206H'J\b\020Z\032\00206H'J\n\020[\032\004\030\0010\\H'J\b\020]\032\00206H'J\020\020^\032\002062\006\020_\032\0020\026H'J\036\020`\032\002062\n\0209\032\006\022\002\b\0030a2\b\020b\032\004\030\0010\001H'J$\020c\032\002062\032\020d\032\026\022\022\022\020\022\004\022\0020g\022\006\022\004\030\0010g0f0eH'J\034\020h\032\0020\0012\b\020i\032\004\030\0010\0012\b\020j\032\004\030\0010\001H'J\026\020k\032\002062\f\020l\032\b\022\004\022\002060OH'J\020\020m\032\002062\006\020n\032\0020*H'J\n\020o\032\004\030\0010\001H'J\b\020p\032\00206H'J\b\020q\032\00206H'J\020\020r\032\002062\006\020r\032\0020sH&J\b\020t\032\00206H&J\030\020u\032\002062\006\020J\032\0020\0262\006\020r\032\0020sH&J\b\020v\032\00206H'J\032\020w\032\002062\006\020J\032\0020\0262\b\020x\032\004\030\0010\001H'J\b\020y\032\00206H'J\024\020z\032\002062\n\0209\032\006\022\002\b\0030{H'J!\020|\032\002062\022\020}\032\016\022\n\b\001\022\006\022\002\b\0030{0~H'¢\006\002\020J\021\020\001\032\002062\006\020J\032\0020\026H'J\021\020\001\032\002062\006\020J\032\0020\026H'J\021\020\001\032\0020\0002\006\020J\032\0020\026H'J\033\020\001\032\002062\006\020J\032\0020\0262\b\020x\032\004\030\0010\001H'J\t\020\001\032\00206H'J\023\020\001\032\002062\b\0209\032\004\030\0010\001H'J\t\020\001\032\00206H'R\036\020\002\032\006\022\002\b\0030\0038&X§\004¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007R\032\020\b\032\0020\t8gX§\004¢\006\f\022\004\b\n\020\005\032\004\b\013\020\fR\024\020\r\032\0020\0168gX¦\004¢\006\006\032\004\b\017\020\020R\022\020\021\032\0020\022X¦\004¢\006\006\032\004\b\023\020\024R\032\020\025\032\0020\0268&X§\004¢\006\f\022\004\b\027\020\005\032\004\b\030\020\031R\022\020\032\032\0020\033X¦\004¢\006\006\032\004\b\034\020\035R\032\020\036\032\0020\0268&X§\004¢\006\f\022\004\b\037\020\005\032\004\b \020\031R\032\020!\032\0020\"8&X§\004¢\006\f\022\004\b#\020\005\032\004\b$\020%R\032\020&\032\0020\"8&X§\004¢\006\f\022\004\b'\020\005\032\004\b(\020%R\034\020)\032\004\030\0010*8&X§\004¢\006\f\022\004\b+\020\005\032\004\b,\020-R\034\020.\032\004\030\0010\0018&X§\004¢\006\f\022\004\b/\020\005\032\004\b0\0201R\032\0202\032\0020\"8&X§\004¢\006\f\022\004\b3\020\005\032\004\b4\020%\001\002\001ø\001\000\002\006\n\004\b!0\001¨\006\001À\006\001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "applier", "Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compoundKeyHash", "", "getCompoundKeyHash$annotations", "getCompoundKeyHash", "()I", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker$annotations", "getCurrentMarker", "defaultsInvalid", "", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "()Z", "inserting", "getInserting$annotations", "getInserting", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "skipping", "getSkipping$annotations", "getSkipping", "apply", "", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "Landroidx/compose/runtime/CompositionContext;", "changed", "", "", "", "", "", "", "changedInstance", "collectParameterInformation", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createNode", "factory", "Lkotlin/Function0;", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "enableReusing", "endDefaults", "endMovableGroup", "endNode", "endProvider", "endProviders", "endReplaceGroup", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endToMarker", "marker", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentReferences", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "joinKey", "left", "right", "recordSideEffect", "effect", "recordUsed", "scope", "rememberedValue", "skipCurrentGroup", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "startDefaults", "startMovableGroup", "dataKey", "startNode", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReplaceGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "updateRememberedValue", "useNode", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime"})
/*      */ public interface Composer
/*      */ {
/*      */   @NotNull
/*      */   public static final Companion Companion = Companion.$$INSTANCE;
/*      */   
/*      */   @NotNull
/*      */   Applier<?> getApplier();
/*      */   
/*      */   boolean getInserting();
/*      */   
/*      */   boolean getSkipping();
/*      */   
/*      */   boolean getDefaultsInvalid();
/*      */   
/*      */   @Nullable
/*      */   RecomposeScope getRecomposeScope();
/*      */   
/*      */   @Nullable
/*      */   Object getRecomposeScopeIdentity();
/*      */   
/*      */   int getCompoundKeyHash();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startReplaceableGroup(int paramInt);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endReplaceableGroup();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startReplaceGroup(int paramInt);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endReplaceGroup();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startMovableGroup(int paramInt, @Nullable Object paramObject);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endMovableGroup();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startDefaults();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endDefaults();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   @NotNull
/*      */   Composer startRestartGroup(int paramInt);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   @Nullable
/*      */   ScopeUpdateScope endRestartGroup();
/*      */   
/*      */   @InternalComposeApi
/*      */   void insertMovableContent(@NotNull MovableContent<?> paramMovableContent, @Nullable Object paramObject);
/*      */   
/*      */   @InternalComposeApi
/*      */   void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> paramList);
/*      */   
/*      */   void sourceInformation(@NotNull String paramString);
/*      */   
/*      */   void sourceInformationMarkerStart(int paramInt, @NotNull String paramString);
/*      */   
/*      */   void sourceInformationMarkerEnd();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void skipToGroupEnd();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void deactivateToEndGroup(boolean paramBoolean);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void skipCurrentGroup();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startNode();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startReusableNode();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   <T> void createNode(@NotNull Function0<? extends T> paramFunction0);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void useNode();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endNode();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void startReusableGroup(int paramInt, @Nullable Object paramObject);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endReusableGroup();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void disableReusing();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void enableReusing();
/*      */   
/*      */   int getCurrentMarker();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void endToMarker(int paramInt);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   <V, T> void apply(V paramV, @NotNull Function2<? super T, ? super V, Unit> paramFunction2);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   @NotNull
/*      */   Object joinKey(@Nullable Object paramObject1, @Nullable Object paramObject2);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   @Nullable
/*      */   Object rememberedValue();
/*      */   
/*      */   @ComposeCompilerApi
/*      */   void updateRememberedValue(@Nullable Object paramObject);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   boolean changed(@Nullable Object paramObject);
/*      */   
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(boolean value) {
/*  906 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(char value) {
/*  922 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(byte value) {
/*  938 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(short value) {
/*  954 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(int value) {
/*  970 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(float value) {
/*  986 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(long value) {
/* 1002 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changed(double value) {
/* 1018 */     return changed(value);
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
/*      */   @ComposeCompilerApi
/*      */   default boolean changedInstance(@Nullable Object value) {
/* 1033 */     return changed(value);
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
/*      */   @InternalComposeApi
/*      */   void recordUsed(@NotNull RecomposeScope paramRecomposeScope);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   void recordSideEffect(@NotNull Function0<Unit> paramFunction0);
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
/*      */   CompositionLocalMap getCurrentCompositionLocalMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   <T> T consume(@NotNull CompositionLocal<T> paramCompositionLocal);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   void startProviders(@NotNull ProvidedValue<?>[] paramArrayOfProvidedValue);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   void endProviders();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   void startProvider(@NotNull ProvidedValue<?> paramProvidedValue);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   void endProvider();
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
/*      */   CompositionData getCompositionData();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void collectParameterInformation();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @InternalComposeApi
/*      */   @NotNull
/*      */   CompositionContext buildContext();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @TestOnly
/*      */   @NotNull
/*      */   CoroutineContext getApplyCoroutineContext();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @TestOnly
/*      */   @NotNull
/*      */   ControlledComposition getComposition();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @TestOnly
/*      */   void disableSourceInformation();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\007R\021\020\003\032\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\n"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "()V", "Empty", "getEmpty", "()Ljava/lang/Object;", "setTracer", "", "tracer", "Landroidx/compose/runtime/CompositionTracer;", "runtime"})
/*      */   public static final class Companion
/*      */   {
/*      */     @NotNull
/* 1200 */     private static final Object Empty = new Composer$Companion$Empty$1(); @NotNull public final Object getEmpty() { return Empty; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\020\000\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"androidx/compose/runtime/Composer$Companion$Empty$1", "", "toString", "", "runtime"}) public static final class Composer$Companion$Empty$1 { @NotNull
/* 1201 */       public String toString() { return "Empty"; }
/*      */        }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @InternalComposeTracingApi
/*      */     public final void setTracer(@NotNull CompositionTracer tracer) {
/* 1210 */       Intrinsics.checkNotNullParameter(tracer, "tracer"); ComposerKt.access$setCompositionTracer$p(tracer);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Composer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */