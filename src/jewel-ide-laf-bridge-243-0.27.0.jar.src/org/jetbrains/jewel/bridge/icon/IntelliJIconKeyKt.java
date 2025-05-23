/*    */ package org.jetbrains.jewel.bridge.icon;
/*    */ import com.intellij.ui.icons.IconPathProvider;
/*    */ import javax.swing.Icon;
/*    */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032 \020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\f\b\002\020\005\032\006\022\002\b\0030\006¨\006\007"}, d2 = {"fromPlatformIcon", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey$Companion;", "icon", "Ljavax/swing/Icon;", "iconClass", "Ljava/lang/Class;", "ide-laf-bridge"})
/*    */ public final class IntelliJIconKeyKt {
/*    */   @NotNull
/*    */   public static final IconKey fromPlatformIcon(@NotNull IntelliJIconKey.Companion $this$fromPlatformIcon, @NotNull Icon icon, @NotNull Class iconClass) {
/*    */     String oldUiPath;
/* 11 */     Intrinsics.checkNotNullParameter($this$fromPlatformIcon, "<this>"); Intrinsics.checkNotNullParameter(icon, "icon"); Intrinsics.checkNotNullParameter(iconClass, "iconClass"); if (!(icon instanceof IconPathProvider)) { int $i$a$-check-IntelliJIconKeyKt$fromPlatformIcon$1 = 0; String str = 
/* 12 */         "Only icons implementing IconPathProvider are supported (e.g., coming from AllIcons)";
/*    */       
/*    */       throw new IllegalStateException(str.toString()); }
/*    */     
/* 16 */     if (((IconPathProvider)icon).getOriginalPath() == null) { ((IconPathProvider)icon).getOriginalPath(); int $i$a$-checkNotNull-IntelliJIconKeyKt$fromPlatformIcon$oldUiPath$1 = 0; String str = 
/* 17 */         "Only resource-backed CachedImageIcons are supported (e.g., coming from AllIcons)";
/*    */       throw new IllegalStateException(str.toString()); }
/*    */     
/* 20 */     if (((IconPathProvider)icon).getExpUIPath() == null) ((IconPathProvider)icon).getExpUIPath();  String newUiPath = oldUiPath;
/* 21 */     return (IconKey)new IntelliJIconKey(oldUiPath, newUiPath, iconClass);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\icon\IntelliJIconKeyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */