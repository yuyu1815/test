/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.awt.Font;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Arrays;
/*     */ import java.util.Locale;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skiko.OsArch_jvmKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\b\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\000\n\002\020\021\n\002\b\t\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J3\020\033\032\004\030\0010\b2\006\020\034\032\0020\0352\032\020\036\032\016\022\n\b\001\022\006\022\002\b\0030\0040\037\"\006\022\002\b\0030\004H\002¢\006\002\020 J\020\020!\032\004\030\0010\0352\006\020\"\032\0020\030J\n\020#\032\004\030\0010\001H\002J\032\020$\032\004\030\0010\0352\006\020%\032\0020\0352\b\b\002\020&\032\0020\024J\016\020'\032\004\030\0010\001*\0020\030H\002R\024\020\003\032\b\022\002\b\003\030\0010\004X\004¢\006\002\n\000R\036\020\005\032\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\004¢\006\002\n\000R\036\020\t\032\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\020\020\n\032\004\030\0010\013X\004¢\006\002\n\000R\020\020\f\032\004\030\0010\bX\004¢\006\002\n\000R\020\020\r\032\004\030\0010\bX\004¢\006\002\n\000R\020\020\016\032\004\030\0010\013X\004¢\006\002\n\000R\036\020\017\032\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\036\020\020\032\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\020\020\021\032\004\030\0010\bX\004¢\006\002\n\000R\020\020\022\032\004\030\0010\bX\004¢\006\002\n\000R\016\020\023\032\0020\024XT¢\006\002\n\000R\036\020\025\032\022\022\002\b\003 \006*\b\022\002\b\003\030\0010\0040\004X\004¢\006\002\n\000R\032\020\026\032\016\022\004\022\0020\030\022\004\022\0020\0010\027X\004¢\006\002\n\000R\016\020\031\032\0020\032X\004¢\006\002\n\000¨\006("}, d2 = {"Landroidx/compose/ui/text/platform/AwtFontUtils;", "", "()V", "CFontClass", "Ljava/lang/Class;", "CompositeFontClass", "kotlin.jvm.PlatformType", "CompositeFont_getSlotFontMethod", "Ljava/lang/reflect/Method;", "Font2DClass", "Font2DHandle_font2DField", "Ljava/lang/reflect/Field;", "Font2D_getFamilyNameMethod", "Font2D_getTypographicFamilyNameMethod", "Font2D_handleField", "FontManagerClass", "FontManagerFactoryClass", "FontManagerFactory_getInstanceMethod", "FontManager_findFont2DMethod", "LOGICAL_FALLBACK", "", "PhysicalFontClass", "font2DHandlesCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/awt/Font;", "isAbleToResolveFontProperties", "", "getFont2DMethodOrNull", "methodName", "", "parameters", "", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getPreferredFontFamilyName", "font", "getSunFontManagerInstance", "resolvePhysicalFontFamilyNameOrNull", "familyName", "style", "obtainFont2DOrNull", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAwtFontUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwtFontUtils.kt\nandroidx/compose/ui/text/platform/AwtFontUtils\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n72#2,2:173\n1#3:175\n*S KotlinDebug\n*F\n+ 1 AwtFontUtils.kt\nandroidx/compose/ui/text/platform/AwtFontUtils\n*L\n156#1:173,2\n156#1:175\n*E\n"})
/*     */ public final class AwtFontUtils
/*     */ {
/*     */   @NotNull
/*  28 */   public static final AwtFontUtils INSTANCE = new AwtFontUtils(); static {
/*  29 */     InternalFontApiChecker.INSTANCE.isSunFontApiAccessible();
/*     */   }
/*     */   
/*  32 */   private static final Class<?> FontManagerFactoryClass = Class.forName("sun.font.FontManagerFactory");
/*     */   
/*  34 */   private static final Class<?> FontManagerClass = Class.forName("sun.font.FontManager");
/*  35 */   private static final Class<?> Font2DClass = Class.forName("sun.font.Font2D");
/*  36 */   private static final Class<?> CompositeFontClass = Class.forName("sun.font.CompositeFont");
/*  37 */   private static final Class<?> PhysicalFontClass = Class.forName("sun.font.PhysicalFont"); @Nullable
/*  38 */   private static final Class<?> CFontClass = OsArch_jvmKt.getHostOs().isMacOS() ? Class.forName("sun.font.CFont") : null;
/*     */ 
/*     */   
/*     */   @Nullable
/*  42 */   private static final Method FontManagerFactory_getInstanceMethod = ReflectionUtil.INSTANCE.getDeclaredMethodOrNull(FontManagerFactoryClass, "getInstance", new Class[0]); @Nullable private static final Method FontManager_findFont2DMethod; static { Intrinsics.checkNotNullExpressionValue(FontManagerFactoryClass, "FontManagerFactoryClass"); }
/*     */ 
/*     */   
/*     */   static {
/*  46 */     Intrinsics.checkNotNullExpressionValue(FontManagerClass, "FontManagerClass");
/*     */     
/*  48 */     Class[] arrayOfClass = new Class[3]; arrayOfClass[0] = String.class; Intrinsics.checkNotNull(int.class); arrayOfClass[1] = int.class; Intrinsics.checkNotNull(int.class); arrayOfClass[2] = int.class; FontManager_findFont2DMethod = ReflectionUtil.INSTANCE.getDeclaredMethodOrNull(FontManagerClass, "findFont2D", arrayOfClass);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*  55 */   private static final Method Font2D_getTypographicFamilyNameMethod = INSTANCE.getFont2DMethodOrNull("getTypographicFamilyName", new Class[0]); @Nullable
/*     */   private static final Method Font2D_getFamilyNameMethod;
/*  57 */   static { arrayOfClass = new Class[1]; arrayOfClass[0] = Locale.class; Font2D_getFamilyNameMethod = INSTANCE.getFont2DMethodOrNull("getFamilyName", arrayOfClass);
/*     */     
/*  59 */     Intrinsics.checkNotNullExpressionValue(Font2DClass, "Font2DClass"); } @Nullable private static final Field Font2D_handleField = ReflectionUtil.INSTANCE.findFieldInHierarchy(Font2DClass, AwtFontUtils$Font2D_handleField$1.INSTANCE::Font2D_handleField$lambda$0); private static final boolean Font2D_handleField$lambda$0(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Field;", "invoke", "(Ljava/lang/reflect/Field;)Ljava/lang/Boolean;"}) static final class AwtFontUtils$Font2D_handleField$1 extends Lambda implements Function1<Field, Boolean> { public static final AwtFontUtils$Font2D_handleField$1 INSTANCE = new AwtFontUtils$Font2D_handleField$1(); @NotNull public final Boolean invoke(@NotNull Field it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(Intrinsics.areEqual(it.getName(), "handle")); }
/*     */      AwtFontUtils$Font2D_handleField$1() {
/*     */       super(1);
/*     */     } } @Nullable
/*  63 */   private static final Field Font2DHandle_font2DField = ReflectionUtil.INSTANCE.findFieldInHierarchy(Class.forName("sun.font.Font2DHandle"), AwtFontUtils$Font2DHandle_font2DField$1.INSTANCE::Font2DHandle_font2DField$lambda$1); @Nullable private static final Method CompositeFont_getSlotFontMethod; private static final int LOGICAL_FALLBACK = 2; private static final boolean Font2DHandle_font2DField$lambda$1(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } static { Intrinsics.checkNotNullExpressionValue(Class.forName("sun.font.Font2DHandle"), "forName(...)"); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Field;", "invoke", "(Ljava/lang/reflect/Field;)Ljava/lang/Boolean;"}) static final class AwtFontUtils$Font2DHandle_font2DField$1 extends Lambda implements Function1<Field, Boolean> { public static final AwtFontUtils$Font2DHandle_font2DField$1 INSTANCE = new AwtFontUtils$Font2DHandle_font2DField$1(); @NotNull
/*  64 */     public final Boolean invoke(@NotNull Field it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(Intrinsics.areEqual(it.getName(), "font2D")); }
/*     */     
/*     */     AwtFontUtils$Font2DHandle_font2DField$1() {
/*     */       super(1);
/*     */     } }
/*     */   static {
/*  70 */     Intrinsics.checkNotNullExpressionValue(CompositeFontClass, "CompositeFontClass");
/*     */     
/*  72 */     arrayOfClass = new Class[1]; Intrinsics.checkNotNull(int.class); arrayOfClass[0] = int.class; CompositeFont_getSlotFontMethod = ReflectionUtil.INSTANCE.getDeclaredMethodOrNull(CompositeFontClass, "getSlotFont", arrayOfClass);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  78 */   private static final ConcurrentHashMap<Font, Object> font2DHandlesCache = new ConcurrentHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 103 */   private static final boolean isAbleToResolveFontProperties = (InternalFontApiChecker.INSTANCE.isRunningOnJetBrainsRuntime() && 
/* 104 */     InternalFontApiChecker.INSTANCE.isSunFontApiAccessible() && 
/* 105 */     Font2D_getTypographicFamilyNameMethod != null); public static final int $stable = 8;
/*     */   @Nullable
/*     */   public final String resolvePhysicalFontFamilyNameOrNull(@NotNull String familyName, int style) {
/* 108 */     Intrinsics.checkNotNullParameter(familyName, "familyName"); if (!isAbleToResolveFontProperties) return null;
/*     */     
/* 110 */     Object fontManager = getSunFontManagerInstance();
/*     */     
/* 112 */     Object[] arrayOfObject = new Object[3]; arrayOfObject[0] = familyName; arrayOfObject[1] = Integer.valueOf(style); arrayOfObject[2] = Integer.valueOf(2); Object object1 = (FontManager_findFont2DMethod != null) ? FontManager_findFont2DMethod.invoke(fontManager, arrayOfObject) : null; if (object1 == null) {
/* 113 */       return null;
/*     */     }
/*     */     
/*     */     Object font2D = object1;
/*     */     
/* 118 */     arrayOfObject = new Object[1]; arrayOfObject[0] = Integer.valueOf(0); Object physicalFontObject = (CompositeFont_getSlotFontMethod != null) ? CompositeFont_getSlotFontMethod.invoke(font2D, arrayOfObject) : null;
/*     */ 
/*     */     
/* 121 */     arrayOfObject = new Object[1]; arrayOfObject[0] = Locale.getDefault();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     String nativeFontName = 
/* 128 */       ReflectionUtil.INSTANCE.<String>getFieldValueOrNull(
/* 129 */         CFontClass, 
/* 130 */         font2D, String.class, 
/*     */         
/* 132 */         "nativeFontName");
/*     */     
/* 134 */     return CompositeFontClass.isInstance(font2D) ? ((Font2D_getFamilyNameMethod != null) ? (String)Font2D_getFamilyNameMethod.invoke(physicalFontObject, arrayOfObject) : null) : (((CFontClass != null) ? ((CFontClass.isInstance(font2D) == true)) : false) ? getPreferredFontFamilyName(new Font(nativeFontName, 0, 10)) : (
/*     */ 
/*     */ 
/*     */       
/* 138 */       PhysicalFontClass.isInstance(font2D) ? (
/* 139 */       (Font2D_getTypographicFamilyNameMethod != null) ? (String)Font2D_getTypographicFamilyNameMethod.invoke(font2D, new Object[0]) : null) : 
/*     */ 
/*     */       
/* 142 */       null));
/*     */   }
/*     */   @Nullable
/*     */   public final String getPreferredFontFamilyName(@NotNull Font font) {
/*     */     Object font2D;
/* 147 */     Intrinsics.checkNotNullParameter(font, "font"); if (!isAbleToResolveFontProperties) return null;
/*     */     
/* 149 */     if (obtainFont2DOrNull(font) == null) { obtainFont2DOrNull(font); return null; }
/* 150 */      Object object1 = (Font2D_getTypographicFamilyNameMethod != null) ? Font2D_getTypographicFamilyNameMethod.invoke(font2D, new Object[0]) : null; return (object1 instanceof String) ? (String)object1 : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object obtainFont2DOrNull(Font $this$obtainFont2DOrNull) {
/*     */     // Byte code:
/*     */     //   0: getstatic androidx/compose/ui/text/platform/AwtFontUtils.font2DHandlesCache : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   3: checkcast java/util/concurrent/ConcurrentMap
/*     */     //   6: astore_3
/*     */     //   7: iconst_0
/*     */     //   8: istore #4
/*     */     //   10: aload_3
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   17: dup
/*     */     //   18: ifnonnull -> 126
/*     */     //   21: pop
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: getstatic androidx/compose/ui/text/platform/AwtFontUtils.INSTANCE : Landroidx/compose/ui/text/platform/AwtFontUtils;
/*     */     //   28: invokespecial getSunFontManagerInstance : ()Ljava/lang/Object;
/*     */     //   31: astore #6
/*     */     //   33: getstatic androidx/compose/ui/text/platform/AwtFontUtils.FontManager_findFont2DMethod : Ljava/lang/reflect/Method;
/*     */     //   36: dup
/*     */     //   37: ifnull -> 83
/*     */     //   40: aload #6
/*     */     //   42: iconst_3
/*     */     //   43: anewarray java/lang/Object
/*     */     //   46: astore #7
/*     */     //   48: aload #7
/*     */     //   50: iconst_0
/*     */     //   51: aload_1
/*     */     //   52: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   55: aastore
/*     */     //   56: aload #7
/*     */     //   58: iconst_1
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual getStyle : ()I
/*     */     //   63: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   66: aastore
/*     */     //   67: aload #7
/*     */     //   69: iconst_2
/*     */     //   70: iconst_2
/*     */     //   71: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   74: aastore
/*     */     //   75: aload #7
/*     */     //   77: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   80: goto -> 85
/*     */     //   83: pop
/*     */     //   84: aconst_null
/*     */     //   85: astore #8
/*     */     //   87: getstatic androidx/compose/ui/text/platform/AwtFontUtils.Font2D_handleField : Ljava/lang/reflect/Field;
/*     */     //   90: dup
/*     */     //   91: ifnull -> 102
/*     */     //   94: aload #8
/*     */     //   96: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   99: goto -> 104
/*     */     //   102: pop
/*     */     //   103: aconst_null
/*     */     //   104: astore #9
/*     */     //   106: iconst_0
/*     */     //   107: istore #10
/*     */     //   109: aload_3
/*     */     //   110: aload_1
/*     */     //   111: aload #9
/*     */     //   113: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   118: dup
/*     */     //   119: ifnonnull -> 125
/*     */     //   122: pop
/*     */     //   123: aload #9
/*     */     //   125: nop
/*     */     //   126: nop
/*     */     //   127: astore_2
/*     */     //   128: getstatic androidx/compose/ui/text/platform/AwtFontUtils.Font2DHandle_font2DField : Ljava/lang/reflect/Field;
/*     */     //   131: dup
/*     */     //   132: ifnull -> 142
/*     */     //   135: aload_2
/*     */     //   136: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   139: goto -> 144
/*     */     //   142: pop
/*     */     //   143: aconst_null
/*     */     //   144: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #156	-> 0
/*     */     //   #173	-> 10
/*     */     //   #174	-> 22
/*     */     //   #157	-> 25
/*     */     //   #159	-> 33
/*     */     //   #158	-> 85
/*     */     //   #160	-> 87
/*     */     //   #174	-> 104
/*     */     //   #175	-> 106
/*     */     //   #174	-> 109
/*     */     //   #174	-> 125
/*     */     //   #173	-> 126
/*     */     //   #156	-> 127
/*     */     //   #163	-> 128
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	79	5	$i$a$-getOrPut-AwtFontUtils$obtainFont2DOrNull$handle$1	I
/*     */     //   33	71	6	fontManager	Ljava/lang/Object;
/*     */     //   87	17	8	font2D	Ljava/lang/Object;
/*     */     //   109	16	10	$i$a$-let-MapsKt__MapsJVMKt$getOrPut$1$iv	I
/*     */     //   106	19	9	default$iv	Ljava/lang/Object;
/*     */     //   10	117	4	$i$f$getOrPut	I
/*     */     //   7	120	3	$this$getOrPut$iv	Ljava/util/concurrent/ConcurrentMap;
/*     */     //   128	17	2	handle	Ljava/lang/Object;
/*     */     //   0	145	0	this	Landroidx/compose/ui/text/platform/AwtFontUtils;
/*     */     //   0	145	1	$this$obtainFont2DOrNull	Ljava/awt/Font;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object getSunFontManagerInstance() {
/* 167 */     return (FontManagerFactory_getInstanceMethod != null) ? FontManagerFactory_getInstanceMethod.invoke(null, new Object[0]) : null;
/*     */   }
/*     */   private final Method getFont2DMethodOrNull(String methodName, Class... parameters) {
/* 170 */     Intrinsics.checkNotNullExpressionValue(Font2DClass, "Font2DClass"); return ReflectionUtil.INSTANCE.getDeclaredMethodOrNull(Font2DClass, methodName, (Class[])Arrays.<Class<?>[]>copyOf((Class<?>[][])parameters, parameters.length));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\AwtFontUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */