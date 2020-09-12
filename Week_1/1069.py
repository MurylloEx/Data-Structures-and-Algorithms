for step in range(0, int(input())):
  try:
    expr = input()
    raw_expr = ''
    if (expr not in '\n\r'):
      for idx in range(0, len(expr)):
        if (expr[idx] in '<>'):
            raw_expr += expr[idx]
      num = 0
      for idx in range(0, int(len(raw_expr) / 2)):
        num += raw_expr.count('<>')
        raw_expr = raw_expr.replace('<>', '')
      print(num)
    else:
      break
  except EOFError:
    break;