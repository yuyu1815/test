/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import com.intellij.ui.icons.CachedImageIconKt;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\004\bÁ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\006\032\0020\007*\0020\bH\026J\020\020\t\032\0020\0072\006\020\n\032\0020\007H\002J\b\020\013\032\0020\007H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/bridge/BridgeOverride;", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "<init>", "()V", "dirProvider", "Lcom/intellij/util/ui/DirProvider;", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "inferActualPathFromReflectivePath", "patchedPath", "toString", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nBridgeOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeOverride.kt\norg/jetbrains/jewel/bridge/BridgeOverride\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1557#2:78\n1628#2,3:79\n774#2:82\n865#2,2:83\n1863#2,2:85\n*S KotlinDebug\n*F\n+ 1 BridgeOverride.kt\norg/jetbrains/jewel/bridge/BridgeOverride\n*L\n56#1:78\n56#1:79,3\n57#1:82\n57#1:83,2\n58#1:85,2\n*E\n"})
/*    */ public final class BridgeOverride implements PainterPathHint {
/* 15 */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) { return PainterPathHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/* 16 */   public static final BridgeOverride INSTANCE = new BridgeOverride(); @NotNull private static final DirProvider dirProvider = new DirProvider(); public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public String patch(@NotNull PainterProviderScope $this$patch) {
/* 20 */     Intrinsics.checkNotNullParameter($this$patch, "<this>"); if (!($this$patch instanceof ResourcePainterProviderScope)) return $this$patch.getPath();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     String fallbackPath = StringsKt.removePrefix($this$patch.getPath(), dirProvider.dir());
/*    */     
/* 28 */     for (ClassLoader classLoader : ((ResourcePainterProviderScope)$this$patch).getClassLoaders()) {
/*    */       
/* 30 */       if (CachedImageIconKt.patchIconPath(StringsKt.removePrefix($this$patch.getPath(), "/"), classLoader) == null || (String)CachedImageIconKt.patchIconPath(StringsKt.removePrefix($this$patch.getPath(), "/"), classLoader).getFirst() == null) { (String)CachedImageIconKt.patchIconPath(StringsKt.removePrefix($this$patch.getPath(), "/"), classLoader).getFirst();
/* 31 */         CachedImageIconKt.patchIconPath(fallbackPath, classLoader); }  String patchedPath = (CachedImageIconKt.patchIconPath(fallbackPath, classLoader) != null) ? (String)CachedImageIconKt.patchIconPath(fallbackPath, classLoader).getFirst() : null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 38 */       if ((patchedPath != null) ? ((StringsKt.startsWith$default(patchedPath, "com.intellij.icons.ExpUiIcons", false, 2, null) == true)) : false) {
/* 39 */         return inferActualPathFromReflectivePath(patchedPath);
/*    */       }
/*    */       
/* 42 */       if (patchedPath != null) {
/* 43 */         return patchedPath;
/*    */       }
/*    */     } 
/* 46 */     return $this$patch.getPath();
/*    */   }
/*    */   
/*    */   private final String inferActualPathFromReflectivePath(String patchedPath) {
/* 50 */     String iconPath = StringsKt.removePrefix(patchedPath, "com.intellij.icons.ExpUiIcons.");
/*    */     
/* 52 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$inferActualPathFromReflectivePath_u24lambda_u243 = stringBuilder1; int $i$a$-buildString-BridgeOverride$inferActualPathFromReflectivePath$1 = 0;
/* 53 */     $this$inferActualPathFromReflectivePath_u24lambda_u243.append("expui/");
/*    */     
/* 55 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '.'; List list1 = StringsKt.split$default(iconPath, arrayOfChar, false, 0, 6, null);
/* 56 */     int $i$f$map = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 78 */     List list2 = list1; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 79 */     for (Object item$iv$iv : list2) {
/* 80 */       String str = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-BridgeOverride$inferActualPathFromReflectivePath$1$1 = 0; collection1.add(StringsKt.trim(str).toString());
/* 81 */     }  Iterable $this$map$iv = collection; int $i$f$filter = 0;
/* 82 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 83 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-BridgeOverride$inferActualPathFromReflectivePath$1$2 = 0; if ((((CharSequence)it).length() > 0)) destination$iv$iv.add(element$iv$iv);  }
/* 84 */      Iterable $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 85 */     Iterator iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-BridgeOverride$inferActualPathFromReflectivePath$1$3 = 0;
/*    */       $this$inferActualPathFromReflectivePath_u24lambda_u243.append(Character.toLowerCase(StringsKt.first(it)));
/*    */       $this$inferActualPathFromReflectivePath_u24lambda_u243.append(StringsKt.drop(it, 1));
/*    */       $this$inferActualPathFromReflectivePath_u24lambda_u243.append('/'); }
/*    */     
/*    */     $this$inferActualPathFromReflectivePath_u24lambda_u243.replace($this$inferActualPathFromReflectivePath_u24lambda_u243.length() - 1, $this$inferActualPathFromReflectivePath_u24lambda_u243.length(), "");
/*    */     if (StringsKt.contains$default(iconPath, "_dark", false, 2, null))
/*    */       $this$inferActualPathFromReflectivePath_u24lambda_u243.append("_dark"); 
/*    */     $this$inferActualPathFromReflectivePath_u24lambda_u243.append(".svg");
/*    */     Logger.getInstance("IconsPathPatching").warn("IntelliJ returned a reflective path: " + patchedPath + " for " + iconPath + ". We reverted that to a plausible-looking resource path: " + $this$inferActualPathFromReflectivePath_u24lambda_u243);
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BridgeOverride";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeOverride.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */