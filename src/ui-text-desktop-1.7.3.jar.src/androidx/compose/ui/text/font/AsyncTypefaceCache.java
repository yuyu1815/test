/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.SynchronizationKt;
/*     */ import androidx.compose.ui.text.SynchronizedObject;
/*     */ import androidx.compose.ui.text.caches.LruCache;
/*     */ import androidx.compose.ui.text.caches.SimpleArrayMap;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.InlineMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001:\002\037 B\005¢\006\002\020\002J#\020\r\032\004\030\0010\0042\006\020\016\032\0020\0172\006\020\020\032\0020\021ø\001\001ø\001\000¢\006\002\b\022J*\020\023\032\0020\0242\006\020\016\032\0020\0172\006\020\020\032\0020\0212\b\020\025\032\004\030\0010\0012\b\b\002\020\026\032\0020\027JH\020\030\032\004\030\0010\0012\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020\0272\036\020\031\032\032\b\001\022\f\022\n\022\006\022\004\030\0010\0010\033\022\006\022\004\030\0010\0010\032H@¢\006\002\020\034J.\020\035\032\004\030\0010\0012\006\020\016\032\0020\0172\006\020\020\032\0020\0212\016\020\031\032\n\022\006\022\004\030\0010\0010\036H\bø\001\002R\026\020\003\032\0020\004X\004ø\001\000ø\001\001¢\006\004\n\002\020\005R\016\020\006\032\0020\007X\004¢\006\002\n\000R\032\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0040\tX\004¢\006\002\n\000R\032\020\013\032\016\022\004\022\0020\n\022\004\022\0020\0040\fX\004¢\006\002\n\000\002\022\n\005\b¡\0360\001\n\002\b!\n\005\b20\001¨\006!"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "()V", "PermanentFailure", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "Ljava/lang/Object;", "cacheLock", "Landroidx/compose/ui/text/SynchronizedObject;", "permanentCache", "Landroidx/compose/ui/text/caches/SimpleArrayMap;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "resultCache", "Landroidx/compose/ui/text/caches/LruCache;", "get", "font", "Landroidx/compose/ui/text/font/Font;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "get-1ASDuI8", "put", "", "result", "forever", "", "runCached", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCachedBlocking", "Lkotlin/Function0;", "AsyncTypefaceResult", "Key", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.kt\nandroidx/compose/ui/text/SynchronizationKt\n*L\n1#1,432:1\n33#2:433\n33#2:434\n33#2:435\n33#2:436\n33#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
/*     */ public final class AsyncTypefaceCache
/*     */ {
/*     */   @JvmInline
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\004\n\002\020\013\n\002\b\t\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\001¢\006\004\b\003\020\004J\032\020\013\032\0020\0062\b\020\f\032\004\030\0010\001HÖ\003¢\006\004\b\r\020\016J\020\020\017\032\0020\020HÖ\001¢\006\004\b\021\020\022J\020\020\023\032\0020\024HÖ\001¢\006\004\b\025\020\026R\021\020\005\032\0020\0068F¢\006\006\032\004\b\007\020\bR\023\020\002\032\004\030\0010\001¢\006\b\n\000\032\004\b\t\020\n\001\002¨\006\027"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isPermanentFailure", "", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "getResult", "()Ljava/lang/Object;", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "ui-text"})
/*     */   public static final class AsyncTypefaceResult
/*     */   {
/*     */     @Nullable
/*     */     private final Object result;
/*     */     
/*     */     @Nullable
/*     */     public final Object getResult() {
/* 342 */       return this.result;
/*     */     }
/* 344 */     public static String toString-impl(Object arg0) { return "AsyncTypefaceResult(result=" + arg0 + ')'; } public String toString() { return toString-impl(this.result); } public static int hashCode-impl(Object arg0) { return (arg0 == null) ? 0 : arg0.hashCode(); } public int hashCode() { return hashCode-impl(this.result); } public static final boolean isPermanentFailure-impl(Object arg0) { return (arg0 == null); }
/*     */     public static boolean equals-impl(Object arg0, Object other) { return !(other instanceof AsyncTypefaceResult) ? false : (!!Intrinsics.areEqual(arg0, ((AsyncTypefaceResult)other).unbox-impl())); }
/*     */     public boolean equals(Object other) { return equals-impl(this.result, other); } @NotNull public static Object constructor-impl(@Nullable Object result) { return result; } public static final boolean equals-impl0(Object p1, Object p2) { return Intrinsics.areEqual(p1, p2); }
/* 347 */   } @NotNull private final Object PermanentFailure = AsyncTypefaceResult.constructor-impl(null); @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\001¢\006\002\020\005J\t\020\n\032\0020\003HÆ\003J\013\020\013\032\004\030\0010\001HÆ\003J\037\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\001HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\023\020\004\032\004\030\0010\001¢\006\b\n\000\032\004\b\b\020\t¨\006\024"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "font", "Landroidx/compose/ui/text/font/Font;", "loaderKey", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "getFont", "()Landroidx/compose/ui/text/font/Font;", "getLoaderKey", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-text"}) @StabilityInferred(parameters = 0) public static final class Key { @NotNull
/*     */     private final Font font; @Nullable
/* 349 */     private final Object loaderKey; public static final int $stable = 8; public Key(@NotNull Font font, @Nullable Object loaderKey) { this.font = font; this.loaderKey = loaderKey; } @NotNull public final Font getFont() { return this.font; } @Nullable public final Object getLoaderKey() { return this.loaderKey; }
/*     */     @NotNull public final Font component1() { return this.font; }
/*     */     @Nullable public final Object component2() { return this.loaderKey; }
/*     */     @NotNull public final Key copy(@NotNull Font font, @Nullable Object loaderKey) { Intrinsics.checkNotNullParameter(font, "font"); return new Key(font, loaderKey); }
/*     */     @NotNull public String toString() { return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')'; }
/*     */     public int hashCode() { result = this.font.hashCode(); return result * 31 + ((this.loaderKey == null) ? 0 : this.loaderKey.hashCode()); }
/* 355 */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Key)) return false;  Key key = (Key)other; return !Intrinsics.areEqual(this.font, key.font) ? false : (!!Intrinsics.areEqual(this.loaderKey, key.loaderKey)); } } @NotNull private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache(16);
/*     */   
/*     */   @NotNull
/* 358 */   private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap(0, 1, null);
/*     */   @NotNull
/* 360 */   private final SynchronizedObject cacheLock = SynchronizationKt.createSynchronizedObject();
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */   
/*     */   public final void put(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @Nullable Object result, boolean forever)
/*     */   {
/* 368 */     Intrinsics.checkNotNullParameter(font, "font"); Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader"); Key key = new Key(font, platformFontLoader.getCacheKey());
/* 369 */     SynchronizedObject lock$iv = this.cacheLock; int $i$f$synchronized = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 433 */     synchronized (lock$iv) { int $i$a$-synchronized-AsyncTypefaceCache$put$1 = 0; AsyncTypefaceResult asyncTypefaceResult = (result == null) ? (AsyncTypefaceResult)this.permanentCache.put(key, AsyncTypefaceResult.box-impl(this.PermanentFailure)) : (forever ? (AsyncTypefaceResult)this.permanentCache.put(key, AsyncTypefaceResult.box-impl(AsyncTypefaceResult.constructor-impl(result))) : (AsyncTypefaceResult)this.resultCache.put(key, AsyncTypefaceResult.box-impl(AsyncTypefaceResult.constructor-impl(result)))); }
/* 434 */      } @Nullable public final AsyncTypefaceResult get-1ASDuI8(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader) { Intrinsics.checkNotNullParameter(font, "font"); Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader"); Key key = new Key(font, platformFontLoader.getCacheKey()); SynchronizedObject lock$iv = this.cacheLock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-AsyncTypefaceCache$get$1 = 0; if ((AsyncTypefaceResult)this.resultCache.get(key) == null) (AsyncTypefaceResult)this.resultCache.get(key);  AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult)this.permanentCache.get(key); }  return asyncTypefaceResult; } @Nullable public final Object runCached(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, boolean forever, @NotNull Function1 block, @NotNull Continuation<Object> paramContinuation) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof androidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1
/*     */     //   13: astore #16
/*     */     //   15: aload #16
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #16
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new androidx/compose/ui/text/font/AsyncTypefaceCache$runCached$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #16
/*     */     //   53: aload #16
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #15
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #17
/*     */     //   65: aload #16
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 401, 0 -> 92, 1 -> 246
/*     */     //   92: aload #15
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new androidx/compose/ui/text/font/AsyncTypefaceCache$Key
/*     */     //   100: dup
/*     */     //   101: aload_1
/*     */     //   102: aload_2
/*     */     //   103: invokeinterface getCacheKey : ()Ljava/lang/Object;
/*     */     //   108: invokespecial <init> : (Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V
/*     */     //   111: astore #6
/*     */     //   113: aload_0
/*     */     //   114: getfield cacheLock : Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   117: astore #7
/*     */     //   119: iconst_0
/*     */     //   120: istore #8
/*     */     //   122: aload #7
/*     */     //   124: astore #9
/*     */     //   126: aload #9
/*     */     //   128: monitorenter
/*     */     //   129: nop
/*     */     //   130: iconst_0
/*     */     //   131: istore #10
/*     */     //   133: aload_0
/*     */     //   134: getfield resultCache : Landroidx/compose/ui/text/caches/LruCache;
/*     */     //   137: aload #6
/*     */     //   139: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   142: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
/*     */     //   145: dup
/*     */     //   146: ifnonnull -> 162
/*     */     //   149: pop
/*     */     //   150: aload_0
/*     */     //   151: getfield permanentCache : Landroidx/compose/ui/text/caches/SimpleArrayMap;
/*     */     //   154: aload #6
/*     */     //   156: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   159: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
/*     */     //   162: astore #11
/*     */     //   164: aload #11
/*     */     //   166: ifnull -> 182
/*     */     //   169: aload #11
/*     */     //   171: invokevirtual unbox-impl : ()Ljava/lang/Object;
/*     */     //   174: astore #13
/*     */     //   176: aload #9
/*     */     //   178: monitorexit
/*     */     //   179: aload #13
/*     */     //   181: areturn
/*     */     //   182: nop
/*     */     //   183: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   186: astore #12
/*     */     //   188: aload #9
/*     */     //   190: monitorexit
/*     */     //   191: goto -> 202
/*     */     //   194: astore #12
/*     */     //   196: aload #9
/*     */     //   198: monitorexit
/*     */     //   199: aload #12
/*     */     //   201: athrow
/*     */     //   202: nop
/*     */     //   203: aload #4
/*     */     //   205: aload #16
/*     */     //   207: aload #16
/*     */     //   209: aload_0
/*     */     //   210: putfield L$0 : Ljava/lang/Object;
/*     */     //   213: aload #16
/*     */     //   215: aload #6
/*     */     //   217: putfield L$1 : Ljava/lang/Object;
/*     */     //   220: aload #16
/*     */     //   222: iload_3
/*     */     //   223: putfield Z$0 : Z
/*     */     //   226: aload #16
/*     */     //   228: iconst_1
/*     */     //   229: putfield label : I
/*     */     //   232: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   237: dup
/*     */     //   238: aload #17
/*     */     //   240: if_acmpne -> 278
/*     */     //   243: aload #17
/*     */     //   245: areturn
/*     */     //   246: aload #16
/*     */     //   248: getfield Z$0 : Z
/*     */     //   251: istore_3
/*     */     //   252: aload #16
/*     */     //   254: getfield L$1 : Ljava/lang/Object;
/*     */     //   257: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$Key
/*     */     //   260: astore #6
/*     */     //   262: aload #16
/*     */     //   264: getfield L$0 : Ljava/lang/Object;
/*     */     //   267: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache
/*     */     //   270: astore_0
/*     */     //   271: aload #15
/*     */     //   273: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   276: aload #15
/*     */     //   278: astore #7
/*     */     //   280: aload #7
/*     */     //   282: astore #8
/*     */     //   284: iconst_0
/*     */     //   285: istore #9
/*     */     //   287: aload_0
/*     */     //   288: getfield cacheLock : Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   291: astore #10
/*     */     //   293: iconst_0
/*     */     //   294: istore #11
/*     */     //   296: aload #10
/*     */     //   298: astore #12
/*     */     //   300: aload #12
/*     */     //   302: monitorenter
/*     */     //   303: nop
/*     */     //   304: iconst_0
/*     */     //   305: istore #13
/*     */     //   307: nop
/*     */     //   308: aload #8
/*     */     //   310: ifnonnull -> 333
/*     */     //   313: aload_0
/*     */     //   314: getfield permanentCache : Landroidx/compose/ui/text/caches/SimpleArrayMap;
/*     */     //   317: aload #6
/*     */     //   319: aload_0
/*     */     //   320: getfield PermanentFailure : Ljava/lang/Object;
/*     */     //   323: invokestatic box-impl : (Ljava/lang/Object;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
/*     */     //   326: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   329: pop
/*     */     //   330: goto -> 376
/*     */     //   333: iload_3
/*     */     //   334: ifeq -> 358
/*     */     //   337: aload_0
/*     */     //   338: getfield permanentCache : Landroidx/compose/ui/text/caches/SimpleArrayMap;
/*     */     //   341: aload #6
/*     */     //   343: aload #8
/*     */     //   345: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   348: invokestatic box-impl : (Ljava/lang/Object;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
/*     */     //   351: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   354: pop
/*     */     //   355: goto -> 376
/*     */     //   358: aload_0
/*     */     //   359: getfield resultCache : Landroidx/compose/ui/text/caches/LruCache;
/*     */     //   362: aload #6
/*     */     //   364: aload #8
/*     */     //   366: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   369: invokestatic box-impl : (Ljava/lang/Object;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
/*     */     //   372: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   375: pop
/*     */     //   376: nop
/*     */     //   377: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   380: astore #14
/*     */     //   382: aload #12
/*     */     //   384: monitorexit
/*     */     //   385: goto -> 396
/*     */     //   388: astore #14
/*     */     //   390: aload #12
/*     */     //   392: monitorexit
/*     */     //   393: aload #14
/*     */     //   395: athrow
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: aload #7
/*     */     //   400: areturn
/*     */     //   401: new java/lang/IllegalStateException
/*     */     //   404: dup
/*     */     //   405: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   407: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   410: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #385	-> 63
/*     */     //   #391	-> 97
/*     */     //   #392	-> 113
/*     */     //   #435	-> 122
/*     */     //   #393	-> 133
/*     */     //   #394	-> 164
/*     */     //   #395	-> 169
/*     */     //   #397	-> 182
/*     */     //   #435	-> 186
/*     */     //   #435	-> 202
/*     */     //   #398	-> 203
/*     */     //   #385	-> 243
/*     */     //   #399	-> 287
/*     */     //   #436	-> 296
/*     */     //   #400	-> 307
/*     */     //   #401	-> 308
/*     */     //   #402	-> 313
/*     */     //   #404	-> 333
/*     */     //   #405	-> 337
/*     */     //   #408	-> 358
/*     */     //   #411	-> 376
/*     */     //   #436	-> 380
/*     */     //   #436	-> 396
/*     */     //   #412	-> 397
/*     */     //   #398	-> 398
/*     */     //   #398	-> 400
/*     */     //   #385	-> 401
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	72	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   182	1	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   183	11	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   202	44	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   271	62	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   333	25	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   358	18	0	this	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
/*     */     //   97	16	1	font	Landroidx/compose/ui/text/font/Font;
/*     */     //   97	16	2	platformFontLoader	Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   97	72	3	forever	Z
/*     */     //   182	1	3	forever	Z
/*     */     //   183	11	3	forever	Z
/*     */     //   202	44	3	forever	Z
/*     */     //   252	61	3	forever	Z
/*     */     //   333	4	3	forever	Z
/*     */     //   97	72	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   182	1	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   183	11	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   202	1	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   203	34	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   113	56	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   182	1	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   183	11	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   202	44	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   262	71	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   333	25	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   358	18	6	key	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
/*     */     //   119	10	7	lock$iv	Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   284	29	8	it	Ljava/lang/Object;
/*     */     //   333	25	8	it	Ljava/lang/Object;
/*     */     //   358	18	8	it	Ljava/lang/Object;
/*     */     //   293	10	10	lock$iv	Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   164	10	11	priorResult	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
/*     */     //   133	41	10	$i$a$-synchronized-AsyncTypefaceCache$runCached$2	I
/*     */     //   122	52	8	$i$f$synchronized	I
/*     */     //   182	21	8	$i$f$synchronized	I
/*     */     //   182	1	10	$i$a$-synchronized-AsyncTypefaceCache$runCached$2	I
/*     */     //   307	70	13	$i$a$-synchronized-AsyncTypefaceCache$runCached$3$1	I
/*     */     //   296	101	11	$i$f$synchronized	I
/*     */     //   287	111	9	$i$a$-also-AsyncTypefaceCache$runCached$3	I
/*     */     //   53	348	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	341	15	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   129	176	194	finally
/*     */     //   182	188	194	finally
/*     */     //   194	196	194	finally
/*     */     //   303	382	388	finally
/*     */     //   388	390	388	finally }
/*     */   @Nullable public final Object runCachedBlocking(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function0 block) { Object object1, it; int $i$a$-also-AsyncTypefaceCache$runCachedBlocking$2; Intrinsics.checkNotNullParameter(font, "font"); Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$runCachedBlocking = 0; SynchronizedObject lock$iv = this.cacheLock;
/*     */     int $i$f$synchronized = 0;
/* 437 */     SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-AsyncTypefaceCache$runCachedBlocking$1 = 0; Key key = new Key(font, platformFontLoader.getCacheKey()); if ((AsyncTypefaceResult)this.resultCache.get(key) == null) (AsyncTypefaceResult)this.resultCache.get(key);  AsyncTypefaceResult priorResult = (AsyncTypefaceResult)this.permanentCache.get(key); if (priorResult != null) return priorResult.unbox-impl();  Unit unit = Unit.INSTANCE; InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/ui/text/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/*     */     
/*     */     return object1; }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {398}, i = {0, 0, 0}, s = {"L$0", "L$1", "Z$0"}, n = {"this", "key", "forever"}, m = "runCached", c = "androidx.compose.ui.text.font.AsyncTypefaceCache")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     AsyncTypefaceCache$runCached$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AsyncTypefaceCache.this.runCached(null, null, false, null, (Continuation<Object>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\AsyncTypefaceCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */