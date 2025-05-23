/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.SynchronizationKt;
/*     */ import androidx.compose.ui.text.SynchronizedObject;
/*     */ import androidx.compose.ui.text.caches.LruCache;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\027\020\017\032\004\030\0010\n2\006\020\020\032\0020\tH\000¢\006\002\b\021J(\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\t0\0252\022\020\026\032\016\022\004\022\0020\t\022\004\022\0020\n0\027J4\020\030\032\b\022\004\022\0020\0010\0312\006\020\020\032\0020\t2\036\020\026\032\032\022\020\022\016\022\004\022\0020\n\022\004\022\0020\0230\027\022\004\022\0020\n0\027R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\032\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\bX\004¢\006\002\n\000R\024\020\013\032\0020\f8@X\004¢\006\006\032\004\b\r\020\016¨\006\032"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "()V", "lock", "Landroidx/compose/ui/text/SynchronizedObject;", "getLock$ui_text", "()Landroidx/compose/ui/text/SynchronizedObject;", "resultCache", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "Landroidx/compose/ui/text/font/TypefaceResult;", "size", "", "getSize$ui_text", "()I", "get", "typefaceRequest", "get$ui_text", "preWarmCache", "", "typefaceRequests", "", "resolveTypeface", "Lkotlin/Function1;", "runCached", "Landroidx/compose/runtime/State;", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.kt\nandroidx/compose/ui/text/SynchronizationKt\n*L\n1#1,264:1\n33#2:265\n33#2:266\n33#2:267\n33#2:268\n33#2:269\n33#2:270\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n172#1:265\n209#1:266\n226#1:267\n239#1:268\n246#1:269\n252#1:270\n*E\n"})
/*     */ public final class TypefaceRequestCache
/*     */ {
/*     */   @NotNull
/* 164 */   private final SynchronizedObject lock = SynchronizationKt.createSynchronizedObject(); @NotNull public final SynchronizedObject getLock$ui_text() { return this.lock; }
/*     */    @NotNull
/* 166 */   private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache(16);
/*     */   public static final int $stable = 8;
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "finalResult", "Landroidx/compose/ui/text/font/TypefaceResult;", "invoke"}) @SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.kt\nandroidx/compose/ui/text/SynchronizationKt\n*L\n1#1,264:1\n33#2:265\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n198#1:265\n*E\n"}) static final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements Function1<TypefaceResult, Unit> {
/*     */     public final void invoke(@NotNull TypefaceResult finalResult) { Intrinsics.checkNotNullParameter(finalResult, "finalResult"); SynchronizedObject synchronizedObject = TypefaceRequestCache.this.getLock$ui_text(); TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this; TypefaceRequest typefaceRequest = this.$typefaceRequest; int $i$f$synchronized = 0; synchronized (synchronizedObject) { int $i$a$-synchronized-TypefaceRequestCache$runCached$currentTypefaceResult$1$1 = 0; if (finalResult.getCacheable()) { typefaceRequestCache.resultCache.put(typefaceRequest, finalResult); }
/*     */         else { typefaceRequestCache.resultCache.remove(typefaceRequest); }
/*     */          Unit unit = Unit.INSTANCE; }
/* 172 */        } TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequest $typefaceRequest) { super(1); } } @NotNull public final State<Object> runCached(@NotNull TypefaceRequest typefaceRequest, @NotNull Function1 resolveTypeface) { TypefaceResult typefaceResult1; Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest"); Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface"); SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     synchronized (lock$iv) { int $i$a$-synchronized-TypefaceRequestCache$runCached$1 = 0; TypefaceResult it = (TypefaceResult)this.resultCache.get(typefaceRequest); int $i$a$-let-TypefaceRequestCache$runCached$1$1 = 0; if (it.getCacheable()) return it;  (TypefaceResult)this.resultCache.get(typefaceRequest); TypefaceResult typefaceResult2 = ((TypefaceResult)this.resultCache.get(typefaceRequest) != null) ? (TypefaceResult)this.resultCache.remove(typefaceRequest) : null; }  try { typefaceResult1 = (TypefaceResult)resolveTypeface.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(typefaceRequest)); } catch (Exception cause) { throw new FontLoadFailedException(typefaceRequest.getFontFamily(), (Throwable)cause); }
/* 266 */      TypefaceResult currentTypefaceResult = typefaceResult1; SynchronizedObject synchronizedObject1 = this.lock; int i = 0; synchronized (synchronizedObject1) { int $i$a$-synchronized-TypefaceRequestCache$runCached$2 = 0; if (this.resultCache.get(typefaceRequest) == null && currentTypefaceResult.getCacheable()) this.resultCache.put(typefaceRequest, currentTypefaceResult);  Unit unit = Unit.INSTANCE; }
/*     */      return currentTypefaceResult; }
/*     */   public final void preWarmCache(@NotNull List<TypefaceRequest> typefaceRequests, @NotNull Function1 resolveTypeface) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'typefaceRequests'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'resolveTypeface'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore_3
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface size : ()I
/*     */     //   20: istore #4
/*     */     //   22: iload_3
/*     */     //   23: iload #4
/*     */     //   25: if_icmpge -> 204
/*     */     //   28: aload_1
/*     */     //   29: iload_3
/*     */     //   30: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   35: checkcast androidx/compose/ui/text/font/TypefaceRequest
/*     */     //   38: astore #5
/*     */     //   40: aload_0
/*     */     //   41: getfield lock : Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   44: astore #7
/*     */     //   46: iconst_0
/*     */     //   47: istore #8
/*     */     //   49: aload #7
/*     */     //   51: astore #9
/*     */     //   53: aload #9
/*     */     //   55: monitorenter
/*     */     //   56: nop
/*     */     //   57: iconst_0
/*     */     //   58: istore #10
/*     */     //   60: aload_0
/*     */     //   61: getfield resultCache : Landroidx/compose/ui/text/caches/LruCache;
/*     */     //   64: aload #5
/*     */     //   66: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   69: checkcast androidx/compose/ui/text/font/TypefaceResult
/*     */     //   72: astore #11
/*     */     //   74: aload #9
/*     */     //   76: monitorexit
/*     */     //   77: aload #11
/*     */     //   79: goto -> 90
/*     */     //   82: astore #11
/*     */     //   84: aload #9
/*     */     //   86: monitorexit
/*     */     //   87: aload #11
/*     */     //   89: athrow
/*     */     //   90: nop
/*     */     //   91: astore #6
/*     */     //   93: aload #6
/*     */     //   95: ifnonnull -> 198
/*     */     //   98: nop
/*     */     //   99: aload_2
/*     */     //   100: aload #5
/*     */     //   102: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   107: checkcast androidx/compose/ui/text/font/TypefaceResult
/*     */     //   110: astore #8
/*     */     //   112: goto -> 135
/*     */     //   115: astore #9
/*     */     //   117: new androidx/compose/ui/text/font/FontLoadFailedException
/*     */     //   120: dup
/*     */     //   121: aload #5
/*     */     //   123: invokevirtual getFontFamily : ()Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   126: aload #9
/*     */     //   128: checkcast java/lang/Throwable
/*     */     //   131: invokespecial <init> : (Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/Throwable;)V
/*     */     //   134: athrow
/*     */     //   135: aload #8
/*     */     //   137: astore #7
/*     */     //   139: aload #7
/*     */     //   141: instanceof androidx/compose/ui/text/font/TypefaceResult$Async
/*     */     //   144: ifne -> 198
/*     */     //   147: aload_0
/*     */     //   148: getfield lock : Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   151: astore #8
/*     */     //   153: iconst_0
/*     */     //   154: istore #9
/*     */     //   156: aload #8
/*     */     //   158: astore #10
/*     */     //   160: aload #10
/*     */     //   162: monitorenter
/*     */     //   163: nop
/*     */     //   164: iconst_0
/*     */     //   165: istore #11
/*     */     //   167: aload_0
/*     */     //   168: getfield resultCache : Landroidx/compose/ui/text/caches/LruCache;
/*     */     //   171: aload #5
/*     */     //   173: aload #7
/*     */     //   175: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   178: checkcast androidx/compose/ui/text/font/TypefaceResult
/*     */     //   181: astore #12
/*     */     //   183: aload #10
/*     */     //   185: monitorexit
/*     */     //   186: goto -> 197
/*     */     //   189: astore #12
/*     */     //   191: aload #10
/*     */     //   193: monitorexit
/*     */     //   194: aload #12
/*     */     //   196: athrow
/*     */     //   197: nop
/*     */     //   198: iinc #3, 1
/*     */     //   201: goto -> 22
/*     */     //   204: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #223	-> 12
/*     */     //   #224	-> 28
/*     */     //   #226	-> 40
/*     */     //   #267	-> 49
/*     */     //   #226	-> 60
/*     */     //   #267	-> 72
/*     */     //   #267	-> 90
/*     */     //   #226	-> 91
/*     */     //   #227	-> 93
/*     */     //   #229	-> 98
/*     */     //   #230	-> 99
/*     */     //   #231	-> 115
/*     */     //   #232	-> 117
/*     */     //   #229	-> 135
/*     */     //   #237	-> 139
/*     */     //   #239	-> 147
/*     */     //   #268	-> 156
/*     */     //   #240	-> 167
/*     */     //   #268	-> 181
/*     */     //   #268	-> 197
/*     */     //   #223	-> 198
/*     */     //   #243	-> 204
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   60	12	10	$i$a$-synchronized-TypefaceRequestCache$preWarmCache$prior$1	I
/*     */     //   49	42	8	$i$f$synchronized	I
/*     */     //   46	45	7	lock$iv	Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   117	18	9	cause	Ljava/lang/Exception;
/*     */     //   167	14	11	$i$a$-synchronized-TypefaceRequestCache$preWarmCache$1	I
/*     */     //   156	42	9	$i$f$synchronized	I
/*     */     //   153	45	8	lock$iv	Landroidx/compose/ui/text/SynchronizedObject;
/*     */     //   40	158	5	typeRequest	Landroidx/compose/ui/text/font/TypefaceRequest;
/*     */     //   93	105	6	prior	Landroidx/compose/ui/text/font/TypefaceResult;
/*     */     //   139	59	7	next	Landroidx/compose/ui/text/font/TypefaceResult;
/*     */     //   14	190	3	i	I
/*     */     //   0	205	0	this	Landroidx/compose/ui/text/font/TypefaceRequestCache;
/*     */     //   0	205	1	typefaceRequests	Ljava/util/List;
/*     */     //   0	205	2	resolveTypeface	Lkotlin/jvm/functions/Function1;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	74	82	finally
/*     */     //   82	84	82	finally
/*     */     //   98	112	115	java/lang/Exception
/*     */     //   163	183	189	finally
/*     */     //   189	191	189	finally } @Nullable public final TypefaceResult get$ui_text(@NotNull TypefaceRequest typefaceRequest) { Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest"); SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 269 */     synchronized (lock$iv) { int $i$a$-synchronized-TypefaceRequestCache$get$1 = 0; TypefaceResult typefaceResult = (TypefaceResult)this.resultCache.get(typefaceRequest); }  return typefaceResult; } public final int getSize$ui_text() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 270 */     synchronized (lock$iv) { int $i$a$-synchronized-TypefaceRequestCache$size$1 = 0; $i$a$-synchronized-TypefaceRequestCache$size$1 = this.resultCache.size(); }  return $i$a$-synchronized-TypefaceRequestCache$size$1; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\TypefaceRequestCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */