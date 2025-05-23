/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import com.intellij.openapi.extensions.PluginDescriptor;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.APP})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\b\007\030\000 \n2\0020\001:\002\t\nB\007¢\006\004\b\002\020\003J\n\020\006\032\004\030\0010\005H\002J\b\020\007\032\0020\bH\026R\020\020\004\032\004\030\0010\005X\016¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands;", "Lcom/intellij/openapi/Disposable;", "<init>", "()V", "regex", "Lkotlin/text/Regex;", "computeRegex", "dispose", "", "CommandsProvider", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nProductSpecificAllowedCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1368#2:51\n1454#2,5:52\n*S KotlinDebug\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands\n*L\n31#1:51\n31#1:52,5\n*E\n"})
/*    */ public final class ProductSpecificAllowedCommands implements Disposable {
/*    */   public ProductSpecificAllowedCommands() {
/* 17 */     this.regex = computeRegex();
/*    */     
/* 19 */     EP_NAME.addExtensionPointListener(new ExtensionPointListener<CommandsProvider>() {
/*    */           public void extensionAdded(ProductSpecificAllowedCommands.CommandsProvider extension, PluginDescriptor pluginDescriptor) {
/* 21 */             Intrinsics.checkNotNullParameter(extension, "extension"); Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); ProductSpecificAllowedCommands.this.regex = ProductSpecificAllowedCommands.this.computeRegex();
/*    */           }
/*    */           
/*    */           public void extensionRemoved(ProductSpecificAllowedCommands.CommandsProvider extension, PluginDescriptor pluginDescriptor) {
/* 25 */             Intrinsics.checkNotNullParameter(extension, "extension"); Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); ProductSpecificAllowedCommands.this.regex = ProductSpecificAllowedCommands.this.computeRegex();
/*    */           }
/* 27 */         }this);
/*    */   }
/*    */   
/*    */   private final Regex computeRegex() {
/* 31 */     Iterable $this$flatMap$iv = EP_NAME.getExtensionList(); int $i$f$flatMap = 0;
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
/* 51 */     Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 52 */     for (Object element$iv$iv : iterable1) {
/* 53 */       CommandsProvider it = (CommandsProvider)element$iv$iv; int $i$a$-flatMap-ProductSpecificAllowedCommands$computeRegex$productSpecificCommands$1 = 0; Iterable<String> list$iv$iv = it.getCommands();
/* 54 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 56 */     List productSpecificCommands = (List)destination$iv$iv;
/*    */     if (!productSpecificCommands.isEmpty())
/*    */       return new Regex("^(" + CollectionsKt.joinToString$default(productSpecificCommands, "|", null, null, 0, null, null, 62, null) + ")(?:\\s+[^|;&<>()`$]+)*$"); 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\003\bf\030\0002\0020\001R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$CommandsProvider;", "", "commands", "", "", "getCommands", "()Ljava/util/List;", "ej-core"})
/*    */   public static interface CommandsProvider {
/*    */     @NotNull
/*    */     List<String> getCommands();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$CommandsProvider;", "isProductSpecificAllowedCommand", "", "command", "", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nProductSpecificAllowedCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,50:1\n40#2,3:51\n*S KotlinDebug\n*F\n+ 1 ProductSpecificAllowedCommands.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$Companion\n*L\n48#1:51,3\n*E\n"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     public final boolean isProductSpecificAllowedCommand(@NotNull String command) {
/*    */       Intrinsics.checkNotNullParameter(command, "command");
/*    */       int $i$f$service = 0;
/*    */       Class<ProductSpecificAllowedCommands> serviceClass$iv = ProductSpecificAllowedCommands.class;
/*    */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) {
/*    */         ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')');
/*    */       } 
/*    */       ((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv)).regex;
/*    */       return (((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv)).regex != null) ? ((((ProductSpecificAllowedCommands)ApplicationManager.getApplication().getService(serviceClass$iv)).regex.matches(command) == true)) : false;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private volatile Regex regex;
/*    */   @NotNull
/*    */   private static final ExtensionPointName<CommandsProvider> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.matterhorn.actions.productSpecificAllowedCommands");
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ProductSpecificAllowedCommands.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */