/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import com.intellij.icons.AllIcons;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003JB\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020\016\032\0020\0172\006\020\020\032\0020\013H\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNodeRenderer;", "Lcom/intellij/ide/util/treeView/NodeRenderer;", "<init>", "()V", "customizeCellRenderer", "", "tree", "Ljavax/swing/JTree;", "value", "", "selected", "", "expanded", "leaf", "row", "", "hasFocus", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nArtifactNodeRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactNodeRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNodeRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1863#2,2:60\n*S KotlinDebug\n*F\n+ 1 ArtifactNodeRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNodeRenderer\n*L\n16#1:60,2\n*E\n"})
/*    */ public final class ArtifactNodeRenderer extends NodeRenderer {
/*    */   public static final int $stable;
/*    */   
/*    */   public void customizeCellRenderer(@NotNull JTree tree, @Nullable Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
/*    */     String title;
/* 12 */     Intrinsics.checkNotNullParameter(tree, "tree"); Object node = TreeUtil.getUserObject(value);
/* 13 */     if (node instanceof ArtifactNode)
/* 14 */     { Intrinsics.checkNotNullExpressionValue(((ArtifactNode)node).getOverriddenPresentation().getColoredText(), "getColoredText(...)"); List overriddenText = ((ArtifactNode)node).getOverriddenPresentation().getColoredText();
/* 15 */       if (!overriddenText.isEmpty())
/* 16 */       { Iterable $this$forEach$iv = overriddenText; int $i$f$forEach = 0;
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
/*    */         
/* 60 */         Iterator iterator = $this$forEach$iv.iterator(); } else { String nodeName; ArtifactType type; if (((ArtifactNode)node).getArtifact() == null || ((ArtifactNode)node).getArtifact().getId() == null || ((ArtifactNode)node).getArtifact().getId().getName() == null) { ((ArtifactNode)node).getArtifact().getId().getName(); return; }  if (((ArtifactNode)node).getArtifact() == null || ((ArtifactNode)node).getArtifact().getId() == null || ((ArtifactNode)node).getArtifact().getId().getType() == null) { ((ArtifactNode)node).getArtifact().getId().getType(); return; }  append("[" + type + "]", SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES); append("  "); Intrinsics.checkNotNull(((ArtifactNode)node).getArtifact()); title = ((ArtifactNode)node).getArtifact().getTitle(); append(!((((CharSequence)title).length() == 0) ? 1 : 0) ? title : nodeName); ArtifactStatistic statistics = ((ArtifactNode)node).getStatistics(); if (statistics != null) { append("  "); String str = "%.2f"; Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = Double.valueOf(statistics.getCost()); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); append("$" + String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), SimpleTextAttributes.GRAY_ATTRIBUTES, false); append(", "); append("" + statistics.getTotalArtifactBuildTimeSeconds() + " seconds", SimpleTextAttributes.GRAY_ATTRIBUTES, false); append(", "); append("" + statistics.getRequests() + " requests", SimpleTextAttributes.GRAY_ATTRIBUTES, false); if (((ArtifactNode)node).isFailed()) { setIcon(AllIcons.RunConfigurations.TestError); } else if (((ArtifactNode)node).isReference()) { setIcon(AllIcons.RunConfigurations.TestPassedIgnored); } else { setIcon(AllIcons.RunConfigurations.TestPassed); }  } else if (((ArtifactNode)node).isFailed()) { setIcon(AllIcons.RunConfigurations.TestError); } else if (((ArtifactNode)node).isCancelled()) { setIcon(AllIcons.RunConfigurations.TestFailed); } else { setIcon((Icon)AnimatedIcon.Default.INSTANCE); }  return; }  } else { super.customizeCellRenderer(tree, value, selected, expanded, leaf, row, hasFocus); return; }  if (title.hasNext()) { Object element$iv = title.next(); PresentableNodeDescriptor.ColoredFragment coloredFragment = (PresentableNodeDescriptor.ColoredFragment)element$iv; boolean bool = false;
/*    */       append(coloredFragment.getText(), coloredFragment.getAttributes()); }
/*    */     
/*    */     setIcon(((ArtifactNode)node).getOverriddenPresentation().getIcon(false));
/*    */     setToolTipText(((ArtifactNode)node).getOverriddenPresentation().getTooltip());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ArtifactNodeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */