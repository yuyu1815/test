/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\022\b\000\030\0002\b\022\004\022\0020\0020\001BG\022\f\020\003\032\b\022\004\022\0020\0050\004\022\006\020\006\032\0020\002\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\022\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0160\f\022\006\020\017\032\0020\020¢\006\002\020\021J\016\020 \032\0020\016H@¢\006\002\020!J\026\020\"\032\004\030\0010\002*\0020\005H@¢\006\004\b#\020$R\016\020\t\032\0020\nX\004¢\006\002\n\000R\032\020\022\032\0020\023X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\032\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0160\fX\004¢\006\002\n\000R\016\020\017\032\0020\020X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R+\020\031\032\0020\0022\006\020\030\032\0020\0028V@RX\002¢\006\022\n\004\b\036\020\037\032\004\b\032\020\033\"\004\b\034\020\035¨\006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text", "()Z", "setCacheable$ui_text", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
/*     */ public final class AsyncFontListLoader
/*     */   implements State<Object>
/*     */ {
/*     */   @NotNull
/*     */   private final List<Font> fontList;
/*     */   @NotNull
/*     */   private final TypefaceRequest typefaceRequest;
/*     */   @NotNull
/*     */   private final AsyncTypefaceCache asyncTypefaceCache;
/*     */   @NotNull
/*     */   private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
/*     */   @NotNull
/*     */   private final PlatformFontLoader platformFontLoader;
/*     */   @NotNull
/*     */   private final MutableState value$delegate;
/*     */   private boolean cacheable;
/*     */   public static final int $stable;
/*     */   
/*     */   public AsyncFontListLoader(@NotNull List<Font> fontList, @NotNull Object initialType, @NotNull TypefaceRequest typefaceRequest, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull Function1<TypefaceResult.Immutable, Unit> onCompletion, @NotNull PlatformFontLoader platformFontLoader) {
/* 249 */     this.fontList = fontList;
/*     */     
/* 251 */     this.typefaceRequest = typefaceRequest;
/* 252 */     this.asyncTypefaceCache = asyncTypefaceCache;
/* 253 */     this.onCompletion = onCompletion;
/* 254 */     this.platformFontLoader = platformFontLoader;
/*     */     
/* 256 */     this.value$delegate = SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
/*     */ 
/*     */     
/* 259 */     this.cacheable = true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public Object getValue() {
/*     */     State state = (State)this.value$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 433 */     return state.getValue(); } private void setValue(Object <set-?>) { MutableState mutableState = this.value$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 434 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   public final boolean getCacheable$ui_text() {
/*     */     return this.cacheable;
/*     */   }
/*     */   
/*     */   public final void setCacheable$ui_text(boolean <set-?>) {
/*     */     this.cacheable = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object load(@NotNull Continuation<? super Unit> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof androidx/compose/ui/text/font/AsyncFontListLoader$load$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast androidx/compose/ui/text/font/AsyncFontListLoader$load$1
/*     */     //   11: astore #13
/*     */     //   13: aload #13
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #13
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new androidx/compose/ui/text/font/AsyncFontListLoader$load$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Landroidx/compose/ui/text/font/AsyncFontListLoader;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #13
/*     */     //   50: aload #13
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #12
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #13
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 598, 0 -> 92, 1 -> 241, 2 -> 443
/*     */     //   92: aload #12
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: nop
/*     */     //   98: aload_0
/*     */     //   99: getfield fontList : Ljava/util/List;
/*     */     //   102: astore_2
/*     */     //   103: iconst_0
/*     */     //   104: istore_3
/*     */     //   105: nop
/*     */     //   106: iconst_0
/*     */     //   107: istore #4
/*     */     //   109: aload_2
/*     */     //   110: invokeinterface size : ()I
/*     */     //   115: istore #5
/*     */     //   117: iload #4
/*     */     //   119: iload #5
/*     */     //   121: if_icmpge -> 495
/*     */     //   124: aload_2
/*     */     //   125: iload #4
/*     */     //   127: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   132: astore #6
/*     */     //   134: aload #6
/*     */     //   136: checkcast androidx/compose/ui/text/font/Font
/*     */     //   139: astore #7
/*     */     //   141: iconst_0
/*     */     //   142: istore #8
/*     */     //   144: aload #7
/*     */     //   146: invokeinterface getLoadingStrategy-PKNRLFQ : ()I
/*     */     //   151: getstatic androidx/compose/ui/text/font/FontLoadingStrategy.Companion : Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;
/*     */     //   154: invokevirtual getAsync-PKNRLFQ : ()I
/*     */     //   157: invokestatic equals-impl0 : (II)Z
/*     */     //   160: ifeq -> 489
/*     */     //   163: aload_0
/*     */     //   164: getfield asyncTypefaceCache : Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   167: aload #7
/*     */     //   169: aload_0
/*     */     //   170: getfield platformFontLoader : Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   173: iconst_0
/*     */     //   174: new androidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1
/*     */     //   177: dup
/*     */     //   178: aload_0
/*     */     //   179: aload #7
/*     */     //   181: aconst_null
/*     */     //   182: invokespecial <init> : (Landroidx/compose/ui/text/font/AsyncFontListLoader;Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)V
/*     */     //   185: checkcast kotlin/jvm/functions/Function1
/*     */     //   188: aload #13
/*     */     //   190: aload #13
/*     */     //   192: aload_0
/*     */     //   193: putfield L$0 : Ljava/lang/Object;
/*     */     //   196: aload #13
/*     */     //   198: aload_2
/*     */     //   199: putfield L$1 : Ljava/lang/Object;
/*     */     //   202: aload #13
/*     */     //   204: aload #7
/*     */     //   206: putfield L$2 : Ljava/lang/Object;
/*     */     //   209: aload #13
/*     */     //   211: iload #4
/*     */     //   213: putfield I$0 : I
/*     */     //   216: aload #13
/*     */     //   218: iload #5
/*     */     //   220: putfield I$1 : I
/*     */     //   223: aload #13
/*     */     //   225: iconst_1
/*     */     //   226: putfield label : I
/*     */     //   229: invokevirtual runCached : (Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   232: dup
/*     */     //   233: aload #14
/*     */     //   235: if_acmpne -> 296
/*     */     //   238: aload #14
/*     */     //   240: areturn
/*     */     //   241: iconst_0
/*     */     //   242: istore_3
/*     */     //   243: iconst_0
/*     */     //   244: istore #8
/*     */     //   246: aload #13
/*     */     //   248: getfield I$1 : I
/*     */     //   251: istore #5
/*     */     //   253: aload #13
/*     */     //   255: getfield I$0 : I
/*     */     //   258: istore #4
/*     */     //   260: aload #13
/*     */     //   262: getfield L$2 : Ljava/lang/Object;
/*     */     //   265: checkcast androidx/compose/ui/text/font/Font
/*     */     //   268: astore #7
/*     */     //   270: aload #13
/*     */     //   272: getfield L$1 : Ljava/lang/Object;
/*     */     //   275: checkcast java/util/List
/*     */     //   278: astore_2
/*     */     //   279: aload #13
/*     */     //   281: getfield L$0 : Ljava/lang/Object;
/*     */     //   284: checkcast androidx/compose/ui/text/font/AsyncFontListLoader
/*     */     //   287: astore_0
/*     */     //   288: nop
/*     */     //   289: aload #12
/*     */     //   291: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   294: aload #12
/*     */     //   296: astore #9
/*     */     //   298: aload #9
/*     */     //   300: ifnull -> 391
/*     */     //   303: aload_0
/*     */     //   304: aload_0
/*     */     //   305: getfield typefaceRequest : Landroidx/compose/ui/text/font/TypefaceRequest;
/*     */     //   308: invokevirtual getFontSynthesis-GVVA2EU : ()I
/*     */     //   311: aload #9
/*     */     //   313: aload #7
/*     */     //   315: aload_0
/*     */     //   316: getfield typefaceRequest : Landroidx/compose/ui/text/font/TypefaceRequest;
/*     */     //   319: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   322: aload_0
/*     */     //   323: getfield typefaceRequest : Landroidx/compose/ui/text/font/TypefaceRequest;
/*     */     //   326: invokevirtual getFontStyle-_-LCdwA : ()I
/*     */     //   329: invokestatic synthesizeTypeface-FxwP2eA : (ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;
/*     */     //   332: invokespecial setValue : (Ljava/lang/Object;)V
/*     */     //   335: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   338: astore #10
/*     */     //   340: aload #13
/*     */     //   342: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   347: invokestatic isActive : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   350: istore #11
/*     */     //   352: aload_0
/*     */     //   353: iconst_0
/*     */     //   354: putfield cacheable : Z
/*     */     //   357: aload_0
/*     */     //   358: getfield onCompletion : Lkotlin/jvm/functions/Function1;
/*     */     //   361: new androidx/compose/ui/text/font/TypefaceResult$Immutable
/*     */     //   364: dup
/*     */     //   365: aload_0
/*     */     //   366: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   369: iload #11
/*     */     //   371: ifeq -> 378
/*     */     //   374: iconst_1
/*     */     //   375: goto -> 379
/*     */     //   378: iconst_0
/*     */     //   379: invokespecial <init> : (Ljava/lang/Object;Z)V
/*     */     //   382: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   387: pop
/*     */     //   388: aload #10
/*     */     //   390: areturn
/*     */     //   391: aload #13
/*     */     //   393: aload #13
/*     */     //   395: aload_0
/*     */     //   396: putfield L$0 : Ljava/lang/Object;
/*     */     //   399: aload #13
/*     */     //   401: aload_2
/*     */     //   402: putfield L$1 : Ljava/lang/Object;
/*     */     //   405: aload #13
/*     */     //   407: aconst_null
/*     */     //   408: putfield L$2 : Ljava/lang/Object;
/*     */     //   411: aload #13
/*     */     //   413: iload #4
/*     */     //   415: putfield I$0 : I
/*     */     //   418: aload #13
/*     */     //   420: iload #5
/*     */     //   422: putfield I$1 : I
/*     */     //   425: aload #13
/*     */     //   427: iconst_2
/*     */     //   428: putfield label : I
/*     */     //   431: invokestatic yield : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   434: dup
/*     */     //   435: aload #14
/*     */     //   437: if_acmpne -> 488
/*     */     //   440: aload #14
/*     */     //   442: areturn
/*     */     //   443: iconst_0
/*     */     //   444: istore #8
/*     */     //   446: iconst_0
/*     */     //   447: istore_3
/*     */     //   448: aload #13
/*     */     //   450: getfield I$1 : I
/*     */     //   453: istore #5
/*     */     //   455: aload #13
/*     */     //   457: getfield I$0 : I
/*     */     //   460: istore #4
/*     */     //   462: aload #13
/*     */     //   464: getfield L$1 : Ljava/lang/Object;
/*     */     //   467: checkcast java/util/List
/*     */     //   470: astore_2
/*     */     //   471: aload #13
/*     */     //   473: getfield L$0 : Ljava/lang/Object;
/*     */     //   476: checkcast androidx/compose/ui/text/font/AsyncFontListLoader
/*     */     //   479: astore_0
/*     */     //   480: nop
/*     */     //   481: aload #12
/*     */     //   483: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   486: aload #12
/*     */     //   488: pop
/*     */     //   489: iinc #4, 1
/*     */     //   492: goto -> 117
/*     */     //   495: nop
/*     */     //   496: aload #13
/*     */     //   498: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   503: invokestatic isActive : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   506: istore_2
/*     */     //   507: aload_0
/*     */     //   508: iconst_0
/*     */     //   509: putfield cacheable : Z
/*     */     //   512: aload_0
/*     */     //   513: getfield onCompletion : Lkotlin/jvm/functions/Function1;
/*     */     //   516: new androidx/compose/ui/text/font/TypefaceResult$Immutable
/*     */     //   519: dup
/*     */     //   520: aload_0
/*     */     //   521: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   524: iload_2
/*     */     //   525: ifeq -> 532
/*     */     //   528: iconst_1
/*     */     //   529: goto -> 533
/*     */     //   532: iconst_0
/*     */     //   533: invokespecial <init> : (Ljava/lang/Object;Z)V
/*     */     //   536: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   541: pop
/*     */     //   542: goto -> 594
/*     */     //   545: astore_2
/*     */     //   546: aload #13
/*     */     //   548: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   553: invokestatic isActive : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   556: istore_3
/*     */     //   557: aload_0
/*     */     //   558: iconst_0
/*     */     //   559: putfield cacheable : Z
/*     */     //   562: aload_0
/*     */     //   563: getfield onCompletion : Lkotlin/jvm/functions/Function1;
/*     */     //   566: new androidx/compose/ui/text/font/TypefaceResult$Immutable
/*     */     //   569: dup
/*     */     //   570: aload_0
/*     */     //   571: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   574: iload_3
/*     */     //   575: ifeq -> 582
/*     */     //   578: iconst_1
/*     */     //   579: goto -> 583
/*     */     //   582: iconst_0
/*     */     //   583: invokespecial <init> : (Ljava/lang/Object;Z)V
/*     */     //   586: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   591: pop
/*     */     //   592: aload_2
/*     */     //   593: athrow
/*     */     //   594: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   597: areturn
/*     */     //   598: new java/lang/IllegalStateException
/*     */     //   601: dup
/*     */     //   602: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   604: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   607: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #261	-> 60
/*     */     //   #262	-> 97
/*     */     //   #263	-> 98
/*     */     //   #436	-> 105
/*     */     //   #437	-> 106
/*     */     //   #438	-> 124
/*     */     //   #439	-> 134
/*     */     //   #271	-> 144
/*     */     //   #272	-> 163
/*     */     //   #261	-> 238
/*     */     //   #275	-> 298
/*     */     //   #276	-> 303
/*     */     //   #277	-> 311
/*     */     //   #278	-> 313
/*     */     //   #279	-> 315
/*     */     //   #280	-> 322
/*     */     //   #276	-> 329
/*     */     //   #282	-> 335
/*     */     //   #291	-> 340
/*     */     //   #291	-> 347
/*     */     //   #292	-> 352
/*     */     //   #293	-> 357
/*     */     //   #285	-> 393
/*     */     //   #261	-> 440
/*     */     //   #288	-> 488
/*     */     //   #439	-> 489
/*     */     //   #437	-> 489
/*     */     //   #441	-> 495
/*     */     //   #291	-> 496
/*     */     //   #291	-> 503
/*     */     //   #292	-> 507
/*     */     //   #293	-> 512
/*     */     //   #294	-> 542
/*     */     //   #291	-> 545
/*     */     //   #291	-> 553
/*     */     //   #292	-> 557
/*     */     //   #293	-> 562
/*     */     //   #295	-> 594
/*     */     //   #261	-> 598
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	144	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   288	59	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   347	31	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   391	52	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   480	9	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   489	7	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   496	7	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   503	29	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   545	8	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   553	29	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   103	138	2	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   279	59	2	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   391	52	2	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   471	25	2	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   507	25	2	shouldCache	Z
/*     */     //   557	25	3	shouldCache	Z
/*     */     //   109	132	4	index$iv	I
/*     */     //   260	78	4	index$iv	I
/*     */     //   391	52	4	index$iv	I
/*     */     //   462	33	4	index$iv	I
/*     */     //   134	7	6	item$iv	Ljava/lang/Object;
/*     */     //   141	100	7	font	Landroidx/compose/ui/text/font/Font;
/*     */     //   270	68	7	font	Landroidx/compose/ui/text/font/Font;
/*     */     //   298	40	9	typeface	Ljava/lang/Object;
/*     */     //   352	26	11	shouldCache	Z
/*     */     //   144	97	8	$i$a$-fastForEach-AsyncFontListLoader$load$2	I
/*     */     //   105	136	3	$i$f$fastForEach	I
/*     */     //   391	52	3	$i$f$fastForEach	I
/*     */     //   391	52	8	$i$a$-fastForEach-AsyncFontListLoader$load$2	I
/*     */     //   50	548	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	541	12	$result	Ljava/lang/Object;
/*     */     //   246	92	8	$i$a$-fastForEach-AsyncFontListLoader$load$2	I
/*     */     //   243	95	3	$i$f$fastForEach	I
/*     */     //   448	48	3	$i$f$fastForEach	I
/*     */     //   446	43	8	$i$a$-fastForEach-AsyncFontListLoader$load$2	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   97	232	545	finally
/*     */     //   288	340	545	finally
/*     */     //   391	434	545	finally
/*     */     //   480	496	545	finally
/*     */     //   545	546	545	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\000\020\000\032\004\030\0010\001H@"}, d2 = {"<anonymous>", ""})
/*     */   static final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
/*     */     int label;
/*     */     
/*     */     AsyncFontListLoader$load$2$typeface$1(Font $font, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (AsyncFontListLoader.this.loadWithTimeoutOrNull$ui_text(this.$font, (Continuation<Object>)this) == object)
/*     */             return object; 
/*     */           return AsyncFontListLoader.this.loadWithTimeoutOrNull$ui_text(this.$font, (Continuation<Object>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super AsyncFontListLoader$load$2$typeface$1> $completion) {
/*     */       return (Continuation<Unit>)new AsyncFontListLoader$load$2$typeface$1(this.$font, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((AsyncFontListLoader$load$2$typeface$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object loadWithTimeoutOrNull$ui_text(@NotNull Font $this$loadWithTimeoutOrNull, @NotNull Continuation<Object> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof androidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast androidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new androidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Landroidx/compose/ui/text/font/AsyncFontListLoader;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 265, 0 -> 88, 1 -> 136
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: ldc2_w 15000
/*     */     //   97: new androidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$2
/*     */     //   100: dup
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aconst_null
/*     */     //   104: invokespecial <init> : (Landroidx/compose/ui/text/font/AsyncFontListLoader;Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)V
/*     */     //   107: checkcast kotlin/jvm/functions/Function2
/*     */     //   110: aload #6
/*     */     //   112: aload #6
/*     */     //   114: aload_1
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #6
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokestatic withTimeoutOrNull : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #7
/*     */     //   130: if_acmpne -> 153
/*     */     //   133: aload #7
/*     */     //   135: areturn
/*     */     //   136: aload #6
/*     */     //   138: getfield L$0 : Ljava/lang/Object;
/*     */     //   141: checkcast androidx/compose/ui/text/font/Font
/*     */     //   144: astore_1
/*     */     //   145: nop
/*     */     //   146: aload #5
/*     */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   151: aload #5
/*     */     //   153: astore_3
/*     */     //   154: goto -> 263
/*     */     //   157: astore #4
/*     */     //   159: aload #6
/*     */     //   161: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   166: invokestatic isActive : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   169: ifeq -> 176
/*     */     //   172: aconst_null
/*     */     //   173: goto -> 179
/*     */     //   176: aload #4
/*     */     //   178: athrow
/*     */     //   179: astore_3
/*     */     //   180: goto -> 263
/*     */     //   183: astore #4
/*     */     //   185: aload #6
/*     */     //   187: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   192: getstatic kotlinx/coroutines/CoroutineExceptionHandler.Key : Lkotlinx/coroutines/CoroutineExceptionHandler$Key;
/*     */     //   195: checkcast kotlin/coroutines/CoroutineContext$Key
/*     */     //   198: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*     */     //   203: checkcast kotlinx/coroutines/CoroutineExceptionHandler
/*     */     //   206: dup
/*     */     //   207: ifnull -> 260
/*     */     //   210: aload #6
/*     */     //   212: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   217: new java/lang/IllegalStateException
/*     */     //   220: dup
/*     */     //   221: new java/lang/StringBuilder
/*     */     //   224: dup
/*     */     //   225: invokespecial <init> : ()V
/*     */     //   228: ldc_w 'Unable to load font '
/*     */     //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   234: aload_1
/*     */     //   235: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   238: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   241: aload #4
/*     */     //   243: checkcast java/lang/Throwable
/*     */     //   246: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   249: checkcast java/lang/Throwable
/*     */     //   252: invokeinterface handleException : (Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
/*     */     //   257: goto -> 261
/*     */     //   260: pop
/*     */     //   261: aconst_null
/*     */     //   262: astore_3
/*     */     //   263: aload_3
/*     */     //   264: areturn
/*     */     //   265: new java/lang/IllegalStateException
/*     */     //   268: dup
/*     */     //   269: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   271: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   274: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #300	-> 60
/*     */     //   #301	-> 93
/*     */     //   #304	-> 94
/*     */     //   #300	-> 133
/*     */     //   #304	-> 153
/*     */     //   #307	-> 157
/*     */     //   #309	-> 159
/*     */     //   #309	-> 166
/*     */     //   #310	-> 183
/*     */     //   #320	-> 185
/*     */     //   #320	-> 192
/*     */     //   #321	-> 210
/*     */     //   #322	-> 217
/*     */     //   #323	-> 221
/*     */     //   #324	-> 241
/*     */     //   #322	-> 246
/*     */     //   #320	-> 252
/*     */     //   #327	-> 261
/*     */     //   #301	-> 264
/*     */     //   #300	-> 265
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	34	0	this	Landroidx/compose/ui/text/font/AsyncFontListLoader;
/*     */     //   93	43	1	$this$loadWithTimeoutOrNull	Landroidx/compose/ui/text/font/Font;
/*     */     //   145	9	1	$this$loadWithTimeoutOrNull	Landroidx/compose/ui/text/font/Font;
/*     */     //   183	9	1	$this$loadWithTimeoutOrNull	Landroidx/compose/ui/text/font/Font;
/*     */     //   192	25	1	$this$loadWithTimeoutOrNull	Landroidx/compose/ui/text/font/Font;
/*     */     //   217	24	1	$this$loadWithTimeoutOrNull	Landroidx/compose/ui/text/font/Font;
/*     */     //   159	21	4	cancel	Ljava/util/concurrent/CancellationException;
/*     */     //   185	7	4	uncaughtFontLoadException	Ljava/lang/Exception;
/*     */     //   192	25	4	uncaughtFontLoadException	Ljava/lang/Exception;
/*     */     //   217	29	4	uncaughtFontLoadException	Ljava/lang/Exception;
/*     */     //   50	215	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	208	5	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	127	157	java/util/concurrent/CancellationException
/*     */     //   93	127	183	java/lang/Exception
/*     */     //   145	154	157	java/util/concurrent/CancellationException
/*     */     //   145	154	183	java/lang/Exception
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, i = {0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"}, n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, m = "load", c = "androidx.compose.ui.text.font.AsyncFontListLoader")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AsyncFontListLoader$load$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     AsyncFontListLoader$load$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AsyncFontListLoader.this.load((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, i = {0}, s = {"L$0"}, n = {"$this$loadWithTimeoutOrNull"}, m = "loadWithTimeoutOrNull$ui_text", c = "androidx.compose.ui.text.font.AsyncFontListLoader")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AsyncFontListLoader$loadWithTimeoutOrNull$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AsyncFontListLoader.this.loadWithTimeoutOrNull$ui_text(null, (Continuation<Object>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\000\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
/*     */     int label;
/*     */     
/*     */     AsyncFontListLoader$loadWithTimeoutOrNull$2(Font font, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (AsyncFontListLoader.this.platformFontLoader.awaitLoad(this.$this_loadWithTimeoutOrNull, (Continuation<Object>)this) == object)
/*     */             return object; 
/*     */           return AsyncFontListLoader.this.platformFontLoader.awaitLoad(this.$this_loadWithTimeoutOrNull, (Continuation<Object>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> $completion) {
/*     */       return (Continuation<Unit>)new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.$this_loadWithTimeoutOrNull, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((AsyncFontListLoader$loadWithTimeoutOrNull$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\AsyncFontListLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */