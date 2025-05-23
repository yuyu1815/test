/*    */ package androidx.compose.desktop;
/*    */ 
/*    */ import androidx.compose.foundation.ScrollbarStyle;
/*    */ import androidx.compose.material.Colors;
/*    */ import androidx.compose.material.MaterialTheme;
/*    */ import androidx.compose.material.Shapes;
/*    */ import androidx.compose.material.Typography;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\032>\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\021\020\b\032\r\022\004\022\0020\0010\t¢\006\002\b\nH\007¢\006\002\020\013\032*\020\f\032\0020\0012\b\b\002\020\r\032\0020\0162\021\020\b\032\r\022\004\022\0020\0010\t¢\006\002\b\nH\007¢\006\002\020\017¨\006\020"}, d2 = {"DesktopMaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DesktopTheme", "scrollbar", "Landroidx/compose/foundation/ScrollbarStyle;", "(Landroidx/compose/foundation/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "desktop"})
/*    */ @SourceDebugExtension({"SMAP\nDesktopTheme.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesktopTheme.jvm.kt\nandroidx/compose/desktop/DesktopTheme_jvmKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,76:1\n149#2:77\n149#2:78\n*S KotlinDebug\n*F\n+ 1 DesktopTheme.jvm.kt\nandroidx/compose/desktop/DesktopTheme_jvmKt\n*L\n65#1:77\n66#1:78\n*E\n"})
/*    */ public final class DesktopTheme_jvmKt
/*    */ {
/*    */   @Deprecated(message = "Use MaterialTheme", replaceWith = @ReplaceWith(expression = "MaterialTheme(colors, typography, shapes, content)", imports = {"androidx.compose.material.MaterialTheme"}))
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[0[0]]")
/*    */   public static final void DesktopMaterialTheme(@Nullable Colors colors, @Nullable Typography typography, @Nullable Shapes shapes, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 43 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(1861883204); ComposerKt.sourceInformation($composer, "C(DesktopMaterialTheme)P(!1,3,2)38@1350L6,39@1401L10,40@1448L6,46@1552L39,42@1496L95:DesktopTheme.jvm.kt#9esuo5"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= ((paramInt1 & 0x1) == 0 && $composer.changed(colors)) ? 4 : 2;  if (($changed & 0x30) == 0) $dirty |= ((paramInt1 & 0x2) == 0 && $composer.changed(typography)) ? 32 : 16;  if (($changed & 0x180) == 0) $dirty |= ((paramInt1 & 0x4) == 0 && $composer.changed(shapes)) ? 256 : 128;  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changedInstance(content) ? 2048 : 1024; }  if (($dirty & 0x493) != 1170 || !$composer.getSkipping()) { $composer.startDefaults(); if (($changed & 0x1) == 0 || $composer.getDefaultsInvalid()) { if ((paramInt1 & 0x1) != 0) {
/*    */           colors = MaterialTheme.INSTANCE.getColors($composer, MaterialTheme.$stable); $dirty &= 0xFFFFFFF1;
/*    */         }  if ((paramInt1 & 0x2) != 0) {
/*    */           typography = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable); $dirty &= 0xFFFFFF8F;
/*    */         }  }
/*    */        $composer.skipToGroupEnd(); }
/* 49 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new DesktopTheme_jvmKt$DesktopMaterialTheme$2(colors, typography, shapes, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*    */   static final class DesktopTheme_jvmKt$DesktopMaterialTheme$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*    */     @Composable
/*    */     public final void invoke(@Nullable Composer $composer, int $changed) {
/*    */       ComposerKt.sourceInformation($composer, "C47@1558L31:DesktopTheme.jvm.kt#9esuo5");
/*    */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-1733340944, $changed, -1, "androidx.compose.desktop.DesktopMaterialTheme.<anonymous> (DesktopTheme.jvm.kt:47)"); 
/*    */         DesktopTheme_jvmKt.DesktopTheme(null, this.$content, $composer, 0, 1);
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */     
/*    */     DesktopTheme_jvmKt$DesktopMaterialTheme$1(Function2<Composer, Integer, Unit> $content) {
/*    */       super(2);
/*    */     }
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Use CompositionLocalProvider(LocalScrollbarStyle provides scrollbar)", replaceWith = @ReplaceWith(expression = "CompositionLocalProvider(\n    LocalScrollbarStyle provides scrollbar,\n    content = content\n)", imports = {"androidx.compose.runtime.CompositionLocalProvider", "androidx.compose.foundation.LocalScrollbarStyle"}))
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[0[0]]")
/*    */   public static final void DesktopTheme(@Nullable ScrollbarStyle scrollbar, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'content'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc -1127327661
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_2
/*    */     //   15: aload_2
/*    */     //   16: ldc 'C(DesktopTheme)P(1)66@2164L6,68@2250L6,69@2323L6,72@2407L93:DesktopTheme.jvm.kt#9esuo5'
/*    */     //   18: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*    */     //   21: iload_3
/*    */     //   22: istore #5
/*    */     //   24: iload_3
/*    */     //   25: bipush #6
/*    */     //   27: iand
/*    */     //   28: ifne -> 58
/*    */     //   31: iload #5
/*    */     //   33: iload #4
/*    */     //   35: iconst_1
/*    */     //   36: iand
/*    */     //   37: ifne -> 54
/*    */     //   40: aload_2
/*    */     //   41: aload_0
/*    */     //   42: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   47: ifeq -> 54
/*    */     //   50: iconst_4
/*    */     //   51: goto -> 55
/*    */     //   54: iconst_2
/*    */     //   55: ior
/*    */     //   56: istore #5
/*    */     //   58: iload #4
/*    */     //   60: iconst_2
/*    */     //   61: iand
/*    */     //   62: ifeq -> 75
/*    */     //   65: iload #5
/*    */     //   67: bipush #48
/*    */     //   69: ior
/*    */     //   70: istore #5
/*    */     //   72: goto -> 104
/*    */     //   75: iload_3
/*    */     //   76: bipush #48
/*    */     //   78: iand
/*    */     //   79: ifne -> 104
/*    */     //   82: iload #5
/*    */     //   84: aload_2
/*    */     //   85: aload_1
/*    */     //   86: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   91: ifeq -> 99
/*    */     //   94: bipush #32
/*    */     //   96: goto -> 101
/*    */     //   99: bipush #16
/*    */     //   101: ior
/*    */     //   102: istore #5
/*    */     //   104: iload #5
/*    */     //   106: bipush #19
/*    */     //   108: iand
/*    */     //   109: bipush #18
/*    */     //   111: if_icmpne -> 123
/*    */     //   114: aload_2
/*    */     //   115: invokeinterface getSkipping : ()Z
/*    */     //   120: ifne -> 338
/*    */     //   123: aload_2
/*    */     //   124: invokeinterface startDefaults : ()V
/*    */     //   129: iload_3
/*    */     //   130: iconst_1
/*    */     //   131: iand
/*    */     //   132: ifeq -> 144
/*    */     //   135: aload_2
/*    */     //   136: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   141: ifeq -> 263
/*    */     //   144: iload #4
/*    */     //   146: iconst_1
/*    */     //   147: iand
/*    */     //   148: ifeq -> 283
/*    */     //   151: new androidx/compose/foundation/ScrollbarStyle
/*    */     //   154: dup
/*    */     //   155: bipush #16
/*    */     //   157: istore #6
/*    */     //   159: iconst_0
/*    */     //   160: istore #7
/*    */     //   162: iload #6
/*    */     //   164: i2f
/*    */     //   165: invokestatic constructor-impl : (F)F
/*    */     //   168: bipush #8
/*    */     //   170: istore #6
/*    */     //   172: iconst_0
/*    */     //   173: istore #7
/*    */     //   175: iload #6
/*    */     //   177: i2f
/*    */     //   178: invokestatic constructor-impl : (F)F
/*    */     //   181: getstatic androidx/compose/material/MaterialTheme.INSTANCE : Landroidx/compose/material/MaterialTheme;
/*    */     //   184: aload_2
/*    */     //   185: getstatic androidx/compose/material/MaterialTheme.$stable : I
/*    */     //   188: invokevirtual getShapes : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;
/*    */     //   191: invokevirtual getSmall : ()Landroidx/compose/foundation/shape/CornerBasedShape;
/*    */     //   194: checkcast androidx/compose/ui/graphics/Shape
/*    */     //   197: sipush #300
/*    */     //   200: getstatic androidx/compose/material/MaterialTheme.INSTANCE : Landroidx/compose/material/MaterialTheme;
/*    */     //   203: aload_2
/*    */     //   204: getstatic androidx/compose/material/MaterialTheme.$stable : I
/*    */     //   207: invokevirtual getColors : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;
/*    */     //   210: invokevirtual getOnSurface-0d7_KjU : ()J
/*    */     //   213: ldc 0.12
/*    */     //   215: fconst_0
/*    */     //   216: fconst_0
/*    */     //   217: fconst_0
/*    */     //   218: bipush #14
/*    */     //   220: aconst_null
/*    */     //   221: invokestatic copy-wmQWz5c$default : (JFFFFILjava/lang/Object;)J
/*    */     //   224: getstatic androidx/compose/material/MaterialTheme.INSTANCE : Landroidx/compose/material/MaterialTheme;
/*    */     //   227: aload_2
/*    */     //   228: getstatic androidx/compose/material/MaterialTheme.$stable : I
/*    */     //   231: invokevirtual getColors : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;
/*    */     //   234: invokevirtual getOnSurface-0d7_KjU : ()J
/*    */     //   237: ldc 0.5
/*    */     //   239: fconst_0
/*    */     //   240: fconst_0
/*    */     //   241: fconst_0
/*    */     //   242: bipush #14
/*    */     //   244: aconst_null
/*    */     //   245: invokestatic copy-wmQWz5c$default : (JFFFFILjava/lang/Object;)J
/*    */     //   248: aconst_null
/*    */     //   249: invokespecial <init> : (FFLandroidx/compose/ui/graphics/Shape;IJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   252: astore_0
/*    */     //   253: iload #5
/*    */     //   255: bipush #-15
/*    */     //   257: iand
/*    */     //   258: istore #5
/*    */     //   260: goto -> 283
/*    */     //   263: aload_2
/*    */     //   264: invokeinterface skipToGroupEnd : ()V
/*    */     //   269: iload #4
/*    */     //   271: iconst_1
/*    */     //   272: iand
/*    */     //   273: ifeq -> 283
/*    */     //   276: iload #5
/*    */     //   278: bipush #-15
/*    */     //   280: iand
/*    */     //   281: istore #5
/*    */     //   283: aload_2
/*    */     //   284: invokeinterface endDefaults : ()V
/*    */     //   289: invokestatic isTraceInProgress : ()Z
/*    */     //   292: ifeq -> 305
/*    */     //   295: ldc -1127327661
/*    */     //   297: iload #5
/*    */     //   299: iconst_m1
/*    */     //   300: ldc 'androidx.compose.desktop.DesktopTheme (DesktopTheme.jvm.kt:72)'
/*    */     //   302: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   305: invokestatic getLocalScrollbarStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*    */     //   308: aload_0
/*    */     //   309: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*    */     //   312: aload_1
/*    */     //   313: aload_2
/*    */     //   314: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*    */     //   317: bipush #112
/*    */     //   319: iload #5
/*    */     //   321: iand
/*    */     //   322: ior
/*    */     //   323: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*    */     //   326: invokestatic isTraceInProgress : ()Z
/*    */     //   329: ifeq -> 344
/*    */     //   332: invokestatic traceEventEnd : ()V
/*    */     //   335: goto -> 344
/*    */     //   338: aload_2
/*    */     //   339: invokeinterface skipToGroupEnd : ()V
/*    */     //   344: aload_2
/*    */     //   345: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   350: dup
/*    */     //   351: ifnull -> 377
/*    */     //   354: new androidx/compose/desktop/DesktopTheme_jvmKt$DesktopTheme$1
/*    */     //   357: dup
/*    */     //   358: aload_0
/*    */     //   359: aload_1
/*    */     //   360: iload_3
/*    */     //   361: iload #4
/*    */     //   363: invokespecial <init> : (Landroidx/compose/foundation/ScrollbarStyle;Lkotlin/jvm/functions/Function2;II)V
/*    */     //   366: checkcast kotlin/jvm/functions/Function2
/*    */     //   369: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   374: goto -> 378
/*    */     //   377: pop
/*    */     //   378: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #73	-> 6
/*    */     //   #64	-> 151
/*    */     //   #65	-> 155
/*    */     //   #77	-> 162
/*    */     //   #66	-> 168
/*    */     //   #78	-> 175
/*    */     //   #67	-> 181
/*    */     //   #68	-> 197
/*    */     //   #69	-> 200
/*    */     //   #70	-> 224
/*    */     //   #64	-> 249
/*    */     //   #73	-> 302
/*    */     //   #74	-> 305
/*    */     //   #75	-> 312
/*    */     //   #73	-> 323
/*    */     //   #76	-> 338
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   162	6	7	$i$f$getDp	I
/*    */     //   159	9	6	$this$dp$iv	I
/*    */     //   175	6	7	$i$f$getDp	I
/*    */     //   172	9	6	$this$dp$iv	I
/*    */     //   24	355	5	$dirty	I
/*    */     //   0	379	0	scrollbar	Landroidx/compose/foundation/ScrollbarStyle;
/*    */     //   0	379	1	content	Lkotlin/jvm/functions/Function2;
/*    */     //   0	379	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	379	3	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class DesktopTheme_jvmKt$DesktopMaterialTheme$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*    */     DesktopTheme_jvmKt$DesktopMaterialTheme$2(Colors $colors, Typography $typography, Shapes $shapes, Function2<Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*    */       super(2);
/*    */     }
/*    */     
/*    */     public final void invoke(@Nullable Composer $composer, int $force) {
/*    */       DesktopTheme_jvmKt.DesktopMaterialTheme(this.$colors, this.$typography, this.$shapes, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class DesktopTheme_jvmKt$DesktopTheme$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*    */     DesktopTheme_jvmKt$DesktopTheme$1(ScrollbarStyle $scrollbar, Function2<Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*    */       super(2);
/*    */     }
/*    */     
/*    */     public final void invoke(@Nullable Composer $composer, int $force) {
/*    */       DesktopTheme_jvmKt.DesktopTheme(this.$scrollbar, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\desktop-jvm-1.7.3.jar!\androidx\compose\desktop\DesktopTheme_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */