/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\004\n\002\020\002\n\002\b\002\n\002\020!\n\002\b\003\bÂ\002\030\0002\0020\001:\002\032\033B\t\b\002¢\006\004\b\002\020\003J\035\020\007\032\n \t*\004\030\0010\b0\b*\0060\bj\002`\nH\002¢\006\002\020\013J%\020\f\032\n \t*\004\030\0010\b0\b*\0060\bj\002`\n2\006\020\r\032\0020\016H\002¢\006\002\020\017J&\020\020\032\0020\0212\006\020\022\032\0020\0162\f\020\023\032\b\022\004\022\0020\0060\0052\006\020\024\032\0020\021H\002J&\020\025\032\0020\026*\0060\bj\002`\n2\006\020\024\032\0020\0212\f\020\004\032\b\022\004\022\0020\0060\005H\002J\030\020\027\032\0020\026\"\004\b\000\020\030*\b\022\004\022\002H\0300\031H\002R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\034"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;", "", "<init>", "()V", "opacityList", "", "", "closeRoot", "Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "Lkotlin/text/StringBuilder;", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "openRoot", "sizePx", "", "(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;", "generateSvgIcon", "", "size", "opacityListShifted", "colorHex", "elements", "", "shtr", "T", "", "Small", "Big", "ui"})
/*     */ final class SpinnerProgressIconGenerator
/*     */ {
/*     */   @NotNull
/*     */   private static final List<Float> opacityList;
/*     */   @NotNull
/* 109 */   public static final SpinnerProgressIconGenerator INSTANCE = new SpinnerProgressIconGenerator(); static { Float[] arrayOfFloat = new Float[8]; arrayOfFloat[0] = Float.valueOf(1.0F); arrayOfFloat[1] = Float.valueOf(0.93F); arrayOfFloat[2] = Float.valueOf(0.78F); arrayOfFloat[3] = Float.valueOf(0.69F); arrayOfFloat[4] = Float.valueOf(0.62F); arrayOfFloat[5] = Float.valueOf(0.48F); arrayOfFloat[6] = Float.valueOf(0.38F); arrayOfFloat[7] = Float.valueOf(0.0F); opacityList = CollectionsKt.listOf((Object[])arrayOfFloat); }
/*     */    private final StringBuilder closeRoot(StringBuilder $this$closeRoot) {
/* 111 */     return $this$closeRoot.append("</svg>");
/*     */   }
/*     */   private final StringBuilder openRoot(StringBuilder $this$openRoot, int sizePx) {
/* 114 */     return $this$openRoot.append("<svg width=\"" + 
/* 115 */         sizePx + "\" height=\"" + sizePx + "\" viewBox=\"0 0 16 16\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">");
/*     */   }
/*     */   
/*     */   private final String generateSvgIcon(int size, List<Float> opacityListShifted, String colorHex) {
/* 119 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$generateSvgIcon_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-SpinnerProgressIconGenerator$generateSvgIcon$1 = 0;
/* 120 */     INSTANCE.openRoot($this$generateSvgIcon_u24lambda_u240, size);
/* 121 */     INSTANCE.elements($this$generateSvgIcon_u24lambda_u240, colorHex, opacityListShifted);
/* 122 */     INSTANCE.closeRoot($this$generateSvgIcon_u24lambda_u240);
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   } private final void elements(StringBuilder $this$elements, String colorHex, List<String> opacityList) {
/* 126 */     Intrinsics.checkNotNullExpressionValue($this$elements.append('\n'), "append(...)"); $this$elements.append('\n');
/*     */     
/* 128 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(0) + "\" x=\"7\" y=\"1\" width=\"2\" height=\"4\" rx=\"1\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(0) + "\" x=\"7\" y=\"1\" width=\"2\" height=\"4\" rx=\"1\"/>").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(0) + "\" x=\"7\" y=\"1\" width=\"2\" height=\"4\" rx=\"1\"/>").append('\n');
/*     */ 
/*     */     
/* 131 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(1) + "\" x=\"2.34961\" y=\"3.76416\" width=\"2\" height=\"4\" rx=\"1\""), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(1) + "\" x=\"2.34961\" y=\"3.76416\" width=\"2\" height=\"4\" rx=\"1\"").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(1) + "\" x=\"2.34961\" y=\"3.76416\" width=\"2\" height=\"4\" rx=\"1\"").append('\n');
/*     */     
/* 133 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(-45 2.34961 3.76416)\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(-45 2.34961 3.76416)\"/>").append('\n'), "append(...)"); $this$elements.append("          transform=\"rotate(-45 2.34961 3.76416)\"/>").append('\n');
/*     */     
/* 135 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(2) + "\" x=\"1\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(2) + "\" x=\"1\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(2) + "\" x=\"1\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>").append('\n');
/*     */ 
/*     */     
/* 138 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(3) + "\" x=\"5.17871\" y=\"9.40991\" width=\"2\" height=\"4\" rx=\"1\""), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(3) + "\" x=\"5.17871\" y=\"9.40991\" width=\"2\" height=\"4\" rx=\"1\"").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(3) + "\" x=\"5.17871\" y=\"9.40991\" width=\"2\" height=\"4\" rx=\"1\"").append('\n');
/*     */     
/* 140 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(45 5.17871 9.40991)\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(45 5.17871 9.40991)\"/>").append('\n'), "append(...)"); $this$elements.append("          transform=\"rotate(45 5.17871 9.40991)\"/>").append('\n');
/*     */     
/* 142 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(4) + "\" x=\"7\" y=\"11\" width=\"2\" height=\"4\" rx=\"1\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(4) + "\" x=\"7\" y=\"11\" width=\"2\" height=\"4\" rx=\"1\"/>").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(4) + "\" x=\"7\" y=\"11\" width=\"2\" height=\"4\" rx=\"1\"/>").append('\n');
/*     */ 
/*     */     
/* 145 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(5) + "\" x=\"9.41016\" y=\"10.8242\" width=\"2\" height=\"4\" rx=\"1\""), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(5) + "\" x=\"9.41016\" y=\"10.8242\" width=\"2\" height=\"4\" rx=\"1\"").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(5) + "\" x=\"9.41016\" y=\"10.8242\" width=\"2\" height=\"4\" rx=\"1\"").append('\n');
/*     */     
/* 147 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(-45 9.41016 10.8242)\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(-45 9.41016 10.8242)\"/>").append('\n'), "append(...)"); $this$elements.append("          transform=\"rotate(-45 9.41016 10.8242)\"/>").append('\n');
/*     */     
/* 149 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(6) + "\" x=\"11\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(6) + "\" x=\"11\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(6) + "\" x=\"11\" y=\"7\" width=\"4\" height=\"2\" rx=\"1\"/>").append('\n');
/*     */ 
/*     */     
/* 152 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(7) + "\" x=\"12.2383\" y=\"2.3501\" width=\"2\" height=\"4\" rx=\"1\""), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(7) + "\" x=\"12.2383\" y=\"2.3501\" width=\"2\" height=\"4\" rx=\"1\"").append('\n'), "append(...)"); $this$elements.append("    <rect fill=\"" + colorHex + "\" opacity=\"" + opacityList.get(7) + "\" x=\"12.2383\" y=\"2.3501\" width=\"2\" height=\"4\" rx=\"1\"").append('\n');
/*     */     
/* 154 */     Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(45 12.2383 2.3501)\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$elements.append("          transform=\"rotate(45 12.2383 2.3501)\"/>").append('\n'), "append(...)"); $this$elements.append("          transform=\"rotate(45 12.2383 2.3501)\"/>").append('\n');
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\006¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Small;", "", "<init>", "()V", "generateSvgFrames", "", "", "colorHex", "ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Small
/*     */   {
/*     */     @NotNull
/*     */     public static final Small INSTANCE = new Small();
/*     */ 
/*     */     
/*     */     public static final int $stable;
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final List<String> generateSvgFrames(@NotNull String colorHex) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'colorHex'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic createListBuilder : ()Ljava/util/List;
/*     */       //   9: astore_2
/*     */       //   10: aload_2
/*     */       //   11: astore_3
/*     */       //   12: iconst_0
/*     */       //   13: istore #4
/*     */       //   15: invokestatic access$getOpacityList$p : ()Ljava/util/List;
/*     */       //   18: checkcast java/util/Collection
/*     */       //   21: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */       //   24: astore #5
/*     */       //   26: invokestatic access$getOpacityList$p : ()Ljava/util/List;
/*     */       //   29: checkcast java/util/Collection
/*     */       //   32: invokeinterface size : ()I
/*     */       //   37: istore #6
/*     */       //   39: iconst_0
/*     */       //   40: istore #7
/*     */       //   42: iload #7
/*     */       //   44: iload #6
/*     */       //   46: if_icmpge -> 89
/*     */       //   49: iload #7
/*     */       //   51: istore #8
/*     */       //   53: iconst_0
/*     */       //   54: istore #9
/*     */       //   56: aload_3
/*     */       //   57: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
/*     */       //   60: bipush #16
/*     */       //   62: aload #5
/*     */       //   64: aload_1
/*     */       //   65: invokestatic access$generateSvgIcon : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;ILjava/util/List;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   73: pop
/*     */       //   74: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
/*     */       //   77: aload #5
/*     */       //   79: invokestatic access$shtr : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;Ljava/util/List;)V
/*     */       //   82: nop
/*     */       //   83: iinc #7, 1
/*     */       //   86: goto -> 42
/*     */       //   89: nop
/*     */       //   90: aload_2
/*     */       //   91: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */       //   94: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #158	-> 6
/*     */       //   #159	-> 15
/*     */       //   #160	-> 26
/*     */       //   #160	-> 39
/*     */       //   #161	-> 56
/*     */       //   #162	-> 74
/*     */       //   #163	-> 82
/*     */       //   #160	-> 83
/*     */       //   #164	-> 89
/*     */       //   #158	-> 90
/*     */       //   #164	-> 94
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   56	27	9	$i$a$-repeat-SpinnerProgressIconGenerator$Small$generateSvgFrames$1$1	I
/*     */       //   53	30	8	it	I
/*     */       //   15	75	4	$i$a$-buildList-SpinnerProgressIconGenerator$Small$generateSvgFrames$1	I
/*     */       //   26	64	5	opacityListShifted	Ljava/util/List;
/*     */       //   12	78	3	$this$generateSvgFrames_u24lambda_u241	Ljava/util/List;
/*     */       //   0	95	0	this	Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Small;
/*     */       //   0	95	1	colorHex	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private final <T> void shtr(List<Object> $this$shtr) {
/* 178 */     $this$shtr.add(CollectionsKt.first($this$shtr));
/* 179 */     CollectionsKt.removeFirst($this$shtr);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\006¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Big;", "", "<init>", "()V", "generateSvgFrames", "", "", "colorHex", "ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Big {
/*     */     @NotNull
/*     */     public static final Big INSTANCE = new Big();
/*     */     public static final int $stable;
/*     */     
/*     */     @NotNull
/*     */     public final List<String> generateSvgFrames(@NotNull String colorHex) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'colorHex'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic createListBuilder : ()Ljava/util/List;
/*     */       //   9: astore_2
/*     */       //   10: aload_2
/*     */       //   11: astore_3
/*     */       //   12: iconst_0
/*     */       //   13: istore #4
/*     */       //   15: invokestatic access$getOpacityList$p : ()Ljava/util/List;
/*     */       //   18: checkcast java/util/Collection
/*     */       //   21: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */       //   24: astore #5
/*     */       //   26: invokestatic access$getOpacityList$p : ()Ljava/util/List;
/*     */       //   29: checkcast java/util/Collection
/*     */       //   32: invokeinterface size : ()I
/*     */       //   37: istore #6
/*     */       //   39: iconst_0
/*     */       //   40: istore #7
/*     */       //   42: iload #7
/*     */       //   44: iload #6
/*     */       //   46: if_icmpge -> 89
/*     */       //   49: iload #7
/*     */       //   51: istore #8
/*     */       //   53: iconst_0
/*     */       //   54: istore #9
/*     */       //   56: aload_3
/*     */       //   57: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
/*     */       //   60: bipush #32
/*     */       //   62: aload #5
/*     */       //   64: aload_1
/*     */       //   65: invokestatic access$generateSvgIcon : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;ILjava/util/List;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   68: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   73: pop
/*     */       //   74: getstatic org/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator.INSTANCE : Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;
/*     */       //   77: aload #5
/*     */       //   79: invokestatic access$shtr : (Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator;Ljava/util/List;)V
/*     */       //   82: nop
/*     */       //   83: iinc #7, 1
/*     */       //   86: goto -> 42
/*     */       //   89: nop
/*     */       //   90: aload_2
/*     */       //   91: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */       //   94: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #168	-> 6
/*     */       //   #169	-> 15
/*     */       //   #170	-> 26
/*     */       //   #170	-> 39
/*     */       //   #171	-> 56
/*     */       //   #172	-> 74
/*     */       //   #173	-> 82
/*     */       //   #170	-> 83
/*     */       //   #174	-> 89
/*     */       //   #168	-> 90
/*     */       //   #174	-> 94
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   56	27	9	$i$a$-repeat-SpinnerProgressIconGenerator$Big$generateSvgFrames$1$1	I
/*     */       //   53	30	8	it	I
/*     */       //   15	75	4	$i$a$-buildList-SpinnerProgressIconGenerator$Big$generateSvgFrames$1	I
/*     */       //   26	64	5	opacityListShifted	Ljava/util/List;
/*     */       //   12	78	3	$this$generateSvgFrames_u24lambda_u241	Ljava/util/List;
/*     */       //   0	95	0	this	Lorg/jetbrains/jewel/ui/component/SpinnerProgressIconGenerator$Big;
/*     */       //   0	95	1	colorHex	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SpinnerProgressIconGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */