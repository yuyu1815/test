/*     */ package androidx.compose.ui.text.platform;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.FontMgr;
/*     */ import org.jetbrains.skia.FontSlant;
/*     */ import org.jetbrains.skia.Typeface;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020%\n\002\020\016\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\027\032\0020\030H\002J\n\020\031\032\004\030\0010\001H\002R\036\020\003\032\022\022\002\b\003 \005*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\036\020\b\032\022\022\002\b\003 \005*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\004¢\006\002\n\000R\035\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0160\f¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228BX\004¢\006\006\032\004\b\023\020\024R\034\020\025\032\n \005*\004\030\0010\0220\0228BX\004¢\006\006\032\004\b\026\020\024¨\006\032"}, d2 = {"Landroidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies;", "", "()V", "FontManagerFactoryClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "FontManagerFactory_getInstanceMethod", "Ljava/lang/reflect/Method;", "SunFontManagerClass", "SunFontManager_jreBundledFontFiles", "Ljava/lang/reflect/Field;", "embeddedFamilies", "", "", "Landroidx/compose/ui/text/font/FontFamily;", "getEmbeddedFamilies", "()Ljava/util/Map;", "javaHomePath", "Ljava/nio/file/Path;", "getJavaHomePath", "()Ljava/nio/file/Path;", "jbrEmbeddedFontsPath", "getJbrEmbeddedFontsPath", "cacheJetBrainsRuntimeEmbeddedFonts", "", "getSunFontManagerInstance", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJetBrainsRuntimeFontFamilies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JetBrainsRuntimeFontFamilies.kt\nandroidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n1045#2:129\n1655#2,8:130\n1549#2:153\n1620#2,3:154\n988#3:138\n1017#3,3:139\n1020#3,3:149\n372#4,7:142\n215#5:152\n216#5:157\n1#6:158\n*S KotlinDebug\n*F\n+ 1 JetBrainsRuntimeFontFamilies.kt\nandroidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies\n*L\n91#1:125\n91#1:126,3\n92#1:129\n93#1:130,8\n113#1:153\n113#1:154,3\n111#1:138\n111#1:139,3\n111#1:149,3\n111#1:142,7\n112#1:152\n112#1:157\n*E\n"})
/*     */ public final class JetBrainsRuntimeFontFamilies {
/*     */   @NotNull
/*     */   public final Map<String, FontFamily> getEmbeddedFamilies() {
/*  38 */     return embeddedFamilies;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final JetBrainsRuntimeFontFamilies INSTANCE;
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final Map<String, FontFamily> embeddedFamilies;
/*     */ 
/*     */   
/*     */   private static final Class<?> FontManagerFactoryClass;
/*     */ 
/*     */   
/*     */   private static final Class<?> SunFontManagerClass;
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static final Method FontManagerFactory_getInstanceMethod;
/*     */   
/*     */   @Nullable
/*     */   private static final Field SunFontManager_jreBundledFontFiles;
/*     */   
/*     */   public static final int $stable;
/*     */ 
/*     */   
/*     */   private final Path getJavaHomePath() {
/*  67 */     Intrinsics.checkNotNullExpressionValue(System.getProperty("java.home"), "getProperty(...)"); Intrinsics.checkNotNullExpressionValue(Paths.get(System.getProperty("java.home"), new String[0]), "get(...)"); return Paths.get(System.getProperty("java.home"), new String[0]);
/*     */   }
/*     */   private final Path getJbrEmbeddedFontsPath() {
/*  70 */     return getJavaHomePath().resolve("lib").resolve("fonts");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void cacheJetBrainsRuntimeEmbeddedFonts() {
/*     */     Field field;
/*  82 */     if (SunFontManager_jreBundledFontFiles == null)
/*     */       return; 
/*     */     try {
/*  85 */       field.setAccessible(true);
/*     */       
/*  87 */       Object fontManager = getSunFontManagerInstance();
/*     */ 
/*     */       
/*  90 */       Intrinsics.checkNotNull(field.get(fontManager), "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }"); HashSet embeddedFontFileNames = (HashSet)field.get(fontManager);
/*  91 */       Iterable $this$map$iv = embeddedFontFileNames; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       Iterable iterable1 = $this$map$iv; Collection<Path> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 126 */       for (Object item$iv$iv : iterable1) {
/* 127 */         String str = (String)item$iv$iv; Collection<Path> collection1 = collection; int $i$a$-map-JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$embeddedFontPaths$1 = 0; collection1.add(INSTANCE.getJbrEmbeddedFontsPath().resolve(str));
/* 128 */       }  $this$map$iv = collection; int $i$f$sortedBy = 0;
/* 129 */       Iterable $this$sortedBy$iv = CollectionsKt.sortedWith($this$map$iv, new JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$$inlined$sortedBy$1()); int $i$f$distinctBy = 0;
/* 130 */       HashSet set$iv = new HashSet();
/* 131 */       ArrayList list$iv = new ArrayList();
/* 132 */       for (Object e$iv : $this$sortedBy$iv) {
/* 133 */         Path it = (Path)e$iv; int $i$a$-distinctBy-JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$embeddedFontPaths$3 = 0; Intrinsics.checkNotNull(it); Object key$iv = it.toAbsolutePath().toString();
/*     */       } 
/*     */ 
/*     */       
/* 137 */       List embeddedFontPaths = list$iv; Sequence sequence1 = SequencesKt.distinctBy(SequencesKt.map(CollectionsKt.asSequence(embeddedFontPaths), JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$1.INSTANCE), JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$2.INSTANCE); int $i$f$groupBy = 0;
/* 138 */       Sequence sequence2 = sequence1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 139 */       for (Object element$iv$iv : sequence2) {
/* 140 */         Pair pair = (Pair)element$iv$iv; int $i$a$-groupBy-JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$3 = 0; String familyName = (String)pair.component1(); Object key$iv$iv = familyName;
/* 141 */         Map<Object, Object> $this$getOrPut$iv$iv$iv = destination$iv$iv; int $i$f$getOrPut = 0;
/* 142 */         Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 151 */       Map<Object, Object> map1 = destination$iv$iv; int $i$f$forEach = 0;
/* 152 */       Iterator<Map.Entry> iterator = map1.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$4 = 0; String identity = (String)entry1.getKey(); List fileFonts = (List)entry1.getValue(); Iterable iterable2 = fileFonts; int i = 0;
/* 153 */         Iterable iterable3 = iterable2; Collection collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10)); int j = 0;
/* 154 */         Iterator iterator1 = iterable3.iterator(); }
/*     */     
/*     */     } finally {
/*     */       field.setAccessible(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\0012\016\020\004\032\n \006*\004\030\0010\0050\005H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/platform/FileFont;", "path", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "invoke"})
/*     */   static final class JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$1 extends Lambda implements Function1<Path, Pair<? extends String, ? extends FileFont>> {
/*     */     public static final JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$1 INSTANCE = new JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$1();
/*     */     
/*     */     @NotNull
/*     */     public final Pair<String, FileFont> invoke(Path path) {
/*     */       Typeface typeface;
/*     */       Intrinsics.checkNotNull(path);
/*     */       String absolutePath = path.toAbsolutePath().toString();
/*     */       if (FontMgr.makeFromFile$default(FontMgr.Companion.getDefault(), absolutePath, 0, 2, null) == null) {
/*     */         FontMgr.makeFromFile$default(FontMgr.Companion.getDefault(), absolutePath, 0, 2, null);
/*     */         throw new IllegalStateException(("makeFromFile " + absolutePath + " failed").toString());
/*     */       } 
/*     */       FontWeight weight = new FontWeight(typeface.getFontStyle().getWeight());
/*     */       switch (WhenMappings.$EnumSwitchMapping$0[typeface.getFontStyle().getSlant().ordinal()]) {
/*     */         case 1:
/*     */         
/*     */         case 2:
/*     */         case 3:
/*     */         
/*     */       } 
/*     */       throw new NoWhenBranchMatchedException();
/*     */     }
/*     */     
/*     */     JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\n \002*\004\030\0010\0010\0012\022\020\003\032\016\022\004\022\0020\001\022\004\022\0020\0050\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/ui/text/platform/FileFont;", "invoke"})
/*     */   static final class JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$2 extends Lambda implements Function1<Pair<? extends String, ? extends FileFont>, String> {
/*     */     public static final JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$2 INSTANCE = new JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$2();
/*     */     
/*     */     JetBrainsRuntimeFontFamilies$cacheJetBrainsRuntimeEmbeddedFonts$2() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final String invoke(@NotNull Pair<String, FileFont> param1Pair) {
/*     */       Intrinsics.checkNotNullParameter(param1Pair, "<name for destructuring parameter 0>");
/*     */       FileFont font = (FileFont)param1Pair.component2();
/*     */       return font.getFile().getAbsolutePath();
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object getSunFontManagerInstance() {
/*     */     return (FontManagerFactory_getInstanceMethod != null) ? FontManagerFactory_getInstanceMethod.invoke(null, new Object[0]) : null;
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: new androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.INSTANCE : Landroidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies;
/*     */     //   10: new java/util/HashMap
/*     */     //   13: dup
/*     */     //   14: invokespecial <init> : ()V
/*     */     //   17: checkcast java/util/Map
/*     */     //   20: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.embeddedFamilies : Ljava/util/Map;
/*     */     //   23: ldc_w 'sun.font.FontManagerFactory'
/*     */     //   26: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   29: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.FontManagerFactoryClass : Ljava/lang/Class;
/*     */     //   32: ldc_w 'sun.font.SunFontManager'
/*     */     //   35: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   38: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.SunFontManagerClass : Ljava/lang/Class;
/*     */     //   41: getstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.FontManagerFactoryClass : Ljava/lang/Class;
/*     */     //   44: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
/*     */     //   47: dup
/*     */     //   48: ldc_w 'getDeclaredMethods(...)'
/*     */     //   51: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   54: checkcast [Ljava/lang/Object;
/*     */     //   57: astore_1
/*     */     //   58: iconst_0
/*     */     //   59: istore_2
/*     */     //   60: aload_1
/*     */     //   61: arraylength
/*     */     //   62: istore_3
/*     */     //   63: iload_2
/*     */     //   64: iload_3
/*     */     //   65: if_icmpge -> 108
/*     */     //   68: aload_1
/*     */     //   69: iload_2
/*     */     //   70: aaload
/*     */     //   71: astore #4
/*     */     //   73: aload #4
/*     */     //   75: checkcast java/lang/reflect/Method
/*     */     //   78: astore #5
/*     */     //   80: iconst_0
/*     */     //   81: istore #6
/*     */     //   83: aload #5
/*     */     //   85: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   88: ldc_w 'getInstance'
/*     */     //   91: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   94: ifeq -> 102
/*     */     //   97: aload #4
/*     */     //   99: goto -> 109
/*     */     //   102: iinc #2, 1
/*     */     //   105: goto -> 63
/*     */     //   108: aconst_null
/*     */     //   109: checkcast java/lang/reflect/Method
/*     */     //   112: astore_0
/*     */     //   113: aload_0
/*     */     //   114: ifnull -> 193
/*     */     //   117: aload_0
/*     */     //   118: astore_1
/*     */     //   119: iconst_0
/*     */     //   120: istore_2
/*     */     //   121: nop
/*     */     //   122: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   125: pop
/*     */     //   126: iconst_0
/*     */     //   127: istore_3
/*     */     //   128: aload_1
/*     */     //   129: iconst_1
/*     */     //   130: invokevirtual setAccessible : (Z)V
/*     */     //   133: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   136: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   139: astore_3
/*     */     //   140: goto -> 158
/*     */     //   143: astore #4
/*     */     //   145: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   148: pop
/*     */     //   149: aload #4
/*     */     //   151: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   154: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   157: astore_3
/*     */     //   158: aload_3
/*     */     //   159: astore_3
/*     */     //   160: aload_3
/*     */     //   161: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */     //   164: dup
/*     */     //   165: ifnonnull -> 182
/*     */     //   168: pop
/*     */     //   169: aload_3
/*     */     //   170: checkcast kotlin/Unit
/*     */     //   173: astore #4
/*     */     //   175: iconst_0
/*     */     //   176: istore #5
/*     */     //   178: aload_1
/*     */     //   179: goto -> 189
/*     */     //   182: astore #4
/*     */     //   184: iconst_0
/*     */     //   185: istore #5
/*     */     //   187: aconst_null
/*     */     //   188: nop
/*     */     //   189: nop
/*     */     //   190: goto -> 194
/*     */     //   193: aconst_null
/*     */     //   194: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.FontManagerFactory_getInstanceMethod : Ljava/lang/reflect/Method;
/*     */     //   197: getstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.SunFontManagerClass : Ljava/lang/Class;
/*     */     //   200: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
/*     */     //   203: dup
/*     */     //   204: ldc_w 'getDeclaredFields(...)'
/*     */     //   207: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   210: checkcast [Ljava/lang/Object;
/*     */     //   213: astore_1
/*     */     //   214: iconst_0
/*     */     //   215: istore_2
/*     */     //   216: aload_1
/*     */     //   217: arraylength
/*     */     //   218: istore_3
/*     */     //   219: iload_2
/*     */     //   220: iload_3
/*     */     //   221: if_icmpge -> 264
/*     */     //   224: aload_1
/*     */     //   225: iload_2
/*     */     //   226: aaload
/*     */     //   227: astore #4
/*     */     //   229: aload #4
/*     */     //   231: checkcast java/lang/reflect/Field
/*     */     //   234: astore #5
/*     */     //   236: iconst_0
/*     */     //   237: istore #6
/*     */     //   239: aload #5
/*     */     //   241: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   244: ldc_w 'jreBundledFontFiles'
/*     */     //   247: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   250: ifeq -> 258
/*     */     //   253: aload #4
/*     */     //   255: goto -> 265
/*     */     //   258: iinc #2, 1
/*     */     //   261: goto -> 219
/*     */     //   264: aconst_null
/*     */     //   265: checkcast java/lang/reflect/Field
/*     */     //   268: astore_0
/*     */     //   269: aload_0
/*     */     //   270: ifnull -> 349
/*     */     //   273: aload_0
/*     */     //   274: astore_1
/*     */     //   275: iconst_0
/*     */     //   276: istore_2
/*     */     //   277: nop
/*     */     //   278: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   281: pop
/*     */     //   282: iconst_0
/*     */     //   283: istore_3
/*     */     //   284: aload_1
/*     */     //   285: iconst_1
/*     */     //   286: invokevirtual setAccessible : (Z)V
/*     */     //   289: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   292: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   295: astore_3
/*     */     //   296: goto -> 314
/*     */     //   299: astore #4
/*     */     //   301: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   304: pop
/*     */     //   305: aload #4
/*     */     //   307: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   310: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   313: astore_3
/*     */     //   314: aload_3
/*     */     //   315: astore_3
/*     */     //   316: aload_3
/*     */     //   317: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */     //   320: dup
/*     */     //   321: ifnonnull -> 338
/*     */     //   324: pop
/*     */     //   325: aload_3
/*     */     //   326: checkcast kotlin/Unit
/*     */     //   329: astore #4
/*     */     //   331: iconst_0
/*     */     //   332: istore #5
/*     */     //   334: aload_1
/*     */     //   335: goto -> 345
/*     */     //   338: astore #4
/*     */     //   340: iconst_0
/*     */     //   341: istore #5
/*     */     //   343: aconst_null
/*     */     //   344: nop
/*     */     //   345: nop
/*     */     //   346: goto -> 350
/*     */     //   349: aconst_null
/*     */     //   350: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.SunFontManager_jreBundledFontFiles : Ljava/lang/reflect/Field;
/*     */     //   353: nop
/*     */     //   354: getstatic androidx/compose/ui/text/platform/InternalFontApiChecker.INSTANCE : Landroidx/compose/ui/text/platform/InternalFontApiChecker;
/*     */     //   357: invokevirtual isRunningOnJetBrainsRuntime : ()Z
/*     */     //   360: ifeq -> 375
/*     */     //   363: getstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.SunFontManager_jreBundledFontFiles : Ljava/lang/reflect/Field;
/*     */     //   366: ifnull -> 375
/*     */     //   369: getstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.INSTANCE : Landroidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies;
/*     */     //   372: invokespecial cacheJetBrainsRuntimeEmbeddedFonts : ()V
/*     */     //   375: bipush #8
/*     */     //   377: putstatic androidx/compose/ui/text/platform/JetBrainsRuntimeFontFamilies.$stable : I
/*     */     //   380: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 10
/*     */     //   #41	-> 23
/*     */     //   #42	-> 32
/*     */     //   #47	-> 41
/*     */     //   #46	-> 41
/*     */     //   #158	-> 80
/*     */     //   #46	-> 83
/*     */     //   #46	-> 94
/*     */     //   #46	-> 109
/*     */     //   #47	-> 113
/*     */     //   #46	-> 117
/*     */     //   #47	-> 118
/*     */     //   #48	-> 121
/*     */     //   #158	-> 126
/*     */     //   #48	-> 128
/*     */     //   #48	-> 136
/*     */     //   #49	-> 160
/*     */     //   #50	-> 178
/*     */     //   #49	-> 179
/*     */     //   #51	-> 187
/*     */     //   #49	-> 188
/*     */     //   #49	-> 189
/*     */     //   #47	-> 190
/*     */     //   #47	-> 193
/*     */     //   #58	-> 197
/*     */     //   #57	-> 197
/*     */     //   #158	-> 236
/*     */     //   #57	-> 239
/*     */     //   #57	-> 250
/*     */     //   #57	-> 265
/*     */     //   #58	-> 269
/*     */     //   #57	-> 273
/*     */     //   #58	-> 274
/*     */     //   #59	-> 277
/*     */     //   #158	-> 282
/*     */     //   #59	-> 284
/*     */     //   #59	-> 292
/*     */     //   #60	-> 316
/*     */     //   #61	-> 334
/*     */     //   #60	-> 335
/*     */     //   #62	-> 343
/*     */     //   #60	-> 344
/*     */     //   #60	-> 345
/*     */     //   #58	-> 346
/*     */     //   #58	-> 349
/*     */     //   #72	-> 353
/*     */     //   #73	-> 354
/*     */     //   #74	-> 354
/*     */     //   #75	-> 363
/*     */     //   #77	-> 369
/*     */     //   #79	-> 375
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   83	11	6	$i$a$-find-JetBrainsRuntimeFontFamilies$FontManagerFactory_getInstanceMethod$1	I
/*     */     //   80	14	5	it	Ljava/lang/reflect/Method;
/*     */     //   128	5	3	$i$a$-runCatching-JetBrainsRuntimeFontFamilies$FontManagerFactory_getInstanceMethod$2$1	I
/*     */     //   178	1	5	$i$a$-fold-JetBrainsRuntimeFontFamilies$FontManagerFactory_getInstanceMethod$2$2	I
/*     */     //   175	4	4	it	Lkotlin/Unit;
/*     */     //   187	1	5	$i$a$-fold-JetBrainsRuntimeFontFamilies$FontManagerFactory_getInstanceMethod$2$3	I
/*     */     //   184	4	4	it	Ljava/lang/Throwable;
/*     */     //   121	69	2	$i$a$-let-JetBrainsRuntimeFontFamilies$FontManagerFactory_getInstanceMethod$2	I
/*     */     //   119	71	1	method	Ljava/lang/reflect/Method;
/*     */     //   239	11	6	$i$a$-find-JetBrainsRuntimeFontFamilies$SunFontManager_jreBundledFontFiles$1	I
/*     */     //   236	14	5	it	Ljava/lang/reflect/Field;
/*     */     //   284	5	3	$i$a$-runCatching-JetBrainsRuntimeFontFamilies$SunFontManager_jreBundledFontFiles$2$1	I
/*     */     //   334	1	5	$i$a$-fold-JetBrainsRuntimeFontFamilies$SunFontManager_jreBundledFontFiles$2$2	I
/*     */     //   331	4	4	it	Lkotlin/Unit;
/*     */     //   343	1	5	$i$a$-fold-JetBrainsRuntimeFontFamilies$SunFontManager_jreBundledFontFiles$2$3	I
/*     */     //   340	4	4	it	Ljava/lang/Throwable;
/*     */     //   277	69	2	$i$a$-let-JetBrainsRuntimeFontFamilies$SunFontManager_jreBundledFontFiles$2	I
/*     */     //   275	71	1	field	Ljava/lang/reflect/Field;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   121	140	143	java/lang/Throwable
/*     */     //   277	296	299	java/lang/Throwable
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\JetBrainsRuntimeFontFamilies.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */