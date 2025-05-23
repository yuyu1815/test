/*     */ package androidx.compose.ui.graphics.layer;
/*     */ 
/*     */ import androidx.collection.MutableScatterSet;
/*     */ import androidx.collection.ScatterSet;
/*     */ import androidx.collection.ScatterSetKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\016\020\013\032\0020\n2\006\020\f\032\0020\005J \020\r\032\0020\0162\022\020\017\032\016\022\004\022\0020\005\022\004\022\0020\0160\020H\bø\001\000J.\020\021\032\0020\0162\022\020\022\032\016\022\004\022\0020\005\022\004\022\0020\0160\0202\f\020\017\032\b\022\004\022\0020\0160\023H\bø\001\000R\026\020\003\032\n\022\004\022\0020\005\030\0010\004X\016¢\006\002\n\000R\020\020\006\032\004\030\0010\005X\016¢\006\002\n\000R\026\020\007\032\n\022\004\022\0020\005\030\0010\004X\016¢\006\002\n\000R\020\020\b\032\004\030\0010\005X\016¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000\002\007\n\005\b20\001¨\006\024"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "()V", "dependenciesSet", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dependency", "oldDependenciesSet", "oldDependency", "trackingInProgress", "", "onDependencyAdded", "graphicsLayer", "removeDependencies", "", "block", "Lkotlin/Function1;", "withTracking", "onDependencyRemoved", "Lkotlin/Function0;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,117:1\n267#2,4:118\n237#2,7:122\n248#2,3:130\n251#2,2:134\n272#2,2:136\n254#2,6:138\n274#2:144\n267#2,4:152\n237#2,7:156\n248#2,3:164\n251#2,2:168\n272#2,2:170\n254#2,6:172\n274#2:178\n1810#3:129\n1672#3:133\n1810#3:163\n1672#3:167\n33#4,7:145\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:118,4\n63#1:122,7\n63#1:130,3\n63#1:134,2\n63#1:136,2\n63#1:138,6\n63#1:144\n112#1:152,4\n112#1:156,7\n112#1:164,3\n112#1:168,2\n112#1:170,2\n112#1:172,6\n112#1:178\n63#1:129\n63#1:133\n112#1:163\n112#1:167\n73#1:145,7\n*E\n"})
/*     */ public final class ChildLayerDependenciesTracker
/*     */ {
/*     */   @Nullable
/*     */   private GraphicsLayer dependency;
/*     */   @Nullable
/*     */   private GraphicsLayer oldDependency;
/*     */   @Nullable
/*     */   private MutableScatterSet<GraphicsLayer> dependenciesSet;
/*     */   @Nullable
/*     */   private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
/*     */   private boolean trackingInProgress;
/*     */   
/*     */   public final void withTracking(@NotNull Function1 onDependencyRemoved, @NotNull Function0 block) {
/*  44 */     Intrinsics.checkNotNullParameter(onDependencyRemoved, "onDependencyRemoved"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withTracking = 0; access$setOldDependency$p(this, access$getDependency$p(this));
/*  45 */     MutableScatterSet currentSet = access$getDependenciesSet$p(this); int $i$a$-let-ChildLayerDependenciesTracker$withTracking$1 = 0;
/*  46 */     if (currentSet.isNotEmpty()) {
/*  47 */       if (access$getOldDependenciesSet$p(this) == null) { access$getOldDependenciesSet$p(this); MutableScatterSet mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf(), it = mutableScatterSet1; int $i$a$-also-ChildLayerDependenciesTracker$withTracking$1$oldSet$1 = 0;
/*  48 */         access$setOldDependenciesSet$p(this, it); }
/*     */        MutableScatterSet mutableScatterSet = mutableScatterSet1;
/*  50 */       mutableScatterSet.addAll((ScatterSet)currentSet);
/*  51 */       currentSet.clear();
/*     */     } 
/*     */     access$getDependenciesSet$p(this);
/*  54 */     access$setTrackingInProgress$p(this, true);
/*  55 */     block.invoke();
/*  56 */     access$setTrackingInProgress$p(this, false);
/*     */ 
/*     */ 
/*     */     
/*  60 */     if (access$getOldDependency$p(this) != null) { onDependencyRemoved.invoke(access$getOldDependency$p(this)); } else { access$getOldDependency$p(this); }
/*  61 */      MutableScatterSet oldSet = access$getOldDependenciesSet$p(this); int $i$a$-let-ChildLayerDependenciesTracker$withTracking$2 = 0;
/*  62 */     if (oldSet.isNotEmpty()) {
/*  63 */       ScatterSet this_$iv = (ScatterSet)oldSet; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 119 */       Object[] k$iv = this_$iv.elements;
/*     */       
/* 121 */       ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*     */       
/* 123 */       long[] m$iv$iv = this_$iv$iv.metadata;
/* 124 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */       
/* 126 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 127 */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 128 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 129 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 130 */             int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 131 */             for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 132 */               long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 133 */               if ((value$iv$iv$iv < 128L)) {
/* 134 */                 int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 135 */                 int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 136 */                 onDependencyRemoved.invoke(k$iv[index$iv]);
/*     */               } 
/* 138 */               slot$iv$iv >>= 8L;
/*     */             } 
/* 140 */             if (bitCount$iv$iv == 8)
/*     */               continue;  break;
/*     */           }  continue; if (i$iv$iv != lastIndex$iv$iv) {
/*     */             i$iv$iv++; continue;
/*     */           }  // Byte code: goto -> 359
/*     */         }  }
/*     */       else
/*     */       {  }
/*     */        oldSet.clear();
/*     */     }  access$getOldDependenciesSet$p(this); } public final void removeDependencies(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$removeDependencies = 0; GraphicsLayer graphicsLayer = access$getDependency$p(this); int $i$a$-let-ChildLayerDependenciesTracker$removeDependencies$1 = 0; block.invoke(graphicsLayer); access$setDependency$p(this, null); access$getDependency$p(this); MutableScatterSet it = access$getDependenciesSet$p(this);
/*     */     int $i$a$-let-ChildLayerDependenciesTracker$removeDependencies$2 = 0;
/*     */     ScatterSet this_$iv = (ScatterSet)it;
/*     */     int $i$f$forEach = 0;
/* 153 */     Object[] k$iv = this_$iv.elements;
/*     */     
/* 155 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*     */     
/* 157 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 158 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */     
/* 160 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 161 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 162 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 163 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 164 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 165 */           for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 166 */             long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 167 */             if ((value$iv$iv$iv < 128L)) {
/* 168 */               int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 169 */               int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 170 */               block.invoke(k$iv[index$iv]);
/*     */             } 
/* 172 */             slot$iv$iv >>= 8L;
/*     */           } 
/* 174 */           if (bitCount$iv$iv == 8)
/*     */             continue; 
/*     */           break;
/*     */         } 
/*     */         continue;
/*     */         if (i$iv$iv != lastIndex$iv$iv) {
/*     */           i$iv$iv++;
/*     */           continue;
/*     */         } 
/*     */         // Byte code: goto -> 253
/*     */       }  }
/*     */     else
/*     */     {  }
/*     */     
/*     */     it.clear();
/*     */     access$getDependenciesSet$p(this); }
/*     */ 
/*     */   
/*     */   public final boolean onDependencyAdded(@NotNull GraphicsLayer graphicsLayer) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'graphicsLayer'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield trackingInProgress : Z
/*     */     //   10: istore_2
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: nop
/*     */     //   14: iload_2
/*     */     //   15: ifne -> 26
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: ldc 'Only add dependencies during a tracking'
/*     */     //   23: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   26: nop
/*     */     //   27: aload_0
/*     */     //   28: getfield dependenciesSet : Landroidx/collection/MutableScatterSet;
/*     */     //   31: ifnull -> 50
/*     */     //   34: aload_0
/*     */     //   35: getfield dependenciesSet : Landroidx/collection/MutableScatterSet;
/*     */     //   38: dup
/*     */     //   39: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   42: aload_1
/*     */     //   43: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   46: pop
/*     */     //   47: goto -> 108
/*     */     //   50: aload_0
/*     */     //   51: getfield dependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   54: ifnull -> 103
/*     */     //   57: aload_0
/*     */     //   58: invokestatic mutableScatterSetOf : ()Landroidx/collection/MutableScatterSet;
/*     */     //   61: astore_2
/*     */     //   62: aload_2
/*     */     //   63: astore_3
/*     */     //   64: astore #5
/*     */     //   66: iconst_0
/*     */     //   67: istore #4
/*     */     //   69: aload_3
/*     */     //   70: aload_0
/*     */     //   71: getfield dependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   74: dup
/*     */     //   75: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   78: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   81: pop
/*     */     //   82: aload_3
/*     */     //   83: aload_1
/*     */     //   84: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   87: pop
/*     */     //   88: nop
/*     */     //   89: aload #5
/*     */     //   91: aload_2
/*     */     //   92: putfield dependenciesSet : Landroidx/collection/MutableScatterSet;
/*     */     //   95: aload_0
/*     */     //   96: aconst_null
/*     */     //   97: putfield dependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   100: goto -> 108
/*     */     //   103: aload_0
/*     */     //   104: aload_1
/*     */     //   105: putfield dependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   108: aload_0
/*     */     //   109: getfield oldDependenciesSet : Landroidx/collection/MutableScatterSet;
/*     */     //   112: ifnull -> 136
/*     */     //   115: aload_0
/*     */     //   116: getfield oldDependenciesSet : Landroidx/collection/MutableScatterSet;
/*     */     //   119: dup
/*     */     //   120: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual remove : (Ljava/lang/Object;)Z
/*     */     //   127: ifne -> 134
/*     */     //   130: iconst_1
/*     */     //   131: goto -> 135
/*     */     //   134: iconst_0
/*     */     //   135: ireturn
/*     */     //   136: aload_0
/*     */     //   137: getfield oldDependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   140: aload_1
/*     */     //   141: if_acmpeq -> 146
/*     */     //   144: iconst_1
/*     */     //   145: ireturn
/*     */     //   146: aload_0
/*     */     //   147: aconst_null
/*     */     //   148: putfield oldDependency : Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */     //   151: iconst_0
/*     */     //   152: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 6
/*     */     //   #145	-> 13
/*     */     //   #148	-> 14
/*     */     //   #149	-> 18
/*     */     //   #73	-> 21
/*     */     //   #149	-> 23
/*     */     //   #151	-> 26
/*     */     //   #76	-> 27
/*     */     //   #77	-> 34
/*     */     //   #78	-> 50
/*     */     //   #79	-> 57
/*     */     //   #80	-> 69
/*     */     //   #81	-> 82
/*     */     //   #82	-> 88
/*     */     //   #79	-> 91
/*     */     //   #79	-> 92
/*     */     //   #83	-> 95
/*     */     //   #85	-> 103
/*     */     //   #89	-> 108
/*     */     //   #91	-> 115
/*     */     //   #93	-> 136
/*     */     //   #94	-> 144
/*     */     //   #97	-> 146
/*     */     //   #98	-> 151
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	2	4	$i$a$-requirePrecondition-ChildLayerDependenciesTracker$onDependencyAdded$1	I
/*     */     //   13	14	3	$i$f$requirePrecondition	I
/*     */     //   11	16	2	value$iv	Z
/*     */     //   69	20	4	$i$a$-also-ChildLayerDependenciesTracker$onDependencyAdded$2	I
/*     */     //   66	23	3	it	Landroidx/collection/MutableScatterSet;
/*     */     //   0	153	0	this	Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;
/*     */     //   0	153	1	graphicsLayer	Landroidx/compose/ui/graphics/layer/GraphicsLayer;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\layer\ChildLayerDependenciesTracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */