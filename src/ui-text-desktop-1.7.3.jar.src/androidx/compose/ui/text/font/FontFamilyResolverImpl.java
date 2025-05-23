/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B5\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ\026\020\023\032\0020\0242\006\020\025\032\0020\026H@¢\006\002\020\027J:\020\030\032\b\022\004\022\0020\0200\0312\b\020\025\032\004\030\0010\0262\006\020\032\032\0020\0332\006\020\034\032\0020\0352\006\020\036\032\0020\037H\026ø\001\000¢\006\004\b \020!J\026\020\030\032\b\022\004\022\0020\0200\0312\006\020\"\032\0020\017H\002R\032\020\r\032\016\022\004\022\0020\017\022\004\022\0020\0200\016X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\021\020\022R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,264:1\n151#2,3:265\n33#2,4:268\n154#2,2:272\n38#2:274\n156#2:275\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:265,3\n47#1:268,4\n47#1:272,2\n47#1:274\n47#1:275\n*E\n"})
/*     */ public final class FontFamilyResolverImpl implements FontFamily.Resolver {
/*     */   @NotNull
/*     */   private final PlatformFontLoader platformFontLoader;
/*     */   @NotNull
/*     */   private final PlatformResolveInterceptor platformResolveInterceptor;
/*     */   @NotNull
/*     */   private final TypefaceRequestCache typefaceRequestCache;
/*     */   @NotNull
/*     */   private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
/*     */   @NotNull
/*     */   private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
/*     */   @NotNull
/*     */   private final Function1<TypefaceRequest, Object> createDefaultTypeface;
/*     */   public static final int $stable = 8;
/*     */   
/*  26 */   public FontFamilyResolverImpl(@NotNull PlatformFontLoader platformFontLoader, @NotNull PlatformResolveInterceptor platformResolveInterceptor, @NotNull TypefaceRequestCache typefaceRequestCache, @NotNull FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @NotNull PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) { this.platformFontLoader = platformFontLoader;
/*  27 */     this.platformResolveInterceptor = platformResolveInterceptor;
/*     */     
/*  29 */     this.typefaceRequestCache = typefaceRequestCache;
/*  30 */     this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
/*     */     
/*  32 */     this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
/*     */ 
/*     */     
/*  35 */     this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(); } @NotNull public final PlatformFontLoader getPlatformFontLoader$ui_text() { return this.platformFontLoader; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\000\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}) static final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements Function1<TypefaceRequest, Object> {
/*  36 */     FontFamilyResolverImpl$createDefaultTypeface$1() { super(1); } @NotNull public final Object invoke(@NotNull TypefaceRequest it) { Intrinsics.checkNotNullParameter(it, "it"); return FontFamilyResolverImpl.this.resolve(TypefaceRequest.copy-e1PVR60$default(it, null, null, 0, 0, null, 30, null)).getValue(); }
/*     */   
/*     */   }
/*     */   @Nullable
/*     */   public Object preload(@NotNull FontFamily fontFamily, @NotNull Continuation<? super Unit> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof androidx/compose/ui/text/font/FontFamilyResolverImpl$preload$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast androidx/compose/ui/text/font/FontFamilyResolverImpl$preload$1
/*     */     //   11: astore #18
/*     */     //   13: aload #18
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #18
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new androidx/compose/ui/text/font/FontFamilyResolverImpl$preload$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Landroidx/compose/ui/text/font/FontFamilyResolverImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #18
/*     */     //   50: aload #18
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #17
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #19
/*     */     //   62: aload #18
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 374, 0 -> 88, 1 -> 145
/*     */     //   88: aload #17
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: instanceof androidx/compose/ui/text/font/FontListFontFamily
/*     */     //   97: ifne -> 104
/*     */     //   100: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   103: areturn
/*     */     //   104: aload_0
/*     */     //   105: getfield fontListFontFamilyTypefaceAdapter : Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;
/*     */     //   108: aload_1
/*     */     //   109: aload_0
/*     */     //   110: getfield platformFontLoader : Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   113: aload #18
/*     */     //   115: aload #18
/*     */     //   117: aload_0
/*     */     //   118: putfield L$0 : Ljava/lang/Object;
/*     */     //   121: aload #18
/*     */     //   123: aload_1
/*     */     //   124: putfield L$1 : Ljava/lang/Object;
/*     */     //   127: aload #18
/*     */     //   129: iconst_1
/*     */     //   130: putfield label : I
/*     */     //   133: invokevirtual preload : (Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   136: dup
/*     */     //   137: aload #19
/*     */     //   139: if_acmpne -> 170
/*     */     //   142: aload #19
/*     */     //   144: areturn
/*     */     //   145: aload #18
/*     */     //   147: getfield L$1 : Ljava/lang/Object;
/*     */     //   150: checkcast androidx/compose/ui/text/font/FontFamily
/*     */     //   153: astore_1
/*     */     //   154: aload #18
/*     */     //   156: getfield L$0 : Ljava/lang/Object;
/*     */     //   159: checkcast androidx/compose/ui/text/font/FontFamilyResolverImpl
/*     */     //   162: astore_0
/*     */     //   163: aload #17
/*     */     //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   168: aload #17
/*     */     //   170: pop
/*     */     //   171: aload_1
/*     */     //   172: checkcast androidx/compose/ui/text/font/FontListFontFamily
/*     */     //   175: invokevirtual getFonts : ()Ljava/util/List;
/*     */     //   178: astore #4
/*     */     //   180: iconst_0
/*     */     //   181: istore #5
/*     */     //   183: nop
/*     */     //   184: new java/util/ArrayList
/*     */     //   187: dup
/*     */     //   188: aload #4
/*     */     //   190: invokeinterface size : ()I
/*     */     //   195: invokespecial <init> : (I)V
/*     */     //   198: astore #6
/*     */     //   200: aload #4
/*     */     //   202: astore #7
/*     */     //   204: iconst_0
/*     */     //   205: istore #8
/*     */     //   207: nop
/*     */     //   208: iconst_0
/*     */     //   209: istore #9
/*     */     //   211: aload #7
/*     */     //   213: invokeinterface size : ()I
/*     */     //   218: istore #10
/*     */     //   220: iload #9
/*     */     //   222: iload #10
/*     */     //   224: if_icmpge -> 344
/*     */     //   227: aload #7
/*     */     //   229: iload #9
/*     */     //   231: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   236: astore #11
/*     */     //   238: aload #11
/*     */     //   240: astore #12
/*     */     //   242: iconst_0
/*     */     //   243: istore #13
/*     */     //   245: aload #6
/*     */     //   247: checkcast java/util/Collection
/*     */     //   250: aload #12
/*     */     //   252: checkcast androidx/compose/ui/text/font/Font
/*     */     //   255: astore #14
/*     */     //   257: astore #16
/*     */     //   259: iconst_0
/*     */     //   260: istore #15
/*     */     //   262: new androidx/compose/ui/text/font/TypefaceRequest
/*     */     //   265: dup
/*     */     //   266: aload_0
/*     */     //   267: getfield platformResolveInterceptor : Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
/*     */     //   270: aload_1
/*     */     //   271: invokeinterface interceptFontFamily : (Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   276: aload_0
/*     */     //   277: getfield platformResolveInterceptor : Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
/*     */     //   280: aload #14
/*     */     //   282: invokeinterface getWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   287: invokeinterface interceptFontWeight : (Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   292: aload_0
/*     */     //   293: getfield platformResolveInterceptor : Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
/*     */     //   296: aload #14
/*     */     //   298: invokeinterface getStyle-_-LCdwA : ()I
/*     */     //   303: invokeinterface interceptFontStyle-T2F_aPo : (I)I
/*     */     //   308: getstatic androidx/compose/ui/text/font/FontSynthesis.Companion : Landroidx/compose/ui/text/font/FontSynthesis$Companion;
/*     */     //   311: invokevirtual getAll-GVVA2EU : ()I
/*     */     //   314: aload_0
/*     */     //   315: getfield platformFontLoader : Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   318: invokeinterface getCacheKey : ()Ljava/lang/Object;
/*     */     //   323: aconst_null
/*     */     //   324: invokespecial <init> : (Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   327: aload #16
/*     */     //   329: swap
/*     */     //   330: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   335: pop
/*     */     //   336: nop
/*     */     //   337: nop
/*     */     //   338: iinc #9, 1
/*     */     //   341: goto -> 220
/*     */     //   344: nop
/*     */     //   345: aload #6
/*     */     //   347: checkcast java/util/List
/*     */     //   350: astore_3
/*     */     //   351: aload_0
/*     */     //   352: getfield typefaceRequestCache : Landroidx/compose/ui/text/font/TypefaceRequestCache;
/*     */     //   355: aload_3
/*     */     //   356: new androidx/compose/ui/text/font/FontFamilyResolverImpl$preload$2
/*     */     //   359: dup
/*     */     //   360: aload_0
/*     */     //   361: invokespecial <init> : (Landroidx/compose/ui/text/font/FontFamilyResolverImpl;)V
/*     */     //   364: checkcast kotlin/jvm/functions/Function1
/*     */     //   367: invokevirtual preWarmCache : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   370: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   373: areturn
/*     */     //   374: new java/lang/IllegalStateException
/*     */     //   377: dup
/*     */     //   378: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   380: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   383: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 60
/*     */     //   #43	-> 93
/*     */     //   #45	-> 104
/*     */     //   #39	-> 142
/*     */     //   #47	-> 170
/*     */     //   #265	-> 183
/*     */     //   #266	-> 184
/*     */     //   #267	-> 200
/*     */     //   #268	-> 207
/*     */     //   #269	-> 208
/*     */     //   #270	-> 227
/*     */     //   #271	-> 238
/*     */     //   #272	-> 245
/*     */     //   #48	-> 262
/*     */     //   #49	-> 266
/*     */     //   #50	-> 276
/*     */     //   #51	-> 292
/*     */     //   #52	-> 308
/*     */     //   #53	-> 314
/*     */     //   #48	-> 324
/*     */     //   #272	-> 330
/*     */     //   #273	-> 336
/*     */     //   #271	-> 337
/*     */     //   #269	-> 338
/*     */     //   #274	-> 344
/*     */     //   #275	-> 345
/*     */     //   #47	-> 350
/*     */     //   #57	-> 351
/*     */     //   #71	-> 370
/*     */     //   #39	-> 374
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	52	0	this	Landroidx/compose/ui/text/font/FontFamilyResolverImpl;
/*     */     //   163	211	0	this	Landroidx/compose/ui/text/font/FontFamilyResolverImpl;
/*     */     //   93	52	1	fontFamily	Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   154	220	1	fontFamily	Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   351	23	3	typeRequests	Ljava/util/List;
/*     */     //   180	24	4	$this$fastMap$iv	Ljava/util/List;
/*     */     //   200	150	6	target$iv	Ljava/util/ArrayList;
/*     */     //   204	141	7	$this$fastForEach$iv$iv	Ljava/util/List;
/*     */     //   211	133	9	index$iv$iv	I
/*     */     //   238	100	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   242	95	12	it$iv	Ljava/lang/Object;
/*     */     //   259	68	14	it	Landroidx/compose/ui/text/font/Font;
/*     */     //   262	65	15	$i$a$-fastMap-FontFamilyResolverImpl$preload$typeRequests$1	I
/*     */     //   245	92	13	$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv	I
/*     */     //   207	138	8	$i$f$fastForEach	I
/*     */     //   183	167	5	$i$f$fastMap	I
/*     */     //   50	324	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	317	17	$result	Ljava/lang/Object;
/*     */   }
/*     */   @DebugMetadata(f = "FontFamilyResolver.kt", l = {45}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "fontFamily"}, m = "preload", c = "androidx.compose.ui.text.font.FontFamilyResolverImpl")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl { Object L$0; Object L$1; int label;
/*     */     FontFamilyResolverImpl$preload$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return FontFamilyResolverImpl.this.preload(null, (Continuation<? super Unit>)this);
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "typeRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"})
/*     */   static final class FontFamilyResolverImpl$preload$2 extends Lambda implements Function1<TypefaceRequest, TypefaceResult> { @NotNull
/*     */     public final TypefaceResult invoke(@NotNull TypefaceRequest typeRequest) {
/*  59 */       Intrinsics.checkNotNullParameter(typeRequest, "typeRequest"); if (FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(
/*  60 */           typeRequest, 
/*  61 */           FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), null.INSTANCE, 
/*     */           
/*  63 */           FontFamilyResolverImpl.this.createDefaultTypeface) == null) { FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(typeRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), null.INSTANCE, FontFamilyResolverImpl.this.createDefaultTypeface);
/*  64 */         if (FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter.resolve(
/*  65 */             typeRequest, 
/*  66 */             FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), null.INSTANCE, 
/*     */             
/*  68 */             FontFamilyResolverImpl.this.createDefaultTypeface) == null) { FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter.resolve(typeRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), null.INSTANCE, FontFamilyResolverImpl.this.createDefaultTypeface);
/*  69 */           throw new FontLoadFailedException(typeRequest.getFontFamily(), null, 2, null); }
/*     */          }
/*     */       
/*     */       return FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(typeRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), null.INSTANCE, FontFamilyResolverImpl.this.createDefaultTypeface);
/*     */     }
/*     */     FontFamilyResolverImpl$preload$2() {
/*     */       super(1);
/*     */     } }
/*     */   @NotNull
/*     */   public State<Object> resolve-DPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis) {
/*  79 */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight"); return resolve(new TypefaceRequest(
/*  80 */           this.platformResolveInterceptor.interceptFontFamily(fontFamily), 
/*  81 */           this.platformResolveInterceptor.interceptFontWeight(fontWeight), 
/*  82 */           this.platformResolveInterceptor.interceptFontStyle-T2F_aPo(fontStyle), 
/*  83 */           this.platformResolveInterceptor.interceptFontSynthesis-Mscr08Y(fontSynthesis), 
/*  84 */           this.platformFontLoader.getCacheKey(), null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final State<Object> resolve(TypefaceRequest typefaceRequest) {
/*  92 */     State<Object> result = this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(typefaceRequest));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     return result;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\001\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "onAsyncCompletion", "Lkotlin/Function1;", "", "invoke"})
/*     */   static final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult> {
/*     */     @NotNull
/*     */     public final TypefaceResult invoke(@NotNull Function1<? super TypefaceResult.Immutable, Unit> onAsyncCompletion) {
/*     */       Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
/*     */       if (FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(this.$typefaceRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), onAsyncCompletion, FontFamilyResolverImpl.this.createDefaultTypeface) == null) {
/*     */         FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(this.$typefaceRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), onAsyncCompletion, FontFamilyResolverImpl.this.createDefaultTypeface);
/*     */         if (FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter.resolve(this.$typefaceRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), onAsyncCompletion, FontFamilyResolverImpl.this.createDefaultTypeface) == null) {
/*     */           FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter.resolve(this.$typefaceRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), onAsyncCompletion, FontFamilyResolverImpl.this.createDefaultTypeface);
/*     */           throw new FontLoadFailedException(this.$typefaceRequest.getFontFamily(), null, 2, null);
/*     */         } 
/*     */       } 
/*     */       return FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter.resolve(this.$typefaceRequest, FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text(), onAsyncCompletion, FontFamilyResolverImpl.this.createDefaultTypeface);
/*     */     }
/*     */     
/*     */     FontFamilyResolverImpl$resolve$result$1(TypefaceRequest $typefaceRequest) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontFamilyResolverImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */