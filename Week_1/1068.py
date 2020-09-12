while True:
    try:
        expr = input()
        if (expr not in '\n\r'):
            raw_expr = str()
            for idx in range(0, len(expr)):
                if (expr[idx] in '()'):
                    raw_expr += expr[idx]
            if (len(raw_expr) % 2 == 1):
                print('incorrect')
            else:
                strlen = int(len(raw_expr)/2)
                for idx in range(0, strlen):
                    raw_expr = raw_expr.replace('()', '')
                print('correct' if raw_expr == '' else 'incorrect')
        else:
            break
    except EOFError:
        break