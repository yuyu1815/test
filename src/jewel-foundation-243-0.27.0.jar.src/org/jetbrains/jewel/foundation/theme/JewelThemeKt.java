/*     */ package org.jetbrains.jewel.foundation.theme;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\0320\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\021\020\006\032\r\022\004\022\0020\0010\007¢\006\002\b\bH\007¢\006\002\020\t\032(\020\000\032\0020\0012\006\020\002\032\0020\0032\021\020\006\032\r\022\004\022\0020\0010\007¢\006\002\b\bH\007¢\006\002\020\n\032(\020$\032\0020\0012\006\020%\032\0020\0052\021\020\006\032\r\022\004\022\0020\0010\007¢\006\002\b\bH\007¢\006\002\020&\"\027\020\013\032\b\022\004\022\0020\r0\f¢\006\b\n\000\032\004\b\016\020\017\"\027\020\020\032\b\022\004\022\0020\0210\f¢\006\b\n\000\032\004\b\022\020\017\"\032\020\023\032\b\022\004\022\0020\0050\fX\004¢\006\b\n\000\032\004\b\024\020\017\"\032\020\025\032\b\022\004\022\0020\0050\fX\004¢\006\b\n\000\032\004\b\026\020\017\"\027\020\027\032\b\022\004\022\0020\0300\f¢\006\b\n\000\032\004\b\031\020\017\"\027\020\032\032\b\022\004\022\0020\0330\f¢\006\b\n\000\032\004\b\034\020\017\"\027\020\035\032\b\022\004\022\0020\0360\f¢\006\b\n\000\032\004\b\037\020\017\"\027\020 \032\b\022\004\022\0020\0360\f¢\006\b\n\000\032\004\b!\020\017\"\027\020\"\032\b\022\004\022\0020\0360\f¢\006\b\n\000\032\004\b#\020\017¨\006'"}, d2 = {"JewelTheme", "", "theme", "Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "swingCompatMode", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LocalThemeName", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalThemeName", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContentColor", "Landroidx/compose/ui/graphics/Color;", "getLocalContentColor", "LocalIsDarkTheme", "getLocalIsDarkTheme", "LocalSwingCompatMode", "getLocalSwingCompatMode", "LocalColorPalette", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "getLocalColorPalette", "LocalIconData", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "getLocalIconData", "LocalTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "LocalEditorTextStyle", "getLocalEditorTextStyle", "LocalConsoleTextStyle", "getLocalConsoleTextStyle", "OverrideDarkMode", "isDark", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation"})
/*     */ public final class JewelThemeKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void JewelTheme(@NotNull ThemeDefinition theme, boolean swingCompatMode, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'theme'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 1900204110
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_3
/*     */     //   21: iload #4
/*     */     //   23: istore #5
/*     */     //   25: iload #4
/*     */     //   27: bipush #6
/*     */     //   29: iand
/*     */     //   30: ifne -> 53
/*     */     //   33: iload #5
/*     */     //   35: aload_3
/*     */     //   36: aload_0
/*     */     //   37: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   42: ifeq -> 49
/*     */     //   45: iconst_4
/*     */     //   46: goto -> 50
/*     */     //   49: iconst_2
/*     */     //   50: ior
/*     */     //   51: istore #5
/*     */     //   53: iload #4
/*     */     //   55: bipush #48
/*     */     //   57: iand
/*     */     //   58: ifne -> 83
/*     */     //   61: iload #5
/*     */     //   63: aload_3
/*     */     //   64: iload_1
/*     */     //   65: invokeinterface changed : (Z)Z
/*     */     //   70: ifeq -> 78
/*     */     //   73: bipush #32
/*     */     //   75: goto -> 80
/*     */     //   78: bipush #16
/*     */     //   80: ior
/*     */     //   81: istore #5
/*     */     //   83: iload #4
/*     */     //   85: sipush #384
/*     */     //   88: iand
/*     */     //   89: ifne -> 116
/*     */     //   92: iload #5
/*     */     //   94: aload_3
/*     */     //   95: aload_2
/*     */     //   96: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   101: ifeq -> 110
/*     */     //   104: sipush #256
/*     */     //   107: goto -> 113
/*     */     //   110: sipush #128
/*     */     //   113: ior
/*     */     //   114: istore #5
/*     */     //   116: iload #5
/*     */     //   118: sipush #147
/*     */     //   121: iand
/*     */     //   122: sipush #146
/*     */     //   125: if_icmpne -> 137
/*     */     //   128: aload_3
/*     */     //   129: invokeinterface getSkipping : ()Z
/*     */     //   134: ifne -> 206
/*     */     //   137: invokestatic isTraceInProgress : ()Z
/*     */     //   140: ifeq -> 153
/*     */     //   143: ldc 1900204110
/*     */     //   145: iload #5
/*     */     //   147: iconst_m1
/*     */     //   148: ldc 'org.jetbrains.jewel.foundation.theme.JewelTheme (JewelTheme.kt:50)'
/*     */     //   150: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   153: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalSwingCompatMode : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   156: iload_1
/*     */     //   157: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   160: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   163: ldc 101291278
/*     */     //   165: iconst_1
/*     */     //   166: new org/jetbrains/jewel/foundation/theme/JewelThemeKt$JewelTheme$1
/*     */     //   169: dup
/*     */     //   170: aload_0
/*     */     //   171: aload_2
/*     */     //   172: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lkotlin/jvm/functions/Function2;)V
/*     */     //   175: aload_3
/*     */     //   176: bipush #54
/*     */     //   178: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   181: checkcast kotlin/jvm/functions/Function2
/*     */     //   184: aload_3
/*     */     //   185: bipush #48
/*     */     //   187: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   190: ior
/*     */     //   191: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   194: invokestatic isTraceInProgress : ()Z
/*     */     //   197: ifeq -> 212
/*     */     //   200: invokestatic traceEventEnd : ()V
/*     */     //   203: goto -> 212
/*     */     //   206: aload_3
/*     */     //   207: invokeinterface skipToGroupEnd : ()V
/*     */     //   212: aload_3
/*     */     //   213: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   218: dup
/*     */     //   219: ifnull -> 240
/*     */     //   222: aload_0
/*     */     //   223: iload_1
/*     */     //   224: aload_2
/*     */     //   225: iload #4
/*     */     //   227: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;ZLkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   232: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   237: goto -> 241
/*     */     //   240: pop
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 12
/*     */     //   #52	-> 153
/*     */     //   #53	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	217	5	$dirty	I
/*     */     //   0	242	0	theme	Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;
/*     */     //   0	242	1	swingCompatMode	Z
/*     */     //   0	242	2	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	242	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	242	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class JewelThemeKt$JewelTheme$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     JewelThemeKt$JewelTheme$1(ThemeDefinition $theme, Function2<Composer, Integer, Unit> $content) {}
/*     */     
/*     */     @Composable
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  52 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(101291278, $changed, -1, "org.jetbrains.jewel.foundation.theme.JewelTheme.<anonymous> (JewelTheme.kt:51)");  JewelThemeKt.JewelTheme(this.$theme, this.$content, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void JewelTheme(@NotNull ThemeDefinition theme, @NotNull Function2 content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'theme'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc -1948143318
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_2
/*     */     //   21: iload_3
/*     */     //   22: istore #4
/*     */     //   24: iload_3
/*     */     //   25: bipush #6
/*     */     //   27: iand
/*     */     //   28: ifne -> 51
/*     */     //   31: iload #4
/*     */     //   33: aload_2
/*     */     //   34: aload_0
/*     */     //   35: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   40: ifeq -> 47
/*     */     //   43: iconst_4
/*     */     //   44: goto -> 48
/*     */     //   47: iconst_2
/*     */     //   48: ior
/*     */     //   49: istore #4
/*     */     //   51: iload_3
/*     */     //   52: bipush #48
/*     */     //   54: iand
/*     */     //   55: ifne -> 80
/*     */     //   58: iload #4
/*     */     //   60: aload_2
/*     */     //   61: aload_1
/*     */     //   62: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 75
/*     */     //   70: bipush #32
/*     */     //   72: goto -> 77
/*     */     //   75: bipush #16
/*     */     //   77: ior
/*     */     //   78: istore #4
/*     */     //   80: iload #4
/*     */     //   82: bipush #19
/*     */     //   84: iand
/*     */     //   85: bipush #18
/*     */     //   87: if_icmpne -> 99
/*     */     //   90: aload_2
/*     */     //   91: invokeinterface getSkipping : ()Z
/*     */     //   96: ifne -> 270
/*     */     //   99: invokestatic isTraceInProgress : ()Z
/*     */     //   102: ifeq -> 115
/*     */     //   105: ldc -1948143318
/*     */     //   107: iload #4
/*     */     //   109: iconst_m1
/*     */     //   110: ldc 'org.jetbrains.jewel.foundation.theme.JewelTheme (JewelTheme.kt:55)'
/*     */     //   112: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   115: bipush #8
/*     */     //   117: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   120: astore #5
/*     */     //   122: aload #5
/*     */     //   124: iconst_0
/*     */     //   125: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalThemeName : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   128: aload_0
/*     */     //   129: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   132: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   135: aastore
/*     */     //   136: aload #5
/*     */     //   138: iconst_1
/*     */     //   139: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalIsDarkTheme : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   142: aload_0
/*     */     //   143: invokevirtual isDark : ()Z
/*     */     //   146: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   149: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   152: aastore
/*     */     //   153: aload #5
/*     */     //   155: iconst_2
/*     */     //   156: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalContentColor : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   159: aload_0
/*     */     //   160: invokevirtual getContentColor-0d7_KjU : ()J
/*     */     //   163: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   166: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   169: aastore
/*     */     //   170: aload #5
/*     */     //   172: iconst_3
/*     */     //   173: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalTextStyle : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual getDefaultTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   180: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   183: aastore
/*     */     //   184: aload #5
/*     */     //   186: iconst_4
/*     */     //   187: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalEditorTextStyle : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   190: aload_0
/*     */     //   191: invokevirtual getEditorTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   194: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   197: aastore
/*     */     //   198: aload #5
/*     */     //   200: iconst_5
/*     */     //   201: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalConsoleTextStyle : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   204: aload_0
/*     */     //   205: invokevirtual getConsoleTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   208: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   211: aastore
/*     */     //   212: aload #5
/*     */     //   214: bipush #6
/*     */     //   216: invokestatic getLocalGlobalColors : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   219: aload_0
/*     */     //   220: invokevirtual getGlobalColors : ()Lorg/jetbrains/jewel/foundation/GlobalColors;
/*     */     //   223: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   226: aastore
/*     */     //   227: aload #5
/*     */     //   229: bipush #7
/*     */     //   231: invokestatic getLocalGlobalMetrics : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   234: aload_0
/*     */     //   235: invokevirtual getGlobalMetrics : ()Lorg/jetbrains/jewel/foundation/GlobalMetrics;
/*     */     //   238: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   241: aastore
/*     */     //   242: aload #5
/*     */     //   244: aload_1
/*     */     //   245: aload_2
/*     */     //   246: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   249: bipush #112
/*     */     //   251: iload #4
/*     */     //   253: iand
/*     */     //   254: ior
/*     */     //   255: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   258: invokestatic isTraceInProgress : ()Z
/*     */     //   261: ifeq -> 276
/*     */     //   264: invokestatic traceEventEnd : ()V
/*     */     //   267: goto -> 276
/*     */     //   270: aload_2
/*     */     //   271: invokeinterface skipToGroupEnd : ()V
/*     */     //   276: aload_2
/*     */     //   277: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   282: dup
/*     */     //   283: ifnull -> 302
/*     */     //   286: aload_0
/*     */     //   287: aload_1
/*     */     //   288: iload_3
/*     */     //   289: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   294: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   299: goto -> 303
/*     */     //   302: pop
/*     */     //   303: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 12
/*     */     //   #58	-> 115
/*     */     //   #59	-> 139
/*     */     //   #58	-> 153
/*     */     //   #60	-> 156
/*     */     //   #58	-> 170
/*     */     //   #61	-> 173
/*     */     //   #58	-> 184
/*     */     //   #62	-> 187
/*     */     //   #58	-> 198
/*     */     //   #63	-> 201
/*     */     //   #58	-> 212
/*     */     //   #64	-> 216
/*     */     //   #58	-> 227
/*     */     //   #65	-> 231
/*     */     //   #58	-> 242
/*     */     //   #66	-> 244
/*     */     //   #57	-> 255
/*     */     //   #68	-> 270
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   24	280	4	$dirty	I
/*     */     //   0	304	0	theme	Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;
/*     */     //   0	304	1	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	304	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	304	3	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  70 */   private static final ProvidableCompositionLocal<String> LocalThemeName = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalThemeName$lambda$2); @NotNull public static final ProvidableCompositionLocal<String> getLocalThemeName() { return LocalThemeName; } private static final String LocalThemeName$lambda$2() {
/*  71 */     throw new IllegalStateException("No ThemeName provided".toString());
/*     */   }
/*     */   @NotNull
/*  74 */   private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt$LocalContentColor$1.INSTANCE); @NotNull public static final ProvidableCompositionLocal<Color> getLocalContentColor() { return LocalContentColor; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*  75 */   static final class JewelThemeKt$LocalContentColor$1 implements Function0<Color> { public final long invoke-0d7_KjU() { throw new IllegalStateException("No ContentColor provided. Have you forgotten the theme?".toString()); }
/*     */      public static final JewelThemeKt$LocalContentColor$1 INSTANCE = new JewelThemeKt$LocalContentColor$1(); }
/*     */   @NotNull
/*  78 */   private static final ProvidableCompositionLocal<Boolean> LocalIsDarkTheme = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalIsDarkTheme$lambda$3); @NotNull public static final ProvidableCompositionLocal<Boolean> getLocalIsDarkTheme() { return LocalIsDarkTheme; } private static final boolean LocalIsDarkTheme$lambda$3() {
/*  79 */     throw new IllegalStateException("No IsDarkTheme provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/*  82 */   private static final ProvidableCompositionLocal<Boolean> LocalSwingCompatMode = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalSwingCompatMode$lambda$4); @NotNull public static final ProvidableCompositionLocal<Boolean> getLocalSwingCompatMode() { return LocalSwingCompatMode; }
/*     */    private static final boolean LocalSwingCompatMode$lambda$4() {
/*  84 */     return false;
/*     */   }
/*     */   @NotNull
/*  87 */   private static final ProvidableCompositionLocal<ThemeColorPalette> LocalColorPalette = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalColorPalette$lambda$5); @NotNull public static final ProvidableCompositionLocal<ThemeColorPalette> getLocalColorPalette() { return LocalColorPalette; } private static final ThemeColorPalette LocalColorPalette$lambda$5() {
/*  88 */     return ThemeColorPalette.Companion.getEmpty();
/*     */   }
/*     */   @NotNull
/*  91 */   private static final ProvidableCompositionLocal<ThemeIconData> LocalIconData = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalIconData$lambda$6); @NotNull public static final ProvidableCompositionLocal<ThemeIconData> getLocalIconData() { return LocalIconData; } private static final ThemeIconData LocalIconData$lambda$6() { return ThemeIconData.Companion.getEmpty(); }
/*     */    @NotNull
/*  93 */   private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalTextStyle$lambda$7); @NotNull public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() { return LocalTextStyle; } private static final TextStyle LocalTextStyle$lambda$7() {
/*  94 */     throw new IllegalStateException("No TextStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/*  97 */   private static final ProvidableCompositionLocal<TextStyle> LocalEditorTextStyle = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalEditorTextStyle$lambda$8); @NotNull public static final ProvidableCompositionLocal<TextStyle> getLocalEditorTextStyle() { return LocalEditorTextStyle; } private static final TextStyle LocalEditorTextStyle$lambda$8() {
/*  98 */     throw new IllegalStateException("No EditorTextStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/* 101 */   private static final ProvidableCompositionLocal<TextStyle> LocalConsoleTextStyle = CompositionLocalKt.staticCompositionLocalOf(JewelThemeKt::LocalConsoleTextStyle$lambda$9); @NotNull public static final ProvidableCompositionLocal<TextStyle> getLocalConsoleTextStyle() { return LocalConsoleTextStyle; } private static final TextStyle LocalConsoleTextStyle$lambda$9() {
/* 102 */     throw new IllegalStateException("No ConsoleTextStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void OverrideDarkMode(boolean isDark, @NotNull Function2 content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'content'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 731385983
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_2
/*     */     //   15: iload_3
/*     */     //   16: istore #4
/*     */     //   18: iload_3
/*     */     //   19: bipush #6
/*     */     //   21: iand
/*     */     //   22: ifne -> 45
/*     */     //   25: iload #4
/*     */     //   27: aload_2
/*     */     //   28: iload_0
/*     */     //   29: invokeinterface changed : (Z)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #4
/*     */     //   45: iload_3
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 74
/*     */     //   52: iload #4
/*     */     //   54: aload_2
/*     */     //   55: aload_1
/*     */     //   56: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 69
/*     */     //   64: bipush #32
/*     */     //   66: goto -> 71
/*     */     //   69: bipush #16
/*     */     //   71: ior
/*     */     //   72: istore #4
/*     */     //   74: iload #4
/*     */     //   76: bipush #19
/*     */     //   78: iand
/*     */     //   79: bipush #18
/*     */     //   81: if_icmpne -> 93
/*     */     //   84: aload_2
/*     */     //   85: invokeinterface getSkipping : ()Z
/*     */     //   90: ifne -> 145
/*     */     //   93: invokestatic isTraceInProgress : ()Z
/*     */     //   96: ifeq -> 109
/*     */     //   99: ldc 731385983
/*     */     //   101: iload #4
/*     */     //   103: iconst_m1
/*     */     //   104: ldc 'org.jetbrains.jewel.foundation.theme.OverrideDarkMode (JewelTheme.kt:120)'
/*     */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   109: getstatic org/jetbrains/jewel/foundation/theme/JewelThemeKt.LocalIsDarkTheme : Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   112: iload_0
/*     */     //   113: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   116: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   119: aload_1
/*     */     //   120: aload_2
/*     */     //   121: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   124: bipush #112
/*     */     //   126: iload #4
/*     */     //   128: iand
/*     */     //   129: ior
/*     */     //   130: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   133: invokestatic isTraceInProgress : ()Z
/*     */     //   136: ifeq -> 151
/*     */     //   139: invokestatic traceEventEnd : ()V
/*     */     //   142: goto -> 151
/*     */     //   145: aload_2
/*     */     //   146: invokeinterface skipToGroupEnd : ()V
/*     */     //   151: aload_2
/*     */     //   152: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   157: dup
/*     */     //   158: ifnull -> 177
/*     */     //   161: iload_0
/*     */     //   162: aload_1
/*     */     //   163: iload_3
/*     */     //   164: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   169: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   174: goto -> 178
/*     */     //   177: pop
/*     */     //   178: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 6
/*     */     //   #122	-> 109
/*     */     //   #123	-> 145
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	161	4	$dirty	I
/*     */     //   0	179	0	isDark	Z
/*     */     //   0	179	1	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	179	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	179	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit JewelTheme$lambda$0(ThemeDefinition $theme, boolean $swingCompatMode, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     JewelTheme($theme, $swingCompatMode, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JewelTheme$lambda$1(ThemeDefinition $theme, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     JewelTheme($theme, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit OverrideDarkMode$lambda$10(boolean $isDark, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     OverrideDarkMode($isDark, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\JewelThemeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */